package com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv$configSavePath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import java.io.File;
import mb7.a;

public final class DynamicTextEnv$configSavePath$2 extends Lambda implements a	// class@0013e2
{
    public static final DynamicTextEnv$configSavePath$2 INSTANCE;

    static {
       DynamicTextEnv$configSavePath$2.INSTANCE = new DynamicTextEnv$configSavePath$2();
    }
    public void DynamicTextEnv$configSavePath$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, DynamicTextEnv$configSavePath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       return uApplication.getFilesDir()+"/.texts/"+a.c.a();
    }
}
