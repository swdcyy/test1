package com.kuaishou.recruit.krn.RecruitTabKrnFragment;
import wq6.k;
import eb5.g;
import on5.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import on5.e;
import brd.t;
import eb5.f;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fr6.a;
import wq6.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import xa5.a;
import cb5.g;
import im8.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.krn.model.LaunchModel;
import android.net.Uri;
import ekd.x0;
import at6.a;
import rs6.f;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import bt4.b;
import lkd.b;
import bt4.a;
import ps6.e;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import bt4.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import bt4.d;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.Boolean;
import js6.a;
import wq6.d;

public class RecruitTabKrnFragment extends LazyInitSupportedFragment implements k, g, f	// class@000eaf
{
    public Fragment s;
    public int t;
    public PresenterV2 u;
    public String v;
    public String w;
    public static final int x;

    public void RecruitTabKrnFragment(){
       super();
       this.t = 1;
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       e.h(this);
    }
    public void N1(){
       e.j(this);
    }
    public t Ra(){
       return f.b(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String X3(){
       return "home";
    }
    public boolean Xg(){
       return false;
    }
    public void Yg(){
       if (PatchProxy.applyVoid(null, this, RecruitTabKrnFragment.class, "5")) {
          return;
       }
       b.P(LiveLogTag.LIVE_RECRUIT.appendTag("RecruitTabKrnFragment"), "logPageShowSuccess");
       super.Yg();
       return;
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecruitTabKrnFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0028, p1, false);
    }
    public void fh(View p0,Bundle p1){
       LiveLogTag lIVE_RECRUIT;
       LiveLogTag liveLogTag;
       Fragment uFragment;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecruitTabKrnFragment.class, "3")) {
          return;
       }
       this.w = QCurrentUser.me().getId();
       String str = "7";
       Object[] objArray = null;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, RecruitTabKrnFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          if (a.a(this)) {
             presenterV2.U7(new g(this));
          }
          PatchProxy.onMethodExit(RecruitTabKrnFragment.class, str);
       }
       this.u = presenterV2;
       presenterV2.f(p0);
       Object[] objArray1 = new Object[]{this,new c("FRAGMENT", this)};
       int i = 0;
       this.u.i(objArray1);
       if (!TextUtils.isEmpty(this.v) && !PatchProxy.applyVoid(objArray, this, RecruitTabKrnFragment.class, "8")) {
          RecruitTabKrnFragment tv = this.v;
          objArray1 = PatchProxy.applyOneRefs(tv, this, RecruitTabKrnFragment.class, "14");
          if (objArray1 != patchProxyRe) {
             objArray = objArray1;
          }else {
             Uri uri = x0.f(tv);
             if (uri != null) {
                objArray = a.a(uri);
             }
          }
          String str1 = "RecruitTabKrnFragment";
          if (objArray == null) {
             lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
             lIVE_RECRUIT.appendTag(str1);
             liveLogTag = lIVE_RECRUIT;
             b.S(liveLogTag, "replaceFragment launchModel == null!", "mTabJumpUrl", this.v);
          }else if(f.b().d(objArray)){
             lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
             lIVE_RECRUIT.appendTag(str1);
             liveLogTag = lIVE_RECRUIT;
             b.S(liveLogTag, "replaceFragment getWebViewFragment", "WebUrl", objArray.c());
             uFragment = this.mh(objArray.c());
          }else {
             objArray1 = PatchProxy.applyOneRefs(objArray, this, RecruitTabKrnFragment.class, "10");
             if (objArray1 != patchProxyRe) {
                uFragment = objArray1;
             }else {
                objArray.g().putString("degradeType", "1");
                objArray.g().putBoolean("enableBackBtnHandler", i);
                objArray.g().putString("containerSource", str1);
                uFragment = KwaiRnTab.dh(objArray);
                uFragment.mg(1);
                uFragment.G = true;
                uFragment.ba(new b(this));
                uFragment.ah(new a(this, objArray));
             }
          }
          this.nh(uFragment);
       }
       if (this.getActivity() != null) {
          this.t = this.getActivity().getRequestedOrientation();
       }
       this.a6();
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       this.Vg().f().compose(c.c(this.m(), dESTROY_VIEW)).delay(2, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(this), Functions.d());
       this.Vg().f().compose(c.c(this.m(), dESTROY_VIEW)).subscribe(new d(this), Functions.d());
       return;
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean kf(){
       return true;
    }
    public boolean lh(){
       return true;
    }
    public final Fragment mh(String p0){
       KwaiYodaWebViewFragment obj = PatchProxy.applyOneRefs(p0, this, RecruitTabKrnFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiYodaWebViewFragment();
       Bundle uBundle = new Bundle();
       uBundle.putString("KEY_URL", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public final void nh(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecruitTabKrnFragment.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.s = p0;
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, p0);
       uoe.m();
       return;
    }
    public String o(){
       return "FIND_JOB_TAB_KRN";
    }
    public boolean o3(){
       RecruitTabKrnFragment obj = PatchProxy.apply(null, this, RecruitTabKrnFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj == null) {
          return false;
       }
       a.b.X8(obj, "recruitTabRefresh", null);
       return true;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RecruitTabKrnFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       RecruitTabKrnFragment tu = this.u;
       if (tu != null) {
          tu.destroy();
          this.u = null;
       }
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public d z5(){
       return j.c(this);
    }
}
