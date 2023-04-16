package com.kuaishou.live.audience.component.gift.gift.audience.v2.k$d;
import jk1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import jk1.d;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ik1.b0;
import gq5.f;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import jk1.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import d71.a;

public class k$d implements c	// class@000b21
{
    public final k a;

    public void k$d(k p0){
       this.a = p0;
       super();
    }
    public void a(d p0,UserInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$d.class, "1")) {
          return;
       }
       a0 c2 = this.a.w.c2;
       if (c2 != null) {
          c2.b();
       }
       this.a.w.g2.t();
       this.a.w.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.GIFT_BOX, false);
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "2")) {
          return;
       }
       this.a.w.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.GIFT_BOX, true);
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$d.class, "4")) {
          return;
       }
       this.a.u = objArray;
       b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxPresenter] [onGiftBoxFragmentRemoved]");
       return;
    }
    public void e(int p0,int p1){
       b.d(this, p0, p1);
    }
    public void f(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "3")) {
          return;
       }
       if (!y.d(this.a.getActivity()) || this.a.w.g2.m()) {
          this.a.w.a2.j();
       }
       a0 c2 = this.a.w.c2;
       if (c2 != null) {
          c2.a();
       }
       return;
    }
}
