package ag8.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@00008f
{
    public Map headers;
    public String method;
    public List protocols;
    public String taskId;
    public long timeout;
    public String url;

    public void d(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WebSocketRequest{taskId=\'"+this.taskId+'''+", url=\'"+this.url+'''+", timeout=\'"+this.timeout+'''+", method=\'"+this.method+'''+", protocols="+this.protocols+", headers="+this.headers+'}';
    }
}
