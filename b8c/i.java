package b8c.i;
import gyb.a;
import java.lang.Object;
import android.content.Intent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e8c.b;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import e8c.c;
import e8c.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import com.yxcorp.gifshow.nearby.NearbyGuideParam$a;
import u1b.a;
import b8c.b;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import c8c.c;
import com.yxcorp.gifshow.rankgather.api.b;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;

public class i implements a	// class@0003d8
{

    public void i(){
       super();
    }
    public void B6(Intent p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, i.class, "2")) {
          return;
       }
       if (p0 == null || p1 == null) {
          PatchProxy.onMethodExit(i.class, "2");
          return;
       }else {
          p1.U7(new b());
          Uri data = p0.getData();
          if (data != null && (!TextUtils.isEmpty(data.getPath()) && data.isHierarchical())) {
             if (("aggregate").equals(data.getHost())) {
                if ("2".equals(data.getQueryParameter("type"))) {
                   p1.U7(new c());
                }else {
                   p1.U7(new d());
                }
             }else {
                p1.U7(new d());
             }
          }
          PatchProxy.onMethodExit(i.class, "2");
          return;
       }
    }
    public void SG(LiveBizParam p0,Intent p1){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oi, "4")) {
          return;
       }
       Uri obj = PatchProxy.applyOneRefs(p1, this, oi, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = p1.getData();
          i = (obj != null && (!TextUtils.isEmpty(obj.getPath()) && (obj.isHierarchical() && (("aggregate").equals(obj.getHost()) && ("2").equals(obj.getQueryParameter("type"))))))? 194: 0;
       }
       p0.mLiveSourceType = i;
       NearbyGuideParam nearbyGuideP = NearbyGuideParam.Companion.b(p1.getData());
       p0.mNearbyGuideParam = nearbyGuideP;
       if (nearbyGuideP.isLocalForceShowGuide()) {
          p0.mSlideGuideMode = 4;
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public a n50(Intent p0){
       b obj = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       if (p0.getData() != null && p0.getData().isHierarchical()) {
          obj.b = p0.getData().getQueryParameter("feedId");
       }
       obj.d = false;
       return obj;
    }
    public i ux(NasaBizParam p0,Intent p1,PhotoDetailParam p2,BaseFragment p3){
       NasaSlideParam$a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NasaSlideParam$a();
       obj.Z("NEARBY_RANK_GATHER");
       obj.T("DETAIL");
       obj.q(true);
       obj.C(false);
       obj.Q(NearbyGuideParam.Companion.b(p1.getData()));
       p0.setNasaSlideParam(obj.a());
       String str = f.b(p3);
       p2.setSlidePlayId(str);
       p2.getSlidePlayConfig().setEnablePullRefresh(false);
       p2.setSource(9);
       c uoc = new c();
       Uri data = p1.getData();
       if (!PatchProxy.applyVoidOneRefs(data, uoc, c.class, "6")) {
          c d = uoc.d;
          if (d == null) {
             uoc.d = new b(data);
          }else {
             d.i2(data);
          }
       }
       b.g(j.e(uoc, str, SlideMediaType.ALL));
       return uoc;
    }
}
