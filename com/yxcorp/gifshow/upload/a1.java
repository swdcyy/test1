package com.yxcorp.gifshow.upload.a1;
import erd.o;
import com.yxcorp.gifshow.upload.b1;
import brd.t;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.gifshow.upload.g1;
import com.yxcorp.gifshow.upload.SegmentUploader;
import com.yxcorp.gifshow.upload.z0;
import erd.r;
import java.lang.Exception;
import com.yxcorp.gifshow.upload.SegmentUploader$SegmentUploadFailedException;
import java.lang.Math;
import java.util.concurrent.TimeUnit;

public class a1 implements o	// class@001e5d
{
    public final t b;
    public final AtomicInteger c;
    public final b1 d;

    public void a1(b1 p0,t p1,AtomicInteger p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a1.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(this.d.b.d.j != null){
          ot = this.b.takeWhile(z0.b);
       }else if(this.c.get() == 3){
          if (p0 instanceof Exception) {
          }else {
             p0 = new SegmentUploader$SegmentUploadFailedException();
          }
          throw p0;
       }else {
          p0.f = true;
          ot = t.timer(((long)Math.pow(2.00f, (double)this.c.get()) * 200), TimeUnit.MILLISECONDS);
       }
       return ot;
    }
}
