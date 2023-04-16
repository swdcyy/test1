package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$d;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import com.yxcorp.gifshow.model.RectInfo;

public final class SocialSimplePhotoFragmentViewBinderAbs$d extends ViewOutlineProvider	// class@000d78
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;

    public void SocialSimplePhotoFragmentViewBinderAbs$d(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SocialSimplePhotoFragmentViewBinderAbs$d.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       SocialSimplePhotoFragmentViewBinderAbs z = this.a.Z;
       a.m(z);
       z = this.a.Z;
       a.m(z);
       z = this.a.Z;
       a.m(z);
       p1.setRoundRect(0, 0, (int)z.getTargetRect().width(), (int)z.getTargetRect().height(), z.getRadiusOuter());
       return;
    }
}
