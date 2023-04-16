package com.kwai.yoda.kernel.helper.GsonHelper$Companion$sGson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder$a;
import zk.d;
import ny7.e;
import com.kwai.yoda.kernel.bridge.FunctionResultGsonAdapter;
import java.lang.reflect.Type;

public final class GsonHelper$Companion$sGson$2 extends Lambda implements a	// class@0012a3
{
    public static final GsonHelper$Companion$sGson$2 INSTANCE;

    static {
       GsonHelper$Companion$sGson$2.INSTANCE = new GsonHelper$Companion$sGson$2();
    }
    public void GsonHelper$Companion$sGson$2(){
       super(0);
    }
    public final Gson invoke(){
       d obj = PatchProxy.apply(null, this, GsonHelper$Companion$sGson$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiGsonBuilder.g.a().m();
       obj.f(e.class, new FunctionResultGsonAdapter());
       return obj.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
