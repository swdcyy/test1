package i0a.d0;
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
import if5.a;
import uw9.q;
import tkd.b;
import tkd.d;
import ilc.i;
import ilc.c;
import if5.b;
import sy6.a;

public class d0 implements a	// class@002747
{

    public void d0(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       a obj;
       object oobject = p0;
       object oobject1 = p2;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = oobject1;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          obj = PatchProxy.apply(objArray, this, uod0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       if (p3.getNasaSlideParam().isFromTube()) {
          obj = new a();
          obj.a = p3.getNasaSlideParam().mAssociatedTagName;
          obj.b = p3.getNasaSlideParam().mEnableCameraButton;
          obj.c = p3.getNasaSlideParam().mEnableSearchButton;
          obj.d = p3.getNasaSlideParam().isFromHot();
          obj.e = p3.getNasaSlideParam().mFromPageName;
          obj.f = q.a(p3);
          obj.g = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          obj.h = p3.getNasaSlideParam().isSidebarEnable();
          obj.i = p3.getNasaSlideParam().mNasaTagInfo;
          obj.j = oobject1;
          obj.k = d.a(0x681d4627).k0(p0);
          obj.l = p3.getNasaSlideParam().mTubePageType;
          return d.a(0x5a495057).Pm(obj, p0, p1, p4, p5, p6, p7, p8, p9, p10);
       }else {
          return null;
       }
    }
}
