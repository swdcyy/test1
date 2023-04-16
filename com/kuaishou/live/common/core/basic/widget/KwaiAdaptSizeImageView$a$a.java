package com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView$a$a;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView$a;

public final class KwaiAdaptSizeImageView$a$a extends a	// class@000f0d
{
    public final KwaiImageView b;

    public void KwaiAdaptSizeImageView$a$a(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiAdaptSizeImageView$a$a.class, "2")) {
       }else {
          a.p(p0, "id");
          KwaiAdaptSizeImageView.x.b(this.b, p1);
       }
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiAdaptSizeImageView$a$a.class, "1")) {
       }else {
          KwaiAdaptSizeImageView.x.b(this.b, p1);
       }
       return;
    }
}
