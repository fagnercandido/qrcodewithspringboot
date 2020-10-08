package com.fagner.qrcode.qrcode.service;

import com.google.zxing.WriterException;

import java.awt.image.BufferedImage;

public interface QRCodeService {
    BufferedImage generateQRCode(String content) throws WriterException;
}
