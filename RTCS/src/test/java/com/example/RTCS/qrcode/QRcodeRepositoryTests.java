package com.example.RTCS.qrcode;

import com.example.RTCS.qrcode.entity.QRcode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class QRcodeRepositoryTests {
    @Autowired
    private  QRcodeRepository qRcodeRepository;

    @Test
    void findById_with_success_Case() {
        // Arrange
        QRcode qRcode = new QRcode();
        qRcode.setId(1L);
        qRcode.setSender("TestSender");
        qRcode.setReceiver("TestReceiver");
        qRcodeRepository.save(qRcode);
        // Act
        Optional<QRcode> result = qRcodeRepository.findById(1L);
        // Assert
        assertTrue(result.isPresent());
    }
}
