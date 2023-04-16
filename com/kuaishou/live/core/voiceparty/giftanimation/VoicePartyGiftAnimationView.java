package com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.View;
import android.animation.PropertyValuesHolder;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$a;
import android.animation.Animator$AnimatorListener;
import android.graphics.Path;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$b;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$c;

public class VoicePartyGiftAnimationView extends FrameLayout	// class@0014f9
{
    public KwaiImageView b;
    public AnimatorSet c;
    public VoicePartyGiftAnimationView$c d;
    public boolean e;
    public long f;
    public static final int g;
    public static final int h;
    public static final int i;

    static {
       VoicePartyGiftAnimationView.g = a1.e(27.00f);
       VoicePartyGiftAnimationView.h = a1.e(57.00f);
       VoicePartyGiftAnimationView.i = a1.e(29.00f);
    }
    public void VoicePartyGiftAnimationView(Context p0){
       super(p0, null);
    }
    public void VoicePartyGiftAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyGiftAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, VoicePartyGiftAnimationView.class, "8")) {
       }else {
          this.b = new KwaiImageView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(a1.d(0x7f07106d), a1.d(0x7f07106d));
          layoutParams.gravity = 81;
          this.b.setLayoutParams(layoutParams);
          this.addView(this.b);
       }
       return;
    }
    public final PropertyValuesHolder a(float p0,float p1){
       if (PatchProxy.isSupport(VoicePartyGiftAnimationView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, VoicePartyGiftAnimationView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       return PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray);
    }
    public final PropertyValuesHolder b(float p0,float p1){
       if (PatchProxy.isSupport(VoicePartyGiftAnimationView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, VoicePartyGiftAnimationView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       return PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray);
    }
    public final ObjectAnimator getFadeInAnimator(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VoicePartyGiftAnimationView obj = PatchProxy.apply(objArray, this, VoicePartyGiftAnimationView.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       obj.setPivotX(((float)obj.getMeasuredWidth() / 2.00f));
       obj = this.b;
       obj.setPivotY(((float)obj.getMeasuredHeight() / 2.00f));
       obj = this.b;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[3];
       int i = 0;
       PropertyValuesHolder propertyValu1 = PatchProxy.apply(objArray, this, VoicePartyGiftAnimationView.class, "13");
       if (propertyValu1 != patchProxyRe) {
       }else {
          propertyValu1 = j.b(new float[2]{0,0x3f800000});
       }
       propertyValu[i] = propertyValu1;
       propertyValu[1] = this.a(0.25f, 0x3f800000);
       propertyValu[2] = this.b(0.25f, 0x3f800000);
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValu);
       objectAnimat.addListener(new VoicePartyGiftAnimationView$a(this));
       objectAnimat.setDuration(400);
       return objectAnimat;
    }
    public final ObjectAnimator getFadeInTranslateAnimator(){
       Path obj = PatchProxy.apply(null, this, VoicePartyGiftAnimationView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Path();
       int g = VoicePartyGiftAnimationView.g;
       int h = VoicePartyGiftAnimationView.h;
       obj.moveTo((float)(- g), (float)h);
       obj.quadTo((float)((- g) / 2), (float)(h / 2), 0, 0);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_X, View.TRANSLATION_Y, obj);
       objectAnimat.setDuration(400);
       return objectAnimat;
    }
    public final ObjectAnimator getFadeOutAnimator(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       VoicePartyGiftAnimationView obj = PatchProxy.apply(objArray, this, VoicePartyGiftAnimationView.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       obj.setPivotX(((float)obj.getMeasuredWidth() / 2.00f));
       obj = this.b;
       obj.setPivotY(((float)obj.getMeasuredHeight() / 2.00f));
       obj = this.b;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[4];
       PropertyValuesHolder propertyValu1 = PatchProxy.apply(objArray, this, VoicePartyGiftAnimationView.class, "12");
       int i = 2;
       if (propertyValu1 != patchProxyRe) {
       }else {
          propertyValu1 = j.b(new float[i]{0x3f800000,0});
       }
       propertyValu[0] = propertyValu1;
       propertyValu[1] = this.a(0x3f800000, 0.25f);
       propertyValu[i] = this.b(0x3f800000, 0.25f);
       PropertyValuesHolder propertyValu2 = PatchProxy.apply(objArray, this, VoicePartyGiftAnimationView.class, "9");
       if (propertyValu2 != patchProxyRe) {
       }else {
          float[] uofloatArray = new float[i];
          uofloatArray[0] = 0;
          uofloatArray[1] = (float)(- VoicePartyGiftAnimationView.i);
          propertyValu2 = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray);
       }
       propertyValu[3] = propertyValu2;
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValu);
       objectAnimat.addListener(new VoicePartyGiftAnimationView$b(this));
       objectAnimat.setDuration(480);
       objectAnimat.setStartDelay(80);
       return objectAnimat;
    }
    public void setOnGiftAnimationEndListener(VoicePartyGiftAnimationView$c p0){
       this.d = p0;
    }
}
