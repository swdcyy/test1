package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$j;
import wpc.w;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import android.view.View;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class SocialSimplePhotoFragmentViewBinderAbs$j implements w	// class@000d80
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;

    public void SocialSimplePhotoFragmentViewBinderAbs$j(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return false;
    }
    public void b(boolean p0){
       SocialSimplePhotoFragmentViewBinderAbs$j oj = SocialSimplePhotoFragmentViewBinderAbs$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "animationCallback", objArray);
       if (this.a.E() != null) {
          this.a.L0((p0 ^ 0x01));
          SocialSimplePhotoFragmentViewBinderAbs b = this.a.B;
          if (!PatchProxy.applyVoidOneRefs(b, this, oj, "2") && b != null) {
             EditDecorationContainerViewV2 uEditDecorat = this.a.E();
             a.m(uEditDecorat);
             float[] uofloatArray = new float[]{b.getTranslationY(),b.getTranslationY() + uEditDecorat.getPullUpTranslationY()};
             ObjectAnimator.ofFloat(b, "TranslationY", uofloatArray).setDuration(200).start();
          }
          SocialSimplePhotoFragmentViewBinderAbs b1 = this.a.B;
          if (b1 != null) {
             b1.setClickable((p0 ^ 0x01));
          }
          b1 = this.a.C;
          if (b1 != null) {
             b1.setClickable((p0 ^ 1));
          }
       }
       return;
    }
}
