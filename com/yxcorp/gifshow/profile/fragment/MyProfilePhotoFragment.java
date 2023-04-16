package com.yxcorp.gifshow.profile.fragment.MyProfilePhotoFragment;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import y8c.t;
import z5c.k0;
import androidx.fragment.app.Fragment;
import z5c.o2;
import fx5.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import k3c.d1;
import lkd.b;
import k3c.a1;
import k3c.z0;
import android.content.res.Resources;
import java.lang.CharSequence;
import l3c.a0;
import k3c.b1;
import s1c.a;
import k3c.y0;
import com.yxcorp.gifshow.profile.fragment.b;
import k3c.c1;
import com.yxcorp.gifshow.profile.fragment.c;
import k3c.x0;
import k3c.w0;
import k3c.t0;
import android.view.View$OnClickListener;
import k3c.e1;
import dx5.d;
import com.yxcorp.gifshow.profile.fragment.e;
import com.kwai.framework.model.user.User;
import z5c.d3;
import com.yxcorp.gifshow.profile.presenter.MyProfileOverduePhotoTipPresenter;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import java.lang.Boolean;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.util.a;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.fragment.d;
import erd.g;
import crd.b;
import lnc.b9;
import y8c.g;
import g9c.a;
import com.kwai.feature.api.social.profile.model.ProfileDraftsFeed;

public class MyProfilePhotoFragment extends ProfilePhotoFragment	// class@001309
{
    public boolean W0;
    public b X0;
    public b Y0;
    public static final int Z0;

    public void MyProfilePhotoFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, MyProfilePhotoFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       this.Q.addMyPresenter(obj, this.G);
       PatchProxy.onMethodExit(MyProfilePhotoFragment.class, "19");
       return obj;
    }
    public t Bh(){
       h oh;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, this, MyProfilePhotoFragment.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0x7f103f73;
       if (k0.c()) {
          obj = PatchProxy.apply(objArray, this, MyProfilePhotoFragment.class, "10");
          if (obj != patchProxyRe) {
          }else {
             boolean b = true;
             if (this.K != b || !o2.c(this)) {
                b = false;
             }
             oh = new h(this, this.G.d);
             oh.d(new d1(this, b));
             oh.c(new a1(this));
             oh.f(new z0(this));
             oh.h(this.getResources().getString(i));
             a0 uoa0 = new a0(oh);
             uoa0.B(new b1(this));
             if (b) {
                uoa0.J(this.G.e);
                uoa0.z(new y0(this));
                uoa0.o = b.a;
                uoa0.y(new c1(this, oh));
             }
             uoa0.G(c.a);
             obj = uoa0;
          }
          return obj;
       }else {
          obj = PatchProxy.apply(objArray, this, MyProfilePhotoFragment.class, "9");
          if (obj != patchProxyRe) {
          }else {
             oh = new h(this, this.G.d);
             Resources resources = this.getResources();
             if (this.G.c == 19) {
                i = 0x7f10024e;
             }
             oh.f(new x0(this));
             oh.c(new w0(this));
             oh.b(new t0(this));
             oh.h(resources.getString(i));
             oh.j(new e1(this));
             obj = new a0(oh);
             obj.G(e.a);
          }
          return obj;
       }
    }
    public void Gh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MyProfilePhotoFragment.class, "20")) {
          return;
       }
       if (this.K == 1 && d3.a(this.G.b)) {
          p0.U7(new MyProfileOverduePhotoTipPresenter());
          p0.U7(new MyProfilePostRecoTipsPresenter());
       }
       super.Gh(p0);
       PatchProxy.onMethodExit(MyProfilePhotoFragment.class, "20");
       return;
    }
    public boolean Jh(){
       Object obj = PatchProxy.apply(null, this, MyProfilePhotoFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.W0 != null || super.Jh())? true: false;
       return b;
    }
    public void Lh(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoFragment.class, "7")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       super.Lh();
       if (this.G.b.isBanned()) {
          this.q().clear();
       }
       return;
    }
    public final boolean Mh(QPhoto p0,int p1){
       if (PatchProxy.isSupport(MyProfilePhotoFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, MyProfilePhotoFragment.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.G.c != p1) {
          return false;
       }else {
          List items = this.q().getItems();
          if (items.contains(p0)) {
             return false;
          }else {
             int i = 0;
             while (true) {
                if (i < items.size()) {
                   QPhoto qPhoto = items.get(i);
                   if (qPhoto != null && (!TextUtils.x(qPhoto.getPhotoId()) && (!w.F0(qPhoto.getEntity()) && (qPhoto.created() - p0.created() < 0 && (!this.q().isEmpty() && this.q().getCount() >= i))))) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else if(!this.q().isEmpty()){
                   this.q().add(p0);
                   return true;
                }else {
                   return false;
                }
             }
             this.q().add(i, p0);
             return true;
          }
       }
    }
    public final void Nh(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoFragment.class, "17")) {
          return;
       }
       if (this.Vg().a()) {
          this.h0().scrollToPosition(0);
          this.a();
       }else {
          this.W0 = true;
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoFragment.class, "6")) {
          return;
       }
       this.W0 = false;
       BaseProfileFeedFragment tG = this.G;
       if (tG != null) {
          r0 d = tG.d;
          if (d != null && a.b(d.mUserProfile)) {
             d = this.G.e;
             if (d != null) {
                a d1 = d.d;
                if (d1 != null) {
                   d1.b("PROFILE_REFRESH", "MAIN_KEY", ProfileRefreshStatus.PROFILE);
                }
             }
          }
       }
       super.a();
       return;
    }
    public int f(){
       r0 d = this.G.d;
       if (d != null) {
          ProfileParam mPhotoTabId = d.mPhotoTabId;
          if (mPhotoTabId != 1) {
             if (mPhotoTabId != 3) {
                if (mPhotoTabId == 19) {
                   return 283;
                }
             }else {
                return 42;
             }
          }else {
             return -1;
          }
       }
       return 0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MyProfilePhotoFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MyProfilePhotoFragment.class, null);
       return objectsByTag;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MyProfilePhotoFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.X0 = RxBus.f.f(f.class).observeOn(d.a).subscribe(new d(this));
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoFragment.class, "2")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.X0);
       b9.a(this.Y0);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoFragment.class, "4")) {
          return;
       }
       super.onResume();
       if (this.W0 != null && this.i0()) {
          this.h0().scrollToPosition(0);
          this.a();
       }
       return;
    }
    public boolean uh(){
       g obj = PatchProxy.apply(null, this, MyProfilePhotoFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.K != b) {
          return super.uh();
       }
       obj = this.g7();
       if (obj.R0()) {
          return b;
       }
       if (obj.getItemCount() != b || !obj.N0(0).getEntity() instanceof ProfileDraftsFeed) {
          b = false;
       }
       return b;
    }
}
