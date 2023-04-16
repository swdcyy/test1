package com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$c;
import ub.a;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import android.graphics.drawable.Animatable;
import bd.f;

public final class SelfAdaptiveImageView$c extends a	// class@001a5c
{
    public final SelfAdaptiveImageView b;
    public final int c;

    public void SelfAdaptiveImageView$c(SelfAdaptiveImageView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelfAdaptiveImageView$c.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       SelfAdaptiveImageView x = this.b.x;
       if (x != null) {
          x.onFail();
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SelfAdaptiveImageView$c.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p1 != null) {
             if (this.c > null && (p1.getWidth() > 0 && p1.getHeight() > 0)) {
                p1 = this.c;
                this.b.r0((int)(((float)p1.getWidth() / (float)p1.getHeight()) * (float)p1), p1);
             }else {
                this.b.r0(p1.getWidth(), p1.getHeight());
             }
          }
          SelfAdaptiveImageView x = this.b.x;
          if (x != null) {
             x.onSuccess();
          }
       }
       return;
    }
}
