package com.yxcorp.gifshow.widget.ScaleView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;
import android.animation.ObjectAnimator;
import java.lang.Float;
import android.animation.PropertyValuesHolder;
import gq.a;
import q87.c;

public class ScaleView extends KwaiImageView	// class@0018be
{
    public ObjectAnimator x;
    public ObjectAnimator y;

    public void ScaleView(Context p0){
       super(p0);
    }
    public void ScaleView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f1;
       Object[] objArray;
       Object obj = PatchProxy.applyOneRefs(p0, this, ScaleView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action == 3) {
                this.p0();
             }
          }else {
             this.p0();
             this.callOnClick();
          }
       }else if(PatchProxy.applyVoid(null, this, ScaleView.class, "2")){
          ScaleView tx = this.x;
          float f = 0x3f800000;
          if (tx != null && tx.isRunning()) {
             f = this.x.getAnimatedValue().floatValue();
             f1 = this.x.getAnimatedValue().floatValue();
             this.x.end();
          }else {
             f1 = 0x3f800000;
          }
          int i = 2;
          float[] uofloatArray = new float[i];
          uofloatArray[0] = f;
          uofloatArray[1] = 0x3f666666;
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("scaleX", uofloatArray);
          float[] uofloatArray1 = new float[i];
          uofloatArray1[0] = f1;
          uofloatArray1[1] = 0x3f666666;
          PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", uofloatArray1);
          ScaleView ty = this.y;
          if (ty == null) {
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[i];
             propertyValu2[0] = propertyValu;
             propertyValu2[1] = propertyValu1;
             this.y = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu2).setDuration(50);
             objArray = new Object[0];
             a.D().s("ScaleView", "scaledownAnim create", objArray);
          }else {
             PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[i];
             propertyValu3[0] = propertyValu;
             propertyValu3[1] = propertyValu1;
             ty.setValues(propertyValu3);
             objArray = new Object[0];
             a.D().s("ScaleView", "scaledownAnim set", objArray);
          }
          this.y.start();
       }
       return true;
    }
    public final void p0(){
       float f1;
       PropertyValuesHolder[] propertyValu2;
       if (PatchProxy.applyVoid(null, this, ScaleView.class, "3")) {
          return;
       }
       ScaleView ty = this.y;
       float f = 0x3f666666;
       if (ty != null && ty.isRunning()) {
          f = this.y.getAnimatedValue().floatValue();
          f1 = this.y.getAnimatedValue().floatValue();
          this.y.end();
       }else {
          f1 = 0x3f666666;
       }
       int i = 2;
       float[] uofloatArray = new float[i];
       uofloatArray[0] = f;
       int i1 = 1;
       uofloatArray[i1] = 0x3f800000;
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("scaleX", uofloatArray);
       float[] uofloatArray1 = new float[i];
       uofloatArray1[0] = f1;
       uofloatArray1[i1] = 0x3f800000;
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", uofloatArray1);
       ScaleView tx = this.x;
       if (tx == null) {
          propertyValu2 = new PropertyValuesHolder[i];
          propertyValu2[0] = propertyValu;
          propertyValu2[i1] = propertyValu1;
          this.x = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu2).setDuration(50);
       }else {
          propertyValu2 = new PropertyValuesHolder[i];
          propertyValu2[0] = propertyValu;
          propertyValu2[i1] = propertyValu1;
          tx.setValues(propertyValu2);
       }
       this.x.start();
       return;
    }
}
