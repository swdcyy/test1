package com.kuaishou.live.core.show.wishlist.c;
import com.kuaishou.live.core.show.wishlist.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m91.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ba2.r;
import android.widget.ViewFlipper;
import nn2.a;
import com.kuaishou.live.core.show.wishlist.d$c;
import java.util.Map;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c extends i	// class@0012d0
{
    public a0 C;
    public r D;
    public static String sLivePresenterClassName = "LiveAudienceWishCompleteResultPresenter";

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.E8();
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.C.N().u5(this.A, uoaArray);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.J8();
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.C.N().G5(this.A, uoaArray);
       return;
    }
    public boolean P8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, this, uoc, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.C.N().r2(AudienceBizRelation.VOICE_PARTY)) {
          Object obj1 = PatchProxy.apply(null, this, uoc, "4");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             c tD = this.D;
             b1 = (tD != null && tD.f())? true: false;
          }
          if (!b1) {
          label_0044 :
             return b;
          }
       }
       b = false;
       goto label_0044 ;
    }
    public ViewFlipper W8(){
       a obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C.y1.d();
       if (obj != null) {
          return obj.c();
       }
       return null;
    }
    public boolean X8(){
       return false;
    }
    public boolean Z8(){
       return true;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(c.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.C = this.q8(a0.class);
       this.D = this.s8(r.class);
       return;
    }
}
