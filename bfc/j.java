package bfc.j;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import efc.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.reminder.news.data.d;
import bdc.b;
import bdc.a;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Boolean;
import lnc.a1;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import tkd.b;
import tkd.d;
import wm5.a;
import android.view.View;
import vm5.o;

public class j	// class@000474
{

    public void j(){
       super();
    }
    public static void a(GifshowActivity p0,int p1,a p2,List p3){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, j.class, "1")) {
          return;
       }
       Fragment uFragment = null;
       QPhoto qPhoto = (!q.f(p3))? p3.get(0): uFragment;
       String str = f.b(uFragment);
       b.g(j.a(new d(a.c(3), p2, qPhoto), str, SlideMediaType.ALL));
       NasaSlideParam$a uoa = new NasaSlideParam$a();
       uoa.C(0);
       uoa.r(true);
       uoa.T("DETAIL");
       uoa.Z("NEWS_ENTRANCE");
       uoa.B(true);
       uoa.x(Boolean.TRUE);
       uoa.R0 = true;
       uoa.H(a1.p(R.string.arg_RES_7f10492e));
       NasaSlideParam nasaSlidePar = uoa.k(true).a();
       new NasaBizParam().setNasaSlideParam(nasaSlidePar);
       PhotoDetailParam photoDetailP = (qPhoto == null)? new PhotoDetailParam(): new PhotoDetailParam(qPhoto);
       photoDetailP.setSlidePlayId(str).setSource(p1).setBizType(4);
       photoDetailP.getSlidePlayConfig().setEnableLazyLoad(0);
       photoDetailP.getDetailPlayConfig().setUseHardDecoder(true);
       photoDetailP.getSlidePlayConfig().setEnableSlidePositionChangeEvent(true);
       photoDetailP.getSlidePlayConfig().setEnablePullRefresh(true);
       photoDetailP.getDetailCommonParam().setSlidePlayDetailDifferentFollowRefer(0);
       d.a(0x66aa3a58).z20(p0, 1234, photoDetailP, null, 0, 0, nasaSlidePar, true, null);
       return;
    }
}
