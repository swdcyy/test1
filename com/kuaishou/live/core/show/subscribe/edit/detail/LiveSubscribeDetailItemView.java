package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailItemView;
import com.yxcorp.widget.selector.view.SelectShapeRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.subscribe.edit.detail.l;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.widget.TextView;
import android.widget.ImageView;
import tk2.d0;
import android.view.View$OnClickListener;
import lnc.a1;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import z1.a;

public class LiveSubscribeDetailItemView extends SelectShapeRelativeLayout	// class@001102
{
    public LiveMediumTextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public SelectShapeTextView g;
    public a h;
    public a i;
    public LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo j;
    public ImageView k;
    public static final int l;

    public void LiveSubscribeDetailItemView(Context p0){
       super(p0, null);
    }
    public void LiveSubscribeDetailItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSubscribeDetailItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = l.a;
       this.i = l.a;
    }
    public final void c(View p0,boolean p1){
       if (PatchProxy.isSupport(LiveSubscribeDetailItemView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveSubscribeDetailItemView.class, "7")) {
          return;
       }
       float f = (p1)? 0x3f800000: 0x3f000000;
       p0.setAlpha(f);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSubscribeDetailItemView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribeDetailItemView.class, "2")) {
          this.g = m1.f(this, 0x7f0a2617);
          this.c = m1.f(this, 0x7f0a2636);
          this.d = m1.f(this, 0x7f0a262e);
          this.f = m1.f(this, 0x7f0a2635);
          this.e = m1.f(this, 0x7f0a2631);
          if (!PatchProxy.applyVoidOneRefs(this, this, LiveSubscribeDetailItemView.class, "4")) {
             ImageView imageView = m1.f(this, R.id.live_subscribe_item_close);
             this.k = imageView;
             imageView.setOnClickListener(new d0(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveSubscribeDetailItemView.class, "3")) {
             int i = a1.a(R.color.arg_RES_7f060751);
             int i1 = Color.red(i);
             int i2 = Color.blue(i);
             i = Color.argb(25, i1, i2, Color.green(i));
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setCornerRadius((float)a1.e(4.00f));
             gradientDraw.setColor(i);
             this.g.setBackground(gradientDraw);
          }
       }
       return;
    }
    public void setDeleteSubscribeListener(a p0){
       this.i = p0;
    }
    public void setRelatePhotoClickListener(a p0){
       this.h = p0;
    }
}
