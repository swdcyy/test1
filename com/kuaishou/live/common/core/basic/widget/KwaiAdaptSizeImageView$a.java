package com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.image.KwaiImageView;
import ub.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView$a$a;
import bd.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.facebook.drawee.view.DraweeView;

public final class KwaiAdaptSizeImageView$a	// class@000f0e
{

    public void KwaiAdaptSizeImageView$a(){
       super();
    }
    public void KwaiAdaptSizeImageView$a(u p0){
       super();
    }
    public final a a(KwaiImageView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiAdaptSizeImageView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "imageView");
       return new KwaiAdaptSizeImageView$a$a(p0);
    }
    public final void b(KwaiImageView p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiAdaptSizeImageView$a.class, "2")) {
          return;
       }
       if (p1 != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          String str = 1;
          int i = -2;
          c uoc = (layoutParams.height == i)? 1: null;
          if (layoutParams.width != i) {
             str = null;
          }
          if (!uoc && !str) {
             return;
          }else if(uoc && str){
             uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             Application uApplication = uoc.a();
             a.o(uApplication, "AppEnv.get\(\).appContext");
             Resources resources = uApplication.getResources();
             a.o(resources, "AppEnv.get\(\).appContext.resources");
             DisplayMetrics density = c.c(resources).density;
             float f = (float)3;
             layoutParams.width = ((int)(((float)p1.getWidth() * density) / f) + p0.getPaddingLeft()) + p0.getPaddingRight();
             layoutParams.height = ((int)(((float)p1.getHeight() * density) / f) + p0.getPaddingTop()) + p0.getPaddingBottom();
             p0.setLayoutParams(layoutParams);
          }else {
             p0.setAspectRatio(((float)p1.getWidth() / (float)p1.getHeight()));
          }
       }
       return;
    }
}
