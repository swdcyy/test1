package fia.c;
import qvb.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import kotlin.jvm.internal.a;
import qvb.i;
import qvb.j;
import java.lang.Throwable;
import java.lang.Boolean;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import fia.d;
import android.view.View$OnClickListener;
import qvb.p;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Runnable;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import fia.c$a;
import android.view.ViewGroup;

public final class c extends PresenterV2 implements q	// class@0028f3
{
    public BaseFragment p;
    public NasaBizParam q;
    public View r;
    public Runnable s;
    public PhotoDetailParam t;
    public i u;
    public int v;

    public void c(){
       super();
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       c tr = this.r;
       if (tr != null) {
          tr.setVisibility(0);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          uoc = this.t;
          if (uoc != null) {
             objArray = uoc.mSlidePlayId;
          }
          b uob = b.e(objArray);
          if (uob != null) {
             a.o(uob, "SlidePlayDataFetcherImpl\x20\x02?.mSlidePlayId\) ?: return\x00");
             i oi = uob.M7();
             this.u = oi;
             if (oi != null) {
                oi.h(this);
             }
             uoc = this.u;
             if (uoc != null) {
                uoc.a();
             }
          }
       }
    label_0040 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tu = this.u;
       if (tu != null && tu != null) {
          tu.f(this);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "7")) {
          return;
       }
       a.p(p1, "error");
       if (p0 && !PatchProxy.applyVoid(null, this, uoc, "9")) {
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.i(a1.p(R.string.arg_RES_7f100d25));
          uoa.p(new d(this));
          uoa.a(c.h(this.r, b.g));
          c tr = this.r;
          if (tr != null) {
             tr.setVisibility(8);
          }
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.r = m1.f(p0, 0x7f0a0feb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(NasaBizParam.class);
       this.s = this.r8("DETAIL_FLOW_END_LISTENER");
       this.t = this.q8(PhotoDetailParam.class);
       this.p = this.r8("FRAGMENT");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "6")) {
          return;
       }
       c tr = this.r;
       if (tr != null) {
          tr.setVisibility(8);
       }
       if (p0) {
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, this, uoc, "8");
          if (obj != PatchProxyResult.class) {
          }else {
             tr = this.u;
             if (tr == null || tr.isEmpty() == true) {
                obj = objArray;
             }else {
                tr = this.u;
                obj = (tr != null)? tr.getItem(0): objArray;
                if (!obj instanceof QPhoto) {
                   obj = objArray;
                }
             }
          }
          if (obj != null) {
             uoc = this.t;
             PhotoDetailParam mPhoto = (uoc != null)? uoc.mPhoto: objArray;
             if (mPhoto == null && uoc != null) {
                uoc.mPhoto = obj;
             }
          }
       label_0062 :
          tr = this.t;
          if (tr != null) {
             objArray = tr.mPhoto;
          }
          QPhotoMediaPlayerCacheManager.e(objArray);
          c ts = this.s;
          if (ts != null) {
             ts.run();
          }
          if (this.v > null) {
             ts = this.p;
             a.m(ts);
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ts);
             a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment!!\)");
             slidePlayVie.s2().post(new c$a(this, slidePlayVie));
          }
       }
       return;
    }
}
