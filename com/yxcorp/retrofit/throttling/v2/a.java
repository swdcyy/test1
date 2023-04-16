package com.yxcorp.retrofit.throttling.v2.a;
import erd.g;
import java.lang.Object;
import njd.a;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import com.yxcorp.retrofit.throttling.v2.b;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.retrofit.throttling.v2.b$c;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

public class a implements g	// class@000982
{

    public void a(){
       super();
    }
    public void accept(Object p0){
       if (!p0 instanceof a) {
          return;
       }
       if (p0.b() != e.h().g().Q()) {
          return;
       }
       Response response = null;
       if (p0.n() != null) {
          response = p0.n().request().url().url();
       }
       if (response == null) {
          return;
       }else {
          b uob = b.a();
          Objects.requireNonNull(uob);
          uob.a.put(response.getPath(), new b$c((SystemClock.elapsedRealtime() + p0.h()), p0.c()));
          return;
       }
    }
}
