package com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView;
import com.kuaishou.merchant.basic.widget.RoundConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper;
import lnc.a1;
import android.widget.AdapterViewFlipper;
import i54.a;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper$a;
import android.view.ViewPropertyAnimator;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$a;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$c;
import com.kuaishou.merchant.api.core.model.Commodity$OrderInfo;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$b;
import android.widget.Adapter;

public class LiveShopOrderInfoView extends RoundConstraintLayout	// class@0019a3
{
    public AdapterViewFlipper C;
    public AnimatorSet D;
    public ObjectAnimator E;
    public LiveShopOrderInfoView$c F;
    public boolean G;
    public boolean H;

    public void LiveShopOrderInfoView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveShopOrderInfoView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.T2);
       int i = 0;
       this.H = typedArray.getBoolean(i, i);
       typedArray.recycle();
       if (PatchProxy.applyVoid(null, this, LiveShopOrderInfoView.class, "1")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d167b, this);
          this.C = this.findViewById(0x7f0a05e8);
          this.setRadius(a1.e(10.00f));
          this.setClipToPadding(i);
          if (!PatchProxy.applyVoid(null, this, LiveShopOrderInfoView.class, "2")) {
             this.G = i;
             this.C.stopFlipping();
             this.C.setVisibility(i);
             this.C.setAutoStop(true);
             this.C.setOnViewFlipperListener(new a(this));
          }
       }
       return;
    }
    public ViewPropertyAnimator getFlipperDismissAnimator(){
       Object obj = PatchProxy.apply(null, this, LiveShopOrderInfoView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.animate().y((float)(- a1.e(10.00f))).alpha(0).setDuration(300).setListener(new LiveShopOrderInfoView$a(this)).setInterpolator(new AccelerateDecelerateInterpolator());
    }
    public final ObjectAnimator getFlipperInAnimator(){
       float[] uofloatArray;
       ObjectAnimator obj = PatchProxy.apply(null, this, LiveShopOrderInfoView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.Y, uofloatArray)};
       uofloatArray = new float[]{(float)a1.d(0x7f0702b8),0};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu);
       obj.setDuration(400);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       return obj;
    }
    public final ObjectAnimator getFlipperOutAnimator(){
       float[] uofloatArray;
       ObjectAnimator obj = PatchProxy.apply(null, this, LiveShopOrderInfoView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.Y, uofloatArray)};
       uofloatArray = new float[]{0,(float)(- a1.d(0x7f0702b8))};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.C, propertyValu);
       obj.setDuration(400);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       return obj;
    }
    public void setOnViewFlipperEndListener(LiveShopOrderInfoView$c p0){
       this.F = p0;
    }
    public void setOrderInfo(Commodity$OrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShopOrderInfoView.class, "9")) {
          return;
       }
       this.C.setFlipInterval(p0.mIntervalMills);
       LiveShopOrderInfoView$b uob = new LiveShopOrderInfoView$b(this);
       uob.b = p0.mItems;
       this.C.setAdapter(uob);
       return;
    }
}
