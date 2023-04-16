package com.kuaishou.live.core.show.hourlytrank.f$a;
import ka2.c;
import com.kuaishou.live.core.show.hourlytrank.f;
import java.lang.Object;
import ka2.b;
import ka2.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka2.a;
import ka2.e;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2;
import k2b.e0;
import xp5.i;
import xp5.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import k2b.u1;
import ba2.x;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.hourlytrank.g;
import com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankTempViewV2$a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import ba2.t;
import android.view.animation.Animation$AnimationListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import ekd.k1;
import ba2.s;
import java.lang.Runnable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f$a implements c	// class@000c0e
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return b.a(this);
    }
    public void b(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       f p = this.a.p;
       if (p != null) {
          p.setDismissListener(p0);
       }
       return;
    }
    public boolean c(e p0,boolean p1,View p2){
       e obj;
       boolean b1;
       a obj1;
       Object obj3;
       f$a uoa = this;
       e uoe = p0;
       int i = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, f$a.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (uoa.a.S8(uoe.i)) {
          f$a a = uoa.a;
          Objects.requireNonNull(a);
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, a, f.class, "8");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             label_0272 :
                return b1;
             }
          }
          obj = uoe.i;
          if (obj != null && (obj.bizType != null && (v14 = i instanceof LiveHourlyRankTempViewV2))) {
             if (PatchProxy.isSupport(uof)) {
                obj1 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, a, f.class, "7");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }
             }
             if (v14) {
                obj1 = i;
                a.p = obj1;
                e0 page = a.v.getPage();
                int b2 = a.w.e();
                ClientContent$LiveStreamPackage liveStreamPa = a.v.a();
                String str = a.w.d();
                String liveStreamId = a.w.getLiveStreamId();
                String str1 = a.P8(uoe.i.bizType);
                i oi = i.class;
                Object obj2 = null;
                if (PatchProxy.isSupport(oi)) {
                   Object[] objArray = new Object[]{page,Boolean.valueOf(b2),liveStreamPa,str,liveStreamId,str1};
                   if (PatchProxy.applyVoid(objArray, obj2, oi, "24")) {
                   label_0104 :
                      obj1.setOnClickListener(new x(a, uoe));
                      obj1.setHourlyTankTempDelegate(new g(a));
                      e i1 = uoe.i;
                      e g = uoe.g;
                      e liveStreamPa1 = uoe.e;
                      if (PatchProxy.isSupport(LiveHourlyRankTempViewV2.class)) {
                         obj3 = obj2;
                         if (!PatchProxy.applyVoidFourRefs(i1, g, Boolean.valueOf(liveStreamPa1), Boolean.valueOf(p1), obj1, LiveHourlyRankTempViewV2.class, "2")) {
                         label_013c :
                            obj1.b = i1;
                            LiveHourlyRankTempViewV2 i2 = obj1.i;
                            if (i2 == null || !i2.isRunning()) {
                               if (!p1) {
                                  i2 = obj1.j;
                                  if (i2 != null) {
                                     i2.a(obj1);
                                  }
                                  Animation uAnimation = AnimationUtils.loadAnimation(obj1.getContext(), R.anim.arg_RES_7f010106);
                                  uAnimation.setAnimationListener(new t(obj1));
                                  obj1.startAnimation(uAnimation);
                               }
                               if (!PatchProxy.applyVoidTwoRefs(i1, g, obj1, LiveHourlyRankTempViewV2.class, "4")) {
                                  int i3 = 8;
                                  if (!TextUtils.x(g) && (i1.textContent).contains(g)) {
                                     obj1.d.setVisibility(i3);
                                     obj1.e.setVisibility(b);
                                     int i4 = (i1.textContent).indexOf(g);
                                     i3 = g.length() + i4;
                                     str1 = "";
                                     liveStreamId = (i4 > 0)? (i1.textContent).substring(b, i4): str1;
                                     obj1.f.setText(liveStreamId);
                                     obj1.g.setText(g);
                                     if (i3 < (i1.textContent).length()) {
                                        str1 = (i1.textContent).substring(i3);
                                     }
                                     obj1.h.setText(str1);
                                     b2 = g.length() * a1.d(0x7f07025d);
                                     ViewGroup$LayoutParams layoutParams = obj1.g.getLayoutParams();
                                     if (layoutParams.width != b2) {
                                        layoutParams.width = b2;
                                        obj1.g.setLayoutParams(layoutParams);
                                     }
                                     if (!PatchProxy.applyVoid(obj3, obj1, LiveHourlyRankTempViewV2.class, "3")) {
                                        obj1.g.clearAnimation();
                                        AnimationSet uAnimationSe = new AnimationSet(1);
                                        ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f800000, 0x3f99999a, 0x3f800000, 0x3f99999a, 1, 0x3f000000, 1, 0x3f000000);
                                        obj3.setDuration(100);
                                        ScaleAnimation scaleAnimati1 = new ScaleAnimation(0x3f800000, 0x3f547ae1, 0x3f800000, 0x3f547ae1, 1, 0x3f000000, 1, 0x3f000000);
                                        b.setDuration(180);
                                        b.setStartOffset(100);
                                        uAnimationSe.setInterpolator(new LinearInterpolator());
                                        uAnimationSe.addAnimation(obj3);
                                        uAnimationSe.addAnimation(b);
                                        obj1.g.startAnimation(uAnimationSe);
                                     }
                                  }else {
                                     obj1.d.setVisibility(b);
                                     obj1.e.setVisibility(i3);
                                     obj1.d.setText(i1.textContent);
                                  }
                                  obj1.setPreIcon(i1);
                               }
                               if (!p1 || liveStreamPa1 != null) {
                                  k1.n(obj1);
                                  k1.s(new s(obj1), obj1, i1.displayDurationMillis);
                               }
                            }
                         }
                      }else {
                         obj3 = obj2;
                         goto label_013c ;
                      }
                      b = 1;
                   }
                }
                ClientEvent$ElementPackage uElementPack = i.c(str1);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
                uDistrictRan.anchorUserId = str;
                uDistrictRan.liveStreamId = liveStreamId;
                uContentPack.districtRankPackage = uDistrictRan;
                uContentPack.liveStreamPackage = liveStreamPa;
                String str2 = (b2)? "2965657": "2965630";
                u1.C0(str2, page, 9, uElementPack, uContentPack);
                goto label_0104 ;
             }
          }
       label_0271 :
          b1 = b;
          goto label_0272 ;
       }else {
          return b;
       }
    }
    public a d(e p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LiveHourlyRankTempViewV2(this.a.getContext());
    }
}
