package com.facebook.react.views.image.ReactImageView$c;
import ub.a;
import com.facebook.react.views.image.ReactImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.ImageView;
import qf.a;
import java.lang.Integer;
import java.lang.Float;
import cb.a;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import pf.b;
import df.b;
import com.facebook.react.uimanager.events.ProfileModule;

public class ReactImageView$c extends a	// class@0013bf
{
    public final ReactImageView b;

    public void ReactImageView$c(ReactImageView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       ReactImageView this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactImageView$c.class, "2")) {
       }else {
          ReactImageView$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p1, tb, ReactImageView.class, "24") && p1 != null) {
             float f = (float)tb.getWidth();
             float f1 = (float)tb.getHeight();
             float f2 = (float)p1.getWidth();
             float f3 = (float)p1.getHeight();
             this = tb.k;
             String this1 = (this == null)? "": this.b();
             int i = 0;
             int i1 = 0;
             if (f - i && f1 - i) {
                float u0 = ReactImageView.U0;
                if (u0 - i >= 0 && (f2 - (f * u0) > 0 || f3 - (u0 * f1) > 0)) {
                   i = 1;
                label_0069 :
                   if (i) {
                      Object[] objArray = new Object[]{Integer.valueOf(tb.getId()),Float.valueOf(f2),Float.valueOf(f3),Float.valueOf(f),Float.valueOf(f1),Float.valueOf(ReactImageView.U0),this1};
                      a.k("ReactImageView", String.format("warn !!! ReactImageView\(ID %s\): \n图片宽高\(%s, %s\) 超过了\n控件宽高\(%s, %s\) %s倍\nsource: %s \n可通过ReactImageView.setScaleThreshold\(\) \n设置阈值", objArray));
                   }
                }
             }
             i = 0;
             goto label_0069 ;
          }
       label_00aa :
          b uob = new b(this.b.getId(), 2, this.b.k.b(), p1.getWidth(), p1.getHeight());
          ProfileModule.dispatchEvent(this.b.getContext(), PatchProxy.applyVoidOneRefs(p1, tb, ReactImageView.class, "24"));
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageView$c.class, "1")) {
          return;
       }
       ProfileModule.dispatchEvent(this.b.getContext(), new b(this.b.getId(), 4));
       return;
    }
}
