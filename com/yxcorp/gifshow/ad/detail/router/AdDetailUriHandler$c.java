package com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qh7.c;
import yh7.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import lnc.y0;
import tkd.b;
import tkd.d;
import nu5.a;
import nu5.a$a;
import android.view.View;

public final class AdDetailUriHandler$c implements g	// class@0016e4
{
    public final AdDetailUriHandler b;
    public final GifshowActivity c;
    public final c d;
    public final a e;

    public void AdDetailUriHandler$c(AdDetailUriHandler p0,GifshowActivity p1,c p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, AdDetailUriHandler$c.class, "1")) {
       }else {
          a.p(obj, "photo");
          p0 = this.b;
          AdDetailUriHandler$c tc = this.c;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidTwoRefs(obj, tc, p0, AdDetailUriHandler.class, "3") && !y0.o(tc)) {
             d.a(-977155072).yV(tc, 0, obj, null, null, null, 0, 0);
             tc.overridePendingTransition(0, 0);
          }
          this.d.a(this.e);
       }
       return;
    }
}
