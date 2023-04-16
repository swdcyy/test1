package com.google.protobuf.Utf8$DecodeUtil;
import java.lang.Object;
import com.google.protobuf.InvalidProtocolBufferException;

public class Utf8$DecodeUtil	// class@0004ea
{

    public void Utf8$DecodeUtil(){
       super();
    }
    public static void handleFourBytes(byte p0,byte p1,byte p2,byte p3,char[] p4,int p5){
       if (Utf8$DecodeUtil.isNotTrailingByte(p1) || ((((p0 << 28) + (p1 + 112)) >> 30) || (Utf8$DecodeUtil.isNotTrailingByte(p2) || Utf8$DecodeUtil.isNotTrailingByte(p3)))) {
          throw InvalidProtocolBufferException.invalidUtf8();
       }
       int i = ((((p0 & 0x07) << 18) | (Utf8$DecodeUtil.trailingByteValue(p1) << 12)) | (Utf8$DecodeUtil.trailingByteValue(p2) << 6)) | Utf8$DecodeUtil.trailingByteValue(p3);
       p4[p5] = Utf8$DecodeUtil.highSurrogate(i);
       p5++;
       p4[p5] = Utf8$DecodeUtil.lowSurrogate(i);
       return;
    }
    public static void handleOneByte(byte p0,char[] p1,int p2){
       p1[p2] = (char)p0;
    }
    public static void handleThreeBytes(byte p0,byte p1,byte p2,char[] p3,int p4){
       if (Utf8$DecodeUtil.isNotTrailingByte(p1) || (p0 == -32 && (p1 < -96 || (p0 == -19 && (p1 >= -96 || Utf8$DecodeUtil.isNotTrailingByte(p2)))))) {
          throw InvalidProtocolBufferException.invalidUtf8();
       }
       p3[p4] = (char)((((p0 & 0x0f) << 12) | (Utf8$DecodeUtil.trailingByteValue(p1) << 6)) | Utf8$DecodeUtil.trailingByteValue(p2));
       return;
    }
    public static void handleTwoBytes(byte p0,byte p1,char[] p2,int p3){
       if (p0 < -62 || Utf8$DecodeUtil.isNotTrailingByte(p1)) {
          throw InvalidProtocolBufferException.invalidUtf8();
       }
       p2[p3] = (char)(((p0 & 0x1f) << 6) | Utf8$DecodeUtil.trailingByteValue(p1));
       return;
    }
    public static char highSurrogate(int p0){
       return (char)((p0 >> 10) + 0xd7c0);
    }
    public static boolean isNotTrailingByte(byte p0){
       boolean b = (p0 > -65)? true: false;
       return b;
    }
    public static boolean isOneByte(byte p0){
       boolean b = (p0 >= 0)? true: false;
       return b;
    }
    public static boolean isThreeBytes(byte p0){
       boolean b = (p0 < -16)? true: false;
       return b;
    }
    public static boolean isTwoBytes(byte p0){
       boolean b = (p0 < -32)? true: false;
       return b;
    }
    public static char lowSurrogate(int p0){
       return (char)((p0 & 0x03ff) + 0xdc00);
    }
    public static int trailingByteValue(byte p0){
       return (p0 & 0x3f);
    }
}
