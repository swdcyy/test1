package com.kwai.sharelib.KsShareDataEngine;
import com.kwai.sharelib.KsShareDataEngine$a;
import nsd.u;
import java.lang.Object;
import uo7.q;
import uo7.k;
import uo7.h0;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.KsShareDataEngine$shareAnyRequest$1;
import io.reactivex.g;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import com.kwai.sharelib.KsShareDataEngine$b;
import erd.o;
import com.kwai.sharelib.KsShareDataEngine$c;
import com.kwai.sharelib.KsShareDataEngine$d;
import erd.g;
import com.kwai.sharelib.model.ShareInitResponse;
import kotlin.LazyThreadSafetyMode;
import com.kwai.sharelib.KsShareDataEngine$writeBuffer$sharedPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.System;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonObject;
import com.kwai.sharelib.KsShareApi;
import com.kwai.sharelib.tools.Gsons;
import com.google.gson.Gson;

public final class KsShareDataEngine	// class@0016a1
{
    public q a;
    public static final KsShareDataEngine$a b;

    static {
       KsShareDataEngine.b = new KsShareDataEngine$a(null);
    }
    public void KsShareDataEngine(){
       super();
    }
    public final q a(){
       return this.a;
    }
    public final t b(k p0,h0 p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KsShareDataEngine.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "conf");
       a.p(p1, "ksShareUrlHdlMgr");
       t ot = t.create(new KsShareDataEngine$shareAnyRequest$1(this, p0, p1, p2)).timeout(11, TimeUnit.SECONDS).observeOn(b.c()).onErrorResumeNext(new KsShareDataEngine$b(this, p1, p0)).map(new KsShareDataEngine$c(this)).doOnNext(new KsShareDataEngine$d(p0));
       a.o(ot, "Observable.create<ShareA¡­\), conf\n        \)\n      }");
       return ot;
    }
    public final void c(String p0,ShareInitResponse p1,k p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsShareDataEngine.class, "3")) {
          return;
       }
       p op = s.b(LazyThreadSafetyMode.NONE, KsShareDataEngine$writeBuffer$sharedPreferences$2.INSTANCE);
       String str = p2.w()+"shareInit";
       if (a.g("nocache", p1.mCacheScope)) {
          SharedPreferences$Editor value = op.getValue();
          value.remove(str);
          value.remove(str+"max_age");
          g.a(value);
       }
       if (!p1.mMaxAge - -1) {
          p1.mMaxAge = 0x11f0231b12800;
       }
       if (p1.mMaxAge > 0 && ((a.g("nocache", p1.mCacheScope) ^ 0x01) && p1.mCacheScope != null)) {
          long l = p1.mMaxAge + System.currentTimeMillis();
          ShareInitResponse mCacheScope = p1.mCacheScope;
          if (mCacheScope != null) {
             String[] stringArray = new String[]{","};
             List list = StringsKt__StringsKt.H4(mCacheScope, stringArray, false, 0, 6, null);
             if (list != null) {
                if (!(list.isEmpty() ^ 0x01)) {
                   list = null;
                }
                if (list != null) {
                   ShareInitResponse mCacheScope1 = p1.mCacheScope;
                   StringBuilder str1 = "";
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      String str2 = iterator.next();
                      switch (str2.hashCode()){
                          case 0x8b04a33e:
                            if (str2.equals("sdkVersion")) {
                               str1 = str1+"1.14.0.4";
                            }
                            break;
                          case 0x8d0bdde7:
                            if (str2.equals("shareResourceType")) {
                               str1 = str1+p2.v();
                            }
                            break;
                          case 0xcadb9eb3:
                            if (str2.equals("subBiz")) {
                               str1 = str1+p2.w();
                            }
                            break;
                          case 0x19fa1:
                            if (str2.equals("kpf")) {
                               str1 = str1+KsShareApi.s.g();
                            }
                            break;
                          case 0x19fa9:
                            if (str2.equals("kpn")) {
                               str1 = str1+KsShareApi.s.h();
                            }
                            break;
                          case 0xa23db9:
                            if (str2.equals("shareObjectId")) {
                               str1 = str1+p2.x();
                            }
                            break;
                          case 0xf03804f:
                            if (str2.equals("extTransientParams")) {
                               str1 = str1+p2.n();
                            }
                            break;
                          default:
                      }
                   }
                   SharedPreferences$Editor value1 = op.getValue();
                   value1.putLong(str+"max_age", l);
                   value1.putString(str, mCacheScope1);
                   String str3 = str1;
                   if (p0 == null) {
                      p0 = Gsons.b.a().q(p1);
                   }
                   value1.putString(str3, p0);
                   g.a(value1);
                }
             }
          }
       }
       return;
    }
}
