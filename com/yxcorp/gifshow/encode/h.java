package com.yxcorp.gifshow.encode.h;
import com.yxcorp.gifshow.encode.i$b;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import q87.c;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import java.lang.Double;
import java.lang.Math;

public class h implements i$b	// class@000d22
{
    public final v a;

    public void h(v p0){
       this.a = p0;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "rxCompressAndClipMedias onComplete\(\) ", objArray);
       this.a.onNext(Integer.valueOf(100));
       this.a.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       a.D().z("AssetExportManager", "rxCompressAndClipMedias onError: ", p0);
       this.a.onError(p0);
       return;
    }
    public void onProgress(double p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, oh, "1")) {
          return;
       }
       this.a.onNext(Integer.valueOf(Math.min((int)p0, 99)));
       return;
    }
}
