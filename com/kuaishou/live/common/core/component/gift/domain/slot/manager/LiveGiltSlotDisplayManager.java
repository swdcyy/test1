package com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import gk1.b;
import vj1.a;
import yj1.c;
import ak1.f;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager$a;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiltSlotDisplayManager$b;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotQueueManager;
import tj1.b;
import xj1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import gk1.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Integer;
import p02.n;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import yb6.d;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import java.lang.Math;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import wj1.d;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.kuaishou.live.basic.model.QLiveMessage;
import fk1.a;
import java.util.Objects;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import android.animation.Animator;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.view.View;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import ak1.e;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import yj1.b;

public class LiveGiltSlotDisplayManager extends LifecycleManager	// class@00126b
{
    public final LiveGiftSlotQueueManager c;
    public final b d;
    public final a e;
    public final c f;
    public final b g;
    public final b h;
    public final f i;

    public void LiveGiltSlotDisplayManager(LifecycleOwner p0,b p1,a p2,c p3,f p4){
       super(p0);
       this.g = new LiveGiltSlotDisplayManager$a(this);
       LiveGiltSlotDisplayManager$b uob = new LiveGiltSlotDisplayManager$b(this);
       this.h = uob;
       this.e = p2;
       this.d = p1;
       this.i = p4;
       this.c = new LiveGiftSlotQueueManager(p0, p2);
       this.f = p3;
       p3.j(uob);
    }
    public final boolean b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiltSlotDisplayManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       while (true) {
          if (i >= this.d.a().size()) {
             return false;
          }
          if (TextUtils.equals(p0.f(), this.d.a().get(i).X2())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, LiveGiltSlotDisplayManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = this.d.a().iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (uod.Z2() && uod.a3()) {
             i = i + 1;
          }
       }
       return i;
    }
    public void d(int p0){
       LiveGiltSlotDisplayManager liveGiltSlot = LiveGiltSlotDisplayManager.class;
       if (PatchProxy.isSupport(liveGiltSlot) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveGiltSlot, "9")) {
          return;
       }
       liveGiltSlot = this.i;
       if (liveGiltSlot == null) {
          return;
       }
       liveGiltSlot.b(n.a(p0));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveGiltSlotDisplayManager.class, "3")) {
          return;
       }
       int i = this.d.a().size();
       LiveGiltSlotDisplayManager ti = this.i;
       if (ti == null) {
          this.f(i);
          return;
       }else {
          boolean b = ti.a(n.a(this.c()), n.a(i));
          b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiltSlotDisplayManager][tryDisplay] vcCount="+i+" enableToShowTowSlot="+b);
          if (!b) {
             i = 1;
          }
          this.f(i);
          return;
       }
    }
    public final void f(int p0){
       int i4;
       d uod1;
       PatchProxyResult patchProxyRe1;
       int i5;
       int i6;
       LiveGiltSlotDisplayManager liveGiltSlot2;
       d uod2;
       LiveGiltSlotDisplayManager liveGiltSlot3;
       String str2;
       int i7;
       a uoa1;
       int b;
       String str3;
       int i8;
       GiftSlotMessage obj1;
       PatchProxyResult patchProxyRe2;
       d uod3;
       Object[] objArray;
       int b1;
       d obj3;
       long l2;
       GiftSlotMessage giftSlotMess3;
       GiftSlotMessage giftSlotMess4;
       PropertyValuesHolder[] propertyValu;
       float[] uofloatArray2;
       float[] uofloatArray3;
       float[] uofloatArray4;
       float[] uofloatArray5;
       LiveGiltSlotDisplayManager liveGiltSlot = this;
       int i = p0;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiltSlotDisplayManager liveGiltSlot1 = LiveGiltSlotDisplayManager.class;
       String str = "4";
       if (PatchProxy.isSupport(liveGiltSlot1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), liveGiltSlot, liveGiltSlot1, str)) {
          return;
       }
       int i1 = liveGiltSlot.d.a().size();
       int i2 = 0;
       int i3 = 0;
       while (i2 < liveGiltSlot.c.c().size() && i3 < i1) {
          a uoa = liveGiltSlot.c.c().get(i2);
          if (uoa == null || (uoa.e() <= 0 || uoa.a() - d.a() < 0)) {
             i4 = i;
             uod1 = uod;
             patchProxyRe1 = patchProxyRe;
             i5 = i1;
             i6 = i2;
             liveGiltSlot2 = liveGiltSlot;
          }else {
             i3 = i3 + 1;
             LiveGiftSlotAnimManager obj = PatchProxy.applyOneRefs(uoa, liveGiltSlot, liveGiltSlot1, "10");
             long l = 2;
             String str1 = 1;
             if (obj != patchProxyRe) {
                uod2 = uod;
                patchProxyRe1 = patchProxyRe;
                liveGiltSlot3 = liveGiltSlot1;
                i5 = i1;
                str2 = str;
                i6 = i2;
                i7 = i3;
                uoa1 = uoa;
                b = obj.booleanValue();
                str3 = 3;
                i8 = 0;
             }else {
                int i10 = 0;
                while (true) {
                   if (i10 < liveGiltSlot.d.a().size()) {
                      d uod4 = liveGiltSlot.d.a().get(i10);
                      if (TextUtils.equals(uod4.X2(), uoa.f()) && uod4.Z2() == l) {
                         LiveGiftSlotAnimManager obj4 = PatchProxy.applyOneRefs(uoa, liveGiltSlot, liveGiltSlot1, "13");
                         if (obj4 != patchProxyRe) {
                            i4 = obj4.intValue();
                         }else {
                            a b2 = liveGiltSlot.e.b;
                            if (uoa.i()) {
                               if (uoa.e() > str1) {
                                  b2 = liveGiltSlot.e.c();
                               }
                            }else if(uoa.e() >= liveGiltSlot.e.b()){
                               b2 = liveGiltSlot.e.c();
                            }
                         }
                         GiftSlotMessage giftSlotMess2 = PatchProxy.applyOneRefs(uoa, liveGiltSlot, liveGiltSlot1, "14");
                         if (giftSlotMess2 != patchProxyRe) {
                         }else if(uoa.i()){
                            giftSlotMess2 = uoa.d();
                            uoa.k(giftSlotMess2);
                         }else {
                            giftSlotMess2 = PatchProxy.applyOneRefs(uoa, liveGiltSlot, liveGiltSlot1, "15");
                            if (giftSlotMess2 != patchProxyRe) {
                            }else if(uoa.e() <= liveGiltSlot.e.b()){
                               giftSlotMess2 = uoa.b();
                               uoa.j();
                            }else {
                               b = Math.max((uoa.e() / 10), liveGiltSlot.e.b());
                               int i14 = 1;
                               obj3 = null;
                               while (i14 <= b) {
                                  i5 = i1;
                                  giftSlotMess3 = uoa.d();
                                  if (giftSlotMess3 != null) {
                                     uoa.k(giftSlotMess3);
                                  }
                                  if (i14 == b) {
                                     GiftSlotMessage giftSlotMess5 = giftSlotMess3;
                                  }
                                  i14 = i14 + 1;
                                  i1 = i5;
                               }
                               i5 = i1;
                               if (obj3 != null) {
                                  giftSlotMess3 = obj3;
                               label_015a :
                                  if (giftSlotMess3 != null) {
                                     if (PatchProxy.isSupport(uod)) {
                                        i7 = i3;
                                        d uod5 = uod4;
                                        if (PatchProxy.applyVoidThreeRefs(giftSlotMess3, uoa, Integer.valueOf(i4), uod4, d.class, "10")) {
                                        label_018b :
                                           uod2 = uod;
                                           patchProxyRe1 = patchProxyRe;
                                           liveGiltSlot3 = liveGiltSlot1;
                                           str2 = str;
                                           i6 = i2;
                                        label_0195 :
                                           uoa1 = uoa;
                                           str3 = 3;
                                           i8 = 0;
                                        label_044a :
                                           b = true;
                                        }else {
                                           uod4 = uod5;
                                        }
                                     }else {
                                        i7 = i3;
                                        i3 = 1;
                                     }
                                     if (uod4.t != null) {
                                        b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotItemVC][mergeGiftSlot] : mDisableGiftSlot == true 槽位不允许被展示");
                                        goto label_018b ;
                                     }else {
                                        uod4.l.e(uod4.p, giftSlotMess3, uod4.j);
                                        uod4.k.c();
                                        uod4.p = giftSlotMess3;
                                        uod4.q = uoa;
                                        uod4.m.d().i(giftSlotMess3);
                                        uod4.o.e(giftSlotMess3.mComboCount);
                                        uod4.o.d(giftSlotMess3.mCount);
                                        i6 = i2;
                                        uod4.o.g(giftSlotMess3.mNewGiftSlotStyle, giftSlotMess3.mCount, giftSlotMess3.mComboCount, a.c(giftSlotMess3, false));
                                        uod4.o.h(giftSlotMess3.mNewGiftSlotStyle);
                                        d k = uod4.k;
                                        d o = uod4.o;
                                        giftSlotMess3 = giftSlotMess3.mDisplayDuration;
                                        b = (i4 <= uod4.m.c())? true: false;
                                        Objects.requireNonNull(k);
                                        obj = LiveGiftSlotAnimManager.class;
                                        if (PatchProxy.isSupport(obj) && (PatchProxy.applyVoidFourRefs(o, Integer.valueOf(i4), Integer.valueOf(giftSlotMess3), Boolean.valueOf(b), k, LiveGiftSlotAnimManager.class, "6") || (PatchProxy.isSupport(obj) && PatchProxy.applyVoidFourRefs(o, Integer.valueOf(i4), Integer.valueOf(giftSlotMess3), Boolean.valueOf(b), k, LiveGiftSlotAnimManager.class, "13")))) {
                                           uod2 = uod;
                                           patchProxyRe1 = patchProxyRe;
                                           liveGiltSlot3 = liveGiltSlot1;
                                           str2 = str;
                                           goto label_0195 ;
                                        }else {
                                           TextView comboView = o.getComboView();
                                           a.e(k.g);
                                           long l3 = (long)i4;
                                           if (PatchProxy.isSupport(obj)) {
                                              obj4 = PatchProxy.applyThreeRefs(comboView, Boolean.valueOf(b), Long.valueOf(l3), k, LiveGiftSlotAnimManager.class, "12");
                                              if (obj4 != patchProxyRe) {
                                                 uod2 = uod;
                                                 str2 = str;
                                              label_02f0 :
                                                 patchProxyRe1 = patchProxyRe;
                                                 liveGiltSlot3 = liveGiltSlot1;
                                                 giftSlotMess4 = giftSlotMess3;
                                                 uoa1 = uoa;
                                                 str3 = 3;
                                                 i8 = 0;
                                              label_0432 :
                                                 k.g = obj4;
                                                 obj4.removeAllListeners();
                                                 k.g.addListener(new e(k, giftSlotMess4, o));
                                                 j.g(k.g, LiveDegradeBiz.GiftSlot);
                                                 goto label_044a ;
                                              }
                                           }
                                           comboView.setPivotX(0);
                                           comboView.setPivotY((float)comboView.getMeasuredHeight());
                                           if (b) {
                                              a.e(k.t);
                                              if (k.s == null) {
                                                 k.s = new AnimatorSet();
                                                 propertyValu = new PropertyValuesHolder[1];
                                                 str2 = str;
                                                 float[] uofloatArray = new float[2];
                                                 i8 = 0;
                                                 uofloatArray[i8] = k.i.j();
                                                 uod2 = uod;
                                                 uofloatArray[1] = k.i.k();
                                                 propertyValu[i8] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
                                                 ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu);
                                                 PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[1];
                                                 float[] uofloatArray1 = new float[2];
                                                 uofloatArray1[i8] = k.i.j();
                                                 int i11 = 1;
                                                 uofloatArray1[i11] = k.i.k();
                                                 propertyValu1[i8] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1);
                                                 ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu1);
                                                 objectAnimat.setDuration(l3);
                                                 objectAnimat1.setDuration(l3);
                                                 Animator[] uAnimatorArr = new Animator[2];
                                                 uAnimatorArr[i8] = objectAnimat;
                                                 uAnimatorArr[i11] = objectAnimat1;
                                                 k.s.playTogether(uAnimatorArr);
                                              }else {
                                                 uod2 = uod;
                                                 str2 = str;
                                              }
                                              obj4 = k.s;
                                              goto label_02f0 ;
                                           }else {
                                              uod2 = uod;
                                              str2 = str;
                                              LiveGiftSlotAnimManager i12 = k.i;
                                              b1 = (int)i12.g;
                                              i4 = (int)i12.f;
                                              int i13 = (int)i12.h;
                                              a.e(k.t);
                                              if (k.t == null) {
                                                 k.t = new AnimatorSet();
                                                 ObjectAnimator objectAnimat2 = j.a(comboView, new float[2]{0,0x3f800000});
                                                 l3 = (long)b1;
                                                 objectAnimat2.setDuration(l3);
                                                 PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray2)};
                                                 patchProxyRe1 = patchProxyRe;
                                                 uofloatArray2 = new float[]{k.i.g(),0x3f800000};
                                                 ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu2);
                                                 PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray3)};
                                                 uofloatArray3 = new float[]{k.i.g(),0x3f800000};
                                                 uoa1 = uoa;
                                                 ObjectAnimator objectAnimat4 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu3);
                                                 objectAnimat3.setDuration(l3);
                                                 objectAnimat4.setDuration(l3);
                                                 PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray4)};
                                                 liveGiltSlot3 = liveGiltSlot1;
                                                 uofloatArray4 = new float[]{0x3f800000,k.i.h()};
                                                 ObjectAnimator objectAnimat5 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu4);
                                                 PropertyValuesHolder[] propertyValu5 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray5)};
                                                 uofloatArray5 = new float[]{0x3f800000,k.i.h()};
                                                 giftSlotMess4 = giftSlotMess3;
                                                 ObjectAnimator objectAnimat6 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu5);
                                                 long l4 = (long)i4;
                                                 objectAnimat5.setDuration(l4);
                                                 objectAnimat6.setDuration(l4);
                                                 objectAnimat5.setStartDelay(l3);
                                                 objectAnimat6.setStartDelay(l3);
                                                 PropertyValuesHolder[] propertyValu6 = new PropertyValuesHolder[1];
                                                 float[] uofloatArray6 = new float[2];
                                                 i8 = 0;
                                                 uofloatArray6[i8] = k.i.h();
                                                 uofloatArray6[1] = 0x3f800000;
                                                 propertyValu6[i8] = PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray6);
                                                 ObjectAnimator objectAnimat7 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu6);
                                                 propertyValu = new PropertyValuesHolder[1];
                                                 float[] uofloatArray7 = new float[2];
                                                 uofloatArray7[i8] = k.i.h();
                                                 uofloatArray7[1] = 0x3f800000;
                                                 propertyValu[i8] = PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray7);
                                                 ObjectAnimator objectAnimat8 = ObjectAnimator.ofPropertyValuesHolder(comboView, propertyValu);
                                                 objectAnimat7.setDuration(l4);
                                                 objectAnimat8.setDuration(l4);
                                                 l4 = (long)i13;
                                                 objectAnimat7.setStartDelay(l4);
                                                 objectAnimat8.setStartDelay(l4);
                                                 Animator[] uAnimatorArr1 = new Animator[7];
                                                 uAnimatorArr1[i8] = objectAnimat2;
                                                 uAnimatorArr1[1] = objectAnimat3;
                                                 uAnimatorArr1[2] = objectAnimat4;
                                                 str3 = 3;
                                                 uAnimatorArr1[str3] = objectAnimat5;
                                                 uAnimatorArr1[4] = objectAnimat6;
                                                 uAnimatorArr1[5] = objectAnimat7;
                                                 uAnimatorArr1[6] = objectAnimat8;
                                                 k.t.playTogether(uAnimatorArr1);
                                              }else {
                                                 patchProxyRe1 = patchProxyRe;
                                                 liveGiltSlot3 = liveGiltSlot1;
                                                 giftSlotMess4 = giftSlotMess3;
                                                 uoa1 = uoa;
                                                 str3 = 3;
                                                 i8 = 0;
                                              }
                                              obj4 = k.t;
                                              goto label_0432 ;
                                           }
                                        }
                                     }
                                  }else {
                                     uod2 = uod;
                                     patchProxyRe1 = patchProxyRe;
                                     liveGiltSlot3 = liveGiltSlot1;
                                     str2 = str;
                                     i6 = i2;
                                     i7 = i3;
                                     uoa1 = uoa;
                                     b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiltSlotDisplayManager][tryToCombo]: giftMessage is null");
                                  }
                               }else {
                                  giftSlotMess2 = uoa.b();
                                  uoa.j();
                               label_00f6 :
                                  giftSlotMess3 = giftSlotMess2;
                                  goto label_015a ;
                               }
                            }
                         }
                         i5 = i1;
                         goto label_00f6 ;
                      }else {
                         uod2 = uod;
                         patchProxyRe1 = patchProxyRe;
                         liveGiltSlot3 = liveGiltSlot1;
                         i5 = i1;
                         str2 = str;
                         i6 = i2;
                         i7 = i3;
                         uoa1 = uoa;
                         i8 = 0;
                      }
                      i10 = i10 + 1;
                      liveGiltSlot = this;
                      i2 = i6;
                      str = str2;
                      uod = uod2;
                      i1 = i5;
                      patchProxyRe = patchProxyRe1;
                      i3 = i7;
                      uoa = uoa1;
                      liveGiltSlot1 = liveGiltSlot3;
                      str1 = 1;
                      l = 2;
                   }else {
                      uod2 = uod;
                      patchProxyRe1 = patchProxyRe;
                      liveGiltSlot3 = liveGiltSlot1;
                      i5 = i1;
                      str2 = str;
                      i6 = i2;
                      i7 = i3;
                      uoa1 = uoa;
                      str3 = 3;
                      b = false;
                   }
                }
             }
             if (b) {
                liveGiltSlot2 = this;
                i4 = p0;
                str = str2;
                uod1 = uod2;
                liveGiltSlot1 = liveGiltSlot3;
             }else if(PatchProxy.isSupport(liveGiltSlot3)){
                liveGiltSlot2 = this;
                uoa = uoa1;
                liveGiltSlot1 = liveGiltSlot3;
                obj1 = PatchProxy.applyTwoRefs(uoa, Integer.valueOf(p0), liveGiltSlot2, liveGiltSlot1, "7");
                patchProxyRe2 = patchProxyRe1;
                if (obj1 != patchProxyRe2) {
                   b = obj1.booleanValue();
                   i4 = p0;
                }else if(liveGiltSlot2.b(uoa)){
                   int i9 = this.c();
                   i3 = 0;
                   while (true) {
                      if (i3 < liveGiltSlot2.d.a().size()) {
                         uod3 = liveGiltSlot2.d.a().get(i3);
                         if (uoa.c().mSlotPos == str3 && uod3.Y2() != liveGiltSlot2.e.a()) {
                            i4 = p0;
                            i2 = i4 - 1;
                            if (uod3.Y2() != i2) {
                            label_054d :
                               GiftSlotMessage giftSlotMess = 1;
                            }else if(!uod3.Z2()){
                               b = i9 + 1;
                               if (b <= i4) {
                                  GiftSlotMessage giftSlotMess1 = uoa.d();
                                  if (giftSlotMess1 != null) {
                                     uoa.k(giftSlotMess1);
                                     uod3.V2(giftSlotMess1, uoa);
                                     liveGiltSlot2.d(b);
                                     b = true;
                                     break ;
                                  }else {
                                     b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiltSlotDisplayManager][tryToAdd]:执行add操作，按逻辑不应该走到这里，giftMessage为空");
                                  }
                               }
                            }else {
                               goto label_054d ;
                            }
                         }else {
                            i4 = p0;
                            goto label_0529 ;
                         }
                         i3 = i3 + 1;
                      }
                   }
                }
                i4 = p0;
                b = false;
             }else {
                liveGiltSlot2 = this;
                patchProxyRe2 = patchProxyRe1;
                uoa = uoa1;
                liveGiltSlot1 = liveGiltSlot3;
                goto label_04e1 ;
             }
             if (!b) {
                obj1 = PatchProxy.applyOneRefs(uoa, liveGiltSlot2, liveGiltSlot1, "11");
                if (obj1 != patchProxyRe2) {
                   obj1.booleanValue();
                }else {
                   obj1 = uoa.d();
                   if (obj1 == null) {
                      b.Z(LiveGiftTag.GIFT_SLOT, "[LiveGiltSlotDisplayManager][tryToReplace]:执行replace操作，giftMessage为空");
                   }else if(liveGiltSlot2.b(uoa)){
                      i3 = 0;
                      while (true) {
                         if (i3 < liveGiltSlot2.d.a().size()) {
                            uod3 = liveGiltSlot2.d.a().get(i3);
                            if (uod3.Z2() != 2 || (uod3.W2() - (long)liveGiltSlot2.e.t < 0 || (obj1.mSlotPos == str3 && uod3.Y2() != liveGiltSlot2.e.a()))) {
                               patchProxyRe1 = patchProxyRe2;
                               str = str2;
                               uod1 = uod2;
                               objArray = null;
                            }else {
                               uod1 = uod2;
                               objArray = null;
                               d obj2 = PatchProxy.apply(objArray, uod3, uod1, "5");
                               if (obj2 != patchProxyRe2) {
                                  b1 = obj2.booleanValue();
                               }else {
                                  obj2 = uod3.q;
                                  b1 = (obj2 == null)? false: obj2.i();
                               }
                               if (!b1) {
                                  l = uoa.h();
                                  long l1 = 3;
                                  str = str2;
                                  obj3 = PatchProxy.apply(objArray, uod3, uod1, str);
                                  if (obj3 != patchProxyRe2) {
                                     l2 = obj3.longValue();
                                  }else {
                                     obj3 = uod3.q;
                                     l2 = (obj3 == null)? 0: obj3.h();
                                  }
                                  l2 = l2 * l1;
                                  if (l - l2 > 0) {
                                     uoa.k(obj1);
                                     uod3.c3(obj1, uoa, "rank");
                                  label_061c :
                                     patchProxyRe1 = patchProxyRe2;
                                     break ;
                                  }
                               }else {
                                  str = str2;
                               }
                               if (uoa.i()) {
                                  uoa.k(obj1);
                                  uod3.c3(obj1, uoa, "myself");
                                  goto label_061c ;
                               }else {
                                  patchProxyRe1 = patchProxyRe2;
                                  if (uod3.W2() - (long)obj1.mDisplayDuration > 0) {
                                     uoa.k(obj1);
                                     uod3.c3(obj1, uoa, "outTime");
                                     break ;
                                  }
                               }
                            }
                            i3 = i3 + 1;
                            str2 = str;
                            uod2 = uod1;
                            patchProxyRe2 = patchProxyRe1;
                            str3 = 3;
                         }
                      }
                   }
                }
             }
             patchProxyRe1 = patchProxyRe2;
             str = str2;
             uod1 = uod2;
             i3 = i7;
          }
          i2 = i6 + 1;
          liveGiltSlot = liveGiltSlot2;
          i = i4;
          uod = uod1;
          i1 = i5;
          patchProxyRe = patchProxyRe1;
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiltSlotDisplayManager.class, "2")) {
          return;
       }
       super.onDestroy(p0);
       int i = 0;
       while (i < this.d.a().size()) {
          d uod = this.d.a().get(i);
          if (uod != null) {
             uod.e3(this.g);
          }
          i++;
       }
       this.f.k(this.h);
       return;
    }
}
