package gwd.a$a;
import java.lang.Runnable;
import gwd.a;
import java.lang.Object;
import java.net.Socket;
import fwd.b;
import java.lang.Exception;
import java.lang.Thread;
import fwd.d;
import java.util.concurrent.BlockingQueue;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.IOException;

public class a$a implements Runnable	// class@000f67
{
    public final a b;
    public final a c;

    public void a$a(a p0,a p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public final void a(){
       try{
          a socket = this.c.socket;
          if (socket != null) {
             socket.close();
          }
       }catch(java.io.IOException e0){
          this.c.onWebsocketError(this.b, e0);
       }
       return;
    }
    public final void b(){
       while (true) {
          int i = 0;
          break ;
       }
       try{
          if (!Thread.interrupted()) {
             ByteBuffer uByteBuffer1 = this.c.engine.b.take();
             byte[] uobyteArray1 = uByteBuffer1.array();
             this.c.ostream.write(uobyteArray1, i, uByteBuffer1.limit());
             this.c.ostream.flush();
          }
       }catch(java.lang.InterruptedException e0){
          Iterator iterator = this.c.engine.b.iterator();
       label_0034 :
          if (iterator.hasNext()) {
             ByteBuffer uByteBuffer = iterator.next();
             byte[] uobyteArray = uByteBuffer.array();
             this.c.ostream.write(uobyteArray, e0, uByteBuffer.limit());
             this.c.ostream.flush();
             goto label_0034 ;
          }else {
             Thread.currentThread().interrupt();
          }
       }
       return;
    }
    public void run(){
       int i;
       Thread.currentThread().setName("WebSocketWriteThread-"+Thread.currentThread().getId());
       try{
          i = 0;
          this.b();
       }catch(java.io.IOException e1){
          this.c.handleIOException(e1);
       }
       this.a();
       this.c.writeThread = i;
       return;
    }
}
