package com.github.IrynaKhrustalova.jrtb.command;

import com.github.IrynaKhrustalova.jrtb.service.SendBotMessageService;
import com.github.IrynaKhrustalova.jrtb.service.TelegramUserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.github.IrynaKhrustalova.jrtb.command.CommandName.*;

/**
 * Container of the {@link Command}s, which are using for handling telegram commands.
 */
@Component
public class CommandContainer {
    private final Map<String, Command> commandMap;
    private final Command unknownCommand;
    @Lazy
    public CommandContainer(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {

       commandMap = Map.ofEntries(Map.entry(START.getCommandName(), new StartCommand(sendBotMessageService, telegramUserService)),
               Map.entry(STOP.getCommandName(), new StopCommand(sendBotMessageService, telegramUserService)),
               Map.entry(HELP.getCommandName(), new HelpCommand(sendBotMessageService)),
               Map.entry(NO.getCommandName(), new NoCommand(sendBotMessageService)),
               Map.entry(STAT.getCommandName(), new StatCommand(sendBotMessageService, telegramUserService)));
        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
