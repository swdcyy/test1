package com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;

public final class RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2 extends Lambda implements a	// class@0011d3
{
    public static final RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2 INSTANCE;

    static {
       RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2.INSTANCE = new RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2();
    }
    public void RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2(){
       super(0);
    }
    public final File invoke(){
       File obj = PatchProxy.apply(null, this, RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       obj = new File(uApplication.getCacheDir(), ".nebula_download");
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
