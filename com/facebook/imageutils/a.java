package com.facebook.imageutils.a;
import java.io.InputStream;
import java.io.IOException;
import java.lang.String;

public class a	// class@001152
{

    public static int a(InputStream p0,int p1,boolean p2){
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= p1) {
             return i1;
          }
          int i2 = p0.read();
          if (i2 != -1) {
             if (p2) {
                i2 = i2 & 0x00ff;
                int i3 = i * 8;
                i2 = i2 << i3;
             }else {
                i1 = i1 << 8;
                i2 = i2 & 0x00ff;
             }
             i1 = i1 | i2;
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IOException("no more bytes");
    }
}
