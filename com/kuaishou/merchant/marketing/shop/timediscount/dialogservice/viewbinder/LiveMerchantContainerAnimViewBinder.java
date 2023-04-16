package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import rk0.b;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$b;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$c;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import ca4.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.List;
import android.graphics.Rect;
import com.kwai.robust.PatchProxyResult;
import z94.a;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import y94.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import ekd.m1;
import java.util.ArrayList;
import android.animation.Animator;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.Ref$ObjectRef;
import ba4.a;
import android.animation.Animator$AnimatorListener;
import w94.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Collection;
import q94.n;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.model.LiveMerchantContainerDataList;
import da4.a;
import android.animation.ObjectAnimator;
import e84.a;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$a;
import android.view.View$OnClickListener;
import w94.c;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba4.c;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$showInAnimListener$2$a;
import w94.d;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class LiveMerchantContainerAnimViewBinder extends b	// class@001c28
{
    public a A;
    public a B;
    public int C;
    public boolean D;
    public int E;
    public a F;
    public LiveMerchantContainerAnimViewBinder$c G;
    public final p H;
    public final String s;
    public final long t;
    public final long u;
    public final long v;
    public KwaiDialogFragment w;
    public View x;
    public LiveMerchantScaleRecyclerView y;
    public a z;

    public void LiveMerchantContainerAnimViewBinder(KwaiDialogFragment p0,int p1,boolean p2,int p3){
       super(p0);
       this.s = "LiveMerchantContainerAnimViewBinder";
       this.t = 300;
       this.u = 280;
       this.v = 100;
       this.w = p0;
       this.C = p1;
       this.D = p2;
       this.E = p3;
       this.F = new LiveMerchantContainerAnimViewBinder$b(this);
       this.G = new LiveMerchantContainerAnimViewBinder$c(this);
       this.H = s.c(new LiveMerchantContainerAnimViewBinder$showInAnimListener$2(this));
    }
    public static final LiveMerchantScaleRecyclerView S8(LiveMerchantContainerAnimViewBinder p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mContainerRecyclerView");
       }
       return p0;
    }
    public static final View V8(LiveMerchantContainerAnimViewBinder p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mRootView");
       }
       return p0;
    }
    public void E8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerAnimViewBinder.class, "4")) {
          return;
       }
       a uoa1 = ViewModelProviders.of(this.R8()).get(uoa);
       this.B = uoa1;
       if (uoa1 == null) {
          a.S("mViewModel");
       }
       if (uoa1 != null) {
          LiveMerchantContainerAnimViewBinder tG = this.G;
          if (!PatchProxy.applyVoidOneRefs(tG, uoa1, uoa, "7") && !uoa1.d.contains(tG)) {
             uoa1.d.add(tG);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerAnimViewBinder.class, "5")) {
          return;
       }
       super.J8();
       LiveMerchantContainerAnimViewBinder tB = this.B;
       if (tB == null) {
          a.S("mViewModel");
       }
       if (tB != null) {
          LiveMerchantContainerAnimViewBinder tG = this.G;
          if (!PatchProxy.applyVoidOneRefs(tG, tB, a.class, "8") && tG != null) {
             tB.d.remove(tG);
          }
       }
       return;
    }
    public final Rect W8(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantContainerAnimViewBinder.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       p0.getLocationInWindow(obj);
       Rect rect = new Rect();
       int i = obj[0];
       rect.left = i;
       rect.right = i + p0.getWidth();
       int i1 = obj[1];
       rect.top = i1;
       rect.bottom = i1 + p0.getHeight();
       return rect;
    }
    public final a X8(){
       Object[] objArray = null;
       LiveMerchantContainerAnimViewBinder obj = PatchProxy.apply(objArray, this, LiveMerchantContainerAnimViewBinder.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == 1) {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, this.s, "getLiveMerchantContainerAnimService: coupon center|right top");
          return this.z;
       }else if(obj == 2){
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, this.s, "getLiveMerchantContainerAnimService: discount activity|right bottom");
          return this.A;
       }else {
          a.s(MerchantMarketingShopLogBiz.LIVE_MERCHANT_TIME_DISCOUNT, this.s, "getLiveMerchantContainerAnimService: null");
          return objArray;
       }
    }
    public final String Y8(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, LiveMerchantContainerAnimViewBinder.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a9();
       String str = (obj != null)? obj.b(): objArray;
       if (TextUtils.x(str)) {
          return "";
       }else if(obj != null){
          objArray = obj.b();
       }
       a.m(objArray);
       return objArray;
    }
    public final View Z8(){
       LiveMerchantContainerAnimViewBinder obj = PatchProxy.apply(null, this, LiveMerchantContainerAnimViewBinder.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          a.S("mContainerRecyclerView");
       }
       LiveMerchantContainerAnimViewBinder tB = this.B;
       if (tB == null) {
          a.S("mViewModel");
       }
       RecyclerView$ViewHolder viewHolder = obj.findViewHolderForAdapterPosition(tB.q0());
       if (viewHolder != null) {
          View view = m1.f(viewHolder.itemView, R.id.live_merchant_container_item_anim_layout);
          if (view != null) {
             return view;
          }
       }
       return null;
    }
    public final c a9(){
       LiveMerchantContainerAnimViewBinder obj = PatchProxy.apply(null, this, LiveMerchantContainerAnimViewBinder.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       String str = "mViewModel";
       if (obj == null) {
          a.S(str);
       }
       a b = obj.b;
       LiveMerchantContainerAnimViewBinder tB = this.B;
       if (tB == null) {
          a.S(str);
       }
       return b.get(tB.q0());
    }
    public final Animator b9(View p0,boolean p1){
       LiveMerchantContainerAnimViewBinder obj2;
       ArrayList uArrayList;
       View view1;
       int i1;
       ValueAnimator valueAnimato;
       int this;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.isSupport(LiveMerchantContainerAnimViewBinder.class)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Boolean.valueOf(p1), obj, LiveMerchantContainerAnimViewBinder.class, "18");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       obj2 = obj.y;
       if (obj2 == null) {
          a.S("mContainerRecyclerView");
       }
       if (obj2 != null) {
          obj2 = obj.y;
          if (obj2 == null) {
             a.S("mContainerRecyclerView");
          }
          if (obj2.getChildCount() > 0) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             if (PatchProxy.isSupport(LiveMerchantContainerAnimViewBinder.class)) {
                View obj3 = PatchProxy.applyTwoRefs(obj1, Boolean.valueOf(p1), obj, LiveMerchantContainerAnimViewBinder.class, "19");
                if (obj3 != PatchProxyResult.class) {
                   uArrayList = obj3;
                }else {
                label_0053 :
                   obj2 = obj.y;
                   if (obj2 == null) {
                      a.S("mContainerRecyclerView");
                   }
                   if (obj2 != null) {
                      obj2 = obj.y;
                      if (obj2 == null) {
                         a.S("mContainerRecyclerView");
                      }
                      if (obj2.getChildCount() > 0) {
                         ArrayList uArrayList1 = new ArrayList();
                         obj2 = obj.y;
                         if (obj2 == null) {
                            a.S("mContainerRecyclerView");
                         }
                         int childCount = obj2.getChildCount();
                         int i = 0;
                         while (i < childCount) {
                            obj2 = obj.y;
                            if (obj2 == null) {
                               a.S("mContainerRecyclerView");
                            }
                            obj3 = obj2.getChildAt(i);
                            View view = (obj3 != null)? obj3: null;
                            if (view != null) {
                               if (PatchProxy.isSupport(LiveMerchantContainerAnimViewBinder.class)) {
                                  view1 = view;
                                  i1 = i;
                                  valueAnimato = PatchProxy.applyThreeRefs(view, p0, Boolean.valueOf(p1), this, LiveMerchantContainerAnimViewBinder.class, "20");
                                  if (valueAnimato != PatchProxyResult.class) {
                                  }else {
                                  label_00b7 :
                                     Ref$ObjectRef objectRef = new Ref$ObjectRef();
                                     View view2 = m1.f(view1, R.id.live_merchant_container_item_anim_layout);
                                     objectRef.element = view2;
                                     if (a.g(obj1, view2) || objectRef.element == null) {
                                        valueAnimato = null;
                                     }else {
                                        int i2 = 0;
                                        this = (p1)? 0: 0x3f800000;
                                        if (p1) {
                                           i2 = 0x3f800000;
                                        }
                                        float[] uofloatArray = new float[]{this,i2};
                                        ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray);
                                        valueAnimato1.addListener(new a(objectRef));
                                        valueAnimato1.addUpdateListener(new a(objectRef.element));
                                        valueAnimato = valueAnimato1;
                                     }
                                  }
                               }else {
                                  view1 = view;
                                  i1 = i;
                                  goto label_00b7 ;
                               }
                               if (valueAnimato != null) {
                                  uArrayList1.add(valueAnimato);
                               }
                            }else {
                               i1 = i;
                            }
                            i = i1 + 1;
                         }
                         if (!uArrayList1.isEmpty()) {
                            uArrayList = uArrayList1;
                         }
                      }
                   }
                label_0117 :
                   uArrayList = null;
                }
             }else {
                goto label_0053 ;
             }
             uAnimatorSet.playTogether(uArrayList);
             return uAnimatorSet;
          }
       }
       return null;
    }
    public final void c9(){
       String str4;
       LiveMerchantContainerAnimViewBinder liveMerchant = LiveMerchantContainerAnimViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMerchant, "6")) {
          return;
       }
       n a = n.a;
       String str = this.Y8();
       LiveMerchantContainerAnimViewBinder tB = this.B;
       String str1 = "mViewModel";
       if (tB == null) {
          a.S(str1);
       }
       int i = tB.b.size();
       LiveMerchantContainerAnimViewBinder tB1 = this.B;
       if (tB1 == null) {
          a.S(str1);
       }
       int i1 = tB1.q0() + 1;
       c uoc = this.a9();
       int i2 = (uoc != null)? uoc.g(): -1;
       LiveMerchantContainerAnimViewBinder tB2 = this.B;
       if (tB2 == null) {
          a.S(str1);
       }
       String liveStreamId = tB2.getLiveStreamId();
       String str2 = "";
       if (liveStreamId == null) {
          liveStreamId = str2;
       }
       LiveMerchantContainerAnimViewBinder tB3 = this.B;
       if (tB3 == null) {
          a.S(str1);
       }
       str1 = tB3.p0();
       String str3 = (str1 != null)? str1: str2;
       c uoc1 = this.a9();
       if (uoc1 != null) {
          a uoa = uoc1.e();
          if (uoa != null) {
             str1 = uoa.f();
             if (str1 != null) {
                str4 = str1;
             label_0071 :
                a.c(str, i, i1, i2, 2, liveStreamId, str3, str4);
                if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "10")) {
                   c uoc2 = this.a9();
                   if (uoc2 == null) {
                      liveMerchant = this.w;
                      if (liveMerchant != null) {
                         liveMerchant.dismiss();
                      }
                   }else {
                      int i3 = uoc2.g();
                      if (i3 >= 0 && i3 <= 2) {
                         this.h9(this.z);
                      }else if(i3 == 4){
                         this.h9(this.z);
                      }else {
                         liveMerchant = this.w;
                         if (liveMerchant != null) {
                            liveMerchant.dismiss();
                         }
                      }
                   }
                }
                return;
             }
          }
       }
       str4 = str2;
       goto label_0071 ;
    }
    public final ValueAnimator d9(boolean p0){
       LiveMerchantContainerAnimViewBinder liveMerchant = LiveMerchantContainerAnimViewBinder.class;
       if (PatchProxy.isSupport(liveMerchant)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, liveMerchant, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       int i1 = (p0)? 0: 0x3f800000;
       if (p0) {
          i = 0x3f800000;
       }
       LiveMerchantContainerAnimViewBinder tx = this.x;
       if (tx == null) {
          a.S("mRootView");
       }
       float[] uofloatArray = new float[]{i1,i};
       return ObjectAnimator.ofFloat(tx, "alpha", uofloatArray);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder.class, "3")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a2173);
       LiveMerchantScaleRecyclerView liveMerchant = m1.f(p0, R.id.live_merchant_container_recycler_view);
       this.y = liveMerchant;
       if (liveMerchant == null) {
          a.S("mContainerRecyclerView");
       }
       liveMerchant.setOnDrawCallback(this.F);
       m1.a(p0, new LiveMerchantContainerAnimViewBinder$a(this), R.id.live_merchant_container_close_view);
       return;
    }
    public final void e9(){
       ValueAnimator valueAnimato;
       AnimatorSet uAnimatorSet1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMerchantContainerAnimViewBinder liveMerchant = LiveMerchantContainerAnimViewBinder.class;
       if (PatchProxy.applyVoid(null, obj, liveMerchant, "8")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       a uoa = this.X8();
       boolean b = true;
       if (uoa != null) {
          valueAnimato = uoa.b(this.Y8(), b);
          if (valueAnimato != null) {
             valueAnimato.setDuration(obj.t);
             uArrayList.add(valueAnimato);
          }
       }
       AnimatorSet uAnimatorSet = 2;
       if (obj.D != null) {
          uAnimatorSet1 = PatchProxy.apply(null, obj, liveMerchant, "12");
          if (uAnimatorSet1 != patchProxyRe) {
          label_00e9 :
             if (uAnimatorSet1 == null) {
                uAnimatorSet1 = PatchProxy.apply(null, obj, liveMerchant, "13");
                if (uAnimatorSet1 != patchProxyRe) {
                }else {
                   View view = this.Z8();
                   if (view != null) {
                      uAnimatorSet = new AnimatorSet();
                      ArrayList uArrayList1 = new ArrayList();
                      ValueAnimator valueAnimato1 = PatchProxy.applyOneRefs(view, obj, liveMerchant, "16");
                      if (valueAnimato1 != patchProxyRe) {
                      }else {
                         valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                         valueAnimato1.addUpdateListener(new a(view));
                         valueAnimato1.setDuration(obj.t);
                      }
                      if (valueAnimato1 != null) {
                         uArrayList1.add(valueAnimato1);
                      }
                      Animator uAnimator = obj.b9(view, b);
                      if (uAnimator != null) {
                         uAnimator.setStartDelay(50);
                         uAnimator.setDuration(obj.t);
                         uArrayList1.add(uAnimator);
                      }
                      if (uArrayList1.size() > 0) {
                         uAnimatorSet.playTogether(uArrayList1);
                         uAnimatorSet1 = uAnimatorSet;
                      }
                   }
                   uAnimatorSet1 = null;
                }
             }
             if (uAnimatorSet1 != null) {
                uArrayList.add(uAnimatorSet1);
             }
             valueAnimato = obj.d9(b);
             if (valueAnimato != null) {
                valueAnimato.setDuration(obj.t);
                uArrayList.add(valueAnimato);
             }
             if (uArrayList.isEmpty()) {
                return;
             }else {
                uAnimatorSet1 = new AnimatorSet();
                Object obj1 = PatchProxy.apply(null, obj, liveMerchant, "1");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = obj.H.getValue();
                }
                uAnimatorSet1.addListener(obj1);
                uAnimatorSet1.playTogether(uArrayList);
                uAnimatorSet1.start();
                return;
             }
          }else {
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = this.Z8();
             a uoa1 = this.X8();
             if (uoa1 != null && objectRef.element != null) {
                AnimatorSet uAnimatorSet2 = new AnimatorSet();
                ArrayList uArrayList2 = new ArrayList();
                Ref$ObjectRef element = objectRef.element;
                ValueAnimator valueAnimato2 = PatchProxy.applyTwoRefs(uoa1, element, obj, liveMerchant, "15");
                if (valueAnimato2 != patchProxyRe) {
                }else {
                   Rect rect = uoa1.a(this.Y8());
                   Rect rect1 = obj.W8(element);
                   if (rect != null && (rect1 != null && (!rect.width() || !rect1.width()))) {
                      valueAnimato2 = null;
                   }else {
                      ValueAnimator valueAnimato3 = ValueAnimator.ofFloat(new float[uAnimatorSet]{0,0x3f800000});
                      LiveMerchantContainerAnimViewBinder x = obj.x;
                      if (x == null) {
                         a.S("mRootView");
                      }
                      Objects.requireNonNull(x, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                      c uoc = new c(element, x, rect, rect1);
                      valueAnimato3.addUpdateListener(uoc);
                      valueAnimato3.addListener(uoc);
                      valueAnimato3.setDuration(obj.t);
                      valueAnimato2 = valueAnimato3;
                   }
                }
                if (valueAnimato2 != null) {
                   uArrayList2.add(valueAnimato2);
                   Animator uAnimator1 = obj.b9(objectRef.element, b);
                   if (uAnimator1 != null) {
                      uAnimator1.setStartDelay(obj.u);
                      uAnimator1.setDuration(obj.v);
                      uArrayList2.add(uAnimator1);
                   }
                   if (uArrayList2.size() > 0) {
                      uAnimatorSet2.addListener(new c(obj, objectRef));
                      uAnimatorSet2.playTogether(uArrayList2);
                      uAnimatorSet1 = uAnimatorSet2;
                      goto label_00e9 ;
                   }
                }
             }
          }
       }
       uAnimatorSet1 = null;
       goto label_00e9 ;
    }
    public final void h9(a p0){
       ValueAnimator valueAnimato;
       LiveMerchantContainerAnimViewBinder liveMerchant = LiveMerchantContainerAnimViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, "11")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          valueAnimato = p0.b(this.Y8(), false);
          if (valueAnimato != null) {
             uArrayList.add(valueAnimato);
          }
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(p0, this, liveMerchant, "14");
       if (uAnimatorSet != patchProxyRe) {
       }else {
          View view = this.Z8();
          if (view != null && p0 != null) {
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             ArrayList uArrayList1 = new ArrayList();
             ValueAnimator valueAnimato2 = PatchProxy.applyTwoRefs(p0, view, this, liveMerchant, "17");
             if (valueAnimato2 != patchProxyRe) {
             }else {
                Rect rect = this.W8(view);
                Rect rect1 = p0.a(this.Y8());
                if (rect == null || rect1 == null) {
                   valueAnimato2 = null;
                }else {
                   valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                   LiveMerchantContainerAnimViewBinder tx = this.x;
                   if (tx == null) {
                      a.S("mRootView");
                   }
                   Objects.requireNonNull(tx, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                   d uod = new d(view, tx, rect, rect1);
                   valueAnimato.addUpdateListener(uod);
                   valueAnimato.addListener(uod);
                   valueAnimato.setDuration(this.t);
                   valueAnimato2 = valueAnimato;
                }
             }
             if (valueAnimato2 != null) {
                uArrayList1.add(valueAnimato2);
             }
             Animator uAnimator = this.b9(view, false);
             if (uAnimator != null) {
                uAnimator.setDuration(this.v);
                uArrayList1.add(uAnimator);
             }
             if (uArrayList1.size() > 0) {
                uAnimatorSet2.playTogether(uArrayList1);
                uAnimatorSet = uAnimatorSet2;
             }
          }
       label_00ab :
          uAnimatorSet = null;
       }
       if (uAnimatorSet != null) {
          uArrayList.add(uAnimatorSet);
       }
       ValueAnimator valueAnimato1 = this.d9(false);
       if (valueAnimato1 != null) {
          uArrayList.add(valueAnimato1);
       }
       if (uArrayList.isEmpty()) {
          return;
       }else {
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          uAnimatorSet1.playTogether(uArrayList);
          uAnimatorSet1.addListener(new LiveMerchantContainerAnimViewBinder$d(this));
          uAnimatorSet1.setDuration(this.t);
          uAnimatorSet1.start();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantContainerAnimViewBinder.class, "2")) {
          return;
       }
       this.z = this.t8("LIVE_MERCHANT_TIME_COUPON_CENTER_ANIM_SERVICE");
       return;
    }
}
