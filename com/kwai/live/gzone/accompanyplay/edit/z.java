package com.kwai.live.gzone.accompanyplay.edit.z;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import n37.k;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import n37.h0;
import com.kwai.live.gzone.accompanyplay.edit.b0;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class z implements g	// class@000c24
{
    public final a0 b;

    public void z(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z tb = this.b;
       if (!tb.q.K()) {
       }else if(p0.a != null){
          k b = p0.b;
          if (b != null && b.mEnableOneClick != null) {
             tb.s = p0;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, a0.class, "6")) {
                if (TextUtils.x(tb.s.d)) {
                   a0 s = tb.s;
                   s.d = s.a.mDefaultFleetId;
                }
                tb.R8(p0);
                tb.X7(p0.k.subscribe(new h0(tb, p0), new b0(tb)));
             }
          }
       }
       tb.S8();
       return;
    }
}
