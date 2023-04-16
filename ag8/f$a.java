package ag8.f$a;
import gwd.a;
import ag8.f;
import java.net.URI;
import org.java_websocket.drafts.b;
import java.util.Map;
import ag8.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import jwd.h;
import java.util.Iterator;
import jwd.f;
import java.util.HashMap;

public class f$a extends a	// class@000091
{
    public final b b;
    public final f c;

    public void f$a(f p0,URI p1,b p2,Map p3,b p4){
       this.c = p0;
       this.b = p4;
       super(p1, p2, p3);
    }
    public void onClose(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, f$a.class, "4")) {
          return;
       }
       p2.d = 3;
       this.b.onClose(p0, p1);
       return;
    }
    public void onError(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "5")) {
          return;
       }
       this.b.onError(p0);
       return;
    }
    public void onMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       try{
          this.b.onMessage(p0);
       }catch(java.lang.OutOfMemoryError e0){
          this.onError(new RuntimeException("message is too big "+p0.length(), e0));
       }
       return;
    }
    public void onMessage(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       this.b.onMessage(p0);
       return;
    }
    public void onOpen(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.c.d = 1;
       Iterator iterator = p0.iterateHttpFields();
       HashMap hashMap = new HashMap();
       while (iterator.hasNext()) {
          String str = iterator.next();
          hashMap.put(str, p0.getFieldValue(str));
       }
       this.b.onOpen(hashMap);
       return;
    }
}
