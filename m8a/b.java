package m8a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m8a.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import android.app.Activity;
import lnc.i3;
import k2b.u1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import yw6.g;
import java.util.List;
import fw6.b;
import android.view.View;
import java.lang.Runnable;
import qvb.i;
import qvb.q;
import qvb.j;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;
import ekd.m1;
import com.yxcorp.gifshow.nasa.NasaRefreshView;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@002f6f
{
    public SlidePlayViewModel A;
    public final q B;
    public Runnable p;
    public PhotoDetailParam q;
    public i r;
    public View s;
    public View t;
    public View u;
    public View v;
    public NasaRefreshView w;
    public ViewStub x;
    public b y;
    public BaseFragment z;

    public void b(){
       super();
       this.B = new b$a(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.A = SlidePlayViewModel.B0(this.z);
       b uob1 = b.e(this.q.mSlidePlayId);
       this.y = uob1;
       if (uob1 == null) {
          this.getActivity().finish();
          i3 oi3 = i3.f();
          oi3.d("reason", "Can not get data fetcher!");
          u1.R("reminder_detail_flow", oi3.e(), 13);
          return;
       }else {
          PhotoDetailParam mPhoto = this.q.mPhoto;
          i obj = PatchProxy.applyTwoRefs(uob1, mPhoto, this, uob, "5");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(mPhoto == null || mPhoto.mEntity == null){
             List list = this.A.O0().n0();
             if (list != null) {
                int i = list.indexOf(mPhoto);
                if (i > -1) {
                   objArray = list.get(i);
                }
             }
          }
          if (objArray != null) {
             this.s.setVisibility(8);
             this.t.setVisibility(8);
             this.P8();
             this.p.run();
          }else {
             obj = this.y.M7();
             this.r = obj;
             obj.h(this.B);
             this.r.a();
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          tr.f(this.B);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       c uoc = QPhotoMediaPlayerCacheManager.d(this.q.mPhoto);
       if (uoc != null) {
          uoc.release();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3a1a);
       this.t = m1.f(p0, 0x7f0a39ec);
       this.u = m1.f(p0, 0x7f0a35e1);
       this.v = m1.f(p0, 0x7f0a35e2);
       this.w = m1.f(p0, 0x7f0a3537);
       this.x = m1.f(p0, 0x7f0a353d);
       this.s.setVisibility(0);
       this.t.setVisibility(0);
       this.v.setVisibility(8);
       this.u.setVisibility(8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q = this.q8(PhotoDetailParam.class);
       this.p = this.r8("DETAIL_FLOW_END_LISTENER");
       this.z = this.r8("FRAGMENT");
       return;
    }
}
