package ana.e;
import an5.b;
import java.lang.Object;
import java.lang.String;
import f55.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.growth.bridge.bean.UrlPluginResp;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import ana.e$b;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.growth.h5login.QuickLoginParams;
import tkd.b;
import tkd.d;
import pn6.a;
import com.kwai.feature.api.feed.growth.model.PendantBubbleModel;
import vt5.e;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vt5.a;
import ana.e$a;
import com.kwai.framework.accountsecurity.d$a;
import java.util.concurrent.Future;
import com.kwai.framework.accountsecurity.d;
import wkd.b;
import ob6.p;
import ob6.h;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.UgActivityPlatform;
import zk.d;
import com.google.gson.Gson;
import com.kwai.feature.api.feed.growth.model.JsKeyConfigResult;
import com.google.gson.JsonElement;
import com.kwai.feature.api.feed.growth.model.JsHttpCallParams;
import kka.h;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.util.Map;
import brd.t;
import java.util.Objects;
import ana.a;
import ana.b;
import erd.g;
import crd.b;
import android.os.Bundle;
import com.kwai.feature.api.feed.growth.model.JsRPRParams;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import android.widget.TextView;
import com.kwai.component.upgrade.b;
import ayb.l;
import com.yxcorp.gifshow.model.response.ulk.UlkHistory;
import ka0.a;
import com.kwai.feature.api.feed.growth.model.JsMobileResult;
import com.kwai.feature.api.feed.growth.model.ClickWidgetDialogModel;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import p55.a;
import com.kwai.feature.api.pendant.core.model.VideoAwardParam;
import yt5.g;
import com.google.gson.JsonObject;
import an5.a;
import com.yxcorp.gifshow.model.response.ulk.UserSimResp;
import lnc.i3;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Boolean;
import fyb.a;

public class e implements b	// class@0000ac
{
    public static int f;
    public static int g;

