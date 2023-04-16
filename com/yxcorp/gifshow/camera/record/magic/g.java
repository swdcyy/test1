package com.yxcorp.gifshow.camera.record.magic.g;
import erd.g;
import brd.v;
import com.yxcorp.gifshow.activity.GifshowActivity;
import s3b.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import android.app.Activity;
import qm6.b$a;
import ce9.r;
import brd.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import tkd.b;
import tkd.d;
import t5b.a;
import ixc.c;
import ce9.m;
import io.reactivex.g;
import com.yxcorp.gifshow.fragment.ObservableBox$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ObservableBox;
import t45.d;
import brd.z;
import ce9.p;
import ce9.n;
import crd.b;

public final class g implements g	// class@000e34
{
    public final v b;
    public final GifshowActivity c;
    public final a d;

    public void g(v p0,GifshowActivity p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       if (!g.y(p0)) {
          tb.onNext(r.a(tc, p0));
          tb.onComplete();
       }else {
          t ot = PatchProxy.applyOneRefs(p0, null, r.class, "4");
          if (ot != PatchProxyResult.class) {
          }else if(!g.y(p0)){
             ot = t.just(p0);
          }else {
             ot = t.create(new m(d.a(0x3bf0d115).KA(), p0));
          }
          ObservableBox$b uob = new ObservableBox$b(tc);
          uob.a(true);
          ot = ObservableBox.b(ot, uob);
          ot.observeOn(d.a).subscribe(new p(tb, tc, p0), new n(td));
       }
       return;
    }
}
