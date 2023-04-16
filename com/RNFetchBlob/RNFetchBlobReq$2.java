package com.RNFetchBlob.RNFetchBlobReq$2;
import okhttp3.Interceptor;
import com.RNFetchBlob.RNFetchBlobReq;
import okhttp3.Request;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReactApplicationContext;
import com.RNFetchBlob.RNFetchBlobReq$b;
import java.lang.Enum;
import m4.a;
import okhttp3.ResponseBody;
import l4.a;
import java.lang.Boolean;
import java.lang.String;
import m4.b;
import okhttp3.Response$Builder;
import java.lang.RuntimeException;

public class RNFetchBlobReq$2 implements Interceptor	// class@000d5a
{
    public final Request a;
    public final RNFetchBlobReq b;

    public void RNFetchBlobReq$2(RNFetchBlobReq p0,Request p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       a uoa;
       int i = 1;
       try{
          Response response = p0.proceed(this.a);
          Object obj = this.b.b.get();
          if (obj == null) {
             throw new RuntimeException("context destroyed unexpectedly");
          }
          int i1 = RNFetchBlobReq$b.b[this.b.p.ordinal()];
          if (i1 != i) {
             if (i1 != 2) {
                uoa = new a(obj, this.b.d, response.body(), this.b.c.l.booleanValue());
             }else {
                RNFetchBlobReq$2 tb = this.b;
                b uob = new b(obj, this.b.d, response.body(), tb.h, tb.c.j.booleanValue());
             }
          }else {
             uoa = new a(obj, this.b.d, response.body(), this.b.c.l.booleanValue());
          }
          return response.newBuilder().body(uoa).build();
       }catch(java.net.SocketException e0){
          this.b.s = e0;
       }catch(java.net.SocketTimeoutException e0){
          this.b.s = e0;
       }catch(java.lang.Exception e0){
       }
       return p0.proceed(p0.request());
    }
}
