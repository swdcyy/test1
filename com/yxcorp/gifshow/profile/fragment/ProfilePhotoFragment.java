package com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import s1c.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.fragment.PhotoFragmentItemType;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.page.cost.list.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j4c.f0;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.util.List;
import im8.c;
import java.util.Map;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y8c.t;
import android.os.Bundle;
import lnc.g2;
import k3c.k1;
import lnc.g2$a;
import z5c.w2;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import z5c.u2;
import ok.x;
import z5c.t2;
import z5c.s2;
import brd.t;
import com.yxcorp.gifshow.profile.fragment.i;
import erd.r;
import k3c.m1;
import com.yxcorp.gifshow.profile.fragment.h;
import erd.g;
import crd.b;
import q99.a;
import com.yxcorp.gifshow.model.LivePlayConfig;
import lnc.b9;
import w16.l;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import v2c.g;
import y8c.g;
import g9c.a;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.d4;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import k3c.l1;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.trello.rxlifecycle3.components.support.RxFragment;
import eoc.f;
import v1c.m;
import jv6.b;
import com.yxcorp.gifshow.profile.adapter.g;
import qvb.i;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment$a;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;

public class ProfilePhotoFragment extends BaseProfileFeedFragment	// class@001312
{
    public PhotoFragmentItemType Q;
    public g2 R;
    public b S;
    public b T;
    public a U;
    public View U0;
    public List V;
    public g W;
    public View X;
    public View Y;
    public View Z;
    public static final int V0;

    public void ProfilePhotoFragment(){
       super();
       this.V = Lists.b();
    }
    public boolean Dh(){
       return false;
    }
    public void Fc(r0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePhotoFragment.class, "1")) {
          return;
       }
       super.Fc(p0);
       this.Q = PhotoFragmentItemType.getPhotoFragmentItemType(this.K);
       return;
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoFragment.class, "10")) {
          return;
       }
       if (!this.uh()) {
          ProfilePhotoFragment tW = this.W;
          if (tW != null) {
             tW.d();
          }
       }
       return;
    }
    public boolean Jh(){
       Object obj = PatchProxy.apply(null, this, ProfilePhotoFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.uh() && this.i0())? true: false;
       return b;
    }
    public PresenterV2 Kh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfilePhotoFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       this.Q.addOnceBindPresenter(obj);
       obj.U7(new f0());
       PatchProxy.onMethodExit(ProfilePhotoFragment.class, "7");
       return obj;
    }
    public void Lh(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoFragment.class, "11")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       this.G.b.notifyChanged();
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, ProfilePhotoFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.U);
       obj.add(new c("PROFILE_DRAFTS_ACTIVITY_CALLBACK", this.V));
       return obj;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePhotoFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ProfilePhotoFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       r0 obj = PatchProxy.apply(null, this, ProfilePhotoFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(this.G.b.getId()) || TextUtils.n("0", this.G.b.getId())) {
          this.sh().i();
          return false;
       }else {
          obj = this.G.d;
          if (obj.mIsPartOfDetailActivity != null && obj.mIsFullyShown == null) {
             return false;
          }
          return this.Vg().c();
       }
    }
    public void onCreate(Bundle p0){
       Object obj;
       g og;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePhotoFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       this.R = new g2(this, new k1(this));
       BaseProfileFeedFragment tK = this.K;
       w2 ow2 = w2.class;
       if (PatchProxy.isSupport(ow2)) {
          obj = PatchProxy.applyTwoRefs(this, Integer.valueOf(tK), null, ow2, "1");
          if (obj != PatchProxyResult.class) {
          }else {
          label_0036 :
             a.p(this, "lifecycleOwner");
             if (tK != 1) {
                if (tK != 2) {
                   if (tK != 3) {
                      obj = null;
                   }else {
                      og = new g(this, new u2(this));
                   }
                }else {
                   og = new g(this, new t2(this));
                }
             }else {
                og = new g(this, new s2(this));
             }
             obj = og;
          }
       }else {
          goto label_0036 ;
       }
       this.W = obj;
       this.S = this.Vg().j().filter(i.b).subscribe(new m1(this), h.b);
       this.U = new a(this, null, 6);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoFragment.class, "14")) {
          return;
       }
       super.onDestroy();
       ProfilePhotoFragment tU = this.U;
       if (tU != null) {
          tU.a();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfilePhotoFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.S);
       b9.a(this.T);
       return;
    }
    public void onEventMainThread(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePhotoFragment.class, "15")) {
          return;
       }
       g.e(KsLogProfileTag.COMMON.appendTag("ProfilePhotoFragment"), "qphoto update event");
       int i = d4.b(p0.a, this.g7().Q0());
       if (i != -1) {
          this.g7().l0(i);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePhotoFragment.class, "9")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.R.b(this.fg());
       f.c(l.class, new l1(this), this, FragmentEvent.DESTROY_VIEW);
       return;
    }
    public g vh(){
       g og;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, ProfilePhotoFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       obj = (this.K == b)? new m(this.G, this.L, this.U, this.V): new g(this.G, this.L, objArray);
       obj.G0(b);
       obj.p1(b);
       obj.n1("PROFILE_CLICK_TO_NASA_SLIDE_PLAY", Boolean.TRUE);
       obj.n1("PROFILE_CLICK_NEBULA_TO_NASA_SLIDE_PLAY", Boolean.FALSE);
       obj.n1("PAGE_NAME", this.Q.getTabName());
       return obj;
    }
    public i yh(){
       i obj = PatchProxy.apply(null, this, ProfilePhotoFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q.createPageList(this.getUrl(), this.G);
       obj.h(new ProfilePhotoFragment$a(this));
       if (obj instanceof ListReqLifecycle) {
          ProfilePhotoFragment tW = this.W;
          if (tW != null) {
             tW.c(obj);
          }
       }
       return obj;
    }
}
