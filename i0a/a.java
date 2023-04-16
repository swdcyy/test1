package i0a.a;
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
import m0a.h;
import uw9.q;
import zqb.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.CharSequence;
import android.text.TextUtils;
import km5.i;
import m0a.c;
import sy6.a;

public class a implements a	// class@002742
{

    public void a(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       Object obj;
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          obj = PatchProxy.apply(objArray, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          i = this;
       }
       if (p3.getNasaSlideParam().isCommonFeedSlidePage()) {
          h oh = new h();
          oh.a = p3.getNasaSlideParam().isFromHot();
          oh.b = p3.getNasaSlideParam().isFromLocal();
          oh.c = q.a(p3);
          oh.d = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          oh.e = p3.getNasaSlideParam().isSidebarEnable();
          oh.f = p3.getNasaSlideParam().mNasaTagInfo;
          oh.j = new a(p3.getNasaSlideParam());
          if (!TextUtils.isEmpty(p2.getDetailCommonParam().getShareUid()) && !TextUtils.isEmpty(p2.getDetailCommonParam().getFromChannel())) {
             oh.h = p2.getDetailCommonParam().getShareUid();
             oh.i = p2.getDetailCommonParam().getFromChannel();
          }
          oh.g = i.c(p2);
          c uoc = new c(oh, p1, p0, p4, p5, p6, p7, p8, p9, p10);
          return obj;
       }else {
          return null;
       }
    }
}
