package com.fagner.qrcode.qrcode.service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
public class QRCodeServiceImpl implements QRCodeService {
    private static final int QR_CODE_SIZE = 200;
    private final QRCodeWriter qrCodeWriter;

    public QRCodeServiceImpl(QRCodeWriter qrCodeWriter){
        this.qrCodeWriter = qrCodeWriter;
    }

    @Override
    public BufferedImage generateQRCode(String content) throws WriterException {
        var bitMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, QR_CODE_SIZE, QR_CODE_SIZE);
        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}
