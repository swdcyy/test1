package com.kuaishou.live.preview.item.presenter.g$a;
import hl3.b;
import com.kuaishou.live.preview.item.presenter.g;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.preview.item.presenter.router.enterlive.LivePreviewEnterLiveRouterExtraParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.util.Map;

public class g$a implements b	// class@000e20
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,boolean p1,String p2,LivePreviewEnterLiveRouterExtraParam p3,LivePassThruParamExtraInfo p4,int p5){
       g$a uoa = this;
       object oobject = p3;
       g$a uoa1 = g$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),p2,oobject,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "3")) {
             return;
          }
       }
       LivePreviewEnterLiveRouterExtraParam livePreviewE = (oobject != null)? oobject.mMerchantAudienceParams: null;
       uoa.a.W8(false, p0, p1, p2, livePreviewE, p4, null, p5, 0);
       return;
    }
    public void b(boolean p0,boolean p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.W8(false, p0, p1, null, null, null, null, 0, 0);
       return;
    }
    public void c(boolean p0,boolean p1,LivePassThruParamExtraInfo p2,int p3){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, g$a.class, "2")) {
          return;
       }
       this.a.W8(false, p0, p1, null, null, p2, null, 0, p3);
       return;
    }
}
