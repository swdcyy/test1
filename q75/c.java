package q75.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.lang.Boolean;
import com.kwai.chat.kwailink.utils.Utils;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;

public class c	// class@002243
{
    public KwaiLinkDefaultServerInfo a;
    public String b;
    public static c c;

    public void c(){
       super();
       this.a = null;
    }
    public static c b(){
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, null, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.c == null) {
          _monitor_enter(uoc);
          if (c.c == null) {
             c.c = new c();
          }
          _monitor_exit(uoc);
       }
       return c.c;
    }
    public synchronized int[] a(){
       int[] ointArray;
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       int i = 3;
       if (obj == null) {
          ointArray = new int[i];
          ointArray[0] = 443;
          ointArray[1] = 80;
          ointArray[2] = 0x36b0;
       }else {
          ointArray = obj.d;
          if (ointArray == null || ointArray.length <= 0) {
             ointArray = new int[i]{443,'P',0x36b0};
          }
       }
       return ointArray;
    }
    public synchronized boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (Utils.getStringNotNull(p0)).equals(Utils.getStringNotNull(this.b));
    }
    public synchronized void d(String p0){
       this.b = p0;
    }
    public synchronized void e(KwaiLinkDefaultServerInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.a = p0;
       if (p0 != null) {
          a.e("KwaiLinkIpInfoManager", "Set default server info: "+this.a);
       }
       return;
    }
}
