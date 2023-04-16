package com.yxcorp.gifshow.photo.download.task.o0$a;
import mxc.a;
import com.yxcorp.gifshow.photo.download.task.o0;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.photo.download.task.p0;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.io.File;
import brd.g;
import ixb.j2;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Double;
import ixb.k2;

public class o0$a implements a	// class@000f0f
{
    public final v a;
    public final o0 b;

    public void o0$a(o0 p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0,int p1){
       o0$a uoa = o0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1) {
          this.b.c.b.e.mWaterMarkType = p1;
       }
       this.a.onNext(new File(p0));
       this.a.onComplete();
       return;
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, o0$a.class, "3")) {
          return;
       }
       k1.o(new j2(this));
       return;
    }
    public void onProgress(double p0){
       o0$a uoa = o0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uoa, "2")) {
          return;
       }
       k1.o(new k2(this, p0));
       return;
    }
}
