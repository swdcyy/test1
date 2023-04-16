package com.facebook.imagepipeline.nativecode.WebpTranscoderImpl;
import com.facebook.imagepipeline.nativecode.a;
import java.lang.Object;
import java.io.InputStream;
import java.io.OutputStream;
import com.facebook.imageformat.a;
import nc.a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import jb.c;
import fd.d;
import ab.e;

public class WebpTranscoderImpl implements a	// class@00110f
{

    public void WebpTranscoderImpl(){
       super();
    }
    public static native void nativeTranscodeWebpToJpeg(InputStream p0,OutputStream p1,int p2);
    public static native void nativeTranscodeWebpToPng(InputStream p0,OutputStream p1);
    public boolean a(a p0){
       if (p0 == a.f) {
          return true;
       }
       if (p0 != a.g && (p0 == a.h || p0 == a.i)) {
          return c.c;
       }
       if (p0 == a.j) {
          return false;
       }
       throw new IllegalArgumentException("Image format is not a WebP.");
    }
    public void b(InputStream p0,OutputStream p1){
       d.a();
       e.d(p0);
       e.d(p1);
       WebpTranscoderImpl.nativeTranscodeWebpToPng(p0, p1);
    }
    public void c(InputStream p0,OutputStream p1,int p2){
       d.a();
       e.d(p0);
       e.d(p1);
       WebpTranscoderImpl.nativeTranscodeWebpToJpeg(p0, p1, p2);
    }
}
