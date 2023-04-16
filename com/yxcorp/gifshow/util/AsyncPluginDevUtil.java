package com.yxcorp.gifshow.util.AsyncPluginDevUtil;
import java.lang.String;
import xf6.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.AsyncPluginLoadException;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import o56.c;
import o56.a;

public final class AsyncPluginDevUtil	// class@001ece
{
    public static String a;
    public static boolean b;
    public static int c;
    public static final AsyncPluginDevUtil d;

    static {
       AsyncPluginDevUtil.d = new AsyncPluginDevUtil();
       String str = l.g("async_plugin_dev_filter_modules", "");
       a.o(str, "TestConfigManager.getStr¡­g\(KEY_FILTER_MODULES, \"\"\)");
       AsyncPluginDevUtil.a = str;
       AsyncPluginDevUtil.b = true;
       AsyncPluginDevUtil.c = l.e("async_plugin_dev_mock_fail_retry_count", true);
    }
    public void AsyncPluginDevUtil(){
       super();
    }
    public static final boolean d(Throwable p0){
       boolean code;
       if (p0 instanceof AsyncPluginLoadException) {
          code = p0.getCode();
       }else if(p0 instanceof PluginInstallException){
          code = p0.getCode();
       }else {
          code = -1;
       }
       code = (code >= 0x4e20)? true: false;
       return code;
    }
    public final String a(){
       return AsyncPluginDevUtil.a;
    }
    public final boolean b(){
       return AsyncPluginDevUtil.b;
    }
    public final boolean c(){
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       return uoc.c();
    }
}
