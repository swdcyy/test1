package hb6.e;
import java.util.concurrent.Callable;
import com.kwai.framework.network.dns.KwaiDns;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dns;
import java.util.Iterator;
import java.net.InetAddress;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tpd.a;
import java.util.Set;

public final class e implements Callable	// class@001747
{
    public final KwaiDns b;
    public final String c;

    public void e(KwaiDns p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       boolean b;
       e tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = tb.a.lookup(this.c).iterator();
       while (iterator.hasNext()) {
          InetAddress inetAddress = iterator.next();
          Object obj = PatchProxy.applyOneRefs(inetAddress, tb, KwaiDns.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tb.b.get().contains(inetAddress) || inetAddress.isLoopbackAddress()){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             uArrayList.add(inetAddress);
          }
       }
       return uArrayList;
    }
}
