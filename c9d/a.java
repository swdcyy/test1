package c9d.a;
import erd.g;
import c9d.i;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.RecommendResponse;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.widget.LinearLayout;
import nfd.t0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import com.kuaishou.webkit.URLUtil;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import c9d.c;
import dd.d;
import kb.c;
import c9d.d;

public final class a implements g	// class@0004fc
{
    public final i b;

    public void a(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       boolean b1;
       a tb = this.b;
       i oi = i.class;
       ViewGroup$LayoutParams layoutParams = tb.F.getLayoutParams();
       ViewGroup$MarginLayoutParams layoutParams1 = tb.F.getLayoutParams();
       Rect rect = new Rect();
       tb.I.getGlobalVisibleRect(rect);
       ViewGroup$MarginLayoutParams layoutParams2 = tb.J.getLayoutParams();
       i = 0;
       layoutParams2.setMargins(i, rect.top, i, i);
       tb.J.setLayoutParams(layoutParams2);
       int b = t0.b;
       layoutParams.width = rect.width() + b;
       layoutParams.height = tb.I.getLayoutParams().height + b;
       tb.F.setLayoutParams(layoutParams);
       layoutParams1.leftMargin = rect.left;
       tb.F.setLayoutParams(layoutParams1);
       RecommendResponse mPopupResour = p0.mPopupResource;
       Object obj = PatchProxy.applyOneRefs(mPopupResour, tb, oi, "5");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(mPopupResour != null && (URLUtil.isValidUrl(mPopupResour.mPopupAnswerPics) && URLUtil.isValidUrl(mPopupResour.mPopupPuzzlePics))){
          i = 1;
       }
    label_0079 :
       b1 = i;
       if (b1) {
          mPopupResour = p0.mPopupResource;
          if (!PatchProxy.applyVoidOneRefs(mPopupResour, tb, oi, "6")) {
             Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.c(mPopupResour.mPopupPuzzlePics), null, new c(tb, mPopupResour));
          }
          p0 = p0.mPopupResource;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, oi, "7")) {
             Fresco.getImagePipeline().prefetchToBitmapCache(ImageRequest.c(p0.mPopupAnswerPics), null, new d(tb, p0));
          }
       }
       return;
    }
}
