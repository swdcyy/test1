package com.meizu.cloud.pushsdk.b.d;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;

public class d	// class@0014ad
{
    public final String e;
    public char[] f;
    public int g;
    public static final char[] a;
    public static final char b;
    public static final char c;
    public static final char d;

    static {
       d.a = new char[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       d.b = (char)Integer.parseInt("00000011", 2);
       d.c = (char)Integer.parseInt("00001111", 2);
       d.d = (char)Integer.parseInt("00111111", 2);
    }
    public void d(String p0){
       super();
       this.g = 0;
       this.e = p0;
       this.a();
    }
    public String a(byte[] p0){
       String str1;
       int i2;
       if (p0 == null || !p0.length) {
          return null;
       }
       StringBuilder str = new StringBuilder((((p0.length + 2) / 3) * 4));
       int len = p0.length;
       for (int i = 0; i < len; i = i3) {
          int i1 = i + 1;
          i = p0[i] & 0x00ff;
          if (i1 == len) {
             str = str+this.f[(i >> 2)]+this.f[((i & d.b) << 4)];
             str1 = "==";
          }else {
             i2 = i1 + 1;
             i1 = p0[i1] & 0x00ff;
             if (i2 == len) {
                str = str+this.f[(i >> 2)]+this.f[(((i & d.b) << 4) | (i1 >> 4))]+this.f[((d.c & i1) << 2)];
                str1 = "=";
             }
          }
          str = str+str1;
          break ;
          int i3 = i2 + 1;
          i2 = p0[i2] & 0x00ff;
          int i4 = i >> 2;
          i = i & d.b;
          i = i << 4;
          i4 = i1 >> 4;
          i = i | i4;
          i1 = i1 & d.c;
          i1 = i1 << 2;
          int i5 = i2 >> 6;
          i1 = i1 | i5;
          i1 = d.d & i2;
          str = str+this.f[i4]+this.f[i]+this.f[i1]+this.f[i1];
       }
       return str;
    }
    public final void a(){
       char[] uocharArray = new char[d.a.length];
       int i = 0;
       this.g = (this.e).charAt(i) % 13;
       char[] a = d.a;
       while (i < a.length) {
          int i1 = this.g + i;
          i1 = i1 % a.length;
          uocharArray[i] = a[i1];
          i = i + 1;
       }
       this.f = uocharArray;
       return;
    }
}
