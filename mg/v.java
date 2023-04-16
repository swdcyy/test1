package mg.v;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsGrowthGuideCloseActionParam;
import f55.g;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import og.l;
import q87.c;
import android.os.Bundle;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.e;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.kwai.feature.post.api.feature.bridge.JsRouterParams;
import android.net.Uri;
import ekd.x0;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import android.app.Application;
import o56.a;
import mg.v$a;
import qh7.b;
import qh7.a;
import com.kwai.feature.post.api.feature.bridge.JsLogParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.JsonElement;
import com.kwai.feature.post.api.feature.bridge.JsLogParams$JsCustomLogParam;
import java.lang.Class;
import com.google.gson.Gson;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.feature.post.api.feature.bridge.JsLogParams$JsElementLogParam;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.activitycontext.ActivityContext$a;

public final class v	// class@002671
{
    public static b a;
    public static b b;
    public static final v c;

    static {
       v.c = new v();
    }
    public void v(){
       super();
    }
    public static final void b(JsGrowthGuideCloseActionParam p0,g p1){
       a.p(p0, "params");
       JsGrowthGuideCloseActionParam mGuideId = p0.mGuideId;
       int i = 0;
       Object[] objArray = (mGuideId == null || !mGuideId.length())? 1: null;
       if (objArray) {
          objArray = new Object[i];
          l.D().w("PostGrowth", "JsGrowthBridgeFuns close guideId is null", objArray);
          if (p1 != null) {
             p1.a(-1, "close guide error", null);
          }
          return;
       }else {
          p0 = p0.mGuideId;
          a.o(p0, "params.mGuideId");
          RxBus.f.b(new e(p0));
          if (p1 != null) {
             p1.onSuccess(new JsSuccessResult());
          }
          return;
       }
    }
    public static final void c(JsRouterParams p0,g p1){
       a.p(p0, "params");
       JsRouterParams mScheme = p0.mScheme;
       int i = 0;
       Object[] objArray = (mScheme == null || !mScheme.length())? 1: null;
       if (objArray) {
          objArray = new Object[i];
          l.D().w("PostGrowth", "JsGrowthBridgeFuns scheme is null", objArray);
          if (p1 != null) {
             p1.a(-1, "scheme is null", null);
          }
          return;
       }else {
          Uri uri = x0.f(p0.mScheme);
          if (uri == null) {
             objArray = new Object[i];
             l.D().w("PostGrowth", "JsGrowthBridgeFuns parse result is null", objArray);
             if (p1 != null) {
                p1.a(-1, "parse result is null", null);
             }
             return;
          }else {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             b uob = (uActivity != null && !uActivity.isFinishing())? b.j(uActivity, uri.toString()): b.j(a.b(), uri.toString()).o(0x10000000);
             a.b(uob, new v$a(p1, uri));
             return;
          }
       }
    }
    public static final void d(JsLogParams p0){
       JsLogParams$JsElementLogParam jsElementLog;
       JsLogParams$JsElementLogParam mAction2;
       ClientEvent$ElementPackage uElementPack;
       a.p(p0, "params");
       GifshowActivity gifshowActiv = v.c.a();
       String str = null;
       if (gifshowActiv instanceof e0) {
       }else {
          gifshowActiv = str;
       }
       JsLogParams mLogType = p0.mLogType;
       if (mLogType != 1) {
          if (mLogType != 2) {
             if (mLogType != 3) {
                Object[] objArray = new Object[0];
                l.D().w("PostGrowth", "JsGrowthBridgeFuns logEvent failed invalid logType "+p0.mLogType, objArray);
             }else {
                JsLogParams$JsCustomLogParam jsCustomLogP = a.a.h(p0.mParams.toString(), JsLogParams$JsCustomLogParam.class);
                if (jsCustomLogP != null) {
                   JsLogParams$JsCustomLogParam mEventKey = jsCustomLogP.mEventKey;
                   if (mEventKey != null) {
                      PostUtils.x(mEventKey, jsCustomLogP.mEventValue);
                   }
                }
             }
          }else {
             jsElementLog = a.a.h(p0.mParams.toString(), JsLogParams$JsElementLogParam.class);
             if (jsElementLog != null) {
                mAction2 = jsElementLog.mAction2;
                if (mAction2 != null) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = mAction2;
                   uElementPack.params = jsElementLog.mElementPackageParam;
                   u1.L("", gifshowActiv, jsElementLog.mClickEventType, uElementPack, str);
                }
             }
          }
       }else {
          jsElementLog = a.a.h(p0.mParams.toString(), JsLogParams$JsElementLogParam.class);
          if (jsElementLog != null) {
             mAction2 = jsElementLog.mAction2;
             if (mAction2 != null) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = mAction2;
                uElementPack.params = jsElementLog.mElementPackageParam;
                u1.C0("", gifshowActiv, jsElementLog.mShowEventType, uElementPack, str);
             }
          }
       }
       return;
    }
    public final GifshowActivity a(){
       Activity uActivity1;
       ActivityContext uActivityCon = ActivityContext.g();
       String str = "ActivityContext.getInstance\(\)";
       a.o(uActivityCon, str);
       Activity uActivity = uActivityCon.e();
       if (uActivity != null && uActivity instanceof GifshowActivity) {
          return uActivity;
       }
       uActivityCon = ActivityContext.g();
       a.o(uActivityCon, str);
       List list = uActivityCon.d();
       a.o(list, "ActivityContext.getInsta¡­\(\).activityStackWithState");
       Iterator iterator = list.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          ActivityContext$a uoa = iterator.next();
          a.o(uoa, "it");
          uActivity1 = uoa.a();
          if (uActivity1 != null && uActivity1 instanceof GifshowActivity) {
             break ;
          }
       }
       return uActivity1;
    }
}
