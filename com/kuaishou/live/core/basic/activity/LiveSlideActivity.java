package com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import jga.e;
import zs5.a;
import ux1.a;
import lnc.r3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kqb.a;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.yxcorp.gifshow.util.t0;
import tkd.b;
import tkd.d;
import ym5.a;
import com.kuaishou.live.core.basic.activity.LiveSlideActivityTablet;
import hka.f;
import lnc.q3;
import jga.c;
import androidx.fragment.app.FragmentActivity;
import f12.d;
import f12.c;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import android.content.Intent;
import android.net.Uri;
import je5.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.KeyEvent;
import java.lang.Boolean;
import k2b.u1;
import com.yxcorp.utility.RomUtils;
import qka.a;
import android.os.Build$VERSION;
import android.view.Window;
import android.app.Activity;
import qka.b;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerWrapperFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import kp3.e;
import java.util.Objects;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;
import d12.d;
import d12.g;
import android.content.res.Configuration;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.l1;
import android.os.Bundle;
import wh5.c;
import e17.i;
import lnc.i5;
import lnc.b5;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import ekd.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import vm5.f;
import za2.r;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.NullPointerException;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$b;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import d12.a;
import ekd.j0;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.yxcorp.gifshow.util.c;
import m02.w1;
import m02.v1;
import android.view.ViewGroup;
import com.kuaishou.live.core.basic.preload.a$b;
import com.kuaishou.live.core.basic.preload.a$a;
import com.kuaishou.live.core.basic.preload.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import r12.g;
import wkd.b;
import ai3.b;
import lm9.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import sf3.g;
import java.lang.Integer;
import rkd.b;
import android.content.IntentFilter;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity$HomeBtnWatcherReceiver;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity$a;
import android.content.Context;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import oe6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;

public class LiveSlideActivity extends GifshowActivity implements e, a, a, r3	// class@001827
{
    public LiveSlideDetailContainerWrapperFragment A;
    public boolean B;
    public long C;
    public BroadcastReceiver D;
    public LiveBizParam E;
    public boolean F;
    public final t0 y;
    public int z;
    public static a G;
    public static boolean H;

