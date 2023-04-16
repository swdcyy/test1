package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder$b;
import toc.d;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
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
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import lnc.a1;

public final class AbsPhotoFragmentV3ViewBinder$b implements d	// class@000d5b
{
    public final AbsPhotoFragmentV3ViewBinder a;

    public void AbsPhotoFragmentV3ViewBinder$b(AbsPhotoFragmentV3ViewBinder p0){
       this.a = p0;
       super();
    }
    public e a(FlexScreenStatusData p0){
       FlexLayoutTopLimitType obj = PatchProxy.applyOneRefs(p0, this, AbsPhotoFragmentV3ViewBinder$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       e uoe = new e(null, null, 0, 0, 0, null, null, 0, 0, 0, 1023, null);
       obj = FlexLayoutTopLimitType.FROM_HOLE_BOTTOM;
       p0.k(obj);
       p0.i(obj);
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
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, AbsPhotoFragmentV3ViewBinder$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       a.p(p1, "currentLimitRect");
       a.p(p2, "assetRatioList");
       a.p(p3, "resolution");
       return p1;
    }
    public RectF c(FlexScreenStatusData p0,RectF p1,RectF p2,List p3,int p4){
       AbsPhotoFragmentV3ViewBinder$b uob = AbsPhotoFragmentV3ViewBinder$b.class;
       int i = 2;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "flexScreenStatusData");
       a.p(p1, "currentLimitRect");
       a.p(p2, "originRectF");
       a.p(p3, "assetRatioList");
       Object[] objArray1 = new Object[0];
       a.D().w("AbsPhotoFragmentV3ViewBinder", "getTransFormRect flexScreenStatusData:"+p0+", "+"currentLimitRect:"+p1+", originRectF:"+p2+", assetRatio:"+p3+", "+"pullUpTabHeight:"+p4, objArray1);
       if (p4 <= 0) {
          return p2;
       }else if(this.a.z() != null){
          float f = (float)a1.d(0x7f0703a1);
          float f1 = (float)i;
          float f2 = p2.width();
          RectF rectF = new RectF(0, 0, f2, ((p2.height() - (f1 * f)) - (float)p4));
          rectF.offset(((p2.width() - f2) / f1), f);
          StringBuilder str = "getTransFormRect topBottomMargin:"+f;
          Object[] objArray2 = new Object[0];
          a.D().w("AbsPhotoFragmentV3ViewBinder", str+"transformRectWidth:"+f2+", transRectF:"+rectF, objArray2);
          return rectF;
       }else {
          return p2;
       }
    }
}
