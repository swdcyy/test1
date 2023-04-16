package com.yxcorp.gifshow.share.init.ForwardInitModule$c;
import erd.g;
import com.yxcorp.gifshow.share.init.ForwardInitModule;
import java.lang.Object;
import java.lang.String;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import mhc.r;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import kotlin.jvm.internal.a;
import isd.a;
import zsd.d;
import java.nio.charset.Charset;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$readFromUrl$1;
import msd.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import c97.d;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.Collection;
import qrd.l1;
import vo7.a;
import com.kwai.sharelib.apiservice.a;
import java.util.HashMap;
import com.kwai.middleware.azeroth.network.a$b;
import zk.d;
import com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory;
import zk.j;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.network.a;
import com.kwai.sharelib.model.BatchShareIdResponse;
import java.util.Map;
import ca7.c;
import com.kwai.corona.startup.model.CoronaDetailMorePanelConfig;
import ni5.c;

public final class ForwardInitModule$c implements g	// class@001bc3
{
    public final ForwardInitModule b;

    public void ForwardInitModule$c(ForwardInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       KsDefaultMgr$Companion c;
       KsDefaultMgr$Companion uCompanion = KsDefaultMgr$Companion.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardInitModule$c.class, "1")) {
       }else {
          Object obj = null;
          this.b.n0(a.t().getValue(r.c, JsonObject.class, obj));
          KsShareApi s = KsShareApi.s;
          InputStream inputStream = SplitAssetHelper.open(s.k().getAssets(), "sf_share_init.json");
          a.o(inputStream, "KsShareApi.context.asset¡­pen\(\"sf_share_init.json\"\)");
          this.b.n0(new c().a(new String(a.p(inputStream), d.a)).r());
          if (a.t().d(r.b, false)) {
             c = KsDefaultMgr.c;
             a.o(p0, "it");
             String str = "";
             Objects.requireNonNull(c);
             if (PatchProxy.applyTwoRefs(p0, str, c, uCompanion, "1") != PatchProxyResult.class) {
             }else {
                a.p(p0, "url");
                a.p(str, "subBiz");
                c.a(p0.hashCode(), str, new KsDefaultMgr$Companion$readFromUrl$1(p0));
             }
          }
          if (a.t().d("enableShareAnyGlobalBackupData", false)) {
             p0 = QCurrentUser.ME;
             a.o(p0, "QCurrentUser.ME");
             if (p0.isLogined()) {
                p0 = KsDefaultMgr.c;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoid(obj, p0, uCompanion, "7")) {
                   String str1 = 5;
                   if (p0.b().size() <= str1) {
                      AtomicBoolean b = KsDefaultMgr.b;
                      if (b.compareAndSet(false, true)) {
                         SharedPreferences sharedPrefer = d.a().h("KS_SP#1419", false);
                         Set stringSet = sharedPrefer.getStringSet("KS_DSI#1419", obj);
                         if (stringSet != null) {
                            HashSet hashSet = p0.b();
                            _monitor_enter(hashSet);
                            p0.b().addAll(stringSet);
                            _monitor_exit(hashSet);
                         }
                         if (p0.b().size() > str1) {
                            b.set(false);
                         }else {
                            p0 = new a(s.k());
                            a uoa = new a(sharedPrefer);
                            str1 = "1.14.0.4";
                            if (!PatchProxy.applyVoidTwoRefs(uoa, str1, p0, a.class, "4")) {
                               HashMap hashMap = new HashMap();
                               hashMap.put("sdkVersion", str1);
                               a$b uob = d.a().k("ks_share_lib");
                               uob.b().g(new ForwardingGsonLifecycleFactory(obj));
                               TimeUnit sECONDS = TimeUnit.SECONDS;
                               uob.c().connectTimeout(30, sECONDS).readTimeout(30, sECONDS);
                               uob.j((s.f() ^ true));
                               uob.h(false);
                               uob.k(p0.a());
                               p0 = uob.a();
                               p0.d("/rest/zt/share/batch/shareId", hashMap, BatchShareIdResponse.class, uoa);
                            }
                         }
                      }
                   }
                }
             }
          }
          p0 = c.a(CoronaDetailMorePanelConfig.class);
          if (p0 != null) {
             p0 = p0.getSharePanelBackup();
             if (p0 != null) {
                KsDefaultMgr.c.d(p0, "PLAYER_PORTRAIT_STATIC");
             }
          }
       }
       return;
    }
}
