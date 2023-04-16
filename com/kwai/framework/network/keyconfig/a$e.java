package com.kwai.framework.network.keyconfig.a$e;
import erd.g;
import rb6.b;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import okhttp3.Response;
import java.lang.Long;
import com.google.common.primitives.Longs;
import ob6.h;
import com.kwai.framework.network.keyconfig.BaseConfig;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import okhttp3.Request;
import okhttp3.HttpUrl;

public final class a$e implements g	// class@0017e4
{
    public final b b;
    public final a c;
    public final String d;
    public final RequestTiming e;

    public void a$e(b p0,a p1,String p2,RequestTiming p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       Long longx1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$e.class, "1")) {
       }else {
          a$e tc = this.c;
          a.o(p0, "it");
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, a.class, "12")) {
             boolean b = a.g("true", p0.n().header("FROM_E_TAG_CACHE"));
             String str = p0.n().header("SERVER_TIMESTAMP");
             if (str == null) {
                str = "";
             }
             a.o(str, "it.raw\(\).header\(ETagInte\x20\x02r.SERVER_TIMESTAMP\) ?: \"\"\x00");
             if (b) {
                Long longx = Longs.d(str, 10);
                long l = (longx != null)? longx.longValue(): 0;
                h oh = p0.a();
                if (oh != null) {
                   oh = oh.mBaseConfig;
                   if (oh != null) {
                      longx1 = Long.valueOf(oh.g());
                   label_006f :
                      Object[] objArray = new Object[0];
                      c.C().w("KeyConfigManager", "KeyConfig is from ETag cache. Update it\'s serverTimestamp.\nOld value: "+longx1+"\n"+"New value : "+l+"\n", objArray);
                      oh = p0.a();
                      if (oh != null) {
                         oh = oh.mBaseConfig;
                         if (oh != null) {
                            oh.i(l);
                         }
                      }
                   }
                }
                longx1 = null;
                goto label_006f ;
             }
          }
       label_00ab :
          this.b.e(p0.n().request().url().toString());
          PatchProxy.onMethodExit(a$e.class, "1");
       }
       return;
    }
}
