package com.yxcorp.gifshow.albumwrapper.config.KwaiDefaultConfigProviderImpl;
import w69.m;
import java.lang.Object;
import w69.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y79.a;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;

public final class KwaiDefaultConfigProviderImpl implements m	// class@001b54
{

    public void KwaiDefaultConfigProviderImpl(){
       super();
    }
    public c getConfiguration(){
       Object obj = PatchProxy.apply(null, this, KwaiDefaultConfigProviderImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a();
    }
    public Application getContext(){
       Application obj = PatchProxy.apply(null, this, KwaiDefaultConfigProviderImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       return obj;
    }
}
