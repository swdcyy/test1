package dlc.k0;
import qvb.q;
import ux5.b$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri$Builder;
import wkc.b;
import qvb.i;
import tkc.f;
import ekd.x0;
import vkc.b;
import java.lang.StringBuilder;
import wx5.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.TrendingInfo;
import com.yxcorp.gifshow.entity.TrendingInfo$SubTrendingInfo;
import im8.f;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent;
import brd.y;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.List;
import tkc.b;
import q87.c;
import java.util.Objects;
import kotlin.jvm.internal.a;
import qvb.a;
import java.util.Collection;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import java.lang.Runnable;
import dlc.i0;
import tkc.f$c;
import dlc.j0;
import msd.l;
import java.lang.Throwable;
import qvb.p;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;
import fw6.c;
import ux5.b;
import ekd.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import tkc.e;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import qvb.n0;
import xkc.b;
import java.lang.Integer;

public class k0 extends PresenterV2 implements q, b$a	// class@002254
{
    public Boolean A;
    public y B;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public PhotoDetailParam r;
    public Runnable s;
    public f t;
    public e u;
    public f v;
    public PublishSubject w;
    public y x;
    public PublishSubject y;
    public f z;

    public void k0(){
       super();
       this.A = Boolean.FALSE;
    }
    public void E8(){
       String str7;
       k0 ok0 = k0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok0, "2")) {
          return;
       }
       this.q = SlidePlayViewModel.B0(this.p);
       if (PatchProxy.applyVoid(objArray, this, ok0, "4") || (this.getActivity() != null && this.getActivity().getIntent() != null)) {
          Uri data = this.getActivity().getIntent().getData();
          if (data != null) {
             String str = w0.a(data, "trendingId");
             if (!TextUtils.x(str)) {
                String str1 = TextUtils.k(w0.a(data, "photoId"));
                this.getActivity().getIntent().setData(data.buildUpon().appendPath(str1).build());
                k0 tu = this.u;
                if (tu instanceof b && tu.b() instanceof f) {
                   String str2 = TextUtils.k(w0.a(data, "source"));
                   String str3 = x0.b(data, "trendingType", "");
                   String str4 = TextUtils.k(w0.a(data, "subTrendingId"));
                   String str5 = TextUtils.k(w0.a(data, "trendingListInfo"));
                   String str6 = x0.b(data, "extParams", "");
                   if (b.a()) {
                      if (TextUtils.x(str4)) {
                      label_00d1 :
                         str7 = str;
                      }else {
                         str7 = str4+str;
                      }
                   }else if(TextUtils.x(str4)){
                      goto label_00d1 ;
                   }else {
                      str7 = str4;
                   }
                   i oi = this.u.b();
                   this.z = oi;
                   oi.u2(str7, str1, str2, str5, str3, a.a(str6));
                   if (!PatchProxy.applyVoidThreeRefs(str, str4, str3, this, k0.class, "7")) {
                      TrendingInfo trendingInfo = PatchProxy.applyThreeRefs(str, str4, str3, this, k0.class, "8");
                      if (trendingInfo != PatchProxyResult.class) {
                      }else if(TextUtils.x(str4)){
                         trendingInfo = new TrendingInfo();
                         trendingInfo.mId = str;
                         trendingInfo.mDesc = str;
                         trendingInfo.mTop = 0;
                         trendingInfo.mTrendingType = "";
                         trendingInfo.mPopularType = str3;
                      }else {
                         trendingInfo = new TrendingInfo$SubTrendingInfo();
                         trendingInfo.mRootTrendingId = str;
                         trendingInfo.mSubTrendingId = str4;
                      }
                      this.v.set(trendingInfo);
                      this.x.onNext(new OnPlayTrendingInfoChangeEvent(trendingInfo));
                   }
                   a mSlidePlayId = this.r.mSlidePlayId;
                   b uob = b.e(mSlidePlayId);
                   if (uob != null) {
                      List list = uob.e0();
                      if (!list.isEmpty()) {
                         Object[] objArray1 = new Object[0];
                         b.C().w("MilanoTrendingDetailFlowPresenterV2", " qPhotos isValid", objArray1);
                         tu = this.z;
                         Objects.requireNonNull(tu);
                         if (!PatchProxy.applyVoidOneRefs(list, tu, f.class, "21")) {
                            a.p(list, "qPhotos");
                            tu.I = list;
                            tu.b.addAll(list);
                            tu.H = true;
                         }
                         b.g(j.e(this.z, mSlidePlayId, b.d()));
                         this.P8();
                         this.s.run();
                         this.A = Boolean.TRUE;
                         this.R8(this);
                      }
                   }
                   this.z.h(this);
                   this.z.w2(new i0(this));
                }
             }
          }
       }
       ok0 = this.z;
       if (ok0 != null) {
          ok0.v2(new j0(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "3")) {
          return;
       }
       k0 tz = this.z;
       if (tz != null) {
          tz.f(this);
          this.z.w2(null);
          this.z.v2(null);
       }
       this.R8(null);
       return;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "9")) {
          return;
       }
       c uoc = QPhotoMediaPlayerCacheManager.d(this.r.mPhoto);
       if (uoc != null) {
          uoc.release();
       }
       return;
    }
    public final void R8(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "11")) {
          return;
       }
       c dataSource = this.q.getDataSource();
       if (dataSource instanceof b) {
          dataSource.V0(p0);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean b5(boolean p0,List p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ok0, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (q.f(p1)) {
          return false;
       }else {
          this.q.x(p1, this.q.getCurrentPhoto(), false, "MilanoTrendingDetailFlowPresenterV2");
          return true;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.r8("DETAIL_FLOW_END_LISTENER");
       this.u = this.q8(e.class);
       this.t = this.x8("LOAD_TRENDING_WITH_PHOTO_ID");
       this.v = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.w = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       this.x = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.y = this.r8("FIRST_SHOW_FEED_INDEX_ON_LOAD_FINISH");
       this.B = this.r8("TRENDING_FEED_LIST_IS_EMPTY_OBSERVER");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ok0, "5")) {
          return;
       }
       if (this.z.isEmpty()) {
          k0 tB = this.B;
          if (tB != null) {
             tB.onNext(Boolean.TRUE);
          }
          return;
       }else {
          this.z.f(this);
          int i = 0;
          if (!this.A.booleanValue()) {
             Object[] objArray = new Object[i];
             b.C().w("MilanoTrendingDetailFlowPresenterV2", " qPhotos isEmpty", objArray);
             k0 tr = this.r;
             k0 tz = this.z;
             QPhoto qPhoto = PatchProxy.applyOneRefs(tz, this, ok0, "10");
             if (qPhoto != PatchProxyResult.class) {
             }else if(tz == null || tz.isEmpty()){
                qPhoto = null;
             }else {
                Iterator iterator = tz.getItems().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      QPhoto qPhoto1 = iterator.next();
                      if (qPhoto1 != null && (qPhoto1.getPhotoId() != null && (qPhoto1.getPhotoId()).equals(this.t.get()))) {
                         qPhoto = qPhoto1;
                      }
                   }else {
                      qPhoto = tz.n2();
                      if (qPhoto == null) {
                         qPhoto = tz.getItem(i);
                      }
                   }
                }
             }
             tr.mPhoto = qPhoto;
             b.g(j.e(this.z, this.r.mSlidePlayId, b.d()));
             this.P8();
             this.s.run();
          }
          this.R8(this);
          if (!PatchProxy.isSupport(ok0) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok0, "6") && p0)) {
             QPhoto currentPhoto = this.q.getCurrentPhoto();
             TrendingInfo trendingInfo = this.z.z2(currentPhoto);
             this.v.set(trendingInfo);
             if (trendingInfo != null) {
                this.x.onNext(new OnPlayTrendingInfoChangeEvent(trendingInfo));
             }
             if (!q.f(this.z.getItems())) {
                while (i < this.z.getItems().size()) {
                   if (this.z.getItems().get(i) == currentPhoto) {
                      this.w.onNext(new b(this.z.F0(i), this.z.O0(i)));
                      this.y.onNext(Integer.valueOf(i));
                      break ;
                   }
                   i = i + 1;
                }
             }
          }
          return;
       }
    }
}
