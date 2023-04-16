package com.kuaishou.webkit.adapter.WebMessagePortImpl$WebMessageCallbackAdapter;
import android.webkit.WebMessagePort$WebMessageCallback;
import com.kuaishou.webkit.adapter.WebMessagePortImpl;
import com.kuaishou.webkit.WebMessagePort$WebMessageCallback;
import android.webkit.WebMessagePort;
import android.webkit.WebMessage;
import com.kuaishou.webkit.adapter.WebMessageImpl;
import com.kuaishou.webkit.WebMessagePort;
import com.kuaishou.webkit.WebMessage;

public class WebMessagePortImpl$WebMessageCallbackAdapter extends WebMessagePort$WebMessageCallback	// class@0012c1
{
    public WebMessagePort$WebMessageCallback mStub;
    public final WebMessagePortImpl this$0;

    public void WebMessagePortImpl$WebMessageCallbackAdapter(WebMessagePortImpl p0,WebMessagePort$WebMessageCallback p1){
       this.this$0 = p0;
       super();
       this.mStub = p1;
    }
    public void onMessage(WebMessagePort p0,WebMessage p1){
       WebMessagePortImpl$WebMessageCallbackAdapter tmStub = this.mStub;
       WebMessageImpl webMessageIm = null;
       WebMessagePortImpl webMessagePo = (p0 != null)? new WebMessagePortImpl(p0): webMessageIm;
       if (p1 != null) {
          webMessageIm = new WebMessageImpl(p1);
       }
       tmStub.onMessage(webMessagePo, webMessageIm);
       return;
    }
}
