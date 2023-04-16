package com.yxcorp.gifshow.v3.editor.text.p0$a;
import c26.d;
import com.yxcorp.gifshow.v3.editor.text.p0;
import brd.v;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import w46.b;
import brd.g;
import tkd.b;
import tkd.d;
import pca.d0;
import java.lang.Float;

public class p0$a implements d	// class@00147e
{
    public final v a;
    public final p0 b;

    public void p0$a(p0 p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(EncodeInfo$Status p0,PostEncodeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ReEditCoverPresenter", "onStatusChanged status: "+p0, objArray);
       if (p0 == EncodeInfo$Status.COMPLETE || p0 == EncodeInfo$Status.CANCELED) {
          this.a.onNext(p1.getOutputPath());
          this.a.onComplete();
          d.a(0x66204fb9).M30(this);
       }else if(p0 == EncodeInfo$Status.FAILED){
          a.D().e("ReEditCoverPresenter", "onStatusChanged export fail", p1.getThrowable());
          this.a.onNext("");
          this.a.onComplete();
          d.a(0x66204fb9).M30(this);
       }
       return;
    }
    public void b(float p0,PostEncodeInfo p1){
       p0$a uoa = p0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ReEditCoverPresenter", "singlePicture onProgressChanged export, progress: "+p0, objArray);
       return;
    }
}
