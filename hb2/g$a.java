package hb2.g$a;
import hb2.g$b;
import hb2.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import hb2.a;
import android.view.View;
import xj2.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import yj2.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import gq5.f;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import za2.y;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;

public class g$a implements g$b	// class@002d46
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       g$a uoa1;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a.q.Y0.r2(AudienceBizRelation.GUEST_ACTIVITY)) {
          this.a.C.B();
          return;
       }else if(p0){
          g y = this.a.y;
          if (y != null && y.getTranslationX() - null) {
             uoa1 = 1;
          label_003f :
             if (!this.a.C.H() && uoa1) {
                uoa = this.a;
                LiveStreamFeed mLiveSideBar = uoa.s.d.mLiveSideBarModel;
                if (mLiveSideBar != null && mLiveSideBar.mLiveSideType == 2) {
                   g q = uoa.q;
                   LiveStreamFeedWrapper mEntity = q.c.mEntity;
                   ClientContent$LiveStreamPackage liveStreamPa = q.Z2.a();
                   a0 l = this.a.q.l;
                   if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidFourRefs(mEntity, liveStreamPa, Integer.valueOf(7), Integer.valueOf(l), null, a.class, "6") && mEntity != null)) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "MORELIST_BUTTON_SHOW";
                      u1.u0(6, uElementPack, a.b(mEntity, liveStreamPa, 7));
                   }
                }
             }
             if (y.d(this.a.getActivity())) {
                if (uoa1) {
                   uoa1 = this.a;
                   if (uoa1.A != null) {
                      uoa1.C.y();
                   }
                }
                this.a.C.B();
             }else if(uoa1 != null){
                this.a.C.y();
             }else {
                this.a.C.B();
             }
             return;
          }
       }
       uoa1 = null;
       goto label_003f ;
    }
    public void b(boolean p0){
       g$a ta;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (!b.d(this.a)) {
          if (!p0) {
             ta = this.a;
             ta.q.g2.i(ta.v, (float)((- this.a.u.getTop()) - this.a.v.getHeight()), 0);
          }else {
             ta = this.a;
             ta.q.g2.o(ta.v, this.a.v.getTranslationY(), (float)((- this.a.u.getTop()) - this.a.v.getHeight()));
          }
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "6")) {
          return;
       }
       g$a ta = this.a;
       if (ta.y == null) {
          ta.y = p0;
          ta.S8();
       }else {
          ta.y = p0;
       }
       return;
    }
    public void d(float p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "4")) {
          return;
       }
       g v = this.a.v;
       if (v != null) {
          v.setAlpha(p0);
       }
       return;
    }
    public void e(boolean p0){
       this.a.B = p0;
    }
    public void f(boolean p0){
       ObjectAnimator objectAnimat;
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "5")) {
          return;
       }
       g v = this.a.v;
       if (v == null) {
          return;
       }
       if (p0) {
          objectAnimat = PatchProxy.applyOneRefs(v, null, y.class, "11");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             objectAnimat = j.a(v, new float[2]{0,0x3f800000});
             objectAnimat.setDuration(200);
          }
          objectAnimat.start();
       }else {
          objectAnimat = PatchProxy.applyOneRefs(v, null, y.class, "9");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             objectAnimat = j.a(v, new float[2]{0x3f800000,0});
             objectAnimat.setDuration(200);
          }
          objectAnimat.start();
       }
       return;
    }
    public void g(boolean p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.V8(p0);
       return;
    }
    public View i(){
       return this.a.v;
    }
}
