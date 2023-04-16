package dlc.h0;
import qvb.q;
import ux5.b$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
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
import qvb.a;
import dlc.f0;
import tkc.f$c;
import dlc.g0;
import msd.l;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import tkc.c;
import fw6.c;
import ux5.b;
import qvb.p;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Runnable;
import tkc.e;
import io.reactivex.subjects.PublishSubject;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.Iterator;
import qvb.n0;
import xkc.b;
import java.lang.Integer;

public class h0 extends PresenterV2 implements q, b$a	// class@00224c
{
    public f A;
    public c B;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public PhotoDetailParam r;
    public Runnable s;
    public e t;
    public f u;
    public f v;
    public PublishSubject w;
    public y x;
    public PublishSubject y;
    public y z;

    public void h0(){
       super();
       this.B = new e0(this);
    }
    public void E8(){
       String str7;
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "2")) {
          return;
       }
       this.q = SlidePlayViewModel.B0(this.p);
       if (this.r.mPhoto == null && (PatchProxy.applyVoid(objArray, this, oh0, "4") || (this.getActivity() != null && this.getActivity().getIntent() != null))) {
          Uri data = this.getActivity().getIntent().getData();
          if (data != null) {
             String str = w0.a(data, "trendingId");
             if (!TextUtils.x(str)) {
                String str1 = TextUtils.k(w0.a(data, "photoId"));
                this.getActivity().getIntent().setData(data.buildUpon().appendPath(str1).build());
                h0 tt = this.t;
                if (tt instanceof b && tt.b() instanceof f) {
                   String str2 = TextUtils.k(w0.a(data, "source"));
                   String str3 = x0.b(data, "trendingType", "");
                   String str4 = TextUtils.k(w0.a(data, "subTrendingId"));
                   String str5 = TextUtils.k(w0.a(data, "trendingListInfo"));
                   String str6 = x0.b(data, "extParams", "");
                   this.A = this.t.b();
                   if (b.a()) {
                      if (TextUtils.x(str4)) {
                      label_00e3 :
                         str7 = str;
                      }else {
                         str7 = str4+str;
                      }
                   }else if(TextUtils.x(str4)){
                      goto label_00e3 ;
                   }else {
                      str7 = str4;
                   }
                   this.A.u2(str7, str1, str2, str5, str3, a.a(str6));
                   if (!PatchProxy.applyVoidThreeRefs(str, str4, str3, this, h0.class, "7")) {
                      TrendingInfo trendingInfo = PatchProxy.applyThreeRefs(str, str4, str3, this, h0.class, "8");
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
                   this.A.h(this);
                   this.A.w2(new f0(this));
                }
             }
          }
       }
       oh0 = this.A;
       if (oh0 != null) {
          oh0.v2(new g0(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       h0 tA = this.A;
       if (tA != null) {
          tA.f(this);
          this.A.w2(null);
          this.A.v2(null);
       }
       this.P8(null);
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(h0.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, h0.class, "9")) {
          return;
       }
       if (!p0) {
          this.A.f(this);
          h0 tB = this.B;
          if (tB != null) {
             tB.a(null, null);
          }
       }
       return;
    }
    public final void P8(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "12")) {
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
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, oh0, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (q.f(p1)) {
          return false;
       }else {
          this.q.x(p1, this.q.getCurrentPhoto(), false, "MilanoTrendingDetailFlowPresenter");
          return true;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.r = this.q8(PhotoDetailParam.class);
       this.s = this.r8("DETAIL_FLOW_END_LISTENER");
       this.t = this.q8(e.class);
       this.u = this.x8("LOAD_TRENDING_WITH_PHOTO_ID");
       this.v = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.w = this.r8("CURRENT_PLAY_FEED_INDEX_IN_TRENDING_INFO");
       this.x = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.y = this.r8("FIRST_SHOW_FEED_INDEX_ON_LOAD_FINISH");
       this.z = this.r8("TRENDING_FEED_LIST_IS_EMPTY_OBSERVER");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oh0, "5")) {
          return;
       }
       if (this.A.isEmpty()) {
          h0 tz = this.z;
          if (tz != null) {
             tz.onNext(Boolean.TRUE);
          }
          return;
       }else {
          this.A.f(this);
          Fragment uFragment = null;
          String str = f.b(uFragment);
          b.g(j.e(this.A, str, b.d()));
          h0 tA = this.A;
          QPhoto qPhoto = PatchProxy.applyOneRefs(tA, this, oh0, "11");
          int i = 0;
          if (qPhoto != PatchProxyResult.class) {
          }else if(tA == null || tA.isEmpty()){
             qPhoto = uFragment;
          }else {
             Iterator iterator = tA.getItems().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   QPhoto qPhoto1 = iterator.next();
                   if (qPhoto1 != null && (qPhoto1.getPhotoId() != null && (qPhoto1.getPhotoId()).equals(this.u.get()))) {
                      qPhoto = qPhoto1;
                   }
                }else {
                   qPhoto = tA.n2();
                   if (qPhoto == null) {
                      qPhoto = tA.getItem(i);
                   }
                }
             }
          }
          if (q.f(this.A.getItems())) {
             this.B.a(uFragment, uFragment);
          }else {
             this.B.a(qPhoto, str);
          }
          if (!PatchProxy.isSupport(oh0) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), qPhoto, this, oh0, "6") && p0)) {
             TrendingInfo trendingInfo = this.A.z2(qPhoto);
             this.v.set(trendingInfo);
             if (trendingInfo != null) {
                this.x.onNext(new OnPlayTrendingInfoChangeEvent(trendingInfo));
             }
             if (!q.f(this.A.getItems())) {
                while (i < this.A.getItems().size()) {
                   if (this.A.getItems().get(i) == qPhoto) {
                      this.w.onNext(new b(this.A.F0(i), this.A.O0(i)));
                      this.y.onNext(Integer.valueOf(i));
                      break ;
                   }
                   i = i + 1;
                }
             }
          }
          this.P8(this);
          return;
       }
    }
}
