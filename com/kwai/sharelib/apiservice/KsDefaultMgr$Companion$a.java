package com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$a;
import java.lang.Runnable;
import java.lang.String;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.KsShareApi;
import java.util.Map;
import java.lang.StringBuilder;
import c97.d;
import android.content.SharedPreferences;
import java.io.InputStream;
import isd.a;
import zsd.d;
import java.nio.charset.Charset;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import com.kwai.sharelib.tools.Gsons;
import com.google.gson.Gson;
import com.kwai.sharelib.model.ShareInitResponse;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class KsDefaultMgr$Companion$a implements Runnable	// class@0016b5
{
    public final int b;
    public final String c;
    public final a d;

    public void KsDefaultMgr$Companion$a(int p0,String p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       String str2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KsDefaultMgr$Companion$a.class, "1")) {
          return;
       }
       KsDefaultMgr$Companion c = KsDefaultMgr.c;
       KsDefaultMgr$Companion$a tb = this.b;
       KsDefaultMgr$Companion$a tc = this.c;
       KsDefaultMgr$Companion$a td = this.d;
       _monitor_enter(c);
       if (PatchProxy.isSupport(KsDefaultMgr$Companion.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(tb), tc, td, c, KsDefaultMgr$Companion.class, "4")) {
          _monitor_exit(c);
       }else {
          try{
             a.p(tc, "subBiz");
             a.p(td, "streamer");
             KsShareApi s = KsShareApi.s;
             if (s.b().get(tc) != null) {
                _monitor_exit(c);
             }else {
                String str = "KS_CDC#1419"+tc;
                String str1 = "KS_CDD#1419"+tc;
                SharedPreferences sharedPrefer = d.a().h("KS_SP#1419", 0);
                if (tb == sharedPrefer.getInt(str, -1)) {
                   str2 = sharedPrefer.getString(str1, "");
                }else {
                   InputStream inputStream = td.invoke();
                   if (inputStream != null) {
                      b.a(inputStream, objArray);
                      str2 = new String(a.p(inputStream), d.a);
                   }else {
                      _monitor_exit(c);
                   }
                }
                try{
                   ShareInitResponse shareInitRes = Gsons.b.a().h(str2, ShareInitResponse.class);
                   if (shareInitRes != null) {
                      g.a(sharedPrefer.edit().putString(str1, str2).putInt(str, tb));
                      s.b().put(tc, shareInitRes);
                      c.e(shareInitRes);
                   }
                }catch(java.lang.Exception e0){
                   KsShareApi.s.b().remove(tc);
                }
                _monitor_exit(e0);
             }
          }catch(java.io.IOException e0){
             _monitor_exit(e0);
          }
       }
    }
}
