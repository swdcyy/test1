package com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$b;
import xz6.a;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import xm4.a;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.LiveShopOrderInfoView$d;
import com.kuaishou.merchant.api.core.model.Commodity$OrderInfoItem;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.a;
import android.animation.Animator$AnimatorListener;
import lnc.a1;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.b;
import java.util.Objects;

public class LiveShopOrderInfoView$b extends a	// class@0019a0
{
    public List b;
    public final LiveShopOrderInfoView c;

    public void LiveShopOrderInfoView$b(LiveShopOrderInfoView p0){
       this.c = p0;
       super();
    }
    public int getCount(){
       LiveShopOrderInfoView$b obj = PatchProxy.apply(null, this, LiveShopOrderInfoView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public Object getItem(int p0){
       if (PatchProxy.isSupport(LiveShopOrderInfoView$b.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveShopOrderInfoView$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = (p0 < 0 || p0 >= this.getCount())? null: this.b.get(p0);
       return obj1;
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       View obj;
       LiveShopOrderInfoView$d uod;
       LiveShopOrderInfoView$b uob = this;
       if (PatchProxy.isSupport(LiveShopOrderInfoView$b.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveShopOrderInfoView$b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          obj = a.e(p2, R.layout.arg_RES_7f0d0692);
          uod = new LiveShopOrderInfoView$d(uob.c, obj);
          obj.setTag(uod);
       }else {
          uod = p1.getTag();
          obj = p1;
       }
       Commodity$OrderInfoItem item = this.getItem(p0);
       if (item != null) {
          uod.b.setPlaceHolderImage(R.drawable.arg_RES_7f080df6);
          uod.b.setFailureImage(R.drawable.arg_RES_7f080df6);
          uod.b.L(item.mThumbnail);
          uod.c.setText(item.mText);
          if (!p0 && uob.c.G == null) {
             if (!PatchProxy.applyVoidOneRefs(uod, uob, LiveShopOrderInfoView$b.class, "4")) {
                int i = 1;
                if (!PatchProxy.applyVoidOneRefs(uod, uob, LiveShopOrderInfoView$b.class, "5") && uob.c.D == null) {
                   LiveShopOrderInfoView$d b = uod.b;
                   LiveShopOrderInfoView$d d1 = uod.d;
                   LiveShopOrderInfoView$d e = uod.e;
                   d1.setVisibility(0);
                   b.setAlpha(0);
                   b.setScaleX(0);
                   b.setScaleY(0);
                   d1.setAlpha(0);
                   d1.setScaleX(0);
                   d1.setScaleY(0);
                   PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
                   ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(b, propertyValu1);
                   objectAnimat.setDuration(400);
                   PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
                   ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(d1, propertyValu2);
                   objectAnimat1.setDuration(400);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.addListener(new a(uob, e, d1));
                   PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[i];
                   float[] uofloatArray = new float[]{(float)(- a1.e(40.00f)),0};
                   propertyValu3[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray);
                   objectAnimat = ObjectAnimator.ofPropertyValuesHolder(e, propertyValu3);
                   objectAnimat.setDuration(300);
                   objectAnimat1.D = new AnimatorSet();
                   uob.c.D.setInterpolator(new AccelerateDecelerateInterpolator());
                   Animator[] uAnimatorArr1 = new Animator[]{uAnimatorSet,objectAnimat};
                   uob.c.D.playSequentially(uAnimatorArr1);
                   uob.c.D.addListener(new b(uob, uod));
                }
                if (!PatchProxy.applyVoidOneRefs(uod, uob, LiveShopOrderInfoView$b.class, "6") && uob.c.E == null) {
                   uod = uod.c;
                   uod.setAlpha(0);
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
                   propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
                   uob.c.E = ObjectAnimator.ofPropertyValuesHolder(uod, propertyValu);
                   uob.c.E.setDuration(300);
                   uob.c.E.setStartDelay(500);
                   uob.c.E.setInterpolator(new AccelerateDecelerateInterpolator());
                }
             }
          label_01c0 :
             LiveShopOrderInfoView$b c = uob.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(null, c, LiveShopOrderInfoView.class, "7")) {
                LiveShopOrderInfoView d = c.D;
                if (d != null && !d.isRunning()) {
                   c.D.start();
                }
                d = c.E;
                if (d != null && !d.isRunning()) {
                   c.E.start();
                }
             }
          }
       }
    label_01ef :
       return obj;
    }
}
