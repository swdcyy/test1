package com.kwai.kxb.service.ExpConfig;
import com.kwai.kxb.service.ExpConfig$mMultiVersionBundleConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kxb.service.ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2;
import com.kwai.kxb.service.ExpConfig$mNetworkBundleMinVersionCheckConfig$2;
import com.kwai.kxb.service.ExpConfig$isLogNetRequestEnabled$2;
import com.kwai.kxb.service.ExpConfig$isBundleLoadRecordEnabled$2;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.kxb.KxbManager;
import gu6.k;
import ru6.t;
import java.util.List;
import com.kwai.kxb.Kxb;
import com.google.gson.Gson;
import com.kwai.kxb.Kxb$a;
import com.kwai.kxb.service.ExpConfig$a;
import java.lang.reflect.Type;
import el.a;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ru6.c;
import com.kwai.kxb.PlatformType;
import java.lang.Number;
import ru6.k;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import java.lang.Integer;

public final class ExpConfig	// class@0007e9
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final ExpConfig f;

    static {
       ExpConfig.f = new ExpConfig();
       ExpConfig.a = s.c(ExpConfig$mMultiVersionBundleConfig$2.INSTANCE);
       ExpConfig.b = s.c(ExpConfig$mDisableNetworkBundleFallbackToLocalConfig$2.INSTANCE);
       ExpConfig.c = s.c(ExpConfig$mNetworkBundleMinVersionCheckConfig$2.INSTANCE);
       ExpConfig.d = s.c(ExpConfig$isLogNetRequestEnabled$2.INSTANCE);
       ExpConfig.e = s.c(ExpConfig$isBundleLoadRecordEnabled$2.INSTANCE);
    }
    public void ExpConfig(){
       super();
    }
    public final JsonElement a(String p0,JsonElement p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, this, ExpConfig.class, "17");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "key");
       return KxbManager.g.d().g().a(p0, null);
    }
    public final List b(String p0){
       JsonElement obj = PatchProxy.applyOneRefs(p0, this, ExpConfig.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       obj = this.a(p0, null);
       if (obj == null) {
          return CollectionsKt__CollectionsKt.E();
       }
       Object obj1 = Kxb.b.a().d(obj, new ExpConfig$a().getType());
       a.o(obj1, "Kxb.gson.fromJson\(jsonEl¡­<ArrayList<T>>\(\) {}.type\)");
       return obj1;
    }
    public final c c(){
       Object obj = PatchProxy.apply(null, this, ExpConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ExpConfig.a.getValue();
    }
    public final int d(String p0,PlatformType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ExpConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "bundleId");
       a.p(p1, "platformType");
       int i = k.a[p1.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                p0 = "KdsNativeMinBundleVersion"+p0;
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             p0 = "KdsVueMinBundleVersion"+p0;
          }
       }else {
          p0 = "KdsReactMinBundleVersion"+p0;
       }
       return this.e(p0, Integer.TYPE, Integer.valueOf(-1)).intValue();
    }
    public final Object e(String p0,Type p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ExpConfig.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       a.p(p1, "typeOfT");
       p0 = KxbManager.g.d().g().b(p0, p1, p2);
       if (p0 != null) {
          p2 = p0;
       }
       return p2;
    }
}
