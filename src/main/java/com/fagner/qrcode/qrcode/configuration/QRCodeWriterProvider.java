package com.fagner.qrcode.qrcode.configuration;

import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QRCodeWriterProvider {
    @Bean
    public QRCodeWriter providesQRCodeWriter() {
        return new QRCodeWriter();
    }
}
