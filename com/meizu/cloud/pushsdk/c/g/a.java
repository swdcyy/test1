package com.meizu.cloud.pushsdk.c.g.a;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class a	// class@0014e9
{
    public static final byte[] a;
    public static final byte[] b;

    static {
       a.a = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       a.b = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
    }
    public static byte[] a(String p0){
       int b;
       int i8;
       int i = p0.length();
       int i1 = 9;
       while (i > 0) {
          int i2 = i - 1;
          char c = p0.charAt(i2);
          if (c != '=' && (c != 10 && (c != 13 && (c != ' ' && c != i1)))) {
             break ;
          }else {
             i = i - 1;
          }
       }
       int i3 = (int)(((long)i * 6) / 8);
       byte[] uobyteArray = new byte[i3];
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       while (true) {
          b = 0;
          if (i4 < i) {
             char c1 = p0.charAt(i4);
             if (c1 >= 'A' && c1 <= 'Z') {
                i8 = c1 - 65;
             }else if(c1 >= 'a' && c1 <= 'z'){
                i8 = c1 - 71;
             }else if(c1 >= '0' && c1 <= '9'){
                i8 = c1 + 4;
             }else if(c1 == '+' || c1 == '-'){
                i8 = 62;
             }else if(c1 == '/' || c1 == '_'){
                i8 = 63;
             }else if(c1 != 10 && (c1 != 13 && (c1 == ' ' || c1 == i1))){
             label_009b :
                i4 = i4 + 1;
             }else {
                break ;
             }
             i6 = i6 << 6;
             i6 = i6 | (byte)i8;
             i5 = i5 + 1;
             b = i5 % 4;
             if (!b) {
                b = i7 + 1;
                i8 = i6 >> 16;
                uobyteArray[i7] = (byte)i8;
                i7 = b + 1;
                i8 = i6 >> 8;
                uobyteArray[b] = (byte)i8;
                b = i7 + 1;
                uobyteArray[i7] = (byte)i6;
                i7 = b;
                goto label_009b ;
             }else {
                goto label_009b ;
             }
          }else {
             i5 = i5 % 4;
             if (i5 == 1) {
                return b;
             }
             if (i5 == 2) {
                uobyteArray[i7] = (byte)((i6 << 12) >> 16);
                i7 = i7 + 1;
             }else if(i5 == 3){
                int i9 = i6 << 6;
                i = i7 + 1;
                uobyteArray[i7] = (byte)(i9 >> 16);
                i7 = i + 1;
                uobyteArray[i] = (byte)(i9 >> 8);
             }
             if (i7 == i3) {
                return uobyteArray;
             }else {
                byte[] uobyteArray1 = new byte[i7];
                System.arraycopy(uobyteArray, 0, uobyteArray1, 0, i7);
                return uobyteArray1;
             }
          }
       }
       return b;
    }
}
