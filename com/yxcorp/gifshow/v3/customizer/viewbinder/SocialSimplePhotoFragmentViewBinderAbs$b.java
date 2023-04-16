package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$b;
import toc.d;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
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
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import kotlin.Triple;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import kotlin.Pair;
import com.yxcorp.gifshow.model.RectInfo;
import java.lang.Integer;

public final class SocialSimplePhotoFragmentViewBinderAbs$b implements d	// class@000d76
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;

    public void SocialSimplePhotoFragmentViewBinderAbs$b(SocialSimplePhotoFragmentViewBinderAbs p0){
       this.a = p0;
       super();
    }
    public e a(FlexScreenStatusData p0){
       FlexLayoutTopLimitType obj = PatchProxy.applyOneRefs(p0, this, SocialSimplePhotoFragmentViewBinderAbs$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       e uoe = new e(null, null, 0, 0, 0, null, null, 0, 0, 0, 1023, null);
       obj = FlexLayoutTopLimitType.FROM_HOLE_TOP;
       p0.k(obj);
       p0.i(obj);
       p0.j(0);
       p0.g(0);
       p0.f(0);
       FlexLayoutBottomLimitType fROM_BOTTOM_ = FlexLayoutBottomLimitType.FROM_BOTTOM_BAR_BOTTOM;
       p0.d(fROM_BOTTOM_);
       p0.h(fROM_BOTTOM_);
       p0.c(0);
       p0.g(0);
       p0.e(0);
       return p0;
    }
    public RectF b(FlexScreenStatusData p0,RectF p1,List p2,Asset$ShootInfo$Resolution p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, SocialSimplePhotoFragmentViewBinderAbs$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "flexScreenStatusData");
       a.p(p1, "currentLimitRect");
       a.p(p2, "assetRatioList");
       a.p(p3, "resolution");
       Object[] objArray = new Object[0];
       a.D().w("SocialSimplePhotoFragmentViewBinderAbs", "getOriginRect flexScreenStatusData:"+p0+", "+"currentLimitRect:"+p1+", assetRatioList:"+p2+", resolution:"+p3, objArray);
       Triple triple = SocialSimpleEditorActivityViewBinder.K.b(SocialSimplePhotoFragmentViewBinderAbs.t0(this.a));
       if (triple != null) {
          Pair first = triple.getFirst();
          if (first != null) {
             RectInfo second = first.getSecond();
             if (second != null) {
                RectF tarRect = second.getTargetRect();
                if (tarRect != null) {
                   p1 = tarRect;
                }
             }
          }
       }
       return p1;
    }
    public RectF c(FlexScreenStatusData p0,RectF p1,RectF p2,List p3,int p4){
       SocialSimplePhotoFragmentViewBinderAbs$b uob = SocialSimplePhotoFragmentViewBinderAbs$b.class;
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
       return p2;
    }
}
