package com.yxcorp.gifshow.ad.detail.presenter.side.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.side.k$a;
import com.yxcorp.gifshow.ad.detail.presenter.side.k$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import g19.e0;
import erd.g;
import crd.b;
import vy6.a;
import jta.c;
import g19.l;
import g19.d0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.HashMap;
import w85.a;
import com.yxcorp.utility.Log;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.ad.detail.presenter.side.k$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class k extends PresenterV2	// class@0016b3
{
    public final c A;
    public String p;
    public ViewStubInflater2 q;
    public QPhoto r;
    public a s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public l v;
    public t w;
    public boolean x;
    public HashMap y;
    public final a z;

    public void k(){
       super();
       this.p = "SlidePlayGlobalPokePresenter";
       this.x = false;
       this.z = new k$a(this);
       this.A = new k$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.u = SlidePlayViewModel.B0(this.t.getParentFragment());
       this.X7(this.r.getUser().observable().subscribe(new e0(this)));
       this.u.P(this.t, this.z);
       this.v.a(this.A);
       this.X7(this.w.subscribe(new d0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.v.c(this.A);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && (this.r.getUser() != null && this.r.getUser().isFollowingOrFollowRequesting()))? true: false;
       return b;
    }
    public void R8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "5")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       if (p0) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String obj = PatchProxy.apply(null, this, ok, "9");
          if (obj != patchProxyRe) {
             patchProxyRe = obj.booleanValue();
          }else {
             obj = this.r.getUserId();
             Object obj1 = PatchProxy.applyOneRefs(obj, this, ok, "11");
             patchProxyRe = (obj1 != patchProxyRe)? obj1.booleanValue(): Boolean.TRUE.equals(this.y.get(obj));
             if (this.P8() && (patchProxyRe && this.s.f())) {
                patchProxyRe = true;
             }else {
                patchProxyRe = false;
             }
          }
          if (patchProxyRe) {
             if (this.t.getParentFragment() == null) {
                Log.g(this.p, "Parent == null");
                return;
             }else {
                this.q.d(this.t.getParentFragment().getView());
                this.q.g(true);
                this.q.a().setOnClickListener(new k$c(this));
             }
          }else {
             this.q.g(false);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = new ViewStubInflater2(0x7f0a10c8, 0x7f0a10c7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(a.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.v = this.r8("NASA_SIDEBAR_STATUS");
       this.y = this.r8("SLIDE_PLAY_GOLBAL_POKE_MAP");
       this.w = this.r8("SLIDE_PLAY_FOLLOW_ANIM_STATUS_OBSERVABLE");
       return;
    }
}
