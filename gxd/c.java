package gxd.c;
import exd.a;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import exd.c;
import java.util.Map;
import gxd.b;
import java.util.Queue;

public class c implements a	// class@000f6c
{
    public boolean a;
    public final Map b;
    public final LinkedBlockingQueue c;

    public void c(){
       super();
       this.a = false;
       this.b = new HashMap();
       this.c = new LinkedBlockingQueue();
    }
    public synchronized c a(String p0){
       b uob = this.b.get(p0);
       if (uob == null) {
          uob = new b(p0, this.c, this.a);
          this.b.put(p0, uob);
       }
       return uob;
    }
}
