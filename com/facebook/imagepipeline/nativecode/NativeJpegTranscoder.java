package com.facebook.imagepipeline.nativecode.NativeJpegTranscoder;
import ld.c;
import java.lang.Object;
import fd.c;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Boolean;
import ab.e;
import ld.e;
import bd.d;
import uc.e;
import uc.d;
import com.facebook.imageformat.a;
import nc.a;
import java.lang.Integer;
import ld.b;
import ld.a;
import java.lang.Math;
import java.util.ArrayList;
import com.facebook.common.internal.b;
import java.lang.String;

public class NativeJpegTranscoder implements c	// class@00110c
{
    public boolean a;
    public int b;
    public boolean c;

    public void NativeJpegTranscoder(boolean p0,int p1,boolean p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (p3) {
          c.a();
       }
       return;
    }
    public static void d(InputStream p0,OutputStream p1,int p2,int p3,int p4){
       c.a();
       boolean b = false;
       boolean b1 = (p3 >= 1)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p3 <= 16)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p4 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p4 <= 100)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p2 >= 0 && (p2 <= 270 && !(p2 % 90)))? true: false;
       e.a(Boolean.valueOf(b1));
       if (p3 != 8 || p2) {
          b = true;
       }
       e.b(b, "no transformation requested");
       e.d(p0);
       e.d(p1);
       NativeJpegTranscoder.nativeTranscodeJpeg(p0, p1, p2, p3, p4);
       return;
    }
    public static void e(InputStream p0,OutputStream p1,int p2,int p3,int p4){
       c.a();
       boolean b = false;
       int i = 1;
       boolean b1 = (p3 >= i)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p3 <= 16)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p4 >= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (p4 <= 100)? true: false;
       e.a(Boolean.valueOf(b1));
       switch (p2){
           case 1:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 2:
             b1 = true;
             break;
           default:
             b1 = false;
       }
       e.a(Boolean.valueOf(b1));
       if (p3 != 8 || p2 != i) {
          b = true;
       }
       e.b(b, "no transformation requested");
       e.d(p0);
       e.d(p1);
       NativeJpegTranscoder.nativeTranscodeJpegWithExifOrientation(p0, p1, p2, p3, p4);
       return;
    }
    public static native void nativeTranscodeJpeg(InputStream p0,OutputStream p1,int p2,int p3,int p4);
    public static native void nativeTranscodeJpegWithExifOrientation(InputStream p0,OutputStream p1,int p2,int p3,int p4);
    public boolean a(d p0,e p1,d p2){
       if (p1 == null) {
          p1 = e.a();
       }
       boolean b = (e.c(p1, p2, p0, this.a) < 8)? true: false;
       return b;
    }
    public boolean b(a p0){
       boolean b = (p0 == a.a)? true: false;
       return b;
    }
    public b c(d p0,OutputStream p1,e p2,d p3,a p4,Integer p5){
       if (p5 == null) {
          p5 = Integer.valueOf(85);
       }
       if (p2 == null) {
          p2 = e.a();
       }
       int i = a.a(p2, p3, p0, this.b);
       int i1 = e.c(p2, p3, p0, this.a);
       int i2 = 1;
       int i3 = Math.max(i2, (8 / i));
       if (this.c != null) {
          i1 = i3;
       }
       InputStream inputStream = p0.k();
       if (e.a.contains(Integer.valueOf(p0.g()))) {
          e.e(inputStream, "Cannot transcode from null input stream!");
          NativeJpegTranscoder.e(inputStream, p1, e.a(p2, p0), i1, p5.intValue());
       }else {
          e.e(inputStream, "Cannot transcode from null input stream!");
          NativeJpegTranscoder.d(inputStream, p1, e.b(p2, p0), i1, p5.intValue());
       }
       b.b(inputStream);
       if (i != i2) {
          i2 = 0;
       }
       return new b(i2);
    }
    public String getIdentifier(){
       return "NativeJpegTranscoder";
    }
}
