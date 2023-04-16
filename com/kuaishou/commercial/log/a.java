package com.kuaishou.commercial.log.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import mxb.y;
import com.yxcorp.gifshow.photoad.t;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.yxcorp.gifshow.photoad.z;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.photoad.f;
import com.yxcorp.gifshow.photoad.k;
import yx.a;
import erd.g;

public class a	// class@0014f5
{

    public void a(){
       super();
    }
    public static j a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0, 0);
    }
    public static j b(BaseFeed p0,int p1){
       PlcEntryStyleInfo obj;
       a uoa = a.class;
       t ot = null;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), ot, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new QPhoto(p0).getPlcEntryStyleInfo();
       if (y.b(obj, p0)) {
          ot = (p1 == 1)? new t(p0, obj, p1): new t(p0, obj);
       }else if(p0 instanceof LiveStreamFeed){
          PhotoAdvertisement photoAdverti = p0.get("AD");
          if (photoAdverti != null && photoAdverti.mAdLiveForFansTop != null) {
             ot = new z(p0);
          }
       }
       if (ot == null && (p0.get("AD") == null && k.x(p0) != null)) {
          ot = new f(p0);
       }
    label_0065 :
       if (ot == null) {
          ot = new k(p0);
       }
       if (p1) {
          ot.a(new a(p1));
       }
       return ot;
    }
}
