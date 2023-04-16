package a85.c;
import java.lang.Object;
import java.lang.String;
import a85.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import a85.c$a;
import a85.a;
import java.lang.Boolean;
import java.net.Socket;
import android.os.SystemClock;
import java.lang.Thread;

public class c	// class@00003c
{

    public void c(){
       super();
    }
    public static void a(String p0,int p1,int p2,c$b p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, c.class, "2")) {
          return;
       }
       long[] olongArray = new long[]{0};
       c$a uoa = new c$a(p0, p1, p3, olongArray);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, uoa, a.class, "1")) {
          try{
             uoa.f.setReuseAddress(1);
          }catch(java.net.SocketException e0){
          }
       }
    }
}
