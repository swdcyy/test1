package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a;
import rk0.b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ca4.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$e;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$d;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import y94.c;
import java.lang.Integer;
import android.widget.TextView;
import android.widget.ViewFlipper;
import da4.a;
import java.util.Objects;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import java.lang.Boolean;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import android.widget.ImageView;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import java.lang.CharSequence;
import ot3.u0;
import crd.b;
import lnc.b9;
import com.yxcorp.utility.f;
import brd.t;
import aa4.b;
import erd.g;
import android.view.View;
import java.util.List;
import java.util.Collection;
import android.animation.AnimatorSet;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogGrabButtonView;
import java.lang.Long;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import aa4.e;
import android.widget.ProgressBar;
import aa4.f;
import com.kuaishou.merchant.basic.widget.BreatheButtonView;
import com.yxcorp.utility.TextUtils;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import y94.a;
import q94.n;
import g9c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import w74.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import android.animation.ObjectAnimator;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel$DiscountCouponOverdueModel;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveFailModel;
import ekd.q;
import java.util.Iterator;
import android.util.Property;
import aa4.c;
import u94.a;
import java.lang.Float;
import android.animation.PropertyValuesHolder;
import qrd.l1;
import ba4.d;
import android.widget.LinearLayout;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import ba4.e;
import android.widget.FrameLayout;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$c;
import ekd.m1;
import com.kuaishou.merchant.basic.widget.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$a;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.a$b;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.CouponLiveMarqueeView;
import t94.c;

public final class a extends b	// class@001c2e
{
    public LiveMerchantDiscountDialogCoverView A;
    public LiveMerchantDiscountDialogGrabButtonView B;
    public BreatheButtonView C;
    public SelectShapeLinearLayout D;
    public TextView E;
    public CouponLiveMarqueeView F;
    public c G;
    public c H;
    public a I;
    public ObjectAnimator J;
    public ObjectAnimator K;
    public o L;
    public a$e M;
    public RecyclerView$r N;
    public final long s;
    public final float t;
    public final int u;
    public final int v;
    public View w;
    public View x;
    public RecyclerView y;
    public TextView z;

