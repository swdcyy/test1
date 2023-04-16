package com.yxcorp.gifshow.camera.record.magic.f;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import java.lang.Object;
import brd.v;
import ce9.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i4b.g;
import tkd.b;
import tkd.d;
import t5b.a;
import s3b.a;
import ixc.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.magic.g;
import ce9.o;
import erd.g;
import crd.b;

public final class f implements g	// class@000e33
{
    public final GifshowActivity b;
    public final SimpleMagicFace c;
    public final String d;

    public void f(GifshowActivity p0,SimpleMagicFace p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (PatchProxy.applyVoidFourRefs(tb, tc, p0, td, null, r.class, "2")) {
       }else {
          g.D();
          a uoa = d.a(0x3bf0d115).KA();
          uoa.c(tc, MagicBusinessId.VIDEO, td).observeOn(d.a).subscribe(new g(p0, tb, uoa), new o(uoa));
       }
       return;
    }
}
