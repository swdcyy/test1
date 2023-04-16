package ag8.f;
import ag8.e;
import n88.b;
import java.lang.Object;
import java.lang.System;
import java.util.Random;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import gwd.a;
import ag8.d;
import ag8.b;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import kwd.b;
import org.java_websocket.drafts.c;
import java.util.Collections;
import ag8.f$a;
import java.net.URI;
import org.java_websocket.drafts.b;
import java.util.Map;
import fwd.a;
import java.lang.RuntimeException;
import java.nio.ByteBuffer;

public class f implements e	// class@000092
{
    public a a;
    public b b;
    public String c;
    public int d;

    public void f(b p0){
       super();
       this.d = 0;
       this.b = p0;
       this.c = String.valueOf(((System.currentTimeMillis() + (long)this.hashCode()) + (long)new Random().nextInt(100)));
    }
    public String a(){
       return this.c;
    }
    public void close(int p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "2")) {
          return;
       }
       this.d = 2;
       if (p0 > 0) {
          this.a.close(p0, p1);
       }else {
          this.a.close(1000, p1);
       }
       return;
    }
    public void o(d p0,b p1){
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (this.a != null) {
          throw new RuntimeException("WebSocketTask ≤ªø…∏¥”√");
       }
       this.d = 0;
       d protocols = p0.protocols;
       if (protocols == null || protocols.isEmpty()) {
          uoc = new c();
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = protocols.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new b(iterator.next()));
          }
          uoc = new c(Collections.EMPTY_LIST, uArrayList);
       }
       f$a uoa = new f$a(this, URI.create(p0.url), uoc, p0.headers, p1);
       this.a = uoc;
       if (p0.timeout - 1000 < 0) {
          p0.timeout = 0x3a98;
       }
       uoc.setConnectionLostTimeout((int)(p0.timeout / 1000));
       this.a.connect();
       return;
    }
    public void send(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       this.a.send(p0);
       return;
    }
    public void send(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       this.a.send(p0);
       return;
    }
}
