package bia.a;
import hv5.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.slide.detail.data.f;
import android.content.Intent;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.b;
import java.lang.Boolean;
import java.util.ArrayList;
import ekd.j;
import cia.q;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import qvb.n0;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import java.util.List;
import qvb.a;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import fia.k;
import nga.a;
import fia.c;
import fia.e;
import fv5.a;
import wkd.b;
import fia.n;
import g3a.a;
import wvb.e;
import tkd.b;
import tkd.d;
import yqb.b;
import yqb.k;
import wga.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import wga.b;
import com.yxcorp.gifshow.follow.common.data.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import wga.a;
import wm5.a;
import android.view.View;
import vm5.o;
import com.yxcorp.gifshow.detail.DetailExtendParam;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import java.lang.StringBuilder;
import hha.b;

public class a implements a	// class@0003be
{

    public void a(){
       super();
    }
    public i Hr(QPhoto p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(p0, p1, false, false);
    }
    public i P00(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p0);
    }
    public PresenterV2 PJ(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "13");
       return new b();
    }
    public i RN(QPhoto p0,int p1,boolean p2,int p3){
       f obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), this, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new f(p0, p1, p2, p3);
       QPhoto[] qPhotoArray = new QPhoto[]{p0};
       ArrayList uArrayList = j.a(qPhotoArray);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, obj, f.class, "1")) {
          q.c(uArrayList, new q(obj));
          FeedsResponse uFeedsRespon = obj.L0();
          if (uFeedsRespon == null) {
             uFeedsRespon = new FeedsResponse();
             uFeedsRespon.mPhotos = uArrayList;
          }
          obj.S1(uFeedsRespon);
          obj.b(uArrayList);
       }
       return obj;
    }
    public String Y0(Fragment p0,i p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "pageList");
       String str = f.b(p0);
       a.o(str, "SlidePlayDataFetcher.buildFetcherId\(fragment\)");
       b.g(j.d(p1, str, SlideMediaType.ALL));
       return str;
    }
    public PresenterV2 aE(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "2");
       return new k();
    }
    public i ak(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(p0);
    }
    public PresenterV2 bS(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "14");
       return new c();
    }
    public PresenterV2 bk(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new e());
       PatchProxy.onMethodExit(a.class, "3");
       return obj;
    }
    public i du(QPhoto p0,int p1,boolean p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(p0, p1, p2, p3);
    }
    public a hZ(){
       Object obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x46e56f43);
       a.o(obj, "Singleton.get\(FollowSlid¡­uideProvider::class.java\)");
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 lk(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new n();
    }
    public boolean m00(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 instanceof a) {
          p0 = p0.m();
          if (!p0 instanceof f || !p0.i2()) {
             b = false;
          }
          return b;
       }else if(p0 instanceof f && p0.i2()){
          b = false;
       }
       return b;
    }
    public i oH(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       i oi = d.a(0x6c2883df).RN(p0, 0, 0, 3);
       a.o(oi, "PluginManager.get\(Follow¡­VE_TO_DETAIL_PLAY\n      \)");
       return oi;
    }
    public void pI(b p0,k p1){
       b uob;
       Object obj = p0;
       d obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, a.class, "15")) {
          return;
       }
       a.p(obj, "liveEntranceParam");
       a.p(obj1, "openLiveConfig");
       GifshowActivity gifshowActiv = p0.a();
       a.o(gifshowActiv, "liveEntranceParam.activity");
       QPhoto qPhoto = p0.e();
       a.o(qPhoto, "liveEntranceParam.photo");
       obj1 = new d(p0.b(), gifshowActiv, qPhoto);
       obj1.a = 3;
       obj1.e = p0.d();
       boolean b = true;
       obj1.g = b;
       a uoa = null;
       if (!PatchProxy.applyVoidOneRefs(obj1, uoa, b.class, "1")) {
          a.p(obj1, "slideLiveEntranceParam");
          int i = 0x6c2883df;
          if (obj1.b() == 6) {
             uob = new b(obj1.b());
             uob.add(0, obj1.c());
          }else {
             uob = d.a(i).du(obj1.c(), 0, obj1.b, obj1.a);
             a.o(uob, "PluginManager.get\(Follow¡­Param.slideType\n        \)");
          }
          String str = d.a(i).Y0(obj1.h, uob);
          PhotoDetailParam photoDetailP = new PhotoDetailParam(obj1.c()).setSlidePlayId(str).setSource(16).setPhotoIndex(0).setFeedPosition(0);
          a.o(photoDetailP, "param");
          DetailPlayConfig detailPlayCo = photoDetailP.getDetailPlayConfig();
          a.o(detailPlayCo, "param.detailPlayConfig");
          detailPlayCo.setUseHardDecoder(b);
          photoDetailP.setSlidePlayId(str);
          NasaSlideParam$a uoa1 = new NasaSlideParam$a();
          uoa1.T("DETAIL");
          uoa1.C(0);
          uoa1.D(b);
          uoa1.t(b);
          uoa1.Y("search_entrance_follow");
          uoa1.l = b;
          uoa1.q(b);
          uoa1.e(b);
          uoa1.Z("follow");
          NasaSlideParam nasaSlidePar = uoa1.a();
          if (obj1.a()) {
             uoa = new a(obj1);
          }
          d.a(0x66aa3a58).z20(obj1.i, 1025, photoDetailP, null, 0, 0, nasaSlidePar, false, uoa);
       }
       return;
    }
    public DetailExtendParam ui(GifshowActivity p0){
       FollowSlideDetailGlobalParams uFollowSlide = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (uFollowSlide != PatchProxyResult.class) {
       }else {
          a.p(p0, "activity");
          uFollowSlide = new FollowSlideDetailGlobalParams(p0);
       }
       return uFollowSlide;
    }
    public String wL(){
       String obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = b.a(-713764853);
       a.o(uob, "visitSourceManager");
       obj = "&"+"follow_session_id"+"="+uob.d()+"&"+"visited_source"+"="+uob.f();
       a.o(obj, "pageParams.toString\(\)");
       return obj;
    }
}
