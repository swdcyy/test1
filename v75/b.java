package v75.b;
import v75.d$a;
import java.lang.Object;
import v75.d;
import java.nio.channels.FileLock;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.service.a;

public final class b implements d$a	// class@002676
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(){
       try{
          FileLock c = d.c;
          if (c != null) {
             c.release();
             d.c = null;
          }
          String str = "FileLocker";
          String str1 = "lockByMessageSdk succeeded!";
          try{
             a.e(str, str1);
             a.N1().f1(3);
             return;
          }catch(android.os.RemoteException e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
