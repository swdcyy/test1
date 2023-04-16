package a85.c$a;
import a85.a;
import java.lang.String;
import a85.c$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public class c$a extends a	// class@00003a
{
    public final c$b m;
    public final long[] n;

    public void c$a(String p0,int p1,c$b p2,long[] p3){
       this.m = p2;
       this.n = p3;
       super(p0, p1);
    }
    public void b(int p0,String p1,boolean p2){
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       this.m.a((SystemClock.elapsedRealtime() - this.n[0]));
       this.a();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.m.b((SystemClock.elapsedRealtime() - this.n[0]));
       this.a();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       this.m.c((SystemClock.elapsedRealtime() - this.n[0]));
       this.a();
       return;
    }
    public void f(byte[] p0){
    }
    public void g(int p0,String p1){
    }
}
