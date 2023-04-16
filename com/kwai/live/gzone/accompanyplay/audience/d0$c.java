package com.kwai.live.gzone.accompanyplay.audience.d0$c;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.accompanyplay.audience.d0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o37.a;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k37.a0;
import crd.b;
import lnc.b9;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import k37.t;
import com.kwai.live.gzone.accompanyplay.audience.e0;
import erd.g;

public class d0$c extends m	// class@000b75
{
    public final d0 c;

    public void d0$c(d0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$c.class, "1")) {
          return;
       }
       d0$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, d0.class, "5") && tc.y != null) {
          a uoa = tc.s.t();
          if (uoa != null) {
             a mGameInfo = uoa.mGameInfo;
             if (mGameInfo != null) {
                if (mGameInfo.mEnableOneClick != null) {
                   d0 t = tc.t;
                   if (t == null || !t.b()) {
                   }
                }else {
                }
             }
          }
       }
       return;
    }
}
