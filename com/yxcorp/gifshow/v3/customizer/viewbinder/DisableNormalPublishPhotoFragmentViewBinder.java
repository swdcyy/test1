package com.yxcorp.gifshow.v3.customizer.viewbinder.DisableNormalPublishPhotoFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsDisableNormalPublishPhotoFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.DisableNormalPublishPhotoFragmentViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import faa.a;
import q87.c;

public final class DisableNormalPublishPhotoFragmentViewBinder extends AbsDisableNormalPublishPhotoFragmentViewBinder	// class@000d6c
{
    public static final DisableNormalPublishPhotoFragmentViewBinder$a A;

    static {
       DisableNormalPublishPhotoFragmentViewBinder.A = new DisableNormalPublishPhotoFragmentViewBinder$a(null);
    }
    public void DisableNormalPublishPhotoFragmentViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DisableNormalPublishPhotoFragmentViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       super.l0(p0, p1, p2);
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DisableNormalPublishPhotoFragmentViewBinder.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.s(p0);
       Object[] objArray = new Object[0];
       a.D().w("DisableNormalPublishPhotoFragmentViewBinderAbs", "bindView", objArray);
       return;
    }
}
