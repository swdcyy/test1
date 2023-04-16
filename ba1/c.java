package ba1.c;
import java.lang.Runnable;
import ba1.d;
import com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import lf3.d;

public final class c implements Runnable	// class@000328
{
    public final d b;
    public final SocketMessages$SocketMessage c;

    public void c(d p0,SocketMessages$SocketMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       if (tb.b == null) {
       }else {
          Iterator iterator = tb.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(tc.payloadType, tc.payload);
          }
       }
       return;
    }
}
