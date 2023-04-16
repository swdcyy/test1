package com.kuaishou.webkit.adapter.WebMessageImpl;
import com.kuaishou.webkit.WebMessage;
import android.webkit.WebMessage;
import java.lang.String;
import com.kuaishou.webkit.WebMessagePort;
import android.webkit.WebMessagePort;
import com.kuaishou.webkit.adapter.WebMessagePortImpl;

public class WebMessageImpl extends WebMessage	// class@0012c0
{
    public WebMessage mStub;

    public void WebMessageImpl(WebMessage p0){
       super(null);
       this.mStub = p0;
    }
    public void WebMessageImpl(String p0){
       super(p0);
       this.mStub = new WebMessage(p0);
    }
    public void WebMessageImpl(String p0,WebMessagePort[] p1){
       super(p0, p1);
       if (p1 == null) {
          this.mStub = new WebMessage(p0, null);
       }else {
          int len = p1.length;
          WebMessagePort[] webMessagePo = new WebMessagePort[len];
          for (int i = 0; i < len; i = i + 1) {
             WebMessagePort stub = (p1[i] != null)? p1[i].getStub(): null;
             webMessagePo[i] = stub;
          }
          this.mStub = new WebMessage(p0, webMessagePo);
       }
       return;
    }
    public String getData(){
       return this.mStub.getData();
    }
    public WebMessagePort[] getPorts(){
       WebMessagePort[] ports = this.mStub.getPorts();
       if (ports == null) {
          return null;
       }
       int len = ports.length;
       WebMessagePortImpl[] webMessagePo = new WebMessagePortImpl[len];
       for (int i = 0; i < len; i = i + 1) {
          WebMessagePortImpl webMessagePo1 = (ports[i] != null)? new WebMessagePortImpl(ports[i]): null;
          webMessagePo[i] = webMessagePo1;
       }
       return webMessagePo;
    }
}
