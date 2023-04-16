package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$mOnDialogDismissListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import u2c.a;
import a3c.a;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$a;
import erd.g;
import z5c.l0;
import crd.b;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$b;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$c;
import j5c.a;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$d;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.ProfileDialogBubbleDispatchPresenter$e;
import java.lang.Runnable;
import ekd.k1;
import java.util.List;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import z5c.o2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import c5c.a;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import t2c.b;
import w2c.a;
import java.util.Set;

public final class ProfileDialogBubbleDispatchPresenter extends PresenterV2	// class@001576
{
    public boolean A;
    public final p B;
    public final String p;
    public List q;
    public c r;
    public a s;
    public RxPageBus t;
    public boolean u;
    public BaseFragment v;
    public Set w;
    public List x;
    public UserProfileResponse y;
    public final p z;

    public void ProfileDialogBubbleDispatchPresenter(){
       super();
       this.p = "ProfileDialogBubbleDispatchPresenter";
       this.x = new ArrayList();
       this.z = s.c(new ProfileDialogBubbleDispatchPresenter$mBubbleShowTask$2(this));
       this.B = s.c(new ProfileDialogBubbleDispatchPresenter$mOnDialogDismissListener$2(this));
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileDialogBubbleDispatchPresenter.class, "4")) {
          return;
       }
       ProfileDialogBubbleDispatchPresenter tt = this.t;
       String str = "mRxPageBus";
       if (tt == null) {
          a.S(str);
       }
       Objects.requireNonNull(tt);
       Object obj = PatchProxy.applyOneRefs("PROFILE_FULL_SHOW", tt, RxPageBus.class, "7");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          a uoa = tt.b.get("PROFILE_FULL_SHOW");
          if (uoa != null) {
             objArray = uoa.a;
          }
       }
       this.u = a.a(objArray, "MAIN_KEY");
       tt = this.r;
       if (tt == null) {
          a.S("mLoadState");
       }
       this.X7(tt.d().subscribe(new ProfileDialogBubbleDispatchPresenter$a(this), l0.a(this.p)));
       if (this.u == null) {
          tt = this.t;
          if (tt == null) {
             a.S(str);
          }
          this.X7(tt.f("PROFILE_FULL_SHOW").map(ProfileDialogBubbleDispatchPresenter$b.b).subscribe(new ProfileDialogBubbleDispatchPresenter$c(this)));
       }
       tt = this.s;
       if (tt == null) {
          a.S("mAppBarScrollState");
       }
       this.X7(tt.b().distinctUntilChanged(ProfileDialogBubbleDispatchPresenter$d.b).subscribe(new ProfileDialogBubbleDispatchPresenter$e(this), l0.a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileDialogBubbleDispatchPresenter.class, "7")) {
          return;
       }
       k1.m(this.P8());
       this.x.clear();
       return;
    }
    public final Runnable P8(){
       Object obj = PatchProxy.apply(null, this, ProfileDialogBubbleDispatchPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final boolean R8(){
       boolean b;
       ProfileDialogBubbleDispatchPresenter obj = PatchProxy.apply(null, this, ProfileDialogBubbleDispatchPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj == null) {
          a.S("mFragment");
       }
       if (o2.c(obj)) {
          obj = this.v;
          if (obj == null) {
             a.S("mFragment");
          }
          b = obj.K0();
       }else {
          b = true;
       }
       return b;
    }
    public final void S8(UserProfileResponse p0){
       ProfileDialogBubbleDispatchPresenter tq;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogBubbleDispatchPresenter.class, "5")) {
          return;
       }
       String str = "mProfileDialogInterceptors";
       if (this.A == null) {
          this.A = true;
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          Collections.sort(tq, new a());
       }
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       Iterator iterator = tq.iterator();
       while (true) {
          if (iterator.hasNext()) {
             b uob = iterator.next();
             a uoa = PatchProxy.apply(null, this, ProfileDialogBubbleDispatchPresenter.class, "2");
             if (uoa == PatchProxyResult.class) {
                uoa = this.B.getValue();
             }
             if (uob.a(p0, uoa)) {
                break ;
             }
          }else {
             this.V8();
             return;
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, ProfileDialogBubbleDispatchPresenter.class, "6")) {
          return;
       }
       k1.m(this.P8());
       k1.r(this.P8(), 0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileDialogBubbleDispatchPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("PROFILE_DIALOG_INTERCEPTOR");
       a.o(obj, "inject\(ProfileCommonAcce¡­OFILE_DIALOG_INTERCEPTOR\)");
       this.q = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.r = obj;
       obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.v = obj;
       obj = this.r8("PROFILE_BUBBLE_SHOW_TASK_LIST");
       a.o(obj, "inject\(ProfileCommonAcce¡­LE_BUBBLE_SHOW_TASK_LIST\)");
       this.w = obj;
       obj = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_APP_BAR_SCROLL_STATE\)");
       this.s = obj;
       obj = this.r8("PROFILE_PAGE_RXBUS");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_PAGE_RXBUS\)");
       this.t = obj;
       return;
    }
}
