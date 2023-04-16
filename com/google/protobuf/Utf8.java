package com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnsafeProcessor;
import com.google.protobuf.Android;
import com.google.protobuf.Utf8$SafeProcessor;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.String;
import com.google.protobuf.Utf8$Processor;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Character;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.lang.AssertionError;

public final class Utf8	// class@0004ef
{
    public static final Utf8$Processor processor;

    static {
       Utf8$UnsafeProcessor unsafeProces = (Utf8$UnsafeProcessor.isAvailable() && !Android.isOnAndroidDevice())? new Utf8$UnsafeProcessor(): new Utf8$SafeProcessor();
       Utf8.processor = unsafeProces;
    }
    public void Utf8(){
       super();
    }
    public static String decodeUtf8(ByteBuffer p0,int p1,int p2){
       return Utf8.processor.decodeUtf8(p0, p1, p2);
    }
    public static String decodeUtf8(byte[] p0,int p1,int p2){
       return Utf8.processor.decodeUtf8(p0, p1, p2);
    }
    public static int encode(CharSequence p0,byte[] p1,int p2,int p3){
       return Utf8.processor.encodeUtf8(p0, p1, p2, p3);
    }
    public static void encodeUtf8(CharSequence p0,ByteBuffer p1){
       Utf8.processor.encodeUtf8(p0, p1);
    }
    public static int encodedLength(CharSequence p0){
       int i = p0.length();
       int i1 = 0;
       while (i1 < i && p0.charAt(i1) < 128) {
          i1 = i1 + 1;
       }
       int i2 = i;
       for (; i1 < i; i1 = i1 + 1) {
          char c = p0.charAt(i1);
          if (c < 2048) {
             int i3 = c - 127;
             i3 = i3 >> 31;
             i2 = i2 + i3;
          }else {
             i2 = i2 + Utf8.encodedLengthGeneral(p0, i1);
             break ;
          }
       }
       if (i2 >= i) {
          return i2;
       }
       throw new IllegalArgumentException("UTF-8 length does not fit in int: "+((long)i2 + 0x100000000));
    }
    public static int encodedLengthGeneral(CharSequence p0,int p1){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (p1 >= i) {
             return i1;
          }
          char c = p0.charAt(p1);
          if (c < 2048) {
             int i2 = c - 127;
             i2 = i2 >> 31;
             i1 = i1 + i2;
          }else {
             i1 = i1 + 2;
             if (0xd800 <= c && c <= 0xdfff) {
                if (Character.codePointAt(p0, p1) >= 0x10000) {
                   p1++;
                }else {
                   break ;
                }
             }
          }
          p1++;
       }
       throw new Utf8$UnpairedSurrogateException(p1, i);
    }
    public static int estimateConsecutiveAscii(ByteBuffer p0,int p1,int p2){
       p2 = p2 - 7;
       int i = p1;
       while (i < p2) {
          long l = p0.getLong(i) & 0x8080808080808080;
          if (!l) {
             i = i + 8;
          }else {
             break ;
          }
       }
       return (i - p1);
    }
    public static int incompleteStateFor(int p0){
       if (p0 > -12) {
          p0 = -1;
       }
       return p0;
    }
    public static int incompleteStateFor(int p0,int p1){
       p0 = (p0 > -12 || p1 > -65)? -1: p0 ^ (p1 << 8);
       return p0;
    }
    public static int incompleteStateFor(int p0,int p1,int p2){
       p0 = (p0 <= -12 && (p1 > -65 || p2 > -65))? -1: (p0 ^ (p1 << 8)) ^ (p2 << 16);
       return p0;
    }
    public static int incompleteStateFor(ByteBuffer p0,int p1,int p2,int p3){
       if (!p3) {
          return Utf8.incompleteStateFor(p1);
       }
       if (p3 == 1) {
          return Utf8.incompleteStateFor(p1, p0.get(p2));
       }
       if (p3 == 2) {
          return Utf8.incompleteStateFor(p1, p0.get(p2), p0.get((p2 + 1)));
       }
       throw new AssertionError();
    }
    public static int incompleteStateFor(byte[] p0,int p1,int p2){
       byte b = p0[(p1 - 1)];
       p2 = p2 - p1;
       if (!p2) {
          return Utf8.incompleteStateFor(b);
       }
       if (p2 == 1) {
          return Utf8.incompleteStateFor(b, p0[p1]);
       }
       if (p2 == 2) {
          return Utf8.incompleteStateFor(b, p0[p1], p0[(p1 + 1)]);
       }
       throw new AssertionError();
    }
    public static boolean isValidUtf8(ByteBuffer p0){
       return Utf8.processor.isValidUtf8(p0, p0.position(), p0.remaining());
    }
    public static boolean isValidUtf8(byte[] p0){
       return Utf8.processor.isValidUtf8(p0, 0, p0.length);
    }
    public static boolean isValidUtf8(byte[] p0,int p1,int p2){
       return Utf8.processor.isValidUtf8(p0, p1, p2);
    }
    public static int partialIsValidUtf8(int p0,ByteBuffer p1,int p2,int p3){
       return Utf8.processor.partialIsValidUtf8(p0, p1, p2, p3);
    }
    public static int partialIsValidUtf8(int p0,byte[] p1,int p2,int p3){
       return Utf8.processor.partialIsValidUtf8(p0, p1, p2, p3);
    }
}
