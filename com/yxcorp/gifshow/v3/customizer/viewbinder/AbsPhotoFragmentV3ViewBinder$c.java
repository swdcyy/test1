package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder$c;
import nwc.f;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nwc.f$a;

public final class AbsPhotoFragmentV3ViewBinder$c implements f	// class@000d5c
{
    public final AbsPhotoFragmentV3ViewBinder a;

    public void AbsPhotoFragmentV3ViewBinder$c(AbsPhotoFragmentV3ViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbsPhotoFragmentV3ViewBinder$c.class, "3")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, null, f$a.class, "3")) {
          a.p(p0, "limitRect");
          a.p(p1, "originLayoutRect");
          a.p(p2, "customTransformRect");
       }
       return;
    }
    public void b(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbsPhotoFragmentV3ViewBinder$c.class, "2")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       if (!PatchProxy.applyVoidFourRefs(this, p0, p1, p2, null, f$a.class, "2")) {
          a.p(p0, "limitRect");
          a.p(p1, "originLayoutRect");
          a.p(p2, "customTransformRect");
       }
       return;
    }
    public void c(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbsPhotoFragmentV3ViewBinder$c.class, "1")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       this.a.l0(p0, p1, p2);
       return;
    }
}
