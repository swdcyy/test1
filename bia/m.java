package bia.m;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import zm5.b;
import km5.i;
import zqb.a;
import eia.p;
import eia.q;
import sy6.a;

public class m implements a	// class@0003cd
{

    public void m(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       b obj;
       q oq;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       String str = "1";
       int i = 10;
       int i1 = 9;
       int i2 = 8;
       int i3 = 7;
       int i4 = 6;
       int i5 = 5;
       int i6 = 4;
       int i7 = 3;
       int i8 = 2;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[i8] = p2;
          objArray[i7] = p3;
          objArray[i6] = p4;
          objArray[i5] = p5;
          objArray[i4] = p6;
          objArray[i3] = p7;
          objArray[i2] = p8;
          objArray[i1] = p9;
          objArray[i] = p10;
          obj = PatchProxy.apply(objArray, this, om, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          i = this;
       }
       if (p3.getNasaSlideParam().isFollowNasaDetail()) {
          obj = new b();
          obj.a = p3.getNasaSlideParam().mAssociatedTagName;
          obj.b = p3.getNasaSlideParam().mEnableCameraButton;
          obj.c = p3.getNasaSlideParam().mEnableSearchButton;
          obj.d = p3.getNasaSlideParam().mFromPageName;
          obj.f = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          obj.g = p3.getNasaSlideParam().isSidebarEnable();
          obj.h = p3.getNasaSlideParam().mNasaTagInfo;
          obj.l = i.c(p2);
          obj.n = new a(p3.getNasaSlideParam());
          p op = p.class;
          if (PatchProxy.isSupport(op)) {
             Object[] objArray1 = new Object[11];
             objArray1[0] = obj;
             objArray1[1] = p1;
             objArray1[i8] = p0;
             objArray1[i7] = p3;
             objArray1[i6] = p4;
             objArray1[i5] = p5;
             objArray1[i4] = p6;
             objArray1[i3] = p7;
             objArray1[i2] = p8;
             objArray1[9] = p9;
             objArray1[10] = p10;
             oq = PatchProxy.apply(objArray1, null, op, str);
             if (oq != patchProxyRe) {
             label_00e4 :
                return oq;
             }
          }
          q oq1 = new q(obj, p1, p0, p4, p5, p6, p7, p8, p9, p10, p3);
          oq = i8;
          goto label_00e4 ;
       }else {
          return null;
       }
    }
}
