package com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import ld.d;
import java.lang.Object;
import com.facebook.imageformat.a;
import ld.c;
import nc.a;
import com.facebook.imagepipeline.nativecode.NativeJpegTranscoder;

public class NativeJpegTranscoderFactory implements d	// class@00110d
{
    public final int a;
    public final boolean b;
    public final boolean c;

    public void NativeJpegTranscoderFactory(int p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public c createImageTranscoder(a p0,boolean p1){
       if (p0 != a.a) {
          return null;
       }
       return new NativeJpegTranscoder(p1, this.a, this.b, this.c);
    }
}
