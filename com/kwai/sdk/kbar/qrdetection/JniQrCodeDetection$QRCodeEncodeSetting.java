package com.kwai.sdk.kbar.qrdetection.JniQrCodeDetection$QRCodeEncodeSetting;
import java.lang.Object;
import com.kwai.sdk.kbar.qrdetection.JniQrCodeDetection$QREncodeErrorCorrectionLevel;

public class JniQrCodeDetection$QRCodeEncodeSetting	// class@00161c
{
    public int backgroundColor;
    public int cornerBorderColor;
    public int cornerCenterColor;
    public int errorCorrectionLevel;
    public int foregroundColor;
    public boolean isAutoEncode;
    public int marginPixel;

    public void JniQrCodeDetection$QRCodeEncodeSetting(){
       super();
       this.cornerCenterColor = 0xff000000;
       this.cornerBorderColor = 0xff000000;
       this.foregroundColor = 0xff000000;
       this.backgroundColor = -1;
       this.marginPixel = 10;
       this.isAutoEncode = false;
       this.errorCorrectionLevel = JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_HIGH.code();
    }
}
