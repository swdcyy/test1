package com.frog.engine.network.webscoket.WebSocketRequest;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class WebSocketRequest	// class@00155e
{
    public Map headers;
    public String method;
    public boolean perMessageDeflate;
    public List protocols;
    public int taskId;
    public boolean tcpNoDelay;
    public int timeout;
    public String url;

    public void WebSocketRequest(){
       super();
       this.timeout = 60;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WebSocketRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WebSocketRequest{taskId=\'"+this.taskId+'''+", url=\'"+this.url+'''+", method=\'"+this.method+'''+", protocols="+this.protocols+", headers="+this.headers+",timeout="+this.timeout+",tcpNoDelay"+this.tcpNoDelay+",perMessageDeflate"+this.perMessageDeflate+'}';
    }
}
