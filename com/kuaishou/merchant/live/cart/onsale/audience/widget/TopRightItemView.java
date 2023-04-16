package com.kuaishou.merchant.live.cart.onsale.audience.widget.TopRightItemView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TopRightAreaInfo$RightAreaEntrance;
import android.widget.ImageView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TopRightAreaInfo$Mark;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import ekd.m1;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import i54.d;

public class TopRightItemView extends LinearLayout	// class@0019a8
{
    public TextView b;
    public MerchantLottieAnimationView c;
    public MerchantKwaiImageView d;
    public SelectShapeTextView e;
    public TopRightAreaInfo$RightAreaEntrance f;
    public boolean g;

    public void TopRightItemView(Context p0){
       super(p0);
       this.b();
    }
    public void TopRightItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
    }
    public void TopRightItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, TopRightItemView.class, "4")) {
          return;
       }
       int i = 0;
       int i1 = 8;
       if (this.f.mImgType == null) {
          this.d.setVisibility(i);
          this.c.setVisibility(i1);
          this.d.L(this.f.mImgUrl);
       }else {
          this.d.setVisibility(i1);
          this.c.setVisibility(i);
          this.c.setAnimationFromUrl(this.f.mImgUrl);
          this.c.s();
       }
       this.b.setText(this.f.mDesc);
       TopRightAreaInfo$RightAreaEntrance mMark = this.f.mMark;
       if (mMark != null) {
          if (mMark.mType == 1 && !TextUtils.x(mMark.mContent)) {
             this.e.setVisibility(i);
             this.e.setText(this.f.mMark.mContent);
          }
       }else {
          this.e.setVisibility(i1);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, TopRightItemView.class, "1")) {
          return;
       }
       a.b(this.getContext(), R.layout.arg_RES_7f0d07fc, this);
       this.b = m1.f(this, 0x7f0a42e0);
       this.c = m1.f(this, 0x7f0a29c8);
       this.d = m1.f(this, 0x7f0a1548);
       this.e = m1.f(this, 0x7f0a42df);
       return;
    }
    public TopRightAreaInfo$RightAreaEntrance getData(){
       return this.f;
    }
    public View getIconView(){
       Object obj = PatchProxy.apply(null, this, TopRightItemView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.d.getVisibility()) {
          return this.d;
       }
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TopRightItemView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       TopRightItemView tc = this.c;
       if (tc != null && tc.p()) {
          this.c.f();
       }
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopRightItemView.class, "5")) {
          return;
       }
       super.setOnClickListener(new d(this, p0));
       return;
    }
}
