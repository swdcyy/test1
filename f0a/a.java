package f0a.a;
import java.lang.Object;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vm5.f;
import f0a.d;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.util.UUID;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public final class a	// class@002267
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(GrootSlidePlayDetailBaseContainerFragment p0,Intent p1,NasaBizParam p2,PhotoDetailParam p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "1")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p1, "intent");
       a.p(p2, "nasaBizParam");
       a.p(p3, "photoDetailParam");
       String str = f.a(p1);
       String str1 = f.c(p1, "source");
       String str2 = f.c(p1, "backTitle");
       String str3 = f.b(p0);
       a.o(str3, "SlidePlayDataFetcher.buildFetcherId\(fragment\)");
       b.g(j.e(new d(str, f.c(p1, "userId")), str3, SlideMediaType.ALL));
       p3.setSource(299);
       p3.setSlidePlayId(str3);
       p3.setBizType(4);
       p3.getSlidePlayConfig().setEnablePullRefresh(false);
       str3 = UUID.randomUUID().toString();
       a.o(str3, "UUID.randomUUID\(\).toString\(\)");
       p3.getDetailLogParam().addPageUrlParam("slide_session_id", str3).addBizParam("slide_session_id", str3);
       if (!TextUtils.isEmpty(str)) {
          p3.getDetailLogParam().addPageUrlParam("slide_first_photo_id", str).addBizParam("slide_first_photo_id", str);
          p3.getDetailLogParam().addPageUrlParam("upper_recommend_photo_id", str).addBizParam("upper_recommend_photo_id", str);
       }
       p3.getDetailLogParam().addSlideSessionParams(p3.getBaseFeed());
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.T("DETAIL");
       uoa.C(true);
       uoa = uoa.k(true);
       uoa.I(true);
       uoa.Z(str1);
       uoa.e(true);
       uoa.H(str2);
       p2.setNasaSlideParam(uoa.a());
       p2.mNeedReplaceFeed = false;
       return;
    }
}
