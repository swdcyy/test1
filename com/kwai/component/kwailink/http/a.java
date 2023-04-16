package com.kwai.component.kwailink.http.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.common.base.b;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import java.io.IOException;
import zb6.a;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import java.net.UnknownHostException;
import aegon.chrome.net.NetworkException;
import javax.net.ssl.SSLException;
import org.json.JSONException;

public abstract class a implements g	// class@0009a3
{

    public void a(){
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       KwaiException kwaiExceptio = -1;
       p0 = b.c(p0);
       if (p0 instanceof KwaiException) {
          kwaiExceptio = p0.mErrorCode;
       }else if(p0 instanceof KwaiIMException){
          kwaiExceptio = p0.mErrorCode;
       }else if(p0 instanceof IOException){
          if (a.g(p0)) {
             if (p0 instanceof SocketTimeoutException || p0 instanceof ConnectTimeoutException) {
                kwaiExceptio = -9001;
             }else if(p0 instanceof UnknownHostException){
                kwaiExceptio = -9002;
             }else {
                kwaiExceptio = -9003;
             }
          }else if(p0 instanceof NetworkException){
             kwaiExceptio = p0.getErrorCode();
          }else if(p0 instanceof SSLException){
             kwaiExceptio = -9006;
          }else {
             kwaiExceptio = -9004;
          }
       }else if(p0 instanceof JSONException){
          kwaiExceptio = -9005;
       }
       this.b(kwaiExceptio);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
    public abstract void b(int p0);
}
