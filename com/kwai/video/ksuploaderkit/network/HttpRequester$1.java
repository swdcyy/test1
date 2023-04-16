package com.kwai.video.ksuploaderkit.network.HttpRequester$1;
import byd.a;
import com.kwai.video.ksuploaderkit.network.HttpRequester;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.Class;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import java.lang.Object;
import retrofit2.a;
import java.lang.Throwable;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import retrofit2.p;
import java.lang.System;

public class HttpRequester$1 implements a	// class@0009b0
{
    public final HttpRequester this$0;
    public final HttpRequester$ICallback val$callback;
    public final HttpRequestInfo val$httpRequestInfo;
    public final Class val$modelClass;
    public final long val$start;

    public void HttpRequester$1(HttpRequester p0,HttpRequestInfo p1,long p2,Class p3,HttpRequester$ICallback p4){
       this.this$0 = p0;
       this.val$httpRequestInfo = p1;
       this.val$start = p2;
       this.val$modelClass = p3;
       this.val$callback = p4;
       super();
    }
    public void onFailure(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpRequester$1.class, "2")) {
          return;
       }
       this.val$httpRequestInfo.setMessage(p1.toString());
       this.val$httpRequestInfo.setNetErrorCode(NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED);
       this.val$callback.onFinished(null, this.val$httpRequestInfo);
       return;
    }
    public void onResponse(a p0,p p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpRequester$1.class, "1")) {
          return;
       }
       this.val$httpRequestInfo.setTimeCost((System.currentTimeMillis() - this.val$start));
       this.val$callback.onFinished(this.this$0.parseResponse(p1, this.val$modelClass, this.val$httpRequestInfo), this.val$httpRequestInfo);
       return;
    }
}
