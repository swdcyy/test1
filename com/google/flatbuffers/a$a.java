package com.google.flatbuffers.a$a;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class a$a	// class@00193f
{

    public static void a(byte p0,byte p1,byte p2,byte p3,char[] p4,int p5){
       if (a$a.e(p1) || ((((p0 << 28) + (p1 + 112)) >> 30) || (a$a.e(p2) || a$a.e(p3)))) {
          throw new IllegalArgumentException("Invalid UTF-8");
       }
       int i = ((((p0 & 0x07) << 18) | (a$a.i(p1) << 12)) | (a$a.i(p2) << 6)) | a$a.i(p3);
       p4[p5] = (char)((i >> 10) + 0xd7c0);
       p5++;
       p4[p5] = (char)((i & 0x03ff) + 0xdc00);
       return;
    }
    public static void b(byte p0,char[] p1,int p2){
       p1[p2] = (char)p0;
    }
    public static void c(byte p0,byte p1,byte p2,char[] p3,int p4){
       if (a$a.e(p1) || (p0 == -32 && (p1 < -96 || (p0 == -19 && (p1 >= -96 || a$a.e(p2)))))) {
          throw new IllegalArgumentException("Invalid UTF-8");
       }
       p3[p4] = (char)((((p0 & 0x0f) << 12) | (a$a.i(p1) << 6)) | a$a.i(p2));
       return;
    }
    public static void d(byte p0,byte p1,char[] p2,int p3){
       if (p0 < -62 || a$a.e(p1)) {
          throw new IllegalArgumentException("Invalid UTF-8");
       }
       p2[p3] = (char)(((p0 & 0x1f) << 6) | a$a.i(p1));
       return;
    }
    public static boolean e(byte p0){
       boolean b = (p0 > -65)? true: false;
       return b;
    }
    public static boolean f(byte p0){
       boolean b = (p0 >= 0)? true: false;
       return b;
    }
    public static boolean g(byte p0){
       boolean b = (p0 < -16)? true: false;
       return b;
    }
    public static boolean h(byte p0){
       boolean b = (p0 < -32)? true: false;
       return b;
    }
    public static int i(byte p0){
       return (p0 & 0x3f);
    }
}
