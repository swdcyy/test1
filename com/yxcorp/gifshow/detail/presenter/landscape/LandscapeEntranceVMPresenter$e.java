package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeEntranceVMPresenter;
import java.lang.Object;
import e5a.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import im8.f;
import java.lang.Boolean;
import uw9.o;
import q87.c;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.n0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hn5.c;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import d5a.i;
import java.lang.Enum;
import fg6.a;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.b4;
import lnc.b4$a;
import e17.i;
import android.os.SystemClock;
import d5a.s;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.util.UUID;
import lq9.a;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import d5a.n;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import jd6.g;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import d5a.r;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import io.reactivex.internal.functions.Functions;
import d5a.q;

public final class LandscapeEntranceVMPresenter$e implements g	// class@0016e4
{
    public final LandscapeEntranceVMPresenter b;

    public void LandscapeEntranceVMPresenter$e(LandscapeEntranceVMPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       a b1;
       int b2;
       String str1;
       LandscapeEntranceVMPresenter t;
       LandscapeEntranceVMPresenter c;
       Pair[] pairArray;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, LandscapeEntranceVMPresenter$e.class, "1")) {
       }else {
          LandscapeEntranceVMPresenter$e b = obj.b;
          b.Y = obj1;
          a.o(obj1, "it");
          LandscapeEntranceVMPresenter landscapeEnt = LandscapeEntranceVMPresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, landscapeEnt, "8")) {
             LandscapeEntranceVMPresenter z = b.z;
             if (z == null) {
                a.S("mDisableLandscapeClick");
             }
             i obj2 = z.get();
             a.o(obj2, "mDisableLandscapeClick.get\(\)");
             String str = "LandscapeEntrancePresenter";
             int i = 0;
             if (obj2.booleanValue()) {
                objArray = new Object[i];
                o.C().w(str, "landScapeClick return by mDisableLandscapeClick", objArray);
             }else {
                z = b.T;
                obj2 = (z != null)? z.X0(): null;
                if (!obj2 instanceof n0) {
                   obj2 = null;
                }
                objArray = 1;
                if (obj2 != null && (obj2.isLoading() == objArray && (obj2.K() && b.getActivity() instanceof c))) {
                   objArray = new Object[i];
                   o.C().w(str, "landScapeClick return by pageRefreshing", objArray);
                }else {
                   LandscapeEntrance landscapeEnt1 = obj1.a();
                   if (!PatchProxy.applyVoidOneRefs(landscapeEnt1, b, landscapeEnt, "28")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LANDSCAPE_MODE_BUTTON";
                      int i1 = i.a[landscapeEnt1.ordinal()];
                      String str3 = "enter_type";
                      String str4 = "LEFT_MID";
                      String str5 = "button_pos";
                      str1 = "NOT_SQUARE";
                      String str6 = "style";
                      b2 = 3;
                      b1 = 2;
                      if (i1 != objArray) {
                         if (i1 == b1) {
                            pairArray = new Pair[b2];
                            pairArray[0] = r0.a(str6, str1);
                            pairArray[objArray] = r0.a(str5, str4);
                            pairArray[b1] = r0.a(str3, "GRAVITY_SENSE");
                            uElementPack.params = a.a.q(t0.M(pairArray));
                         }
                      }else {
                         pairArray = new Pair[b2];
                         pairArray[0] = r0.a(str6, str1);
                         pairArray[objArray] = r0.a(str5, str4);
                         pairArray[b1] = r0.a(str3, "CLICK");
                         uElementPack.params = a.a.q(t0.M(pairArray));
                      }
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      t = b.t;
                      str4 = "mPhoto";
                      if (t == null) {
                         a.S(str4);
                      }
                      BaseFeed entity = t.getEntity();
                      LandscapeEntranceVMPresenter t1 = b.t;
                      if (t1 == null) {
                         a.S(str4);
                      }
                      uContentPack.photoPackage = w1.g(entity, (t1.getPosition() + objArray));
                      c = b.C;
                      if (c == null) {
                         a.S("mFragment");
                      }
                      u1.M("", c, 6, uElementPack, uContentPack, null);
                   }
                   b1 = obj1.b;
                   b2 = (obj1.a() != LandscapeEntrance.GRAVITY)? true: false;
                   if (!PatchProxy.isSupport(landscapeEnt) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), Boolean.valueOf(b2), obj1, b, LandscapeEntranceVMPresenter.class, "11")) {
                      if (b4.a.b(b.getActivity())) {
                         i.a(R.style.arg_RES_7f110668, 0x7f10104f);
                      }else {
                         long l = SystemClock.elapsedRealtime();
                         boolean b3 = s.a();
                         Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                         uBooleanRef.element = false;
                         str1 = UUID.randomUUID().toString();
                         a.o(str1, "UUID.randomUUID\(\).toString\(\)");
                         if (!PatchProxy.applyVoidOneRefs(str1, b, landscapeEnt, "12")) {
                            a.g(str1, "LANDSCAPE", "switchToLandscape", "LADNSCAPE", "");
                            a.b(str1, "pluginInstalled", Boolean.valueOf(s.a()));
                            a.b(str1, "dispatch", Boolean.valueOf(CoronaExperimentUtilKt.o()));
                            a.b(str1, "isFromCorona", Boolean.FALSE);
                            a.b(str1, "sourceId", "SLIDE_PLAYER");
                            a.f(str1, "switchScreenCost");
                            a.f(str1, "clickToSwitchBeginCost");
                            a.f(str1, "loadPluginTime");
                         }
                         Activity activity = b.getActivity();
                         a.m(activity);
                         Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                         Activity uActivity = activity;
                         n on = landscapeEnt;
                         n on1 = landscapeEnt;
                         on = new n(b, b3, l, uBooleanRef, str1, b1, b2, obj1);
                         if (PatchProxy.applyTwoRefs(uActivity, on1, null, s.class, "5") != PatchProxyResult.class) {
                         }else {
                            String str2 = "landscape";
                            if (!g.e(str2)) {
                               PluginDownloadExtension.k.a(str2);
                            }
                            if (g.e(str2) || Dva.instance().isLoaded(str2)) {
                               t.just(Boolean.TRUE).subscribe(new q(on1));
                            }else {
                               t.fromCallable(new r(uActivity, on1)).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.e);
                            }
                         }
                      }
                   }
                }
             }
          }
          PatchProxy.onMethodExit(LandscapeEntranceVMPresenter$e.class, "1");
       }
       return;
    }
}
