package k7a.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k7a.h$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import le5.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import k7a.e;
import erd.g;
import crd.b;
import brd.t;
import im8.f;
import java.lang.Integer;
import uy6.h;
import uy6.b;
import k7a.g;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import k7a.f;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import q3a.i;
import android.os.SystemClock;
import com.kwai.framework.model.feed.BaseFeed;
import e1a.u;
import rh5.a;
import rh5.b;
import io.reactivex.subjects.PublishSubject;
import de5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class h extends PresenterV2	// class@002c11
{
    public boolean A;
    public final a B;
    public List p;
    public PublishSubject q;
    public f r;
    public QPhoto s;
    public List t;
    public a u;
    public BaseFragment v;
    public PhotoDetailLogger w;
    public SlidePlayViewModel x;
    public boolean y;
    public boolean z;

    public void h(){
       super();
       this.B = new h$a(this);
    }
    public void E8(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "2")) {
          return;
       }
       h obj = PatchProxy.apply(null, this, oh, "3");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.s.isVideoType() || f.i()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return;
       }else {
          obj = this.v;
          if (obj != null) {
             this.x = SlidePlayViewModel.S0(obj.getParentFragment());
          }
          obj = this.x;
          if (obj != null) {
             obj.P(this.v, this.B);
          }else {
             obj = this.t;
             if (obj != null) {
                obj.add(this.B);
             }
          }
          this.X7(this.q.subscribe(new e(this)));
          this.z = false;
          Object obj1 = PatchProxy.apply(null, this, oh, "4");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.x != null && (this.r.get().intValue() != this.x.j() && this.p.contains(this.r.get()))){
             i = 0;
          }
          b1 = i;
          if (b1) {
             if (h.a.a != null) {
                k1.s(new g(this), this, 16);
             }else {
                this.V8("onBind");
             }
          }
          this.R8();
          this.X7(this.getActivity().m().subscribe(new f(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       h tx = this.x;
       if (tx != null) {
          tx.D(this.v, this.B);
       }else {
          tx = this.t;
          if (tx != null) {
             tx.remove(this.B);
          }
       }
       k1.n(this);
       return;
    }
    public void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       o oo = o.C();
       StringBuilder str = p0+", photoId = ";
       h ts = this.s;
       String str1 = "null";
       ts = (ts == null)? str1: ts.getPhotoId();
       str = str+ts+", userName = ";
       ts = this.s;
       if (ts != null) {
          str1 = ts.getUserName();
       }
       Object[] objArray = new Object[0];
       oo.w("SlidePreloadOpt", str+str1+", index = "+this.r.get(), objArray);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       this.p.remove(this.r.get());
       return;
    }
    public final void S8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "10")) {
          return;
       }
       if (this.getActivity() == null) {
          this.P8("removePreloadPlayer, activity is null, not remove");
          return;
       }else if(this.y != null){
          this.P8("removePreloadPlayer, mIsBecomesAttached == true, not remove");
          return;
       }else if(this.z == null){
          this.P8("removePreloadPlayer, mHasCalledPreload == false, not remove");
          return;
       }else if(this.u instanceof i){
          this.P8("release preload player:");
          this.u.m();
          this.z = false;
          this.A = p0;
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       this.z = true;
       this.P8("start preload..."+p0);
       u.a(this.s.getEntity());
       a uoa = new a();
       uoa.mFunctionName = "SlidePlayPhotoPreloadOptPresenter - startPreload";
       uoa.mContainer = "SlidePlayPhotoPreloadOptPresenter";
       uoa.mStartTime = SystemClock.currentThreadTimeMillis();
       uoa.mEndTime = SystemClock.currentThreadTimeMillis();
       b.b("FEATURED_PAGE").a(uoa);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PENGING_PRELOAD_LIST");
       this.q = this.r8("DETAIL_PRELOAD_EVENT");
       this.r = this.x8("DETAIL_PHOTO_INDEX");
       this.s = this.q8(QPhoto.class);
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       this.u = this.q8(a.class);
       this.v = this.t8("DETAIL_FRAGMENT");
       this.w = this.r8("DETAIL_LOGGER");
       return;
    }
}
