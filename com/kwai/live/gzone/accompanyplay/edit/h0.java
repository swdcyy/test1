package com.kwai.live.gzone.accompanyplay.edit.h0;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import n37.k;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import mkc.b;
import android.view.View;
import mkc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameFleetSetting;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import com.kwai.live.gzone.accompanyplay.anchor.m$a;
import com.kwai.live.gzone.accompanyplay.edit.m;
import java.lang.StringBuilder;
import lnc.a1;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.util.HashMap;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserGameInfoResponse$FollowOfficialAccount;
import n37.c1;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n37.d1;
import n37.z0;
import n37.b1;
import n37.a1;

public final class h0 implements g	// class@000bf6
{
    public final j0 b;

    public void h0(j0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j0 g;
       k b;
       h0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == null) {
          tb.D.o();
       }else {
          b[] uobArray = new b[]{b.d};
          c.d(tb.C, uobArray);
          tb.C.setVisibility(8);
          tb.G = p0;
          p0 = j0.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "5")) {
             if (TextUtils.x(tb.G.d)) {
                g = tb.G;
                g.d = g.a.mDefaultFleetId;
             }
             g = tb.E;
             if (g != null) {
                b = tb.G.b;
                if (b != null && b.mEnableOneClick != null) {
                   g.b(b.mAccompanySdkPlatformConfig);
                }
             }
             if (!PatchProxy.applyVoid(objArray, tb, p0, "10")) {
                if (TextUtils.x(tb.F.n)) {
                   tb.r.setText(tb.G.b.mGameName+a1.p(R.string.arg_RES_7f10230d));
                }
                p0 = tb.G.a.mFleetSettingList.iterator();
                while (p0.hasNext()) {
                   LiveGzoneAccompanyFleetSetting liveGzoneAcc = p0.next();
                   liveGzoneAcc.resetEditingItemValue();
                   tb.G.m.put(liveGzoneAcc.mFleetId, liveGzoneAcc);
                }
                if (tb.F.e != null) {
                   tb.B.setVisibility(0);
                }
                if (!j.h(tb.G.b.mGamePanelBackground)) {
                   tb.z.U(tb.G.b.mGamePanelBackground);
                }
                if (tb.G.e != null) {
                   tb.x.setVisibility(0);
                   tb.w.setVisibility(0);
                   tb.w.setText(a1.r(R.string.arg_RES_7f102355, tb.G.e.mAccountName));
                }
             }
             tb.P8();
             tb.X7(tb.G.i.subscribe(new c1(tb)));
             tb.X7(tb.G.k.subscribe(new d1(tb)));
             tb.X7(tb.G.j.subscribe(new z0(tb)));
             tb.X7(tb.G.l.subscribe(new b1(tb)));
             tb.X7(tb.G.f.subscribe(new a1(tb)));
          }
       }
       return;
    }
}
