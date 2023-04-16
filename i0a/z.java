package i0a.z;
import cf5.a;
import java.lang.Object;
import android.app.Activity;
import androidx.fragment.app.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import k2b.e0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import bf5.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.yxcorp.gifshow.nearby.NearbyParam;
import i0a.x;
import uw9.q;
import wh5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import zqb.a;
import s0a.i;
import erb.a;
import sy6.a;

public class z implements a	// class@002761
{

    public void z(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       Object obj;
       object oobject = p2;
       z oz = z.class;
       int i = 1;
       if (PatchProxy.isSupport(oz)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[i] = p1;
          objArray[2] = oobject;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          obj = PatchProxy.apply(objArray, this, oz, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i1 = this;
       }
       if (p3.getNasaSlideParam().isLocalPoiPage() && (p3.getNasaSlideParam().mNearbyParam != null && p3.getNasaSlideParam().mNearbyParam.isPoiDetailStyle())) {
          x ox = new x();
          ox.i = q.a(p3);
          ox.j = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          if (!p3.getNasaSlideParam().isSidebarEnable() || c.b()) {
             i = false;
          }
          ox.m = i;
          ox.n = p3.getNasaSlideParam().mNasaTagInfo;
          if (oobject != null) {
             PhotoDetailParam mPhoto = oobject.mPhoto;
             if (mPhoto != null) {
                ox.t = mPhoto.isNonSlideAd();
             }
          }
          ox.o = p3.getNasaSlideParam().mIsFollowNasaDetail;
          ox.s = -1;
          ox.C = new a(p3.getNasaSlideParam());
          i oi = new i(ox, p0, p1, p4, p5, p6, p7, p8, p9, p10, p3.getNasaSlideParam().mNearbyParam.getMPoiParams());
          return obj;
       }else {
          return null;
       }
    }
}