    static {
       Object obj = PatchProxy.apply(null, null, e.class, "45");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): a.t().u("SOURCE_LIVE").a("getLiveRoomLimitNumber", 5);
       LiveSlideActivity.G = new a(i);
    }
    public void LiveSlideActivity(){
       super();
       this.y = new t0();
       this.z = -1;
       this.F = false;
    }
    public static Class u3(){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       Object obj = PatchProxy.apply(null, null, liveSlideAct, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a(0x4c5dd1b8).f2()) {
          liveSlideAct = LiveSlideActivityTablet.class;
       }
       return liveSlideAct;
    }
    public void G1(f p0){
       q3.c(this, p0);
    }
    public c G9(){
       LiveStreamFeed obj = PatchProxy.apply(null, this, LiveSlideActivity.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.c(this).N();
       if (obj != null) {
          return b.c(obj);
       }
       return null;
    }
    public String M2(Intent p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveSlideActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.M2(p0);
       if (obj == null && p0.getData() != null) {
          String str = c.a(p0.getData(), "2");
          if (!TextUtils.x(str)) {
             return str;
          }
       }
       return obj;
    }
    public void R(f p0){
       q3.a(this, p0);
    }
    public boolean Y(int p0,KeyEvent p1){
       return q3.b(this, p0, p1);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, liveSlideAct, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveSlideAct, "19") && (!p0.getAction() && p0.getKeyCode() == 4)) {
          u1.K0(9);
       }
    label_002e :
       return super.dispatchKeyEvent(p0);
    }
    public int f(){
       return 7;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, LiveSlideActivity.class, "7")) {
          return;
       }
       if (RomUtils.n() && (a.a() && Build$VERSION.SDK_INT < 28)) {
          b.b(this.getWindow());
       }
    label_0025 :
       LiveSlideActivity tA = this.A;
       if (tA != null) {
          tA.dh();
       }
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveSlideActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, LiveSlideActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getUrl();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public e l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveSlideActivity obj = PatchProxy.apply(objArray, this, LiveSlideActivity.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.A;
       Objects.requireNonNull(obj);
       g og = PatchProxy.apply(objArray, obj, LiveSlideDetailContainerWrapperFragment.class, "6");
       if (og != patchProxyRe) {
       }else {
          og = obj.j.g.c.e;
       }
       return og;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSlideActivity.class, "9")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.A.ch() != null) {
          int i = 1;
          int i1 = l1.a() ^ i;
          if (i1 || !d.a(0x4c5dd1b8).f2()) {
             i = i1;
          }
          this.A.ch().setEnabled(i);
       }
       return;
    }
    public void onCreate(Bundle p0){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveSlideAct, "2")) {
          return;
       }
       super.onCreate(p0);
       if (e.f()) {
          LiveSlideActivity.G.a(this);
       }
       if (!c.d()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          i5.j(this.getWindow(), 0xff000000);
          this.getWindow().addFlags(128);
          Object[] objArray = null;
          boolean b = false;
          if (!PatchProxy.applyVoid(objArray, this, liveSlideAct, "10")) {
             if (b5.a(this)) {
                MultiWindowLayoutUtil.c(this, true);
             }else {
                i.h(this, b, b);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, liveSlideAct, "3")) {
             this.E = LiveBizParam.getBizParamFromIntent(this.getIntent());
             if (f.g(this.getIntent())) {
                if (this.getIntent().getData() != null) {
                   this.E = r.a(this.getIntent().getData());
                }
             }else if(this.E == null){
                if (!SystemUtil.I()) {
                   b.Z(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER, "LiveBizParam is null");
                   this.E = new LiveBizParam();
                }else {
                   throw new NullPointerException("LiveBizParam解析为空，请调用LiveDetailPluginImpl.navigateNewLiveSlidePlay\(GifshowActivity,Intent, int\)方法");
                }
             }
             LiveSlideActivity tE = this.E;
             if (tE.mSlidePlayFeedFlowParam == null) {
                tE.mSlidePlayFeedFlowParam = new LiveSlidePlayFeedFlowParam$b().a();
             }
             LiveSlideActivity tE1 = this.E;
             a.e(this).a = tE1;
             tE1.mIsFromPush = j0.a(this.getIntent(), "kwai_from_push", b);
          }
          this.setVolumeControlStream(3);
          if (this.E.mLiveStyleParams.mIsWindowTranslucent != null) {
             new c(this).a();
          }
          a.e(this, R.layout.arg_RES_7f0d0dc9, null, false, new w1(this), new v1(this));
          if (!PatchProxy.applyVoid(objArray, this, liveSlideAct, "4")) {
             e uoe = this.getSupportFragmentManager().beginTransaction();
             LiveSlideDetailContainerWrapperFragment liveSlideDet = PatchProxy.apply(objArray, objArray, LiveSlideDetailContainerWrapperFragment.class, "1");
             if (liveSlideDet != PatchProxyResult.class) {
             }else {
                liveSlideDet = new LiveSlideDetailContainerWrapperFragment();
             }
             this.A = liveSlideDet;
             uoe.f(R.id.live_slide_container, liveSlideDet);
             uoe.m();
          }
          PageMonitor.INSTANCE.registerPageInfo(this, "LIVE_STREAM");
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSlideActivity.class, "8")) {
          return;
       }
       super.onDestroy();
       if (e.f()) {
          LiveSlideActivity.G.b(this);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, g.class, "4")) {
          b.Z(LiveLogTag.LIVE_PRELOAD, "clearLiveSlideActivityLayout");
          int[] ointArray = new int[]{0x7f0d0dc9};
          a.a(ointArray);
          g.l();
       }
       Objects.requireNonNull(b.a(-1731004515));
       if (this.E != null) {
          d.a(-1638991736).nS(this.E.mLiveAudienceParam);
       }
       g.a(false);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       if (PatchProxy.isSupport(liveSlideAct)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveSlideAct, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (b.d() && this.Y(p0, p1)) {
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveSlideActivity.class, "6")) {
          return;
       }
       this.v3();
       super.onPause();
       this.y.a();
       this.F = true;
       g.a(false);
       return;
    }
    public void onResume(){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveSlideAct, "5")) {
          return;
       }
       super.onResume();
       if (e.f()) {
          LiveSlideActivity.G.c(this);
       }
       this.y.c();
       if (!PatchProxy.applyVoid(objArray, this, liveSlideAct, "16")) {
          this.v3();
          LiveSlideActivity$HomeBtnWatcherReceiver homeBtnWatch = new LiveSlideActivity$HomeBtnWatcherReceiver(objArray);
          this.D = homeBtnWatch;
          UniversalReceiver.e(this, homeBtnWatch, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
       }
       String str = b.m();
       if (!TextUtils.x(str) && !LiveSlideActivity.H) {
          LiveBizParam mSelectedPho = this.E.mSelectedPhoto;
          if (mSelectedPho != null && !(mSelectedPho.getUserId()).equals(QCurrentUser.ME.getId())) {
             i.d(R.style.arg_RES_7f11066a, str);
             LiveSlideActivity.H = true;
          }
       }
       if (this.F != null) {
          this.F = false;
          g.a(true);
       }
       return;
    }
    public void onSaveInstanceState(Bundle p0){
    }
    public void setRequestedOrientation(int p0){
       LiveSlideActivity liveSlideAct = LiveSlideActivity.class;
       if (PatchProxy.isSupport(liveSlideAct) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveSlideAct, "11")) {
          return;
       }
       super.setRequestedOrientation(p0);
       this.z = p0;
       return;
    }
    public int u(){
       return this.z;
    }
    public final void v3(){
       if (PatchProxy.applyVoid(null, this, LiveSlideActivity.class, "17")) {
          return;
       }
       LiveSlideActivity tD = this.D;
       if (tD != null) {
          UniversalReceiver.f(this, tD);
          this.D = null;
       }
       return;
    }
}
