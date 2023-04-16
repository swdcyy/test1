package com.alipay.android.phone.mrpc.core.c;
import org.apache.http.HttpRequestInterceptor;
import java.lang.Object;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;
import android.os.Looper;
import java.lang.RuntimeException;
import java.lang.String;

public final class c implements HttpRequestInterceptor	// class@000e48
{

    public void c(){
       super();
    }
    public final void process(HttpRequest p0,HttpContext p1){
       if (Looper.myLooper() == null || Looper.myLooper() != Looper.getMainLooper()) {
          return;
       }
       throw new RuntimeException("This thread forbids HTTP requests");
    }
}
