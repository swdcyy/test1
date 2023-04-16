package com.android.kwai.foundation.network.core.progress.request.RequestProgressBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import com.android.kwai.foundation.network.IRpcService$RequestProgressListener;
import com.android.kwai.foundation.network.ThreadType;
import java.io.IOException;
import okhttp3.MediaType;
import okio.c;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.lang.String;
import okhttp3.internal.http.CallServerInterceptor;
import java.lang.Class;
import com.android.kwai.foundation.network.core.progress.request.RequestProgressBody$ByteSink;
import okio.m;
import okio.l;
import cud.j;

public class RequestProgressBody extends RequestBody	// class@000ef4
{
    public long mContentLength;
    public Handler mHandler;
    public RequestBody mRequestBody;
    public IRpcService$RequestProgressListener mRequestProgressListener;
    public ThreadType mThreadType;

    public void RequestProgressBody(Request p0,CallbackWrapper p1){
       super();
       this.mContentLength = 0;
       this.mHandler = new Handler(Looper.getMainLooper());
       this.mRequestBody = p0.body();
       this.mRequestProgressListener = p1.getCallback();
       this.mThreadType = p1.getThreadType();
    }
    public long contentLength(){
       try{
          if (!this.mContentLength) {
             this.mContentLength = this.mRequestBody.contentLength();
          }
          return this.mContentLength;
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          return -1;
       }
    }
    public MediaType contentType(){
       return this.mRequestBody.contentType();
    }
    public boolean isDuplex(){
       return this.mRequestBody.isDuplex();
    }
    public boolean isOneShot(){
       return this.mRequestBody.isOneShot();
    }
    public void writeTo(c p0){
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       int i = 1;
       if (stackTrace == null || (stackTrace.length <= i || !(stackTrace[i].getClassName()).equals(CallServerInterceptor.class.getName()))) {
          i = false;
       }
       p0 = l.c(new RequestProgressBody$ByteSink(this, p0, i));
       this.mRequestBody.writeTo(p0);
       p0.flush();
       return;
    }
}
