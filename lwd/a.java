package lwd.a;
import org.java_websocket.d;
import java.lang.Object;
import org.java_websocket.a;
import org.java_websocket.drafts.b;
import fwd.b;
import fwd.d;
import org.java_websocket.c;
import java.util.List;
import org.java_websocket.enums.Role;
import java.util.ArrayList;
import org.java_websocket.drafts.c;
import java.nio.channels.SocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ByteChannel;

public class a implements d	// class@001ced
{

    public void a(){
       super();
    }
    public b a(a p0,b p1){
       return new d(p0, p1);
    }
    public d a(a p0,b p1){
       return new d(p0, p1);
    }
    public b b(a p0,List p1){
       return this.b(p0, p1);
    }
    public d b(a p0,List p1){
       d uod = new d(p0, null);
       uod.l = Role.SERVER;
       if (p1 == null || p1.isEmpty()) {
          ArrayList uArrayList = new ArrayList();
          uod.j = uArrayList;
          uArrayList.add(new c());
       }else {
          uod.j = p1;
       }
       return uod;
    }
    public void close(){
    }
    public ByteChannel wrapChannel(SocketChannel p0,SelectionKey p1){
       return p0;
    }
}
