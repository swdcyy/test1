package com.yxcorp.gifshow.activity.share.ShareActivity;
import x26.a;
import ml8.d;
import c35.i;
import c35.c;
import p16.a;
import im8.g;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import ow8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import ow8.b;
import el.a;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.util.HashMap;
import xw8.d;
import crd.a;
import com.yxcorp.gifshow.activity.share.viewbinder.AbsShareActivityViewBinder;
import android.app.Activity;
import lnc.b5;
import com.yxcorp.utility.RomUtils;
import android.view.View;
import ekd.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.p0;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.custom.b;
import com.yxcorp.gifshow.activity.share.presenter.f1;
import zw8.i2;
import com.yxcorp.gifshow.activity.share.presenter.j0;
import java.lang.Boolean;
import lq.i;
import com.yxcorp.gifshow.activity.share.presenter.r0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zw8.p1;
import com.yxcorp.gifshow.activity.share.presenter.g1;
import com.yxcorp.gifshow.activity.share.presenter.o;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import zw8.x5;
import xf6.l;
import zw8.n1;
import com.yxcorp.gifshow.activity.share.presenter.h0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.MiniAppBusinessArg;
import ww8.a;
import com.yxcorp.gifshow.model.config.CoCreatorConfig;
import zw8.r0;
import ax8.e;
import ax8.f;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import oa0.a;
import zw8.s0;
import bx8.k;
import com.yxcorp.gifshow.activity.share.presenter.v0;
import com.yxcorp.gifshow.activity.share.presenter.y1;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.activity.share.presenter.n1;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import zw8.c1;
import zw8.q1;
import com.yxcorp.gifshow.activity.share.presenter.n;
import com.yxcorp.gifshow.activity.share.presenter.c2;
import zw8.w0;
import com.yxcorp.gifshow.activity.share.presenter.a2;
import com.yxcorp.gifshow.activity.share.presenter.m0;
import com.yxcorp.gifshow.activity.share.presenter.f2;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import com.yxcorp.gifshow.activity.share.presenter.l;
import gq.a;
import com.yxcorp.gifshow.activity.share.presenter.j;
import lnc.ta;
import com.yxcorp.gifshow.activity.share.presenter.c3;
import tkd.b;
import tkd.d;
import w26.a;
import w26.c;
import android.view.Window;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import mba.m0;
import kuaishou.perf.page.impl.d;
import xw8.p0;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Integer;
import android.content.Intent;
import q46.t;
import qxc.c;
import kw8.l;
import java.util.Map;
import ekd.j0;
import bba.b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import wba.f0;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.FriendVisiableInfo;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import zf6.l;
import java.util.Set;
import xw8.p0$a;
import hka.a;
import android.content.res.Configuration;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;
import wh5.c;
import e17.i;
import ekd.k1;
import java.lang.System;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import android.widget.FrameLayout;
import km8.b;
import android.content.SharedPreferences;
import k2b.e0;
import k2b.u1;
import lq.e;
import lq.a;
import brd.t;
import kw8.c;
import com.yxcorp.gifshow.activity.share.b;
import erd.g;
import crd.b;
import gx8.e;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.activity.share.util.PublishFunnel$funnelEnter$1;
import msd.l;
import com.kuaishou.ax2c.PreLoader;
import ow8.a;
import lnc.r5;
import androidx.fragment.app.FragmentActivity;
import h69.j;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import voc.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public class ShareActivity extends BasePostActivity implements a, d, i, c, a, g	// class@00136b
{
    public SharedPreferences O;
    public GifshowActivity P;
    public PublishPageSetting Q;
    public List R;
    public Map S;
    public boolean T;
    public AttrAnimProgressFragment U;
    public String U0;
    public PresenterV2 V;
    public Configuration V0;
    public d W;
    public long X;
    public long Y;
    public a Z;
    public static final int W0;

    public void ShareActivity(){
       super();
       this.P = this;
       this.Q = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting());
       Object[] objArray = null;
       ArrayList uArrayList = PatchProxy.apply(objArray, objArray, c.class, "14");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          List value = a.t().getValue("PublishPageShareOptions", new b().getType(), objArray);
          ArrayList uArrayList1 = new ArrayList();
          if (!q.f(value)) {
             Iterator iterator = value.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                PublishPageShareOption wECHAT_SESSI = PublishPageShareOption.WECHAT_SESSION;
                if (str.equals(wECHAT_SESSI.getKSwitch())) {
                   uArrayList1.add(wECHAT_SESSI);
                }else {
                   wECHAT_SESSI = PublishPageShareOption.WECHAT_TIMELINE;
                   if (str.equals(wECHAT_SESSI.getKSwitch())) {
                      uArrayList1.add(wECHAT_SESSI);
                   }else {
                      wECHAT_SESSI = PublishPageShareOption.QQ_FRIEND;
                      if (str.equals(wECHAT_SESSI.getKSwitch())) {
                         uArrayList1.add(wECHAT_SESSI);
                      }else {
                         wECHAT_SESSI = PublishPageShareOption.QQ_ZONE;
                         if (str.equals(wECHAT_SESSI.getKSwitch())) {
                            uArrayList1.add(wECHAT_SESSI);
                         }else {
                            wECHAT_SESSI = PublishPageShareOption.WEIBO;
                            if (str.equals(wECHAT_SESSI.getKSwitch())) {
                               uArrayList1.add(wECHAT_SESSI);
                            }else {
                               wECHAT_SESSI = PublishPageShareOption.MOMENT;
                               if (str.equals(wECHAT_SESSI.getKSwitch())) {
                                  uArrayList1.add(wECHAT_SESSI);
                               }
                            }
                         }
                      }
                   }
                }
             }
             value = c.k(a1.c());
             int i = 0;
             while (i < uArrayList1.size()) {
                if (!value.contains(uArrayList1.get(i).getKwaiOp())) {
                   uArrayList1.remove(i);
                   i = i - 1;
                }
                i = i + 1;
             }
          }
          uArrayList = uArrayList1;
       }
       this.R = uArrayList;
       this.S = new HashMap();
       this.T = false;
       this.W = new d();
       this.Z = new a();
       return;
    }
    public String E7(){
       return "SharePage";
    }
    public AbsShareActivityViewBinder G3(){
       return this.I;
    }
    public final void H3(){
       if (PatchProxy.applyVoid(null, this, ShareActivity.class, "4")) {
          return;
       }
       if (b5.a(this) && !RomUtils.q()) {
          this.findViewById(0x1020002).setPadding(0, 0, 0, 0);
       }else {
          i.i(this, 0, this.isDarkImmersiveMode(), 0);
       }
       return;
    }
    public final void I3(){
       boolean b;
       boolean b1;
       boolean b2;
       ShareActivity shareActivit1;
       ShareActivity shareActivit2;
       d f;
       PostArguments postArgument;
       ShareActivity shareActivit = ShareActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, shareActivit, "9")) {
          return;
       }
       this.V = new PresenterV2();
       d g = this.W.g;
       if (g != null) {
          b = (g.T0() == Workspace$Source.JUXING)? true: false;
          b1 = p0.a(this.W.g.T0());
       }else {
          b = false;
          b1 = false;
       }
       Object[] objArray1 = new Object[0];
       a.b().w("ShareActivity", "initCorePresenters: isJuXing="+b, objArray1);
       if (!b) {
          this.V.U7(new b());
       }
       this.V.U7(new f1());
       this.V.U7(new i2());
       this.V.U7(new j0());
       Object obj = PatchProxy.apply(objArray, this, shareActivit, "10");
       String str = "FEED_PAGE";
       if (obj != PatchProxyResult.class) {
          b2 = obj.booleanValue();
       }else if(!str.equalsIgnoreCase(this.W.m) && (i.h() && i.m().B())){
          b2 = true;
       }else {
          b2 = false;
       }
       if (b2) {
          this.V.U7(new r0());
       }
       if (!str.equals(this.W.m)) {
          if (!TextUtils.x(this.W.C)) {
             this.V.U7(new p1());
          }
          if (!b) {
             this.V.U7(new g1());
             this.V.U7(new o());
             if (PostExperimentUtils.O()) {
                this.V.U7(new x5());
             }
          }
          if (l.c("key_share_encode_end", 0)) {
             this.V.U7(new n1());
          }
          this.V.U7(new h0());
       }
       b2 = str.equalsIgnoreCase(this.W.m);
       ShareActivity tW = this.W;
       boolean b3 = DraftUtils.O(tW.D, tW.g);
       if (i.h() && i.g().getMiniAppBusinessInfo().isValid()) {
          this.V.U7(new a());
          shareActivit1 = 1;
       }else {
          shareActivit1 = null;
       }
       if (!b && (!b1 && (!b2 && PostExperimentUtils.g0().mShowCoCreateEntrance != null))) {
          this.V.U7(new r0());
       }
    label_0162 :
       if (!b && (!shareActivit1 && (!b1 && this.J3()))) {
          this.V.U7(new e(this.W.G, b2));
       }
    label_017c :
       String str1 = "ShowRelatedTrendingEntrance2";
       if (a.a().c()) {
          if (!g.N0()) {
             if (f.a(str1) && a.w()) {
             label_019c :
                shareActivit2 = 1;
             label_01b4 :
                if (shareActivit2) {
                   shareActivit2 = this.V;
                   f = this.W.F;
                   b3 = (b2 || b3)? true: false;
                   shareActivit2.U7(new s0(f, b3));
                }
                if (c.s() && !b2) {
                   this.V.U7(new v0());
                }
                this.V.U7(new y1());
                shareActivit2 = this.W;
                if (c.q(c.i(shareActivit2.g, shareActivit2.D), c.f(this.W.g))) {
                   this.T = false;
                   this.V.U7(new n1());
                }else {
                   this.T = true;
                   this.V.U7(new m2());
                }
                if (PostExperimentUtils.y1()) {
                   this.V.U7(new ShareHintTextPresenter());
                }
                str1 = "enableTitleAutoPaste";
                if (a.a().c()) {
                   if (g.B0() > 0) {
                      postArgument = (g.B0() == 2)? 1: null;
                   }else {
                      postArgument = f.a(str1);
                   }
                }else {
                   postArgument = f.a(str1);
                }
                if (postArgument && !i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
                   this.V.U7(new c1());
                }
                if (PostExperimentUtils.A1() || PostExperimentUtils.y1()) {
                   this.V.U7(new q1());
                }
                this.V.U7(new n());
                this.V.U7(new c2());
                if (PostExperimentUtils.y1()) {
                   this.V.U7(new w0());
                }
                if (!i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
                   this.V.U7(new a2());
                   if (!PostExperimentUtils.y1()) {
                      this.V.U7(new m0());
                   }
                   if (this.Q.mBadTopicNoticeOn != null) {
                      this.V.U7(new f2());
                   }
                }
                this.V.U7(new c1());
                this.V.U7(new w2());
                this.V.U7(new o());
                this.V.U7(new l());
                if (l.c("key_enable_publish_rule_tip", 0)) {
                   Object[] objArray2 = new Object[0];
                   a.D().w("PostExperimentUtils", "isEnablePublishRuleTip: debug enable", objArray2);
                   shareActivit2 = 1;
                }else {
                   b = f.a("enableLogoTipAdr");
                }
                if (shareActivit2) {
                   this.V.U7(new j());
                }
                if (ta.a()) {
                   this.V.U7(new c3());
                }
                d.a(0x27e26f6e).xU(this.V);
                if (PostExperimentUtils.H0()) {
                   this.V.f(this.getWindow().getDecorView().findViewWithTag("sharelayout_root_tag"));
                }else {
                   this.V.f(this.findViewById(R.id.publish_view));
                }
                if (!PatchProxy.applyVoid(objArray, this, shareActivit, "11")) {
                   objArray = new Object[0];
                   a.b().w("EditCost", "realBind", objArray);
                   d g1 = this.W.g;
                   if (g1 != null) {
                      g1.u().q(0);
                   }
                   objArray = new Object[]{this,this.W};
                   this.V.i(objArray);
                   d.d("postEditNextMonitor").h("createToRenderFinish");
                   d.d("postEditNextMonitor").c();
                }
                return;
             }
          }else if(g.N0() != 1){
             goto label_019c ;
          }
       }else if(f.a(str1) && a.w()){
          goto label_019c ;
       }
       shareActivit2 = null;
       goto label_01b4 ;
    }
    public final boolean J3(){
       boolean b = (this.W.k.z == null)? true: false;
       return b;
    }
    public final void K3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareActivity.class, "25")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.b().w("ShareActivity", "onFinish\(\) private", objArray1);
       ShareActivity tW = this.W;
       if (tW != null) {
          d k = tW.k;
          if (k != null) {
             Objects.requireNonNull(k);
             if (!PatchProxy.applyVoid(objArray, k, p0.class, "13")) {
                k.h.onNext(new Object());
             }
          }
       }
       return;
    }
    public int M(){
       return 1;
    }
    public IViewBinder O1(){
       return this.G3();
    }
    public int P2(){
       return 1;
    }
    public IViewBinder V5(int p0){
       AbsShareActivityViewBinder uAbsShareAct;
       ShareActivity shareActivit = ShareActivity.class;
       if (PatchProxy.isSupport(shareActivit)) {
          uAbsShareAct = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, shareActivit, "27");
          if (uAbsShareAct != PatchProxyResult.class) {
          label_0025 :
             return uAbsShareAct;
          }
       }
       uAbsShareAct = c.a(t.c(this.getIntent()), AbsShareActivityViewBinder.class, this);
       goto label_0025 ;
    }
    public void doBindView(View p0){
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, ShareActivity.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareActivity", "onFinish\(\)", objArray);
       this.K3();
       super.finish();
       return;
    }
    public void finishAffinity(){
       if (PatchProxy.applyVoid(null, this, ShareActivity.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareActivity", "finishAffinity\(\)", objArray);
       this.K3();
       super.finishAffinity();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareActivity.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ShareActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ShareActivity.class, new l());
       }else {
          obj.put(ShareActivity.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 43;
    }
    public String getPageParams(){
       d g;
       boolean b1;
       ShareActivity shareActivit = ShareActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, shareActivit, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "task_id="+j0.f(this.getIntent(), "photo_task_id");
       ShareActivity tW = this.W;
       if (tW != null) {
          g = tW.g;
          if (g != null && g.T0() == Workspace$Source.ANNUAL_ALBUM_MOVIE) {
             obj = obj+"&activity=MEMORY_2019";
          }
       }
       String obj1 = PatchProxy.apply(objArray, this, shareActivit, "5");
       g = 1;
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          d g1 = this.W.g;
          b1 = (g1 != null && (g1.a1() == Workspace$Type.KTV_MV || this.W.g.a1() == Workspace$Type.KTV_SONG))? true: false;
       }
       obj1 = (b1)? obj+"&edit_photo_type=karaoke": obj+"&edit_photo_type=normal";
       obj1 = obj1+"&is_reedit="+("FEED_PAGE").equalsIgnoreCase(this.W.m);
       if (!TextUtils.x(this.U0)) {
          obj1 = obj1+"&activity="+this.U0;
       }
       ShareActivity tW1 = this.W;
       if (tW1 != null && tW1.g != null) {
          obj = obj1+"&edit_visible=";
          PhotoVisibility photoVisibil = f0.a(this.W.g.Q0());
          b uob = this.W.g.Q0();
          Object obj2 = PatchProxy.applyOneRefs(uob, objArray, f0.class, "3");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(uob == null){
             Publish publish = uob.v();
             if (publish != null) {
                if (publish.getFriendVisiableInfo() == null || publish.getFriendVisiableInfo().getType() != FriendVisiableInfo$Type.INTIMATE) {
                   g = 0;
                }
                b = g;
             }
          }
          obj1 = obj+f0.c(photoVisibil, b);
       }
       return obj1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ShareActivity.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0;
    }
    public String getUrl(){
       StringBuilder obj = PatchProxy.apply(null, this, ShareActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ks://share";
       ShareActivity tW = this.W;
       if (tW != null && !TextUtils.x(tW.b)) {
          obj = obj+"/"+this.W.b;
       }
       return obj;
    }
    public boolean isDarkImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, ShareActivity.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.r();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ShareActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ShareActivity.class, "21")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       ShareActivity tW = this.W;
       if (tW == null) {
          return;
       }
       Iterator iterator = tW.k.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, ShareActivity.class, "15")) {
          return;
       }
       Iterator iterator = this.W.k.t.iterator();
       do {
       } while (!iterator.hasNext() || iterator.next().onBackPressed());
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareActivity.class, "20")) {
          return;
       }
       ShareActivity tW = this.W;
       if (tW != null && tW.k != null) {
          tW = this.V0;
          if (tW != null) {
             this.V0 = new Configuration(p0);
             d k = this.W.k;
             Integer integer = Integer.valueOf(tW.diff(p0));
             Objects.requireNonNull(k);
             if (!PatchProxy.applyVoidOneRefs(integer, k, p0.class, "10")) {
                k.f.onNext(integer);
             }
          }else {
             this.V0 = new Configuration(p0);
          }
       }
       try{
          super.onConfigurationChanged(p0);
       }catch(java.lang.Exception e5){
          PostUtils.D("ShareActivity", "onConfigurationChanged", e5);
       }
       return;
    }
    public void onCreate(Bundle p0){
       long l;
       int i;
       e a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareActivity.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       if (!c.g()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          d.d("postEditNextMonitor").h("pauseToCreate");
          d.d("postEditNextMonitor").g("createToRenderFinish");
          this.Y = k1.i();
          if (this.getIntent() != null) {
             l = System.currentTimeMillis();
             long l1 = 0;
             long l2 = j0.c(this.getIntent(), "START_SHARE_ACTIVITY_TIME", l1);
             if (l2 - l1 > 0 && l - l2 > 0) {
                this.X = l - l2;
             }
          }
          String str = "time_tag";
          a.f.a().b(PostCommonBiz.PUBLISH, str, "onCreate timeCost: "+this.X);
          l = k1.i();
          i = 0x7f0d1505;
          if (PostExperimentUtils.H0()) {
             FrameLayout uFrameLayout = new FrameLayout(this);
             uFrameLayout.setTag("sharelayout_root_tag");
             uFrameLayout.addView(BasePostActivity.C3(this, i));
             this.setContentView(uFrameLayout);
          }else {
             this.setContentView(i);
          }
          Object[] objArray = new Object[0];
          a.b().s(str, "onCreate setContentView timeElapse time: "+k1.t(l), objArray);
          this.doBindView(this.getWindow().getDecorView());
          this.O = b.c(a.w, 0);
          u1.L0(this);
          this.U0 = i.m().k().b();
          this.Z.c(i.m().p().init().subscribe(new c(this), b.b));
          Object[] objArray1 = new Object[0];
          a.b().s(str, "onCreate initCorePresenters timeCost: "+k1.t(k1.i()), objArray1);
          this.H3();
          a = e.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, e.class, "1")) {
             PostFunnelManager.j.a().d().l(PublishFunnel$funnelEnter$1.INSTANCE);
          }
          this.V0 = this.getResources().getConfiguration();
          return;
       }
    }
    public void onDestroy(){
       ShareActivity shareActivit = ShareActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, shareActivit, "18")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.b().w("ShareActivity", "onDestroy\(\) ", objArray1);
       this.Z.dispose();
       ShareActivity tV = this.V;
       if (tV != null) {
          tV.destroy();
       }
       if (!PatchProxy.applyVoid(objArray, this, shareActivit, "19")) {
          shareActivit = this.W;
          if (shareActivit != null) {
             d g = shareActivit.G;
             if (g != null) {
                if (!PatchProxy.applyVoid(objArray, g, f.class, "3")) {
                   g.b.dispose();
                }
                this.W.G = objArray;
             }
          }
       }
       this.W = objArray;
       super.onDestroy();
       if (PostExperimentUtils.H0()) {
          PreLoader.getInstance().clear(new int[6]{R.layout.share_v2,0x7f0d14f5,R.layout.share_edit_immutable_layout,0x7f0d14e5,R.layout.share_photos_preview_container_v2,0x7f0d14f9});
       }
       if (!this.isChangingConfigurations()) {
          Intent intent = this.getIntent();
          if (!PatchProxy.applyVoidTwoRefsWithListener(this, intent, objArray, a.class, "2")) {
             String str = j0.f(intent, "encode_request_key");
             if (!TextUtils.x(str)) {
                r5.b().d(str);
             }
             PatchProxy.onMethodExit(a.class, "2");
          }
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       ShareActivity shareActivit = ShareActivity.class;
       if (PatchProxy.isSupport(shareActivit) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, shareActivit, "22")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.H3();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ShareActivity.class, "17")) {
          return;
       }
       super.onPause();
       ShareActivity tW = this.W;
       if (tW != null) {
          d k = tW.k;
          if (k != null) {
             k.j(true);
          }
       }
       return;
    }
    public void onResume(){
       long l = this;
       if (PatchProxy.applyVoid(null, l, ShareActivity.class, "16")) {
          return;
       }
       super.onResume();
       long l1 = k1.i();
       ShareActivity w = l.W;
       if (w != null && j.j(w.g)) {
          MemoryLogger.d("enterPublish", l.W.r);
       }
       Object[] objArray = new Object[0];
       a.b().s("time_tag", "onResume: startLocation timeCost: "+k1.t(l1), objArray);
       w = l.W;
       if (w != null) {
          d k = w.k;
          if (k != null) {
             k.j(0);
          }
       }
       if (l.X > 0) {
          PostUtils.x("start_share_activity_cost", l.X);
          d.a(0x27ab2faf).DO(7, 446, l.X, new ClientContent$ContentPackage(), "success", null);
          objArray = new Object[0];
          a.b().s("PRODUCTION_PERFORMANCE", "进入发布页面耗时:"+l.X, objArray);
          l.X = 0;
       }
       Object[] objArray1 = new Object[0];
       a.b().s("time_tag", "onResume: timeCost: "+k1.t(l1)+"\n onResume onCreate2onResume timeCost: "+k1.t(l.Y), objArray1);
       return;
    }
}
