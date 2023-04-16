package cud.n;
import okio.a;
import java.net.Socket;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.lang.Throwable;
import java.lang.AssertionError;
import okio.l;
import java.util.logging.Level;
import java.lang.StringBuilder;

public final class n extends a	// class@001444
{
    public final Logger a;
    public final Socket b;

    public void n(Socket p0){
       a.q(p0, "socket");
       super();
       this.b = p0;
       this.a = Logger.getLogger("okio.Okio");
    }
    public IOException newTimeoutException(IOException p0){
       SocketTimeoutException socketTimeou = new SocketTimeoutException("timeout");
       if (p0 != null) {
          socketTimeou.initCause(p0);
       }
       return socketTimeou;
    }
    public void timedOut(){
       String str = "Failed to close timed out socket ";
       try{
          this.b.close();
       }catch(java.lang.Exception e1){
          this.a.log(Level.WARNING, str+this.b, e1);
       }catch(java.lang.AssertionError e1){
          if (!l.e(e1)) {
             throw e1;
          }
          this.a.log(Level.WARNING, str+this.b, e1);
       }
       return;
    }
}
