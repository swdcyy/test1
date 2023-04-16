package com.yxcorp.gifshow.growth.test.network.api.TestApi$userApi$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import wqa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wqa.c;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public final class TestApi$userApi$2 extends Lambda implements a	// class@001547
{
    public static final TestApi$userApi$2 INSTANCE;

    static {
       TestApi$userApi$2.INSTANCE = new TestApi$userApi$2();
    }
    public void TestApi$userApi$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, TestApi$userApi$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.b(new c(RouteType.USER_INNER, d.b), a.class);
    }
}
