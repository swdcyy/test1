package com.yxcorp.gifshow.v3.editor.sticker.f0$c;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$c;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import java.util.Map;
import java.io.File;
import java.lang.StringBuilder;
import itc.p1;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import itc.o1;
import erd.g;
import itc.n1;
import itc.m1;
import crd.b;
import java.lang.Throwable;
import java.lang.Long;

public class f0$c extends PostBaseResourceDownloadHelper$c	// class@001249
{
    public final f0 d;

    public void f0$c(f0 p0,StickerDetailInfo p1,PostBaseResourceDownloadHelper$a p2){
       this.d = p0;
       super(p1, null);
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f0$c.class, "2")) {
          return;
       }
       super.onCancel(p0, p1);
       this.d.b.remove(this.b.getId());
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f0$c.class, "4")) {
          return;
       }
       File uFile = new File(f0.k(this.b)+f0.l(this.b));
       a0.y(new p1(this, uFile)).T(d.c).p(new o1(uFile)).G(d.a).R(new n1(this, p0), new m1(this));
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f0$c.class, "3")) {
          return;
       }
       super.onFailed(p0, p1, p2, p3);
       this.d.b.remove(this.b.getId());
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(f0$c.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, f0$c.class, "1")) {
          return;
       }
       super.onProgress(p0, p1, p2);
       if (!this.d.b.containsKey(this.b.getId())) {
          this.d.b.put(this.b.getId(), p0);
       }
       return;
    }
}
