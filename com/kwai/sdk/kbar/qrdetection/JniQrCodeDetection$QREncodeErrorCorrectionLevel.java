package com.kwai.sdk.kbar.qrdetection.JniQrCodeDetection$QREncodeErrorCorrectionLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class JniQrCodeDetection$QREncodeErrorCorrectionLevel extends Enum	// class@00161d
{
    public int code;
    public String desc;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel[] $VALUES;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel QR_ENCODE_ERROR_CORRECTION_LEVEL_HIGH;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel QR_ENCODE_ERROR_CORRECTION_LEVEL_INVALID;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel QR_ENCODE_ERROR_CORRECTION_LEVEL_LOW;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel QR_ENCODE_ERROR_CORRECTION_LEVEL_MEDIUM;
    public static final JniQrCodeDetection$QREncodeErrorCorrectionLevel QR_ENCODE_ERROR_CORRECTION_LEVEL_QUALITY;

    static {
       JniQrCodeDetection$QREncodeErrorCorrectionLevel qREncodeErro = new JniQrCodeDetection$QREncodeErrorCorrectionLevel("QR_ENCODE_ERROR_CORRECTION_LEVEL_LOW", 0, 0, "encode level low");
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_LOW = qREncodeErro;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel qREncodeErro1 = new JniQrCodeDetection$QREncodeErrorCorrectionLevel("QR_ENCODE_ERROR_CORRECTION_LEVEL_MEDIUM", 1, 1, "encode level medium");
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_MEDIUM = qREncodeErro1;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel qREncodeErro2 = new JniQrCodeDetection$QREncodeErrorCorrectionLevel("QR_ENCODE_ERROR_CORRECTION_LEVEL_QUALITY", 2, 2, "encode level quality");
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_QUALITY = qREncodeErro2;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel qREncodeErro3 = new JniQrCodeDetection$QREncodeErrorCorrectionLevel("QR_ENCODE_ERROR_CORRECTION_LEVEL_HIGH", 3, 3, "encode level high");
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_HIGH = qREncodeErro3;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel qREncodeErro4 = new JniQrCodeDetection$QREncodeErrorCorrectionLevel("QR_ENCODE_ERROR_CORRECTION_LEVEL_INVALID", 4, 4, "encode level invalid");
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_INVALID = qREncodeErro4;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel[] qREncodeErro5 = new JniQrCodeDetection$QREncodeErrorCorrectionLevel[]{qREncodeErro,qREncodeErro1,qREncodeErro2,qREncodeErro3,qREncodeErro4};
       JniQrCodeDetection$QREncodeErrorCorrectionLevel.$VALUES = qREncodeErro5;
    }
    public void JniQrCodeDetection$QREncodeErrorCorrectionLevel(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.code = p2;
       this.desc = p3;
    }
    public static JniQrCodeDetection$QREncodeErrorCorrectionLevel fromCode(int p0){
       object oobject;
       JniQrCodeDetection$QREncodeErrorCorrectionLevel[] qREncodeErro = JniQrCodeDetection$QREncodeErrorCorrectionLevel.values();
       int len = qREncodeErro.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return JniQrCodeDetection$QREncodeErrorCorrectionLevel.QR_ENCODE_ERROR_CORRECTION_LEVEL_INVALID;
          }
          oobject = qREncodeErro[i];
          if (oobject.code() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static JniQrCodeDetection$QREncodeErrorCorrectionLevel valueOf(String p0){
       return Enum.valueOf(JniQrCodeDetection$QREncodeErrorCorrectionLevel.class, p0);
    }
    public static JniQrCodeDetection$QREncodeErrorCorrectionLevel[] values(){
       return JniQrCodeDetection$QREncodeErrorCorrectionLevel.$VALUES.clone();
    }
    public int code(){
       return this.code;
    }
    public String description(){
       return this.desc;
    }
}
