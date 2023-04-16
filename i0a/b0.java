package i0a.b0;
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
import b1a.o;
import uw9.q;
import az6.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import b1a.a;
import sy6.a;

public class b0 implements a	// class@002743
{

    public void b0(){
       super();
    }
    public e a(Activity p0,c p1,PhotoDetailParam p2,NasaBizParam p3,e0 p4,SlidePlayViewModel p5,MilanoContainerEventBus p6,e p7,b p8,g p9,f p10){
       object oobject = p2;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = p10;
          Object obj = PatchProxy.apply(objArray, this, uob0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       if (p3.getNasaSlideParam().isSerialStyle()) {
          o oo = new o();
          oo.a = p3.getNasaSlideParam().mAssociatedTagName;
          oo.b = p3.getNasaSlideParam().mEnableCameraButton;
          oo.c = p3.getNasaSlideParam().mEnableSearchButton;
          oo.d = p3.getNasaSlideParam().isFromHot();
          oo.e = p3.getNasaSlideParam().isFromLocal();
          oo.f = p3.getNasaSlideParam().mIsFollowNasaDetail;
          oo.g = p3.getNasaSlideParam().mEntrySource;
          oo.h = p3.getNasaSlideParam().mFromPageName;
          oo.i = q.a(p3);
          oo.j = p3.getNasaSlideParam().mEnableLiveSlidePlay;
          oo.o = p3.getNasaSlideParam().isFollowNasaDetail();
          oo.k = p3.getNasaSlideParam().mNasaTagInfo;
          oo.l = p3.getNasaSlideParam().mNasaSlideSerialParam;
          oo.m = oobject.mSlidePlayId;
          PhotoDetailParam mDetailCommo = oobject.mDetailCommonParam;
          if (mDetailCommo != null) {
             oo.r = mDetailCommo.getUnserializableBundleId();
          }
          o l = oo.l;
          if (l != null) {
             oo.p = l.mIsFromProfileSerialBtnOrItem;
             oo.q = l.mIsAutoShowPanel;
          }
          a uoa = new a(oo, p0, p1, p4, p5, p6, p7, p8, p9, p10);
          return l;
       }else {
          return null;
       }
    }
}
