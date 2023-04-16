package com.kuaishou.webkit.adapter.WebResourceRequestAdapter;
import com.kuaishou.webkit.WebResourceRequest;
import android.webkit.WebResourceRequest;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import android.net.Uri;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;

public class WebResourceRequestAdapter implements WebResourceRequest	// class@0012c4
{
    public WebResourceRequest mStub;

    public void WebResourceRequestAdapter(WebResourceRequest p0){
       super();
       this.mStub = p0;
    }
    public String getMethod(){
       return this.mStub.getMethod();
    }
    public Map getRequestHeaders(){
       return this.mStub.getRequestHeaders();
    }
    public Uri getUrl(){
       return this.mStub.getUrl();
    }
    public boolean hasGesture(){
       return this.mStub.hasGesture();
    }
    public boolean isForMainFrame(){
       return this.mStub.isForMainFrame();
    }
    public boolean isRedirect(){
       if (SystemApiVersionChecker.check(24, "WebResourceRequest", "isRedirect\(\)")) {
          return this.mStub.isRedirect();
       }
       return false;
    }
}
