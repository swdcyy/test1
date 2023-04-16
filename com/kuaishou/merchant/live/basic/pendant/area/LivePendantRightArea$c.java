package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$c;
import java.lang.Runnable;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import x14.b;
import java.util.Collection;
import trd.x;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView;
import java.lang.Integer;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import java.util.Iterator;
import ms3.b;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import x14.i;
import x14.a;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import z90.a;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationUtils;
import qrd.l1;
import android.view.animation.Animation;
import java.lang.Number;
import java.lang.Iterable;
import lnc.a1;
import java.lang.Math;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import x14.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import x14.g;
import x14.h;
import android.animation.Animator$AnimatorListener;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import bs3.b;
import com.kuaishou.merchant.live.basic.pendantgroup.view.MerchantViewFlipper;
import android.widget.ViewFlipper;

public final class LivePendantRightArea$c implements Runnable	// class@0018a5
{
    public final LivePendantRightArea b;

    public void LivePendantRightArea$c(LivePendantRightArea p0){
       this.b = p0;
       super();
    }
    public final void run(){
       View view;
       int i;
       int i1;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LivePendantRightArea$c.class, "1")) {
          return;
       }
       LivePendantRightArea$c b = obj.b;
       int b1 = true;
       b.q = b1;
       LivePendantRightArea p = b.p;
       Objects.requireNonNull(b);
       LivePendantRightArea livePendantR = LivePendantRightArea.class;
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(p, b, livePendantR, str)) {
          if (b.b().isEmpty() ^ b1) {
             b.h();
          }
          b.b().addAll(p);
          x.m0(b.b());
          boolean b2 = b.w();
          LivePendantRightArea h = b.h;
          if ((b2 ^ 0x01) != h) {
             b.B(b2, "insertBatchPendants");
          }else {
             String str1 = "pendants";
             if (h != null) {
                b.o();
                LivePendantRightArea k = b.k;
                if (k != null) {
                   k.setLayoutAnimated(false);
                   b.C();
                   b.f("right container add batch pendants", s0.k(r0.a(str1, Integer.valueOf(p.size()))));
                   Iterator iterator = b.b().iterator();
                   while (iterator.hasNext()) {
                      b uob = iterator.next();
                      view = uob.H();
                      PendantContainerView.k(k, view, 0, b.s(uob.getWidth()), b.s(uob.getHeight()), 2, null);
                   }
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   if (!PatchProxy.applyVoid(objArray, b, livePendantR, "32")) {
                      LivePendantRightArea obj1 = PatchProxy.apply(objArray, b, livePendantR, "31");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else if(b.b().size() > 4 && b.d == null){
                         i a = i.a;
                         a b3 = b.n.b;
                         Objects.requireNonNull(a);
                         i oi = i.class;
                         if (PatchProxy.isSupport(oi)) {
                            Object obj4 = PatchProxy.applyOneRefs(Integer.valueOf(b3), a, oi, "3");
                            if (obj4 != patchProxyRe) {
                               b2 = obj4.booleanValue();
                            }else {
                            label_00f9 :
                               str1 = DateUtils.j(System.currentTimeMillis(), objArray);
                               String str2 = a.a.getString("merchant_pendant_expand_animation_count", "");
                               if (!TextUtils.x(str2)) {
                                  String[] stringArray = new String[]{"_"};
                                  List list = StringsKt__StringsKt.H4(str2, stringArray, false, 0, 6, null);
                                  if (list.size() > b1) {
                                     int i2 = Integer.parseInt(list.get(b1));
                                     if (TextUtils.n(list.get(false), str1) && i2 >= b3) {
                                        a.u(LiveBasicLogBiz.PENDANT_NEW, "PendantAnimUtil", "can not show expand anim", "todayCount", Integer.valueOf(i2), "limit", Integer.valueOf(b3));
                                        b2 = false;
                                     }else {
                                        a.a(str1+'_'+(i2 + b1));
                                     label_0184 :
                                        b2 = true;
                                     }
                                  }
                               }
                               a.a(str1+"_1");
                               goto label_0184 ;
                            }
                         }else {
                            goto label_00f9 ;
                         }
                         if (b2) {
                            b2 = true;
                         }
                      }
                   label_0189 :
                      b2 = false;
                      if (b2) {
                         b.f("show expand anim", objArray);
                         obj1 = b.k;
                         if (obj1 != null) {
                            long l = 100;
                            Iterator iterator1 = b.b().iterator();
                            while (iterator1.hasNext()) {
                               ScaleAnimation scaleAnimati = v15;
                               ScaleAnimation scaleAnimati1 = v15;
                               scaleAnimati = new ScaleAnimation(0, 0x3f800000, 0, 0x3f800000, 1, 0x3f000000, 1, 0x3f000000);
                               scaleAnimati1.setDuration(300);
                               long l1 = AnimationUtils.currentAnimationTimeMillis() + l;
                               scaleAnimati1.setStartTime(l1);
                               iterator1.next().H().setAnimation(scaleAnimati1);
                               l = l + (long)120;
                               b1 = 1;
                            }
                            b1 = b.u();
                            ValueAnimator[] obj2 = PatchProxy.apply(objArray, b, livePendantR, "13");
                            if (obj2 != patchProxyRe) {
                               i = obj2.intValue();
                            }else {
                               Objects.requireNonNull(PendantContainerView.i);
                               i = (PendantContainerView.h * 2) * b.b().size();
                               iterator1 = b.b().iterator();
                               while (iterator1.hasNext()) {
                                  b uob1 = iterator1.next();
                                  Object obj3 = PatchProxy.applyOneRefs(uob1, b, b.class, str);
                                  if (obj3 != patchProxyRe) {
                                     i1 = obj3.intValue();
                                  }else {
                                     view = uob1.H();
                                     int measuredHeig = view.getMeasuredHeight();
                                     if (measuredHeig <= 0) {
                                        i1 = a1.e((float)uob1.getHeight());
                                        if (i1 <= 0) {
                                           view.measure(false, false);
                                           i1 = view.getMeasuredHeight();
                                        }
                                     }else {
                                        i1 = measuredHeig;
                                     }
                                  }
                                  i = i + i1;
                               }
                            }
                            i = Math.min(b1, i);
                            AnimatorSet uAnimatorSet = new AnimatorSet();
                            ValueAnimator valueAnimato = new ValueAnimator();
                            valueAnimato.setDuration(((long)b.b().size() * 160));
                            int[] ointArray = new int[]{false,i};
                            valueAnimato.setIntValues(ointArray);
                            valueAnimato.addUpdateListener(new f(obj1, i, b));
                            ValueAnimator valueAnimato1 = new ValueAnimator();
                            valueAnimato1.setDuration(600);
                            valueAnimato1.setStartDelay(1000);
                            int[] ointArray1 = new int[]{i,a1.d(0x7f0702bf)};
                            valueAnimato1.setIntValues(ointArray1);
                            valueAnimato1.addUpdateListener(new g(obj1, i, b));
                            uAnimatorSet.addListener(new h(obj1, i, b));
                            obj2 = new ValueAnimator[]{valueAnimato,valueAnimato1};
                            uAnimatorSet.playSequentially(CollectionsKt__CollectionsKt.L(obj2));
                            uAnimatorSet.start();
                            b.o = uAnimatorSet;
                         }
                      }
                   }
                }
             }else {
                b.z(true);
                b.D();
                ArrayList uArrayList = new ArrayList();
                Iterator iterator2 = p.iterator();
                while (iterator2.hasNext()) {
                   b uob2 = iterator2.next();
                   b uob3 = b.r(uob2);
                   b.x.put(uob2, uob3);
                   uArrayList.add(uob3);
                }
                LivePendantRightArea u = b.u;
                if (u != null) {
                   b.f("slide container add batch pendants", s0.k(r0.a(str1, Integer.valueOf(p.size()))));
                   u.b(uArrayList);
                   if (!u.isFlipping()) {
                      u.startFlipping();
                   }
                }
             }
             b.y(true);
          }
       }
       return;
    }
}
