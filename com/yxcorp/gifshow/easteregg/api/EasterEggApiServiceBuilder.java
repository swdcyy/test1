package com.yxcorp.gifshow.easteregg.api.EasterEggApiServiceBuilder;
import com.smile.gifshow.annotation.plugin.Factory;
import aaa.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public class EasterEggApiServiceBuilder extends Factory	// class@001ac9
{

    public void EasterEggApiServiceBuilder(){
       super();
    }
    public a newInstance(){
       Object obj = PatchProxy.apply(null, this, EasterEggApiServiceBuilder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.b(b.a(-1961311520).a(RouteType.API, d.b), a.class);
       a.o(obj, "RetrofitManager.create\(\n¡­Service::class.java\n    \)");
       return obj;
    }
    public Object newInstance(){
       return this.newInstance();
    }
}
