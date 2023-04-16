package j0a.o;
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
import j0a.q;
import uw9.q;
import az6.a;
import km5.i;
import zqb.a;
import j0a.a;
import sy6.a;

public class o implements a	// class@0028ec
{

    public void o(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       int i;
       object oobject = p2;
       object oobject1 = p3;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = oobject1;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          Object obj = PatchProxy.apply(objArray, this, oo, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          i = this;
       }
       if (p3.getNasaSlideParam().isChannelPage()) {
          q oq = new q();
          oq.j = p3.getNasaSlideParam().isFollowNasaDetail();
          oq.a = p3.getNasaSlideParam().isFromHot();
          oq.b = p3.getNasaSlideParam().isFromLocal();
          oq.c = q.a(p3);
          oq.d = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          oq.e = p3.getNasaSlideParam().mNasaTagInfo;
          oq.f = p3.getNasaSlideParam().isFromLink();
          oq.g = oobject.mSlidePlayId;
          oq.h = oobject1.mHotChannelColumn;
          oq.i = oobject1.mHotChannelId;
          oq.k = i.c(p2);
          oq.l = new a(p3.getNasaSlideParam());
          a uoa = new a(oq, p0, p1, p4, p5, p6, p7, p8, p9, p10);
          return oobject;
       }else {
          return null;
       }
    }
}
