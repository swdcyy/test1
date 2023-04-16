package com.kuaishou.krn.bridges.weblogger.KrnWebLoggerBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.krn.c;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KrnWebLoggerBridge extends KrnBridge	// class@000833
{
    public SharedPreferences mSharedPreferences;

    public void KrnWebLoggerBridge(ReactApplicationContext p0){
       super(p0);
    }
    public void getLoggerDebugConfig(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnWebLoggerBridge.class, "1")) {
          return;
       }
       String str = "";
       if (this.getCurrentActivity() == null) {
          p0.resolve(str);
          return;
       }else {
          int i = 0;
          if (this.mSharedPreferences == null) {
             this.mSharedPreferences = c.b().h(str, i);
          }
          String str1 = this.mSharedPreferences.getString("LoggingUploadConfig", str);
          if (TextUtils.isEmpty(str1)) {
             SharedPreferences sharedPrefer = c.b().h("KanasSharedPreference", i);
             this.mSharedPreferences = sharedPrefer;
             str1 = sharedPrefer.getString("debug_logger_config", str);
          }
          if (TextUtils.isEmpty(str1)) {
             this.mSharedPreferences = null;
          }
          p0.resolve(str1);
          return;
       }
    }
    public String getName(){
       return "WebLoggerDebugger";
    }
}
