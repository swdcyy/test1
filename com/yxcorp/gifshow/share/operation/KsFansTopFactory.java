package com.yxcorp.gifshow.share.operation.KsFansTopFactory;
import mhc.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory$isAvaiable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import uo7.h0;
import uo7.c0;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory$a;

public final class KsFansTopFactory extends i0	// class@001bf9
{
    public final p d;
    public final QPhoto e;

    public void KsFansTopFactory(QPhoto p0,String p1){
       a.p(p0, "photo");
       a.p(p1, "id");
       super(p1);
       this.e = p0;
       this.d = s.c(new KsFansTopFactory$isAvaiable$2(this));
    }
    public boolean available(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KsFansTopFactory ksFansTopFac = KsFansTopFactory.class;
       Object obj = PatchProxy.apply(null, this, ksFansTopFac, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Boolean uBoolean = PatchProxy.apply(null, this, ksFansTopFac, "3");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.d.getValue();
       }
       return uBoolean.booleanValue();
    }
    public c0 b(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4){
       if (PatchProxy.isSupport(KsFansTopFactory.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p0 = PatchProxy.apply(objArray, this, KsFansTopFactory.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       a.p(p1, "conf");
       a.p(p4, "urlMgr");
       return new KsFansTopFactory$a(this, p1, p1);
    }
}
