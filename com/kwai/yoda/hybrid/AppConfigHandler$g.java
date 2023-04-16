package com.kwai.yoda.hybrid.AppConfigHandler$g;
import erd.g;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Collection;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.kwai.yoda.model.AppConfigParams;
import java.io.Serializable;
import hy7.r;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.YodaInitConfig;
import ub7.f;
import java.io.InputStream;
import zsd.d;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import kotlin.io.TextStreamsKt;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import yz7.e;
import yz7.r;
import com.kwai.yoda.model.AppConfigParams$DomainInfo;

public final class AppConfigHandler$g implements g	// class@00126f
{
    public final AppConfigHandler b;

    public void AppConfigHandler$g(AppConfigHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       AppConfigParams uAppConfigPa;
       YodaInitConfig config;
       InputStreamReader inputStreamR;
       Object[] objArray1;
       AppConfigHandler uAppConfigHa = AppConfigHandler.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AppConfigHandler$g.class, "1")) {
       }else {
          AppConfigHandler$g tb = this.b;
          a.h(p0, "list");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uAppConfigHa, "2")) {
             a.q(p0, "<set-?>");
             tb.b = p0;
          }
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, uAppConfigHa, "4") && !(p0.b.isEmpty() ^ 0x01)) {
             try{
                uAppConfigPa = r.a(Azeroth2.B.d(), "key_biz_config", AppConfigParams.class);
                if (uAppConfigPa == null) {
                   AppConfigParams uAppConfigPa1 = PatchProxy.apply(objArray, p0, uAppConfigHa, "5");
                   if (uAppConfigPa1 != PatchProxyResult.class) {
                   }else {
                      Yoda yoda = Yoda.get();
                      a.h(yoda, "Yoda.get\(\)");
                      config = yoda.getConfig();
                      if (config != null) {
                         f localAppConf = config.getLocalAppConfigSupplier();
                         if (localAppConf != null) {
                            InputStream inputStream = localAppConf.get();
                            if (inputStream != null) {
                               inputStreamR = new InputStreamReader(inputStream, d.a);
                               String str = 8192;
                               if (inputStreamR instanceof BufferedReader) {
                               label_009f :
                                  str = (inputStreamR != null)? TextStreamsKt.k(inputStreamR): objArray;
                                  b.a(inputStreamR, objArray);
                                  if (str == null) {
                                     str = "";
                                  }
                                  uAppConfigPa1 = e.a(str, AppConfigParams.class);
                               }else {
                                  inputStreamR = new BufferedReader(inputStreamR, str);
                                  goto label_009f ;
                               }
                            }
                         }
                      }
                      inputStreamR = objArray;
                      goto label_009f ;
                   }
                   uAppConfigPa = uAppConfigPa1;
                }
             }catch(java.lang.Exception e0){
                r.e("AppConfigHandler", e0);
                uAppConfigPa = objArray;
             }
             if (uAppConfigPa != null) {
                objArray = uAppConfigPa.mDomainInfo;
             }
             p0.k(objArray);
             if (uAppConfigPa != null) {
                p0.j(uAppConfigPa);
             }
          }
       label_00d0 :
          r.h("AppConfigHandler", "notify biz config changed from db.");
          this.b.h();
       }
       return;
    }
}