    public void e(){
       super();
    }
    public void C5(String p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "17")) {
          return;
       }
       if (!a.t().d("ugSim", false)) {
          p1.onSuccess(new UrlPluginResp(-1));
          return;
       }else if(TextUtils.isEmpty(p0)){
          p1.onSuccess(new UrlPluginResp(-2));
          return;
       }else {
          Dva.instance().getPluginInstallManager().j(p0).b(WorkExecutors.c(), new e$b(this, p0, p1));
          return;
       }
    }
    public void E3(QuickLoginParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "16")) {
          return;
       }
       d.a(0xf003023).E3(p0, p1);
       return;
    }
    public void F3(PendantBubbleModel p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "3")) {
          return;
       }
       int i = -1;
       if (p0 != null && (TextUtils.isEmpty(p0.mBubbleText) || p0.mBubbleId == i)) {
          p1.onSuccess(new JsErrorResult(i, "config is not valid"));
          return;
       }else {
          d.a(-1094279325).H1(p0.mBubbleText, p0.mBubbleId);
          p1.onSuccess(new JsSuccessResult());
          return;
       }
    }
    public void G3(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       d.a(0x24032e2d).Xv();
       return;
    }
    public void H3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       d.a(new e$a(this, p0));
       return;
    }
    public void I3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null) {
          h mActivityCon = oh.mActivityConfig;
          if (mActivityCon != null) {
             ActivityConfig mUgActivityP = mActivityCon.mUgActivityPlatform;
             if (mUgActivityP != null && mUgActivityP.mUagConfig != null) {
                d uod1 = new d();
                uod1.i();
                p0.onSuccess(uod1.b().q(new JsKeyConfigResult(1, oh.mActivityConfig.mUgActivityPlatform.mUagConfig)));
             label_0060 :
                return;
             }
          }
       }
       d uod = new d();
       uod.i();
       p0.onSuccess(uod.b().q(new JsKeyConfigResult(1, null)));
       goto label_0060 ;
    }
    public void J3(JsHttpCallParams p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.mParams;
          if (p0 != null) {
             Objects.requireNonNull(p1);
             b.a(-1592356291).r(p0, RequestTiming.DEFAULT).subscribe(new a(p1), new b(p1));
             return;
          }
       }
       p1.a(-1, "params error", null);
       return;
    }
    public void K3(JsRPRParams p0,g p1){
    }
    public void L3(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       b.a(p0, null);
       return;
    }
    public void M3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "23")) {
          return;
       }
       d.a(0x38955e85).t6("simRestart", "", null, p0);
       return;
    }
    public void N3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "21")) {
          return;
       }
       d.a(0x38955e85).t6("simOriginId", "", null, p0);
       return;
    }
    public void O3(UlkHistory p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "24")) {
          return;
       }
       d.a(0x38955e85).t6("simSetId", "", p0, p1);
       return;
    }
    public void P1(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "15")) {
          return;
       }
       d.a(0xf003023).P1(p0);
       return;
    }
    public void P3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "22")) {
          return;
       }
       d.a(0x38955e85).t6("simId", "", null, p0);
       return;
    }
    public void Q3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       p0.onSuccess(new JsMobileResult(1, a.d()));
       return;
    }
    public void R3(ClickWidgetDialogModel p0,Activity p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "10")) {
          return;
       }
       Object obj = b.a(-1467459046);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, obj, AddGrowthWidgetTaskHelper.class, "3")) {
          a.p(p1, "activity");
          a.p(p2, "callback");
          Monitor_ThreadKt.f(new AddGrowthWidgetTaskHelper$createClickWidgetDialog$1(p1, d0.a("alte-din.ttf", p1), p0, p2));
       }
       return;
    }
    public void U3(JsRPRParams p0,g p1){
    }
    public void U6(a p0,Activity p1,VideoAwardParam p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "2")) {
          return;
       }
       d.a(-626371061).hB(p0, p1, p2, p3);
       return;
    }
    public void V8(String p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "14")) {
          return;
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null) {
          h mActivityCon = oh.mActivityConfig;
          if (mActivityCon != null) {
             ActivityConfig mUgActivityP = mActivityCon.mUgActivityPlatform;
             if (mUgActivityP != null && mUgActivityP.mUagConfig != null) {
                d uod1 = new d();
                uod1.i();
                p1.onSuccess(uod1.b().q(new JsKeyConfigResult(1, oh.mActivityConfig.mUgActivityPlatform.mUagConfig.e0(p0))));
             label_0064 :
                return;
             }
          }
       }
       d uod = new d();
       uod.i();
       p1.onSuccess(uod.b().q(new JsKeyConfigResult(1, null)));
       goto label_0064 ;
    }
    public String getNameSpace(){
       return a.a(this);
    }
    public void ma(){
    }
    public void p8(UserSimResp p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "20")) {
          return;
       }
       d.a(0x38955e85).t6("simUserInfo", "", p0, p1);
       return;
    }
    public void q8(String p0,g p1){
       i3 oi3;
       WidgetType[] widgetTypeAr;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "8")) {
          return;
       }
       AddGrowthWidgetTaskHelper uAddGrowthWi = b.a(-1467459046);
       Objects.requireNonNull(uAddGrowthWi);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, uAddGrowthWi, AddGrowthWidgetTaskHelper.class, "1")) {
          a.p(p0, "widgetType");
          a.p(p1, "callback");
          int i = -1382356358;
          if (a.g(p0, "rank")) {
             oi3 = i3.f();
             widgetTypeAr = new WidgetType[]{WidgetType.RANK_LIGHT,WidgetType.RANK_DARK};
             oi3.a("canAddWidget", Boolean.valueOf((GrowthWidgetManager.e(b.a(i), widgetTypeAr, 0, 2, null) ^ 1)));
             p1.onSuccess(oi3.e());
          }else if(a.g(p0, "search")){
             oi3 = i3.f();
             widgetTypeAr = new WidgetType[]{WidgetType.SEARCH_LIGHT,WidgetType.SEARCH_DARK};
             oi3.a("canAddWidget", Boolean.valueOf((GrowthWidgetManager.e(b.a(i), widgetTypeAr, 0, 2, null) ^ 1)));
             p1.onSuccess(oi3.e());
          }
       }
       return;
    }
    public void v3(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       d.a(0x37fb53f8).v3();
       return;
    }
    public void v6(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       b.a(-1467459046).b(p0);
       return;
    }
    public void z6(UserSimResp p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "19")) {
          return;
       }
       d.a(0x38955e85).t6("simAccount", "", p0, p1);
       return;
    }
}
