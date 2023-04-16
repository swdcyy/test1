package com.yxcorp.gifshow.share.KsShareBuilder$c;
import erd.o;
import com.yxcorp.gifshow.share.KsShareBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;
import mhc.l2;
import android.app.Activity;
import uo7.l;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.login.model.LoginParams;
import brd.a0;

public final class KsShareBuilder$c implements o	// class@001b43
{
    public final KsShareBuilder b;

    public void KsShareBuilder$c(KsShareBuilder p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a0 uoa0 = PatchProxy.applyOneRefs(p0, this, KsShareBuilder$c.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Activity uActivity = this.b.b();
          Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          KsShareBuilder$c tb = this.b;
          uoa0 = l2.a.b(uActivity, tb.B, tb.E, tb.J);
       }
       return uoa0;
    }
}
