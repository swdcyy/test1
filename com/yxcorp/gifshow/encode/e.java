package com.yxcorp.gifshow.encode.e;
import io.reactivex.g;
import com.yxcorp.gifshow.encode.i;
import java.util.List;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import java.lang.Object;
import brd.v;
import gq.a;
import java.lang.String;
import q87.c;
import java.util.Objects;
import pca.g;
import erd.f;
import com.yxcorp.gifshow.encode.h;
import mca.a;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import android.content.Context;
import lnc.a1;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import pca.c;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import pca.b;
import erd.o;
import com.yxcorp.gifshow.encode.d;
import com.yxcorp.gifshow.encode.i$b;
import com.yxcorp.gifshow.encode.c;
import erd.g;
import com.yxcorp.gifshow.encode.b;
import pca.i;
import pca.f;
import erd.a;
import crd.b;

public final class e implements g	// class@000d19
{
    public final i b;
    public final List c;
    public final KSAssetExportInfo d;
    public final boolean e;
    public final boolean f;

    public void e(i p0,List p1,KSAssetExportInfo p2,boolean p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       i a;
       t ot;
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       e te = this.e;
       e tf = this.f;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("AssetExportManager", "rxCompressAndClipMedias: start ", objArray);
       Objects.requireNonNull(tb);
       p0.setCancellable(new g(tb));
       h oh = new h(p0);
       a.u();
       tb.e = new ThumbnailGenerator(a1.c());
       tb.d = -1;
       tb.i = i;
       if (tb.a == null) {
          tb.a = new a();
       }
       a = tb.a;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray1 = new Object[]{tc,td,Boolean.valueOf(te),Boolean.valueOf(tf),oh};
          ot = PatchProxy.apply(objArray1, tb, oi, "7");
          if (ot != PatchProxyResult.class) {
          label_009d :
             a.c(ot.observeOn(d.a).subscribe(b.b, new i(tb, oh), new f(tb, oh)));
             return;
          }
       }
       ot = t.fromCallable(new c(tb, tc, te, td)).subscribeOn(d.c).concatMap(new b(tb)).concatMap(new d(tb, td, oh, tf)).doOnError(c.b);
       goto label_009d ;
    }
}
