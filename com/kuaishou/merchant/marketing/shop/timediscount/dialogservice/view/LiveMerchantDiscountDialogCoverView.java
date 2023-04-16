package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.util.ArrayList;
import android.animation.ObjectAnimator;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView$a;
import android.animation.Animator$AnimatorListener;
import th0.l;
import android.animation.TimeInterpolator;
import android.view.animation.BounceInterpolator;
import android.animation.Keyframe;
import th0.k;
import th0.m;
import android.animation.PropertyValuesHolder;
import android.view.animation.DecelerateInterpolator;
import java.lang.Boolean;
import da4.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import q94.p;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.view.LiveMerchantDiscountDialogCoverView$b;

public class LiveMerchantDiscountDialogCoverView extends ConstraintLayout implements d	// class@001c1d
{
    public MerchantKwaiImageView B;
    public MerchantKwaiImageView C;
    public MerchantKwaiImageView D;
    public MerchantKwaiImageView E;
    public TextView F;
    public TextView G;
    public AnimatorSet H;
    public AnimatorSet I;
    public ObjectAnimator J;
    public b K;
    public Group L;
    public a M;
    public static final int N;

    public void LiveMerchantDiscountDialogCoverView(Context p0){
       super(p0, null);
    }
    public void LiveMerchantDiscountDialogCoverView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantDiscountDialogCoverView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView.class, "1")) {
       }else {
          a.b(p0, R.layout.arg_RES_7f0d1680, this);
       }
       return;
    }
    public final List L(View p0){
       float[] uofloatArray;
       float f;
       ObjectAnimator objectAnimat;
       Object obj = this;
       ObjectAnimator obj1 = p0;
       ObjectAnimator obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveMerchantDiscountDialogCoverView.class, "10");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 2;
       int i1 = (a1.e(74.00f) + a1.e(28.00f)) / i;
       int i2 = a1.e(16.00f);
       ArrayList uArrayList = new ArrayList();
       int i3 = 0;
       String str = "translationX";
       if (obj1 == obj.C) {
          uofloatArray = new float[i];
          uofloatArray[0] = (float)(- i1);
          f = (float)i2;
          uofloatArray[1] = f;
          objectAnimat = ObjectAnimator.ofFloat(obj1, str, uofloatArray);
          uofloatArray = new float[i];
          uofloatArray[0] = f;
          uofloatArray[1] = i3;
          obj2 = ObjectAnimator.ofFloat(obj1, str, uofloatArray);
       }else {
          uofloatArray = new float[i];
          uofloatArray[0] = (float)i1;
          f = (float)(- i2);
          uofloatArray[1] = f;
          objectAnimat = ObjectAnimator.ofFloat(obj1, str, uofloatArray);
          uofloatArray = new float[i];
          uofloatArray[0] = f;
          uofloatArray[1] = i3;
          obj2 = ObjectAnimator.ofFloat(obj1, str, uofloatArray);
       }
       obj2.setDuration(300);
       obj2.setStartDelay(1300);
       objectAnimat.setDuration(300);
       objectAnimat.addListener(new LiveMerchantDiscountDialogCoverView$a(obj, obj1, objectAnimat));
       objectAnimat.setInterpolator(new l());
       obj2.setInterpolator(new BounceInterpolator());
       Keyframe keyframe = Keyframe.ofFloat(i3, 0x3f333333);
       Keyframe keyframe1 = Keyframe.ofFloat(0.30f, 0x3f800000);
       keyframe1.setInterpolator(new BounceInterpolator());
       Keyframe keyframe2 = Keyframe.ofFloat(0x3f19999a, 0x3f666666);
       keyframe2.setInterpolator(new k());
       Keyframe keyframe3 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
       keyframe3.setInterpolator(new m());
       Keyframe[] keyframeArra = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
       Keyframe[] keyframeArra1 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
       propertyValu[0] = PropertyValuesHolder.ofKeyframe("scaleX", keyframeArra);
       propertyValu[1] = PropertyValuesHolder.ofKeyframe("scaleY", keyframeArra1);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(obj1, propertyValu);
       objectAnimat1.setStartDelay(200);
       objectAnimat1.setDuration(1100);
       obj1 = ObjectAnimator.ofFloat(obj1, "alpha", new float[i]{0,0x3f800000});
       obj1.setDuration(300);
       obj1.setInterpolator(new DecelerateInterpolator());
       uArrayList.add(objectAnimat);
       uArrayList.add(obj2);
       uArrayList.add(objectAnimat1);
       uArrayList.add(obj1);
       return uArrayList;
    }
    public final boolean M(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantDiscountDialogCoverView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.M.f(), "2");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantDiscountDialogCoverView.class, "3")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a1384);
       this.C = m1.f(p0, 0x7f0a1385);
       this.D = m1.f(p0, 0x7f0a1397);
       this.F = m1.f(p0, 0x7f0a3e52);
       this.G = m1.f(p0, 0x7f0a3e63);
       this.L = m1.f(p0, 0x7f0a1133);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.image_view_grab_cover_top_background);
       this.E = merchantKwai;
       merchantKwai.s0(p.a, null);
       return;
    }
    public final AnimatorSet getCoverTextAnimator(){
       AnimatorSet obj = PatchProxy.apply(null, this, LiveMerchantDiscountDialogCoverView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.G, "alpha", new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(this.G, "scaleX", new float[2]{0x3f333333,0x3f800000}),ObjectAnimator.ofFloat(this.G, "scaleY", new float[2]{0x3f333333,0x3f800000})};
       obj.playTogether(uAnimatorArr);
       obj.setDuration(300);
       obj.setStartDelay(500);
       obj.addListener(new LiveMerchantDiscountDialogCoverView$b(this, obj));
       return obj;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantDiscountDialogCoverView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
}
