package com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder$a;
import toc.d;
import com.yxcorp.gifshow.v3.customizer.viewbinder.PhotoMovieViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import toc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutTopLimitType;
import com.yxcorp.gifshow.v3.customizer.preview.FlexLayoutBottomLimitType;
import nsd.u;
import android.graphics.RectF;
import java.util.List;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import android.app.Activity;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import lwc.h;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import ooc.h;
import java.lang.Integer;
import lnc.a1;
import android.graphics.Matrix;

public final class PhotoMovieViewBinder$a implements d	// class@000d71
{
    public final PhotoMovieViewBinder a;

    public void PhotoMovieViewBinder$a(PhotoMovieViewBinder p0){
       this.a = p0;
       super();
    }
    public e a(FlexScreenStatusData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoMovieViewBinder$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       e uoe = new e(null, null, 0, 0, 0, null, null, 0, 0, 0, 1023, null);
       p0.k(FlexLayoutTopLimitType.FROM_HOLE_TOP);
       p0.i(FlexLayoutTopLimitType.FROM_STATUS_BAR_TOP);
       p0.j(0);
       p0.g(0);
       p0.f(0);
       p0.d(FlexLayoutBottomLimitType.FROM_BOTTOM_BAR_TOP);
       p0.h(FlexLayoutBottomLimitType.FROM_SAFE_AREA_TOP);
       p0.c(0);
       p0.g(0);
       p0.e(0);
       return p0;
    }
    public RectF b(FlexScreenStatusData p0,RectF p1,List p2,Asset$ShootInfo$Resolution p3){
       Size obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PhotoMovieViewBinder$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       a.p(p1, "currentLimitRect");
       a.p(p2, "assetRatioList");
       a.p(p3, "resolution");
       if (this.a.z() == null) {
          return new RectF();
       }
       a.m(this.a.z());
       Size size = this.a.D().u0(0);
       RectF rectF = new RectF();
       obj = size.b;
       float f = (p1.width() - (float)obj) / (float)2;
       float f1 = (float)h.c(size, p0);
       rectF.set(f, f1, ((float)obj + f), ((float)size.c + f1));
       return rectF;
    }
    public RectF c(FlexScreenStatusData p0,RectF p1,RectF p2,List p3,int p4){
       Size obj;
       PhotoMovieViewBinder$a uoa = PhotoMovieViewBinder$a.class;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "flexScreenStatusData");
       a.p(p1, "currentLimitRect");
       a.p(p2, "originRectF");
       a.p(p3, "assetRatioList");
       RectF rectF = new RectF();
       if (p4 <= 0) {
          rectF.set(p2);
       }else if(this.a.z() != null){
          obj = this.a.D().u0(i1);
          i1 = a1.d(R.dimen.arg_RES_7f0703a1);
          int i2 = a1.d(R.dimen.arg_RES_7f0703a1);
          if (p0.getHasHole()) {
             i2 = i2 + p0.getStatusBarHeight();
          }
          float f = (float)i2;
          float f1 = ((p1.height() - (float)p4) - f) - (float)i1;
          if (f1 - (float)obj.c < 0) {
             rectF.set(p2);
             Matrix matrix = new Matrix();
             matrix.postScale((f1 / p2.height()), (f1 / p2.height()), p2.centerX(), p2.top);
             matrix.postTranslate(0, (f - p2.top));
             matrix.mapRect(rectF);
          }else {
             rectF.set(p2);
             Matrix matrix1 = new Matrix();
             matrix1.postTranslate(0, ((f + ((f1 - (float)obj.c) / (float)i)) - p2.top));
             matrix1.mapRect(rectF);
          }
       }
       return rectF;
    }
}
