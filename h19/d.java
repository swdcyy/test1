package h19.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h19.d$a;
import h19.d$b;
import h19.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import h19.d$d;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager$a;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import h19.b;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import gx5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.SystemClock;
import n49.s;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kwai.framework.model.feed.BaseFeed;
import tw.j;
import nx8.n;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.webkit.URLUtil;
import zsd.u;
import n49.e;
import n49.o;
import k2b.u1;
import im8.f;
import p1a.a;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import mxb.c;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import v19.e;
import androidx.lifecycle.ViewModel;
import io.reactivex.subjects.PublishSubject;
import v19.g;
import v19.d;
import java.util.HashMap;
import java.lang.Integer;
import vu5.b;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import h19.c;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import joc.d;
import yy6.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xy8.a;

public class d extends PresenterV2	// class@00253a
{
    public BaseFragment A;
    public f B;
    public t C;
    public o D;
    public GifshowActivity E;
    public l F;
    public d G;
    public SwipeLayout H;
    public boolean I;
    public final o J;
    public final a K;
    public final SwipeLayout$b L;
    public SlidePlayViewModel p;
    public View q;
    public PhotosViewPager r;
    public SwipeLayout$Direction s;
    public PhotoDetailParam t;
    public QPhoto u;
    public d v;
    public f w;
    public f x;
    public c y;
    public List z;
    public static long M;

    public void d(){
       super();
       this.J = new d$a(this);
       this.K = new d$b(this);
       this.L = new d$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tG = this.G;
       if (tG != null) {
          this.F = tG.e;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.A.getParentFragment());
       this.p = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.A, this.K);
       }else {
          tG = this.z;
          if (tG != null) {
             tG.add(this.K);
          }
       }
       tG = this.r;
       if (tG != null) {
          tG.setOnSwipeOutListener(new d$d(this));
       }
       this.X7(this.C.subscribe(new b(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.E = activity;
       this.H = w9.c(activity);
       return;
    }
    public boolean P8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uod, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.E.isFinishing()) {
          return true;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uod, "10");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): d.a(-1188553266).VA(this.E.U2(), this.u.getUserId()) ^ true;
       if (!b) {
          return true;
       }else if((SystemClock.elapsedRealtime() - d.M) - 1000 < 0){
          return true;
       }else {
          d.M = SystemClock.elapsedRealtime();
          return false;
       }
    }
    public void R8(){
       boolean b;
       boolean b1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "9")) {
          return;
       }
       QPhoto mEntity = this.u.mEntity;
       a$a obj = PatchProxy.applyOneRefs(mEntity, objArray, s.class, "22");
       int i = 2;
       String str = "AD";
       int i1 = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(mEntity == null){
          PhotoAdvertisement photoAdverti1 = mEntity.get(str);
          if (photoAdverti1 != null && (j.z(mEntity) || n.d(12, photoAdverti1))) {
             if (j.C(photoAdverti1)) {
                PhotoAdvertisement mAdData = photoAdverti1.mAdData;
                PhotoAdvertisement$AdData mH5Url = (mAdData != null)? mAdData.mH5Url: objArray;
                if (!URLUtil.isNetworkUrl(mH5Url)) {
                   Object obj2 = PatchProxy.applyOneRefs(mH5Url, objArray, j.class, "38");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(mH5Url != null){
                      b = u.q2(mH5Url, "kwai://adtkpage/moli", i1, i, objArray);
                   }else {
                      b = false;
                   }
                   if (!b) {
                   label_0076 :
                      b = false;
                   }
                }
             }
          label_0078 :
             b = true;
          }
       }
       if (b) {
          this.D.a(this.u, this.getActivity(), new e(12));
          return;
       }else {
          u1.K0(i);
          obj = new a$a(5, 1071, "PULL_TO_SWITCH_PAGE");
          obj.i(3);
          obj.g(a.b(this.u));
          this.x.get().a(obj);
          mEntity = this.u.mEntity;
          d obj1 = PatchProxy.applyOneRefs(mEntity, objArray, c.class, "48");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(mEntity != null){
             PhotoAdvertisement photoAdverti = mEntity.get(str);
             if (photoAdverti != null) {
                if (photoAdverti.mIsInLiving == null) {
                   photoAdverti = objArray;
                }
                if (photoAdverti != null) {
                   photoAdverti = photoAdverti.mAdData;
                   if (photoAdverti != null) {
                      b1 = photoAdverti.mEnableLeftSlideOpenLive;
                   }
                }
             }
          }
          b1 = null;
          if (b1 != null) {
             ViewModelProviders.of(this.getActivity()).get(e.class).o0().onNext(new d(this.u, true, 4));
          }else {
             HashMap hashMap = new HashMap();
             hashMap.put("clickType", Integer.valueOf(12));
             b uob = d.a(-1718536792);
             obj1 = this.E;
             ProfileStartParam profileStart = ProfileStartParam.l(this.u.getUser());
             profileStart.p(c.b);
             profileStart.D(hashMap);
             profileStart.q(c.e(this.u));
             d tt = this.t;
             if (tt != null) {
                PhotoDetailParam mPhoto = tt.mPhoto;
                if (mPhoto != null) {
                   objArray1 = mPhoto.mEntity;
                label_0147 :
                   if (tt != null) {
                      i1 = tt.mPhotoIndex;
                   }
                   if (tt != null) {
                      objArray = tt.getDetailCommonParam().getPreInfo();
                   }
                   profileStart.y(objArray1, i1, objArray);
                   uob.Nl(obj1, profileStart, 100);
                }
             }
             objArray1 = objArray;
             goto label_0147 ;
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2f51);
       this.r = m1.f(p0, 0x7f0a4452);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.q8(QPhoto.class);
       this.v = this.t8("DETAIL_HORIZONTAL_SWIPE");
       this.w = this.x8("DETAIL_LOGGER");
       this.x = this.x8("LOG_LISTENER");
       this.y = this.q8(c.class);
       this.z = this.t8("DETAIL_ATTACH_LISTENERS");
       this.A = this.r8("DETAIL_FRAGMENT");
       this.B = this.x8("DETAIL_ENABLE_SLIDE_PLAY");
       this.C = this.r8("DETAIL_ADJUST_EVENT");
       this.D = this.q8(o.class);
       this.G = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       if (!this.P8()) {
          this.R8();
       }
       return;
    }
}
