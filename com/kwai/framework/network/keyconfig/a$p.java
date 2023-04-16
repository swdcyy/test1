package com.kwai.framework.network.keyconfig.a$p;
import java.lang.Runnable;
import com.kwai.framework.network.keyconfig.a;
import ob6.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e66.d;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch;
import kotlin.jvm.internal.a;
import ob6.u;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import da6.d;
import com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig;
import da6.f;
import com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger;
import java.util.Objects;
import com.kwai.framework.network.keyconfig.BaseConfig;
import jb6.a;
import ta6.c;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a$p implements Runnable	// class@000c30
{
    public final a b;
    public final h c;
    public final String d;

    public void a$p(a p0,h p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$p.class, "1")) {
          return;
       }
       try{
          SharedPreferences$Editor uEditor = d.a.edit();
          uEditor.putInt("Version", this.c.mVersion);
          g.a(uEditor);
          if (!DiffInfoSwitch.c.a()) {
             a$p tc = this.c;
             a.p(tc, "keyConfig");
             if (!a.g(tc, u.a) || u.c) {
                String str = u.d.h().q(tc);
                a.o(str, "json");
                u.m(str);
             }
          }
          h mFeatureConf = this.c.mFeatureConfig;
          if (mFeatureConf != null) {
             d.c(mFeatureConf);
             FeatureConfig mPassportCon = this.c.mFeatureConfig.mPassportConfig;
             if (mPassportCon != null) {
                f.b(mPassportCon);
             }
          }
          KeyConfigDataLogger b = KeyConfigDataLogger.b;
          h mBaseConfig = this.c.mBaseConfig;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(mBaseConfig, b, KeyConfigDataLogger.class, "3")) {
             b.b(mBaseConfig, "idc_config");
          }
          a.a(this.c.mBaseConfig, this.d);
          this.b.n();
          Object[] objArray = new Object[0];
          c.C().w("KeyConfigManager", "KeyConfig preference save finished.", objArray);
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
}