    public void a(Fragment p0){
       super(p0);
       this.s = 500;
       this.t = 0x3f4ccccd;
       this.u = 0x7f0803bc;
       this.v = 0x7f1026ea;
       this.I = ViewModelProviders.of(p0).get(a.class);
       this.M = new a$e(this);
       this.N = new a$d(this);
    }
    public void E8(){
       n a;
       String str2;
       int itemCount;
       a h1;
       a g1;
       Object[] objArray3;
       Object obj = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
          return;
       }
       this.a9();
       a y = obj.y;
       if (y == null) {
          a.S("mRecyclerView");
       }
       y.addOnScrollListener(obj.N);
       y = obj.G;
       if (y == null) {
          a.S("mContainerLiveData");
       }
       int i = y.g();
       String str = "7";
       int i1 = 2;
       int i2 = 0;
       int i3 = 4;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), obj, uoa, str)) {
          if (i != 1 && i != i1) {
             this.Z8();
          }else if(PatchProxy.applyVoid(objArray, obj, uoa, "13")){
             y = obj.E;
             if (y == null) {
                a.S("mCouponEndTimeView");
             }
             itemCount = 8;
             y.setVisibility(itemCount);
             y = obj.F;
             if (y == null) {
                a.S("mCouponMarqueeView");
             }
             y.setVisibility(itemCount);
             y = obj.A;
             if (y == null) {
                a.S("mCoverView");
             }
             h1 = obj.I.c;
             a g2 = obj.G;
             if (g2 == null) {
                a.S("mContainerLiveData");
             }
             g2 = g2.e();
             Objects.requireNonNull(y);
             String str4 = "4";
             if (!PatchProxy.isSupport(LiveMerchantDiscountDialogCoverView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(h1), g2, y, LiveMerchantDiscountDialogCoverView.class, str4)) {
                if (g2 == null) {
                   y.setVisibility(i3);
                }else {
                   y.M = g2;
                   if (y.M()) {
                      LiveMerchantDiscountDialogCoverView l1 = y.L;
                      int i6 = (h1 == null)? 4: 0;
                      l1.setVisibility(i6);
                      y.B.setVisibility(i3);
                   }else {
                      y.L.setVisibility(i3);
                      y.B.setVisibility(i2);
                   }
                   if (!PatchProxy.applyVoid(objArray, y, LiveMerchantDiscountDialogCoverView.class, str)) {
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      if (qCurrentUser != null && qCurrentUser.getAvatars() != null) {
                         y.D.U(qCurrentUser.getAvatars());
                      }
                      if (y.M.a() != null && y.M.a().length > 0) {
                         y.B.U(y.M.a());
                         y.C.U(y.M.a());
                      }
                      y.F.setText(y.M.z);
                      if (y.M()) {
                         y.F.setVisibility(itemCount);
                      }else {
                         y.F.setVisibility(i2);
                      }
                      if (u0.b() - y.M.g() >= 0) {
                         y.G.setText(y.M.e());
                      }else {
                         y.G.setText(y.M.p);
                         b9.a(y.K);
                         y.K = f.d().e((y.M.g() - u0.b())).subscribe(new b(y));
                      }
                   }
                   if (!y.M() || (h1 == null && !PatchProxy.applyVoid(objArray, y, LiveMerchantDiscountDialogCoverView.class, "9"))) {
                      List list = y.L(y.D);
                      list.addAll(y.L(y.C));
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      y.H = uAnimatorSet;
                      uAnimatorSet.addListener(new a(y));
                      y.H.setStartDelay(400);
                      y.H.playTogether(list);
                      y.H.start();
                      AnimatorSet coverTextAni = y.getCoverTextAnimator();
                      y.I = coverTextAni;
                      coverTextAni.start();
                   }
                label_01be :
                   y.setTranslationY(0);
                   y.setVisibility(i2);
                }
             }
             y = obj.G;
             if (y == null) {
                a.S("mContainerLiveData");
             }
             y = y.e();
             if (y != null) {
                long l = y.g();
                y = obj.B;
                if (y == null) {
                   a.S("mGrabButton");
                }
                Objects.requireNonNull(y);
                if (!PatchProxy.isSupport(LiveMerchantDiscountDialogGrabButtonView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), y, LiveMerchantDiscountDialogGrabButtonView.class, str4)) {
                   a.t(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, "LiveMerchantDiscountDialogButtonView", "show button", "couldGrabTimestamp", Long.valueOf(l));
                   y.a();
                   if (l - u0.b() <= 0) {
                      y.d();
                   }else {
                      y.c(Long.valueOf((l - u0.b())));
                      y.s = f.d().b((l - u0.b()), 1000).subscribe(new e(y));
                      y.w = (int)(l - u0.b());
                      y.b.setVisibility(i2);
                      y.c.setVisibility(i2);
                      y.b.setMax(y.w);
                      y.t = f.d().b((l - u0.b()), 30).subscribe(new f(y));
                   }
                }
             }
             y = obj.C;
             if (y == null) {
                a.S("mNormalButton");
             }
             Objects.requireNonNull(y);
             if (!PatchProxy.applyVoid(objArray, y, BreatheButtonView.class, "12")) {
                y.c();
             }
             if (this.X8()) {
                y = obj.G;
                if (y == null) {
                   a.S("mContainerLiveData");
                }
                if (y != null) {
                   y = y.e();
                   if (y != null) {
                      str2 = y.b();
                   label_02a7 :
                      String str5 = "mComeBackTitleView";
                      if (!TextUtils.x(str2)) {
                         y = obj.G;
                         if (y == null) {
                            a.S("mContainerLiveData");
                         }
                         if (y != null) {
                            y = y.e();
                            if (y != null) {
                               str2 = y.f();
                            label_02c4 :
                               if (TextUtils.n(str2, "2")) {
                                  y = obj.z;
                                  if (y == null) {
                                     a.S(str5);
                                  }
                                  g1 = obj.G;
                                  if (g1 == null) {
                                     a.S("mContainerLiveData");
                                  }
                                  if (g1 != null) {
                                     g1 = g1.e();
                                     if (g1 != null) {
                                        str = g1.b();
                                     label_02e8 :
                                        y.setText(str);
                                        y = obj.z;
                                        if (y == null) {
                                           a.S(str5);
                                        }
                                        y.setVisibility(i2);
                                     label_0300 :
                                        this.m8().getLayoutParams().height = a1.e(390.00f);
                                        y = obj.w;
                                        if (y == null) {
                                           a.S("mViewContainer");
                                        }
                                        y.getLayoutParams().height = a1.e(337.00f);
                                        y = obj.x;
                                        if (y == null) {
                                           a.S("mCouponContainer");
                                        }
                                        y.setVisibility(i3);
                                     }
                                  }
                                  Object[] objArray2 = objArray;
                                  goto label_02e8 ;
                               }
                            }
                         }
                         objArray3 = objArray;
                         goto label_02c4 ;
                      }
                      y = obj.z;
                      if (y == null) {
                         a.S(str5);
                      }
                      y.setVisibility(i3);
                      goto label_0300 ;
                   }
                }
                objArray3 = objArray;
                goto label_02a7 ;
             }
          }
       }
       y = obj.G;
       if (y == null) {
          a.S("mContainerLiveData");
       }
       y.h(obj.M);
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "22")) {
          uoa = obj.G;
          if (uoa == null) {
             a.S("mContainerLiveData");
          }
          if (uoa.h == null) {
             a = n.a;
             a g = obj.G;
             if (g == null) {
                a.S("mContainerLiveData");
             }
             String str1 = g.b();
             str2 = "";
             if (str1 == null) {
                str1 = str2;
             }
             a h = obj.H;
             str = "mAdapter";
             if (h == null) {
                a.S(str);
             }
             itemCount = h.getItemCount();
             h1 = obj.H;
             if (h1 == null) {
                a.S(str);
             }
             g1 = obj.G;
             if (g1 == null) {
                a.S("mContainerLiveData");
             }
             int i4 = h1.P0(g1) + 1;
             int i5 = this.S8();
             String liveStreamId = obj.I.getLiveStreamId();
             if (liveStreamId == null) {
                liveStreamId = str2;
             }
             String str3 = obj.I.p0();
             if (str3 != null) {
                str2 = str3;
             }
             str3 = this.W8();
             Objects.requireNonNull(a);
             if (PatchProxy.isSupport(n.class)) {
                Object[] objArray1 = new Object[]{str1,Integer.valueOf(itemCount),Integer.valueOf(i4),Integer.valueOf(i5),liveStreamId,str2,str3};
                if (!PatchProxy.applyVoid(objArray1, a, n.class, "1")) {
                label_03d5 :
                   ClientContent$ContentPackage uContentPack = a.a(liveStreamId, str2);
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "MERCHANT_TIMING_REDPACKET";
                   i3 oi3 = i3.f();
                   oi3.d("activity_id", str1);
                   oi3.c("num", Integer.valueOf(itemCount));
                   oi3.c("pos", Integer.valueOf(i4));
                   oi3.c("status", Integer.valueOf(i5));
                   oi3.d("receive_condition_type", str3);
                   uElementPack.params = oi3.e();
                   if (!PatchProxy.applyVoidTwoRefs(uElementPack, uContentPack, a, n.class, "5")) {
                      u1.u0(9, uElementPack, uContentPack);
                   }
                }
             }else {
                goto label_03d5 ;
             }
             uoa = obj.G;
             if (uoa == null) {
                a.S("mContainerLiveData");
             }
             uoa.i(1);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tG = this.G;
       if (tG == null) {
          a.S("mContainerLiveData");
       }
       tG.i(false);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       super.J8();
       this.L = objArray;
       a tB = this.B;
       if (tB == null) {
          a.S("mGrabButton");
       }
       tB.a();
       tB = this.C;
       if (tB == null) {
          a.S("mNormalButton");
       }
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, BreatheButtonView.class, "23")) {
          BreatheButtonView e = tB.e;
          if (e != null) {
             e.cancel();
             tB.e = objArray;
          }
          e = tB.d;
          if (e != null) {
             e.cancel();
             tB.d = objArray;
          }
          tB.f = objArray;
       }
       tB = this.A;
       if (tB == null) {
          a.S("mCoverView");
       }
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, LiveMerchantDiscountDialogCoverView.class, "13")) {
          LiveMerchantDiscountDialogCoverView j = tB.J;
          if (j != null) {
             j.cancel();
             tB.J = objArray;
          }
          LiveMerchantDiscountDialogCoverView h = tB.H;
          if (h != null) {
             h.cancel();
             tB.H.removeAllListeners();
          }
          h = tB.I;
          if (h != null) {
             h.cancel();
          }
          b9.a(tB.K);
       }
       tB = this.G;
       if (tB == null) {
          a.S("mContainerLiveData");
       }
       tB.j(this.M);
       tB = this.y;
       if (tB == null) {
          a.S("mRecyclerView");
       }
       tB.removeOnScrollListener(this.N);
       return;
    }
    public final int S8(){
       a obj = PatchProxy.apply(null, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       if (obj == null) {
          a.S("mContainerLiveData");
       }
       int i = obj.g();
       int i1 = 1;
       if (i != i1) {
          i1 = 2;
          if (i != i1) {
             if (i != 4) {
                return -1;
             }else {
                return 3;
             }
          }
       }
       return i1;
    }
    public final String V8(){
       DiscountCouponsInfoModel uDiscountCou;
       String buttonText;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          a.S("mContainerLiveData");
       }
       int i = obj.g();
       if (i != 3) {
          if (i != 4) {
             if (i == 5) {
                obj = this.G;
                if (obj == null) {
                   a.S("mContainerLiveData");
                }
                uDiscountCou = obj.c();
                if (uDiscountCou != null) {
                   DiscountCouponsInfoModel$DiscountCouponOverdueModel expireInfo = uDiscountCou.getExpireInfo();
                   if (expireInfo != null) {
                      buttonText = expireInfo.getButtonText();
                   label_003e :
                      objArray = buttonText;
                   }
                }
             }
          }else {
             obj = this.G;
             if (obj == null) {
                a.S("mContainerLiveData");
             }
             uDiscountCou = obj.c();
             if (uDiscountCou != null) {
                buttonText = uDiscountCou.getButtonText();
                goto label_003e ;
             }
          }
       }else {
          obj = this.G;
          if (obj == null) {
             a.S("mContainerLiveData");
          }
          DiscountCouponReceiveFailModel uDiscountCou1 = obj.d();
          if (uDiscountCou1 != null) {
             buttonText = uDiscountCou1.getButtonText();
             goto label_003e ;
          }
       }
    label_0064 :
       if (objArray == null) {
          objArray = a1.p(this.v);
       }
       return objArray;
    }
    public final String W8(){
       String str;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj == null) {
          a.S("mContainerLiveData");
       }
       if (obj.g() >= 4) {
          obj = this.G;
          if (obj == null) {
             a.S("mContainerLiveData");
          }
          DiscountCouponsInfoModel uDiscountCou = obj.c();
          if (uDiscountCou != null) {
             objArray = Integer.valueOf(uDiscountCou.getReceiveCondition());
          }
          str = String.valueOf(objArray);
       }else {
          obj = this.G;
          if (obj == null) {
             a.S("mContainerLiveData");
          }
          obj = obj.e();
          if (obj != null) {
             str = obj.f();
             if (str == null) {
             }
          }else {
          }
       }
       return str;
    }
    public final boolean X8(){
       String str1;
       a obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.H;
       String str = "mAdapter";
       if (obj == null) {
          a.S(str);
       }
       List list = (obj != null)? obj.Q0(): null;
       if (q.f(list)) {
          return false;
       }else {
          obj = this.H;
          if (obj == null) {
             a.S(str);
          }
          Iterator iterator = obj.Q0().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return false;
             }
             c uoc = iterator.next();
             if (uoc != null) {
                a uoa = uoc.e();
                if (uoa != null) {
                   str1 = uoa.b();
                label_0056 :
                   if (!TextUtils.x(str1)) {
                      if (uoc != null) {
                         a uoa1 = uoc.e();
                         if (uoa1 != null) {
                            str = uoa1.f();
                         label_006a :
                            if (TextUtils.n(str, "2")) {
                               break ;
                            }
                         }
                      }
                      Object[] objArray = null;
                      goto label_006a ;
                   }
                }
             }
             str1 = null;
             goto label_0056 ;
          }
          return true;
       }
    }
    public final void Y8(){
       a z;
       l1 a;
       ObjectAnimator objectAnimat1;
       float[] uofloatArray;
       Object[] objArray2;
       a uoa1;
       ObjectAnimator objectAnimat2;
       l1 a1;
       float[] uofloatArray1;
       ObjectAnimator objectAnimat = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objectAnimat, uoa, "15")) {
          return;
       }
       int i = 4;
       if (this.X8()) {
          z = objectAnimat.z;
          if (z == null) {
             a.S("mComeBackTitleView");
          }
          z.setVisibility(i);
          z = objectAnimat.x;
          if (z == null) {
             a.S("mCouponContainer");
          }
          z.setVisibility(0);
       }
       z = objectAnimat.B;
       if (z == null) {
          a.S("mGrabButton");
       }
       z.b(objectAnimat.s);
       z = objectAnimat.A;
       if (z == null) {
          a.S("mCoverView");
       }
       a s = objectAnimat.s;
       Objects.requireNonNull(z);
       float f = 0;
       if (!PatchProxy.isSupport(LiveMerchantDiscountDialogCoverView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(s), z, LiveMerchantDiscountDialogCoverView.class, "6")) {
          float[] uofloatArray2 = new float[]{f,(float)(- a1.e(257.00f))};
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(z, ViewGroup.TRANSLATION_Y, uofloatArray2);
          z.J = objectAnimat3;
          objectAnimat3.setDuration(s);
          z.J.addListener(new c(z));
          z.J.start();
       }
       z = objectAnimat.C;
       if (z == null) {
          a.S("mNormalButton");
       }
       String str = this.V8();
       a s1 = objectAnimat.s;
       Objects.requireNonNull(z);
       if (!PatchProxy.isSupport(BreatheButtonView.class) || !PatchProxy.applyVoidTwoRefs(str, Long.valueOf(s1), z, BreatheButtonView.class, "10")) {
          z.e(str, 1, s1);
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, objectAnimat, uoa, "18")) {
          if (objectAnimat.J == null) {
             s1 = objectAnimat.D;
             if (s1 == null) {
                a.S("mCouponView");
             }
             a t = objectAnimat.t;
             if (PatchProxy.isSupport(a.class)) {
                uoa1 = t;
                objectAnimat2 = PatchProxy.applyThreeRefs(s1, Float.valueOf(t), Float.valueOf(0x3f800000), 0, a.class, "1");
                if (objectAnimat2 != patchProxyRe) {
                label_0125 :
                   objectAnimat.J = objectAnimat2;
                   a1 = l1.a;
                }
             }else {
                uoa1 = t;
             }
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray1),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray1)};
             uofloatArray1 = new float[]{uoa1,0x3f800000};
             uofloatArray1 = new float[]{uoa1,0x3f800000};
             objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(s1, propertyValu1);
             goto label_0125 ;
          }
          if (objectAnimat.K == null) {
             if (!PatchProxy.applyVoid(objArray, objectAnimat, uoa, "19")) {
                s1 = objectAnimat.G;
                if (s1 == null) {
                   a.S("mContainerLiveData");
                }
                uoa = PatchProxy.applyOneRefs(s1, objectAnimat, uoa, "21");
                int i1 = 5;
                if (uoa != patchProxyRe) {
                }else if(s1.g() != i1 && s1.g() == i){
                   if (s1.f() == 1) {
                      objArray2 = objectAnimat.E;
                      if (objArray2 == null) {
                         a.S("mCouponEndTimeView");
                      }
                   }else {
                      objArray2 = objectAnimat.F;
                      if (objArray2 == null) {
                         a.S("mCouponMarqueeView");
                      }
                   }
                }else {
                   objArray2 = objArray;
                }
                if (uoa != null) {
                   uoa.setVisibility(i);
                   s1 = objectAnimat.t;
                   if (PatchProxy.isSupport(a.class)) {
                      Object[] objArray1 = new Object[i1];
                      objArray1[0] = uoa;
                      objArray1[1] = Float.valueOf(s1);
                      objArray1[2] = Float.valueOf(0x3f800000);
                      objArray1[3] = Float.valueOf(f);
                      objArray1[i] = Float.valueOf(0x3f800000);
                      objectAnimat1 = PatchProxy.apply(objArray1, objArray, a.class, "2");
                      if (objectAnimat1 != patchProxyRe) {
                      label_01da :
                         objectAnimat.K = objectAnimat1;
                         a.m(objectAnimat1);
                         objectAnimat1.addListener(new d(uoa));
                      }
                   }
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
                   uofloatArray = new float[]{s1,0x3f800000};
                   uofloatArray = new float[]{s1,0x3f800000};
                   objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(uoa, propertyValu);
                   goto label_01da ;
                }
             }
             a = l1.a;
          }
          AnimatorSet uAnimatorSet = new AnimatorSet();
          a d = objectAnimat.D;
          if (d == null) {
             a.S("mCouponView");
          }
          d.setVisibility(0);
          d = objectAnimat.K;
          if (d != null) {
             Animator[] uAnimatorArr = new Animator[]{objectAnimat.J,d};
             uAnimatorSet.playTogether(uAnimatorArr);
          }else {
             uAnimatorSet.play(objectAnimat.J);
          }
          uAnimatorSet.setDuration(objectAnimat.s);
          uAnimatorSet.addListener(new e(objectAnimat));
          uAnimatorSet.start();
       }
       return;
    }
    public final void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "14")) {
          return;
       }
       a tA = this.A;
       if (tA == null) {
          a.S("mCoverView");
       }
       Objects.requireNonNull(tA);
       if (!PatchProxy.applyVoid(objArray, tA, LiveMerchantDiscountDialogCoverView.class, "5")) {
          tA.setVisibility(4);
       }
       tA = this.B;
       if (tA == null) {
          a.S("mGrabButton");
       }
       Objects.requireNonNull(tA);
       if (!PatchProxy.applyVoid(objArray, tA, LiveMerchantDiscountDialogGrabButtonView.class, "7") && (!PatchProxy.isSupport(LiveMerchantDiscountDialogGrabButtonView.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, tA, LiveMerchantDiscountDialogGrabButtonView.class, "8"))) {
          tA.setVisibility(4);
          LiveMerchantDiscountDialogGrabButtonView q = tA.q;
          if (q != null) {
             q.end();
          }
       }
       tA = this.C;
       if (tA == null) {
          a.S("mNormalButton");
       }
       tA.d(this.V8());
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.L = new a$c(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a09e8);
       this.B = m1.f(p0, 0x7f0a1101);
       m1.a(p0, new a(new a$a(this)), R.id.grab_button);
       int i = 0x7f0a2dfe;
       BreatheButtonView uBreatheButt = m1.f(p0, i);
       this.C = uBreatheButt;
       if (uBreatheButt == null) {
          a.S("mNormalButton");
       }
       uBreatheButt.setBackground(a1.f(this.u));
       m1.a(p0, new a$b(this), i);
       ViewGroup viewGroup = m1.f(p0, R.id.coupon_container);
       this.D = m1.f(viewGroup, 0x7f0a16d6);
       this.E = m1.f(viewGroup, 0x7f0a09bd);
       this.F = m1.f(p0, 0x7f0a09c2);
       this.y = m1.f(this.R8().getView(), 0x7f0a2172);
       this.z = m1.f(p0, 0x7f0a411a);
       this.w = m1.f(p0, 0x7f0a4430);
       this.x = m1.f(p0, 0x7f0a09ba);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.G = this.q8(c.class);
       this.H = this.q8(c.class);
       return;
    }
}
