package com.fagner.qrcode.qrcode.controller;

import com.fagner.qrcode.qrcode.service.QRCodeService;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.awt.image.BufferedImage;

@RestController
@RequestMapping("qrcode")
public class QRCodeController {
    private final QRCodeService qrCodeService;

    public QRCodeController(QRCodeService qrCodeService){
        this.qrCodeService = qrCodeService;
    }

    @GetMapping(value = "/1/{name}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> barbecueEAN13Barcode(@PathVariable("name") String name) throws Exception {
        return ResponseEntity.ok(qrCodeService.generateQRCode(name));
    }
}