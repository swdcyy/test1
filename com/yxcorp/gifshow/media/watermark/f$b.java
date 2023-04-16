package com.yxcorp.gifshow.media.watermark.f$b;
import com.yxcorp.gifshow.video.d$c;
import com.yxcorp.gifshow.media.watermark.f;
import com.yxcorp.gifshow.media.watermark.VideoWatermarkTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ekd.k1;
import lnc.qa;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import y6b.q;
import erd.a;
import crd.b;
import java.io.File;
import com.kwai.robust.PatchProxyResult;

public class f$b implements d$c	// class@001d35
{
    public final VideoWatermarkTask a;
    public final f b;

    public void f$b(f p0,VideoWatermarkTask p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void build(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "1")) {
          return;
       }
       f$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, VideoWatermarkTask.class, "2")) {
          k1.c();
          qa.e.h(LoadPolicy.SILENT_IMMEDIATE).t(new q(ta));
       }
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "2")) {
          return;
       }
       this.a.i = true;
       return;
    }
    public File getOutputFile(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d;
    }
}
