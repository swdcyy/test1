package com.yxcorp.gifshow.detail.presenter.b;
import jc6.g;
import com.yxcorp.gifshow.detail.presenter.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import vy6.a;
import java.util.List;
import p5a.e;
import de5.a;
import y4a.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import lnc.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.view.ViewStub;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Locale;
import wkd.b;
import kka.h;
import p5a.c;
import java.lang.Integer;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uc6.c;
import sd5.d;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.lang.Boolean;
import com.kwai.video.player.IKwaiMediaPlayer;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rd5.d;

public class b extends g	// class@0016d0
{
    public boolean A;
    public int B;
    public final a C;
    public PhotoDetailParam s;
    public d t;
    public QPhoto u;
    public a v;
    public List w;
    public f x;
    public SlidePlayViewModel y;
    public BaseFragment z;

    public void b(){
       super();
       this.B = 0x7f0a302a;
       this.C = new b$a(this);
    }
    public void b(int p0){
       super();
       this.B = 0x7f0a302a;
       this.C = new b$a(this);
       this.B = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.E8();
       b tz = this.z;
       if (tz != null) {
          this.y = SlidePlayViewModel.S0(tz.getParentFragment());
       }
       if (this.r != null && this.u.isVideoType()) {
          tz = this.y;
          if (tz != null) {
             tz.P(this.z, this.C);
          }else {
             tz = this.w;
             if (tz != null) {
                tz.add(this.C);
             }
          }
       }
       this.v.getPlayer().w(new e(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       u1.a(this);
       ViewStub viewStub = this.getActivity().findViewById(this.B);
       if (viewStub != null) {
          View view = viewStub.inflate();
          this.r = (view instanceof HostKwaiPlayerDebugInfoView)? view: view.findViewById(this.p);
       }else {
          this.r = this.getActivity().findViewById(this.p);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b ty = this.y;
       if (ty != null) {
          ty.D(this.z, this.C);
       }else {
          ty = this.w;
          if (ty != null) {
             ty.remove(this.C);
          }
       }
       return;
    }
    public String P8(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       b tx = this.x;
       if (tx != null) {
          objArray = tx.get();
       }
       if (objArray != null) {
          obj = obj+"[用户首屏："+objArray.getFirstFrameDurationMs()+"ms]";
       }
       Locale uS = Locale.US;
       Object[] objArray1 = new Object[2];
       String str = (this.u.expectFreeTraffic())? "是": "否";
       objArray1[0] = str;
       objArray1[1] = b.a(-1592356291).b();
       objArray1 = new Object[]{Integer.valueOf((this.v.getPlayer().getRetryCount() - 1))};
       obj = obj+String.format(uS, "[免流:%s][KCardState:%s]", objArray1)+String.format(uS, "[RetryCount:%d]", objArray1);
       if (this.s.enableSlidePlay()) {
          tx = this.t;
          if (tx != null) {
             Object[] objArray2 = new Object[]{Integer.valueOf(tx.N().d())};
             obj = obj+String.format(uS, "[use surface type: %d]", objArray2);
          }
       }
       objArray1 = new Object[]{Boolean.valueOf(this.s.getDetailPlayConfig().usePlayerKitPlayer())};
       objArray1 = new Object[]{Boolean.TRUE};
       return obj+String.format(uS, "[use player kit: %b]", objArray1)+String.format(uS, "[use kpmid: %b]", objArray1);
    }
    public IKwaiMediaPlayer R8(){
       b obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null && obj.getPlayer() != null) {
          return this.v.getPlayer().getIKwaiMediaPlayer();
       }
       return null;
    }
    public String S8(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getPlayer().getRetryDebugInfo();
    }
    public String V8(){
       b obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj != null) {
          return obj.getPhotoId();
       }
       return null;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.texture_view_frame);
       if (viewGroup != null) {
          d uod = c.a(viewGroup);
          this.t = uod;
          this.W7(uod);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.q8(QPhoto.class);
       this.v = this.q8(a.class);
       this.w = this.t8("DETAIL_ATTACH_LISTENERS");
       this.x = this.x8("DETAIL_LOGGER");
       this.z = this.t8("DETAIL_FRAGMENT");
       this.s = this.q8(PhotoDetailParam.class);
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       if (this.A != null) {
          this.X8();
       }
       return;
    }
}
