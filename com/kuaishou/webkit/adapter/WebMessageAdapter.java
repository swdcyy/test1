package com.kuaishou.webkit.adapter.WebMessageAdapter;
import android.webkit.WebMessage;
import com.kuaishou.webkit.WebMessage;
import java.lang.String;
import android.webkit.WebMessagePort;
import com.kuaishou.webkit.WebMessagePort;
import com.kuaishou.webkit.adapter.WebMessagePortImpl;

public class WebMessageAdapter extends WebMessage	// class@0012bf
{
    public WebMessage mStub;

    public void WebMessageAdapter(WebMessage p0){
       super(null);
       this.mStub = p0;
    }
    public void WebMessageAdapter(String p0){
       super(p0);
       this.mStub = new WebMessage(p0);
    }
    public void WebMessageAdapter(String p0,WebMessagePort[] p1){
       super(p0, null);
       if (p1 == null) {
          this.mStub = new WebMessage(p0, null);
       }else {
          int len = p1.length;
          WebMessagePortImpl[] webMessagePo = new WebMessagePortImpl[len];
          for (int i = 0; i < len; i = i + 1) {
             WebMessagePortImpl webMessagePo1 = (p1[i] != null)? new WebMessagePortImpl(p1[i]): null;
             webMessagePo[i] = webMessagePo1;
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
       WebMessagePort[] webMessagePo = new WebMessagePort[len];
       for (int i = 0; i < len; i = i + 1) {
          WebMessagePort stub = (ports[i] != null)? ports[i].getStub(): null;
          webMessagePo[i] = stub;
       }
       return webMessagePo;
    }
}
