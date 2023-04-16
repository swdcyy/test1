package com.kuaishou.webkit.adapter.ServiceWorkerClientAdapter;
import android.webkit.ServiceWorkerClient;
import com.kuaishou.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.kuaishou.webkit.adapter.WebResourceRequestAdapter;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import java.lang.String;
import java.io.InputStream;
import java.util.Map;
import java.lang.Exception;

public class ServiceWorkerClientAdapter extends ServiceWorkerClient	// class@0012ad
{
    public ServiceWorkerClient mStub;

    public void ServiceWorkerClientAdapter(ServiceWorkerClient p0){
       super();
       this.mStub = p0;
    }
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest p0){
       ServiceWorkerClientAdapter tmStub = this.mStub;
       WebResourceResponse webResourceR = null;
       WebResourceRequestAdapter webResourceR1 = (p0 != null)? new WebResourceRequestAdapter(p0): webResourceR;
       WebResourceResponse webResourceR2 = tmStub.shouldInterceptRequest(webResourceR1);
       if (webResourceR2 == null) {
          return webResourceR;
       }else {
          WebResourceResponse webResourceR3 = new WebResourceResponse(webResourceR2.getMimeType(), webResourceR2.getEncoding(), webResourceR2.getData());
          Map responseHead = webResourceR2.getResponseHeaders();
          try{
             webResourceR3.setResponseHeaders(responseHead);
             webResourceR3.setStatusCodeAndReasonPhrase(webResourceR2.getStatusCode(), webResourceR2.getReasonPhrase());
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          return webResourceR3;
       }
    }
}
