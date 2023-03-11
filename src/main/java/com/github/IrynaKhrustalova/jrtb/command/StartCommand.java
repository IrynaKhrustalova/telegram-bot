package com.github.IrynaKhrustalova.jrtb.command;

import com.github.IrynaKhrustalova.jrtb.repository.TelegramUser;
import com.github.IrynaKhrustalova.jrtb.service.SendBotMessageService;
import com.github.IrynaKhrustalova.jrtb.service.TelegramUserService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}.
 */
@Component
public class StartCommand implements Command {
    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;
    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot. Я помогу тебе быть в курсе последних " +
            "статей тех авторов, котрые тебе интересны. Я еще маленький и только учусь.";

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        String chatId = update.getMessage().getChatId().toString();
        TelegramUser telegramUser = new TelegramUser();
        telegramUser.setActive(true);
        telegramUser.setChatId(chatId);
        telegramUserService.saveTelegramUser(telegramUser);
        sendBotMessageService.sendMessage(chatId, START_MESSAGE);
    }
}
