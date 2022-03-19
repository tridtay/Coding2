package com.example.RTCS.qrcode;

import com.example.RTCS.qrcode.entity.QRcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class QRcodeService {

    @Autowired
    private QRcodeRepository QrcodeRepository;

    public String findQRcode(long id) {
        Optional<QRcode> result = QrcodeRepository.findById(id);
        if (result.isPresent()) {
            return "found";
        } return  "not found";
    }

    public String Generate(QRcode qRcode){
        QrcodeRepository.save(qRcode);
        return "Generate Success";
        }
}
