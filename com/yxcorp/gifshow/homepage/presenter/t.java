package com.yxcorp.gifshow.homepage.presenter.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.presenter.s;
import erd.g;
import crd.b;
import brd.t;
import yta.x1;
import android.view.View$OnClickListener;
import android.view.View;
import dsa.e;
import q87.c;
import android.content.Context;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.framework.model.user.User;
import jyc.b;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import android.view.ViewStub;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kwai.framework.model.feed.BaseFeed;

public class t extends PresenterV2	// class@0017e8
{
    public CardStyle A;
    public ViewStub p;
    public ViewStub q;
    public View r;
    public CommonMeta s;
    public User t;
    public PublishSubject u;
    public CoverMeta v;
    public BaseFeed w;
    public PublishSubject x;
    public ViewGroup y;
    public View z;

    public void t(CardStyle p0){
       super();
       this.A = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       this.P8();
       this.X7(this.u.subscribe(new s(this)));
       this.X7(this.x.subscribe(new x1(this)));
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "6")) {
          return;
       }
       t tz = this.z;
       if (tz == null) {
          return;
       }
       tz.setOnClickListener(objArray);
       this.z.setVisibility(8);
       return;
    }
    public final void R8(){
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "PhotoFansPromotePresenter";
       e.C().w(str, "onFansPromoteClick", objArray1);
       if (this.getContext() == null) {
          objArray = new Object[i];
          e.C().t(str, "onFansPromoteClick context is null", objArray);
          return;
       }else {
          c.i(this.getContext(), KwaiWebViewActivity.N3(this.getContext(), b.d(WebEntryUrls.f, "14", this.s.mId, this.t.mId)).o("ks://fansTop").a());
          if (!PatchProxy.applyVoid(objArray, this, ot, "11")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 1;
             uElementPack.action = 0x757c;
             uElementPack.name = "cover";
             u1.u(6, uElementPack, objArray);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.r = p0;
       this.q = m1.f(p0, 0x7f0a0de7);
       this.p = m1.f(p0, 0x7f0a3063);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.s = this.q8(CommonMeta.class);
       this.t = this.q8(User.class);
       this.u = this.r8("PHOTO_FANS_PROMOTE");
       this.v = this.q8(CoverMeta.class);
       this.w = this.r8("feed");
       this.x = this.r8("PHOTO_FANS_PROMOTE_V2");
       return;
    }
}
