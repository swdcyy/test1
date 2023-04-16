package com.yxcorp.gifshow.encode.f0;
import erd.o;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import android.util.Pair;
import qkd.b;
import java.lang.Float;
import brd.t;
import com.yxcorp.gifshow.encode.s0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.encode.b0;
import io.reactivex.g;
import t45.d;
import brd.z;
import pca.q0;

public final class f0 implements o	// class@000d1a
{
    public final boolean b;
    public final File c;
    public final File d;
    public final VideoContext e;

    public void f0(boolean p0,File p1,File p2,VideoContext p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       Object[] objArray;
       t ot;
       f0 tb = this.b;
       f0 tc = this.c;
       f0 td = this.d;
       f0 te = this.e;
       Pair first = p0.first;
       if (first != null) {
          if (tb != null || tc != null) {
             Pair pair = first;
             s0 os0 = s0.class;
             int i = 0;
             if (PatchProxy.isSupport(os0)) {
                objArray = new Object[]{pair,td,tc,te,Boolean.valueOf(tb)};
                ot = PatchProxy.apply(objArray, null, os0, "49");
                if (ot != PatchProxyResult.class) {
                label_00aa :
                   p0 = ot.observeOn(d.c).map(new q0(p0));
                }
             }
             Object[] objArray1 = new Object[i];
             a.D().w("EncodingUtils", "encodeWatermarkVideoFile\(\) called with: input = ["+pair+"], output = ["+td+"], cover = ["+tc+"], videoContext = ["+te+"], needWaterMark = ["+tb+"]", objArray1);
             b0 uob0 = new b0(tc, pair, te, tb, td);
             ot = t.create(objArray).subscribeOn(d.c).observeOn(d.a);
             goto label_00aa ;
          }else {
             b.k0(first, td);
             p0 = t.just(Float.valueOf(0x3f800000));
          }
       }else {
          p0 = t.just(p0.second);
       }
       return p0;
    }
}
