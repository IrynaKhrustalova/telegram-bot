/*package com.github.IrynaKhrustalova.jrtb.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

/**
 * Integration-level testing for {@link TelegramUserRepository}.
 */
/*@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
class TelegramUserRepositoryIT {
    @Autowired
    private TelegramUserRepository telegramUserRepository;

    @Sql(scripts = {"/sql/clearDbs.sql", "/sql/telegram_users.sql"})
    @Test
    void shouldProperlyFindAllActiveUsers() {
        List<TelegramUser> telegramUserList = telegramUserRepository.findAll();
        Assertions.assertEquals(8, telegramUserList.size());
    }

    @Sql(scripts = {"/sql/clearDbs.sql"})
    @Test
    void shouldProperlySaveTelegramUser() {
        TelegramUser telegramUser = new TelegramUser();
        telegramUser.setActive(false);
        telegramUser.setChatId("247257");
        telegramUserRepository.save(telegramUser);

        Optional<TelegramUser> savedUser = telegramUserRepository.findById("247257");
        Assertions.assertTrue(savedUser.isPresent());
        Assertions.assertEquals(telegramUser, savedUser.get());
    }
}
*/