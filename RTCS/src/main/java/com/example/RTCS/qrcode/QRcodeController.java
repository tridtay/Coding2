package com.example.RTCS.qrcode;

import com.example.RTCS.MessageResponse;
import com.example.RTCS.qrcode.entity.QRcode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QRcodeController {

    private static final Logger log
            = LoggerFactory.getLogger(QRcodeController.class);

    @Autowired
    private QRcodeService Qrcodeservice;

    @Autowired
    private QRcodeRepository QrcodeRepository;

    @GetMapping("/{Code}")
    public MessageResponse getQRcode(@PathVariable long Code)  {
        log.info("Ger QRcode Info");
        return new MessageResponse(Qrcodeservice.findQRcode(Code));
    }

    @PostMapping("/Generate")
    public MessageResponse Generate(@RequestBody QRcode qRcode ){
        log.info("Generate QRcode");
        return new MessageResponse(Qrcodeservice.Generate(qRcode));
    }

}
