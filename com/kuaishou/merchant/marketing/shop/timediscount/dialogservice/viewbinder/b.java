package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b;
import rk0.b;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b$a;
import nsd.u;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y94.a;
import y94.c;
import crd.b;
import java.lang.Long;
import ot3.u0;
import java.lang.StringBuilder;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.graphics.Typeface;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.utility.f;
import brd.t;
import ba4.i;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel$DiscountCouponOverdueModel;
import android.widget.ViewFlipper;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveFailModel;
import java.util.ArrayList;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveRollingInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponReceiveRollingInfo$RollingUserMsg;
import aa4.k;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.GraphicVerticalMarqueeView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.LayoutInflater;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.CouponLiveMarqueeView;
import android.view.ViewGroup;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.ImageView;
import aa4.a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b extends b	// class@001c31
{
    public c A;
    public b$b B;
    public b C;
    public b D;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;
    public TextView w;
    public CouponLiveMarqueeView x;
    public int y;
    public int z;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final b$a I;

    static {
       b.I = new b$a(null);
       b.E = a1.e(10.00f);
       b.F = a1.e(16.00f);
       b.G = a1.e(24.00f);
       b.H = a1.e(60.00f);
    }
    public void b(Fragment p0){
       super(p0);
       this.y = 3;
       this.B = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tA = this.A;
       if (tA != null) {
          tA.h(this.B);
       }
       tA = this.A;
       int i = (tA != null)? tA.f(): 3;
       this.y = i;
       tA = this.A;
       i = (tA != null)? tA.g(): 0;
       this.z = i;
       this.V8(this.y, i);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       super.J8();
       b tA = this.A;
       if (tA != null) {
          tA.j(this.B);
       }
       tA = this.C;
       if (tA != null) {
          tA.dispose();
       }
       tA = this.D;
       if (tA != null) {
          tA.dispose();
       }
       return;
    }
    public final void S8(long p0){
       String useRangeTitl;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "8")) {
          return;
       }
       StringBuilder str = u0.c(p0)+" ";
       b tA = this.A;
       if (tA != null) {
          DiscountCouponsInfoModel uDiscountCou = tA.c();
          if (uDiscountCou != null) {
             useRangeTitl = uDiscountCou.getUseRangeTitle();
          label_0036 :
             useRangeTitl = str+useRangeTitl;
             b tw = this.w;
             if (tw == null) {
                a.S("mEndTimeView");
             }
             tw.setText(useRangeTitl);
             tA = this.w;
             if (tA == null) {
                a.S("mEndTimeView");
             }
             tA.setVisibility(0);
             return;
          }
       }
       useRangeTitl = null;
       goto label_0036 ;
    }
    public final void V8(int p0,int p1){
       b tv;
       String str3;
       ViewGroup$LayoutParams layoutParams;
       List rollingUserM;
       String rollingMessa;
       Object[] objArray1;
       ViewGroup viewGroup;
       Object[] objArray2;
       String couponPrice;
       b tv1;
       DiscountCouponsInfoModel uDiscountCou4;
       Object[] objArray3;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       float f = 18.00f;
       String str = "mEndTimeView";
       String str1 = "mAmountContainer";
       int i = 8;
       String str2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
       Object[] objArray = null;
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
             label_01ae :
                tv = this.v;
                if (tv == null) {
                   a.S(str1);
                }
                tv.setVisibility(i);
                tv = this.x;
                str3 = "mMarqueeView";
                if (tv == null) {
                   a.S(str3);
                }
                tv.setVisibility(0);
                tv = this.w;
                if (tv == null) {
                   a.S(str);
                }
                tv.setVisibility(i);
                tv = this.s;
                if (tv == null) {
                   a.S("mTitleView");
                }
                b tA = this.A;
                if (tA != null) {
                   DiscountCouponReceiveFailModel uDiscountCou = tA.d();
                   if (uDiscountCou != null) {
                      str = uDiscountCou.getResultTitle();
                   label_01e5 :
                      tv.setText(str);
                      tv = this.u;
                      if (tv == null) {
                         a.S("mCouponDescView");
                      }
                      tA = this.A;
                      if (tA != null) {
                         uDiscountCou = tA.d();
                         if (uDiscountCou != null) {
                            str = uDiscountCou.getSubTitle();
                         label_01ff :
                            tv.setText(str);
                            tv = this.s;
                            if (tv == null) {
                               a.S("mTitleView");
                            }
                            tv.setTextSize(f);
                            tv = this.u;
                            if (tv == null) {
                               a.S("mCouponDescView");
                            }
                            layoutParams = tv.getLayoutParams();
                            Objects.requireNonNull(layoutParams, str2);
                            layoutParams.topMargin = b.F;
                            tv = this.s;
                            if (tv == null) {
                               a.S("mTitleView");
                            }
                            layoutParams = tv.getLayoutParams();
                            Objects.requireNonNull(layoutParams, str2);
                            layoutParams.topMargin = b.H;
                            if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
                               ArrayList uArrayList = new ArrayList();
                               uob = this.A;
                               if (uob != null) {
                                  DiscountCouponReceiveFailModel uDiscountCou1 = uob.d();
                                  if (uDiscountCou1 != null) {
                                     DiscountCouponReceiveRollingInfo rollingInfo = uDiscountCou1.getRollingInfo();
                                     if (rollingInfo != null) {
                                        rollingUserM = rollingInfo.getRollingUserMsg();
                                     label_0259 :
                                        if (rollingUserM != null) {
                                           Iterator iterator = rollingUserM.iterator();
                                           while (iterator.hasNext()) {
                                              DiscountCouponReceiveRollingInfo$RollingUserMsg rollingUserM1 = iterator.next();
                                              if (uArrayList.size() <= 10) {
                                                 k ok = new k();
                                                 str1 = (rollingUserM1 != null)? rollingUserM1.getBuyerImage(): objArray;
                                                 ok.b = str1;
                                                 rollingMessa = (rollingUserM1 != null)? rollingUserM1.getRollingMessage(): objArray;
                                                 ok.a = rollingMessa;
                                                 uArrayList.add(ok);
                                              }
                                           }
                                        }
                                        uob = this.x;
                                        if (uob == null) {
                                           a.S(str3);
                                        }
                                        Objects.requireNonNull(uob);
                                        if (!PatchProxy.applyVoidOneRefs(uArrayList, uob, GraphicVerticalMarqueeView.class, "2")) {
                                           uob.setMarquees(uArrayList);
                                           PatchProxyResult patchProxyRe = PatchProxyResult.class;
                                           GraphicVerticalMarqueeView obj = PatchProxy.apply(objArray, uob, GraphicVerticalMarqueeView.class, "3");
                                           if (obj != patchProxyRe) {
                                              obj.booleanValue();
                                           }else {
                                              obj = uob.c;
                                              if (obj != null && obj.size()) {
                                                 uob.removeAllViews();
                                                 if (!PatchProxy.applyVoid(objArray, uob, GraphicVerticalMarqueeView.class, "4")) {
                                                    uob.clearAnimation();
                                                    Animation uAnimation = AnimationUtils.loadAnimation(uob.b, R.anim.arg_RES_7f010099);
                                                    if (uob.d != null) {
                                                       uAnimation.setDuration((long)uob.g);
                                                    }
                                                    uob.setInAnimation(uAnimation);
                                                    uAnimation = AnimationUtils.loadAnimation(uob.b, R.anim.arg_RES_7f01009a);
                                                    if (uob.d != null) {
                                                       uAnimation.setDuration((long)uob.g);
                                                    }
                                                    uob.setOutAnimation(uAnimation);
                                                 }
                                                 for (obj = 0; obj < uob.c.size(); obj++) {
                                                    if (PatchProxy.isSupport(GraphicVerticalMarqueeView.class)) {
                                                       viewGroup = PatchProxy.applyOneRefs(Integer.valueOf(obj), uob, GraphicVerticalMarqueeView.class, "5");
                                                       if (viewGroup != patchProxyRe) {
                                                       label_0364 :
                                                          viewGroup.setOnClickListener(new a(uob, obj, viewGroup));
                                                          uob.addView(viewGroup);
                                                       }
                                                    }
                                                    k ok1 = uob.c.get(obj);
                                                    ViewGroup viewGroup1 = LayoutInflater.from(uob.b).inflate(uob.getLayoutResId(), objArray);
                                                    MerchantKwaiImageView merchantKwai = uob.a(viewGroup1);
                                                    TextView textView = uob.b(viewGroup1);
                                                    textView.setText(ok1.a);
                                                    if (uob.i != null) {
                                                       merchantKwai.setVisibility(0);
                                                       merchantKwai.L(ok1.b);
                                                    }
                                                    textView.setTextSize((float)uob.h);
                                                    viewGroup1.setTag(Integer.valueOf(obj));
                                                    viewGroup = viewGroup1;
                                                    goto label_0364 ;
                                                 }
                                                 if (uob.c.size() > 1) {
                                                    uob.startFlipping();
                                                 }else {
                                                    uob.stopFlipping();
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                               rollingUserM = objArray;
                               goto label_0259 ;
                            }
                         }
                      }
                      objArray2 = objArray;
                      goto label_01ff ;
                   }
                }
                objArray2 = objArray;
                goto label_01e5 ;
             }
          }else if(p1 == 4){
             tv = this.A;
             if (tv != null) {
                DiscountCouponsInfoModel uDiscountCou2 = tv.c();
                if (uDiscountCou2 != null) {
                   couponPrice = uDiscountCou2.getCouponPrice();
                label_0046 :
                   if (!TextUtils.x(couponPrice)) {
                      tv1 = this.v;
                      if (tv1 == null) {
                         a.S(str1);
                      }
                      tv1.setVisibility(0);
                   }
                   tv1 = this.w;
                   if (tv1 == null) {
                      a.S(str);
                   }
                   tv1.setVisibility(0);
                   tv1 = this.s;
                   if (tv1 == null) {
                      a.S("mTitleView");
                   }
                   b tA1 = this.A;
                   if (tA1 != null) {
                      DiscountCouponsInfoModel uDiscountCou3 = tA1.c();
                      if (uDiscountCou3 != null) {
                         rollingMessa = uDiscountCou3.getCouponTitle();
                      label_0077 :
                         tv1.setText(rollingMessa);
                         tv1 = this.s;
                         if (tv1 == null) {
                            a.S("mTitleView");
                         }
                         tv1.setTextSize(14.00f);
                         tv1 = this.t;
                         rollingMessa = "mAmountView";
                         if (tv1 == null) {
                            a.S(rollingMessa);
                         }
                         tv1.setText(couponPrice);
                         tv = this.t;
                         if (tv == null) {
                            a.S(rollingMessa);
                         }
                         tv.setTypeface(Typeface.DEFAULT_BOLD);
                         tv = this.u;
                         if (tv == null) {
                            a.S("mCouponDescView");
                         }
                         tv1 = this.A;
                         if (tv1 != null) {
                            uDiscountCou4 = tv1.c();
                            if (uDiscountCou4 != null) {
                               str3 = uDiscountCou4.getUseConditionTitle();
                            label_00b5 :
                               tv.setText(str3);
                               tv = this.u;
                               if (tv == null) {
                                  a.S("mCouponDescView");
                               }
                               layoutParams = tv.getLayoutParams();
                               Objects.requireNonNull(layoutParams, str2);
                               layoutParams.topMargin = b.E;
                               tv = this.s;
                               if (tv == null) {
                                  a.S("mTitleView");
                               }
                               layoutParams = tv.getLayoutParams();
                               Objects.requireNonNull(layoutParams, str2);
                               layoutParams.topMargin = b.G;
                               tv = this.A;
                               if (tv != null) {
                                  uDiscountCou2 = tv.c();
                                  if (uDiscountCou2 != null) {
                                     objArray = Long.valueOf(uDiscountCou2.getStartTime());
                                  }
                               }
                               if (!PatchProxy.applyVoidOneRefs(objArray, this, uob, "9") && objArray != null) {
                                  long l = objArray.longValue() - u0.b();
                                  uob = this.D;
                                  if (uob != null) {
                                     uob.dispose();
                                  }
                                  this.D = f.d().b(l, 1000).subscribe(new i(this));
                               }
                            }
                         }
                         objArray3 = objArray;
                         goto label_00b5 ;
                      }
                   }
                   Object[] objArray4 = objArray;
                   goto label_0077 ;
                }
             }
             couponPrice = objArray;
             goto label_0046 ;
          }else if(p1 == 5){
             tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             tv.setVisibility(i);
             tv = this.s;
             if (tv == null) {
                a.S("mTitleView");
             }
             tv1 = this.A;
             if (tv1 != null) {
                uDiscountCou4 = tv1.c();
                if (uDiscountCou4 != null) {
                   DiscountCouponsInfoModel$DiscountCouponOverdueModel expireInfo = uDiscountCou4.getExpireInfo();
                   if (expireInfo != null) {
                      str3 = expireInfo.getResultTitle();
                   label_014f :
                      tv.setText(str3);
                      tv = this.s;
                      if (tv == null) {
                         a.S("mTitleView");
                      }
                      tv.setTextSize(f);
                      tv = this.u;
                      if (tv == null) {
                         a.S("mCouponDescView");
                      }
                      tv1 = this.A;
                      if (tv1 != null) {
                         uDiscountCou4 = tv1.c();
                         if (uDiscountCou4 != null) {
                            expireInfo = uDiscountCou4.getExpireInfo();
                            if (expireInfo != null) {
                               objArray = expireInfo.getSubTitle();
                            }
                         }
                      }
                      tv.setText(objArray);
                      tv = this.w;
                      if (tv == null) {
                         a.S(str);
                      }
                      tv.setVisibility(i);
                      tv = this.u;
                      if (tv == null) {
                         a.S("mCouponDescView");
                      }
                      layoutParams = tv.getLayoutParams();
                      Objects.requireNonNull(layoutParams, str2);
                      layoutParams.topMargin = b.F;
                      tv = this.s;
                      if (tv == null) {
                         a.S("mTitleView");
                      }
                      layoutParams = tv.getLayoutParams();
                      Objects.requireNonNull(layoutParams, str2);
                      layoutParams.topMargin = b.H;
                   }
                }
             }
             objArray3 = objArray;
             goto label_014f ;
          }
       }else {
          goto label_01ae ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a09c3);
       this.v = m1.f(p0, 0x7f0a09bf);
       this.t = m1.f(p0, 0x7f0a09be);
       this.u = m1.f(p0, 0x7f0a09c1);
       this.w = m1.f(p0, 0x7f0a09bd);
       this.x = m1.f(p0, 0x7f0a09c2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.A = this.q8(c.class);
       return;
    }
}
