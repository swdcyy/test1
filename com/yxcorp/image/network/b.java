package com.yxcorp.image.network.b;
import okhttp3.EventListener$Factory;
import java.lang.Object;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Request;
import com.yxcorp.image.network.ImageHttpStatistics;
import java.lang.Class;
import ab.e;
import com.yxcorp.image.network.NetworkRequestInfo;
import q0d.j;

public final class b implements EventListener$Factory	// class@001a1e
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final EventListener create(Call p0){
       p0 = p0.request().tag(ImageHttpStatistics.class);
       e.d(p0);
       NetworkRequestInfo networkReque = new NetworkRequestInfo();
       p0.mRequestInfo = networkReque;
       return new j(networkReque);
    }
}
