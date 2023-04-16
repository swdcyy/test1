package com.kwai.live.gzone.accompanyplay.audience.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.TextView;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.y;
import erd.g;
import crd.b;
import o37.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyAnchorGameAccountInfo;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneLivelinkConfig;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyEasyBoardConfig;
import ekd.m1;
import android.content.Context;
import d61.f0;
import k37.x;
import android.view.View$OnClickListener;

public class h0 extends PresenterV2	// class@000b80
{
    public k0$g p;
    public TextView q;
    public View r;
    public TextView s;
    public TextView t;
    public View u;
    public TextView v;
    public a w;

    public void h0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       this.u.getLayoutParams().width = -1;
       this.v.setText(R.string.arg_RES_7f10237c);
       this.X7(this.p.n().subscribe(new y(this)));
       return;
    }
    public final String P8(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.R8(p0)) {
          return a1.r(0x7f1013ad, p0.mAnchorGameAccount.authorGameAccountName);
       }
       return a1.r(0x7f1013ae, p0.mAnchorGameAccount.authorGameAccountName);
    }
    public final boolean R8(a p0){
       a mLivelinkCon = p0.mLivelinkConfig;
       boolean b = true;
       if (mLivelinkCon == null || mLivelinkCon.mRoomCreate == null) {
          p0 = p0.mEasyBoardConfig;
          if (p0 == null || p0.mAudienceScheme == null) {
             b = false;
          }
       }
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1213);
       this.r = m1.f(p0, 0x7f0a11d3);
       this.s = m1.f(p0, 0x7f0a11dd);
       this.t = m1.f(p0, 0x7f0a1222);
       this.u = m1.f(p0, 0x7f0a11ea);
       this.v = m1.f(p0, 0x7f0a11eb);
       f0.i(this.q, this.getContext());
       m1.a(p0, new x(this), R.id.gzone_accompany_wait_bottom_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}
