package com.yxcorp.gifshow.activity.preview.e;
import c26.d;
import brd.v;
import b26.c;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.preview.f$a;
import java.lang.Enum;
import gq.a;
import q87.c;
import tkd.b;
import tkd.d;
import pca.d0;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import brd.g;
import b26.d;
import android.util.Pair;
import java.lang.Float;
import java.lang.StringBuilder;

public class e implements d	// class@001363
{
    public final v a;
    public final c b;
    public final int c;

    public void e(v p0,c p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(EncodeInfo$Status p0,PostEncodeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       int i = f$a.a[p0.ordinal()];
       int i1 = 0;
       String str = "PreviewEncodeUtil";
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                Object[] objArray = new Object[i1];
                a.D().w(str, "encode cancel", objArray);
                d.a(0x66204fb9).M30(this);
             }
          }else if(p1.getThrowable() != null){
             this.a.onError(p1.getThrowable());
          }else {
             this.a.onError(new Throwable("Encode failed."));
          }
          d.a(0x66204fb9).M30(this);
          this.b.cancel(p1.mId);
       }else {
          Object[] objArray1 = new Object[i1];
          a.D().w(str, "encode complete", objArray1);
          this.a.onNext(new Pair(null, Float.valueOf(0x3f800000)));
          this.a.onNext(new Pair(p1, Float.valueOf(0x3f800000)));
          this.a.onComplete();
          d.a(0x66204fb9).M30(this);
       }
       return;
    }
    public void b(float p0,PostEncodeInfo p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       if (this.c == p1.getId()) {
          Object[] objArray = new Object[0];
          a.D().w("PreviewEncodeUtil", "encoding id: "+this.c+" progress: "+p0, objArray);
          this.a.onNext(new Pair(null, Float.valueOf(p0)));
       }
       return;
    }
}
