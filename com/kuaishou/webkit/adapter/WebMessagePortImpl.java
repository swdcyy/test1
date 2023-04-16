package com.kuaishou.webkit.adapter.WebMessagePortImpl;
import com.kuaishou.webkit.WebMessagePort;
import android.webkit.WebMessagePort;
import com.kuaishou.webkit.WebMessage;
import com.kuaishou.webkit.adapter.WebMessageAdapter;
import android.webkit.WebMessage;
import com.kuaishou.webkit.WebMessagePort$WebMessageCallback;
import com.kuaishou.webkit.adapter.WebMessagePortImpl$WebMessageCallbackAdapter;
import android.webkit.WebMessagePort$WebMessageCallback;
import android.os.Handler;

public class WebMessagePortImpl extends WebMessagePort	// class@0012c2
{
    public WebMessagePort mStub;

    public void WebMessagePortImpl(WebMessagePort p0){
       super();
       this.mStub = p0;
    }
    public void close(){
       this.mStub.close();
    }
    public WebMessagePort getStub(){
       return this.mStub;
    }
    public void postMessage(WebMessage p0){
       WebMessagePortImpl tmStub = this.mStub;
       WebMessageAdapter webMessageAd = (p0 != null)? new WebMessageAdapter(p0): null;
       tmStub.postMessage(webMessageAd);
       return;
    }
    public void setWebMessageCallback(WebMessagePort$WebMessageCallback p0){
       WebMessagePortImpl tmStub = this.mStub;
       WebMessagePortImpl$WebMessageCallbackAdapter webMessageCa = (p0 != null)? new WebMessagePortImpl$WebMessageCallbackAdapter(this, p0): null;
       tmStub.setWebMessageCallback(webMessageCa);
       return;
    }
    public void setWebMessageCallback(WebMessagePort$WebMessageCallback p0,Handler p1){
       WebMessagePortImpl tmStub = this.mStub;
       WebMessagePortImpl$WebMessageCallbackAdapter webMessageCa = (p0 != null)? new WebMessagePortImpl$WebMessageCallbackAdapter(this, p0): null;
       tmStub.setWebMessageCallback(webMessageCa, p1);
       return;
    }
}
