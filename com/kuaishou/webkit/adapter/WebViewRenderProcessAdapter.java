package com.kuaishou.webkit.adapter.WebViewRenderProcessAdapter;
import com.kuaishou.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcess;

public class WebViewRenderProcessAdapter extends WebViewRenderProcess	// class@0012c9
{
    public WebViewRenderProcess mStub;

    public void WebViewRenderProcessAdapter(WebViewRenderProcess p0){
       super();
       this.mStub = p0;
    }
    public boolean terminate(){
       return this.mStub.terminate();
    }
}
