package dn2.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import dn2.c$b;
import dn2.c$e;
import java.lang.Object;
import dn2.c$d;
import dn2.c$a;
import java.util.LinkedList;
import dn2.b;
import dn2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dn2.c$c;

public class c	// class@002558
{
    public final List a;
    public final long b;
    public final c$b c;
    public int d;
    public final c$c e;
    public c$e f;
    public static final List g;

    static {
       c.g = LiveLogTag.LIVE_WISH_LIGHT.appendTag("Queue");
    }
    public void c(long p0,c$b p1,c$e p2){
       super();
       this.f = new c$d(null);
       this.a = new LinkedList();
       this.b = p0;
       this.c = p1;
       this.f = p2;
       this.e = new b(this);
    }
    public synchronized g a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.a.size()) {
          return null;
       }
       return this.a.remove(0);
    }
    public synchronized void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       int i = 3;
       if (this.d >= i) {
          return;
       }
       i = i - this.d;
       int i1 = 0;
       while (i1 < i) {
          g og = this.a();
          if (og != null) {
             int i2 = this.d + 1;
             this.d = i2;
             this.c.a(og, this.e, this.d);
          }
          i1 = i1 + 1;
       }
       return;
    }
}
