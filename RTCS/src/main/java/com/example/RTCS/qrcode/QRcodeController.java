package com.example.RTCS.qrcode;

import com.example.RTCS.MessageResponse;
import com.example.RTCS.qrcode.entity.QRcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QRcodeController {
    @Autowired
    private QRcodeService Qrcodeservice;

    @Autowired
    private QRcodeRepository QrcodeRepository;

    @GetMapping("/{Code}")
    public MessageResponse getQRcode(@PathVariable long Code)  {
        return new MessageResponse(Qrcodeservice.findQRcode(Code));
    }

    @PostMapping("/Generate")
    public MessageResponse Generate(@RequestBody QRcode QRcode){
        return new MessageResponse(Qrcodeservice.Generate(QRcode));
    }

}
