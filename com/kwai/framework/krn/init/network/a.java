package com.kwai.framework.krn.init.network.a;
import qe.d;
import java.lang.Object;
import okhttp3.OkHttpClient;
import y86.u;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import okhttp3.OkHttpClient$Builder;
import qe.i;
import okhttp3.CookieJar;

public final class a implements d	// class@0015eb
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final OkHttpClient a(){
       return new u(RouteType.API, d.b, true, true).createOkHttpClientBuilder(10).cookieJar(new i()).build();
    }
}
