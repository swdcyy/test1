package g59.e;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tw.e;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;

public class e	// class@0023fc
{

    public void e(){
       super();
    }
    public static boolean a(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoe, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       p0 = p0.mEntity;
       PhotoAdvertisement$SearchBrandInfo obj2 = PatchProxy.applyOneRefs(p0, obj, uoe, "2");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(p0 == null){
          obj2 = PatchProxy.applyOneRefs(p0, obj, e.class, "6");
          if (obj2 != patchProxyRe) {
          }else {
             obj2 = e.a(p0.get("AD"));
          }
          if (obj2 != null) {
             b = obj2.mAlreadyBooked;
          }else {
             PhotoAdvertisement photoAdverti = p0.get("AD");
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData mInspireAdIn = photoAdverti.mInspireAdInfo;
                   if (mInspireAdIn != null && mInspireAdIn.mSupportLiveReservation != null) {
                      b = mInspireAdIn.mHasReserved;
                   }
                }
             }
             p0 = b.a(-762347696).x1(p0, "has_live_ad_reserved");
             if (p0 instanceof Boolean) {
                b = p0.booleanValue();
             }
          }
       }
       return b;
    }
}
