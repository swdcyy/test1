package com.kwai.framework.network.keyconfig.a$g;
import erd.o;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e0;
import kotlin.jvm.internal.a;
import ob6.h;
import java.util.Objects;
import com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger;
import com.kwai.framework.network.keyconfig.BaseConfig;
import okhttp3.Response;
import okhttp3.Request;
import pb6.b;
import brd.a0;
import com.kwai.framework.network.keyconfig.OldVersionKeyConfigException;
import java.lang.Throwable;

public final class a$g implements o	// class@0017e6
{
    public final a b;
    public final String c;
    public final RequestTiming d;

    public void a$g(a p0,String p1,RequestTiming p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       h mBaseConfig;
       h mBaseConfig1;
       a0 uoa0 = PatchProxy.applyOneRefsWithListener(p0, this, a$g.class, "1");
       if (uoa0 != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a o = this.b.o;
          a$g og = null;
          h mVersion = (o != null)? o.mVersion: null;
          h oh = p0.a();
          a$g tc = this.c;
          if (tc != null) {
             if (tc.length() > 0) {
                og = 1;
             }
             if (og) {
                a o1 = this.b.o;
                Objects.requireNonNull(oh);
                if (o1 != null) {
                   if (oh.mBaseConfig == null) {
                      mBaseConfig = o1.mBaseConfig;
                      if (mBaseConfig != null) {
                         oh.mBaseConfig = mBaseConfig;
                      }
                   }
                   if (oh.mFeatureConfig == null) {
                      mBaseConfig = o1.mFeatureConfig;
                      if (mBaseConfig != null) {
                         oh.mFeatureConfig = mBaseConfig;
                      }
                   }
                   if (oh.mActivityConfig == null) {
                      mBaseConfig1 = o1.mActivityConfig;
                      if (mBaseConfig1 != null) {
                         oh.mActivityConfig = mBaseConfig1;
                      }
                   }
                }
             }
          }
       label_005e :
          KeyConfigDataLogger b = KeyConfigDataLogger.b;
          mBaseConfig = (oh != null)? oh.mBaseConfig: null;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(mBaseConfig, b, KeyConfigDataLogger.class, "2")) {
             b.b(mBaseConfig, "idc_response");
          }
          p0 = p0.n().request().header("X-REQUESTID");
          if (p0 == null) {
             p0 = "UNKNOWN";
          }
          a.o(p0, "it.raw\(\).request\(\).heade\x20\x02_REQUEST_ID\) ?: \"UNKNOWN\"\x00");
          if (oh.mVersion >= mVersion) {
             b uob = this.b.d();
             mBaseConfig1 = oh.mBaseConfig;
             a.o(mBaseConfig1, "kc.mBaseConfig");
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoidOneRefs(mBaseConfig1, uob, b.class, "1")) {
                a.p(mBaseConfig1, "newBaseConfig");
                uob.b = mBaseConfig1;
             }
             a.o(oh, "kc");
             this.b.o(oh, true, p0);
             p0.n = true;
             p0 = a0.B(oh);
          }else {
             p0 = a0.s(new OldVersionKeyConfigException(oh.mVersion, mVersion));
          }
          uoa0 = p0;
          PatchProxy.onMethodExit(a$g.class, "1");
       }
       return uoa0;
    }
}
