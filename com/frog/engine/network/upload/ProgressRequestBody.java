package com.frog.engine.network.upload.ProgressRequestBody;
import okhttp3.RequestBody;
import com.frog.engine.network.upload.ProgressRequestBody$Listener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.IOException;
import okhttp3.MediaType;
import okio.c;
import com.frog.engine.network.upload.ProgressRequestBody$CountingSink;
import okio.m;
import okio.l;
import cud.j;

public class ProgressRequestBody extends RequestBody	// class@001559
{
    public ProgressRequestBody$CountingSink mCountingSink;
    public RequestBody mDelegate;
    public ProgressRequestBody$Listener mListener;

    public void ProgressRequestBody(RequestBody p0,ProgressRequestBody$Listener p1){
       super();
       this.mDelegate = p0;
       this.mListener = p1;
    }
    public long contentLength(){
       Object obj = PatchProxy.apply(null, this, ProgressRequestBody.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          return this.mDelegate.contentLength();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          return -1;
       }
    }
    public MediaType contentType(){
       Object obj = PatchProxy.apply(null, this, ProgressRequestBody.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mDelegate.contentType();
    }
    public void writeTo(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressRequestBody.class, "3")) {
          return;
       }
       ProgressRequestBody$CountingSink uCountingSin = new ProgressRequestBody$CountingSink(this, p0);
       this.mCountingSink = uCountingSin;
       p0 = l.c(uCountingSin);
       this.mDelegate.writeTo(p0);
       p0.flush();
       return;
    }
}
