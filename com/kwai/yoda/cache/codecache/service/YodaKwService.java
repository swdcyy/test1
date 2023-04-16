package com.kwai.yoda.cache.codecache.service.YodaKwService;
import android.app.Service;
import com.kwai.yoda.cache.codecache.service.YodaKwService$Companion;
import nsd.u;
import com.kwai.yoda.cache.codecache.service.YodaKwService$Companion$CoreInitState;
import com.kwai.yoda.cache.codecache.service.YodaKwService$mWebView$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.extension.KsWebView;
import java.lang.Iterable;
import brd.t;
import com.kwai.yoda.cache.codecache.service.YodaKwService$a;
import erd.r;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.yoda.cache.codecache.service.YodaKwService$b;
import erd.o;
import com.kwai.yoda.cache.codecache.service.YodaKwService$c;
import com.kwai.yoda.cache.codecache.service.YodaKwService$d;
import erd.g;
import crd.b;
import com.kuaishou.webkit.WebView;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo;
import java.lang.ClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import ux7.a;
import java.lang.Enum;
import android.app.Application;
import com.kwai.yoda.cache.codecache.service.YodaKwService$initWebView$1;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kuaishou.webkit.extension.KwSdk;

public class YodaKwService extends Service	// class@0011b2
{
    public final p b;
    public boolean c;
    public CopyOnWriteArraySet d;
    public static YodaKwService$Companion$CoreInitState e;
    public static final YodaKwService$Companion f;

    static {
       YodaKwService.f = new YodaKwService$Companion(null);
       YodaKwService.e = YodaKwService$Companion$CoreInitState.UNINITED;
    }
    public void YodaKwService(){
       super();
       this.b = s.c(new YodaKwService$mWebView$2(this));
       this.c = true;
       this.d = new CopyOnWriteArraySet();
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaKwService.class, "5")) {
          return;
       }
       p0.size();
       if (!KsWebView.isCompileJsAndGenCodeCacheSupported()) {
          return;
       }
       AzerothSchedulers$a b = AzerothSchedulers.b;
       t.fromIterable(p0).filter(YodaKwService$a.b).subscribeOn(b.b()).map(YodaKwService$b.b).observeOn(b.c()).subscribe(new YodaKwService$c(this), YodaKwService$d.b);
       return;
    }
    public final WebView b(){
       Object obj = PatchProxy.apply(null, this, YodaKwService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       YodaKwService yodaKwServic;
       YodaKwService$Companion$CoreInitState uCompanion$C;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(YodaKwService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, YodaKwService.class, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return 2;
       }else {
          ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, YodaKwService.class, "3");
          if (uArrayList != patchProxyRe) {
          }else {
             try{
                p0.setExtrasClassLoader(CodeCacheInfo.class.getClassLoader());
                uArrayList = p0.getParcelableArrayListExtra("CODE_CACHE_INFOS");
             }catch(java.lang.Exception e0){
                uArrayList = null;
             }
          }
       }
    }
}
