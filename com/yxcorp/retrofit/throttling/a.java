package com.yxcorp.retrofit.throttling.a;
import erd.g;
import java.lang.Object;
import njd.a;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import sjd.b;
import java.lang.String;
import sjd.a;
import java.util.Map;

public class a implements g	// class@00097f
{

    public void a(){
       super();
    }
    public void accept(Object p0){
       if (!p0 instanceof a) {
          return;
       }
       if (p0.b() != e.h().g().U()) {
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
          _monitor_enter(uob);
          uob.a.put(response.getPath(), new a(p0.m(), p0.l()));
          _monitor_exit(uob);
          return;
       }
    }
}
