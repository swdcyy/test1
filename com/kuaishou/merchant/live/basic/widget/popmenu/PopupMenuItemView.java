package com.kuaishou.merchant.live.basic.widget.popmenu.PopupMenuItemView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.basic.MerchantLottieAnimationView;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.merchant.live.basic.widget.popmenu.a$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;

public class PopupMenuItemView extends LinearLayout	// class@0018d5
{
    public TextView b;
    public MerchantLottieAnimationView c;
    public MerchantKwaiImageView d;
    public a$b e;

    public void PopupMenuItemView(Context p0){
       super(p0);
       this.a();
    }
    public void PopupMenuItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void PopupMenuItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PopupMenuItemView.class, "1")) {
          return;
       }
       a.b(this.getContext(), R.layout.arg_RES_7f0d087f, this);
       this.b = m1.f(this, 0x7f0a421a);
       this.c = m1.f(this, 0x7f0a29c4);
       this.d = m1.f(this, 0x7f0a156d);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PopupMenuItemView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       PopupMenuItemView tc = this.c;
       if (tc != null && tc.p()) {
          this.c.f();
       }
       return;
    }
    public void setData(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupMenuItemView.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.e = p0;
       if (TextUtils.x(p0.c())) {
          this.b.setVisibility(8);
       }else {
          this.b.setVisibility(0);
          this.b.setText(p0.c());
       }
       if (TextUtils.x(p0.b())) {
          this.c.setVisibility(8);
          if (!PatchProxy.applyVoid(null, this, PopupMenuItemView.class, "3")) {
             if (TextUtils.x(this.e.a())) {
                this.d.setVisibility(8);
             }else {
                this.d.setVisibility(0);
                this.d.L(this.e.a());
             }
          }
       }else {
          this.d.setVisibility(8);
          this.c.setVisibility(0);
          this.c.setAnimationFromUrl(p0.b());
          this.c.s();
       }
       return;
    }
}
