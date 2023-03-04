package com.github.IrynaKhrustalova.jrtb.service;

/**
 * Service for sending messages via telegram-bot.
 */
public interface SendBotMessageService {
    /**
     * Service for sending messages via telegram-bot.
     */
    void sendMessage(String chatId, String message);
}
