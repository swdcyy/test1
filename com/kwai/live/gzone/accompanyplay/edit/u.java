package com.kwai.live.gzone.accompanyplay.edit.u;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import n37.k;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import n37.c0;
import com.kwai.live.gzone.accompanyplay.edit.y;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class u implements g	// class@000c19
{
    public final v b;

    public void u(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       if (!tb.q.K()) {
       }else if(p0.a != null && (p0.b == null || p0.c == null)){
          tb.S8();
       }else {
          tb.r = p0;
          v ov = v.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, ov, "12")) {
             if (TextUtils.x(tb.r.d)) {
                v r = tb.r;
                r.d = r.a.mDefaultFleetId;
             }
             tb.P8(p0);
             if (!PatchProxy.applyVoid(null, tb, ov, "13")) {
                k c = tb.r.c;
                if (c != null) {
                   tb.X8(tb.R8(c.mBindUserInfo));
                }
             }
             tb.X7(p0.k.subscribe(new c0(tb, p0), new y(tb)));
          }
       }
       return;
    }
}
