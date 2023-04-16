package df.b;
import java.lang.Object;
import vf.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import vd.h;

public abstract class b	// class@001e4b
{
    public boolean a;
    public int b;
    public long c;
    public int d;
    public static int e;

    public void b(){
       super();
       int e = b.e;
       b.e = e + 1;
       this.d = e;
    }
    public void b(int p0){
       super();
       int e = b.e;
       b.e = e + 1;
       this.d = e;
       this.h(p0);
    }
    public boolean a(){
       return (this instanceof b ^ 0x01);
    }
    public abstract void b(RCTEventEmitter p0);
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.a = false;
       this.j();
       return;
    }
    public short d(){
       return 0;
    }
    public abstract String e();
    public final long f(){
       return this.c;
    }
    public final int g(){
       return this.b;
    }
    public void h(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b = p0;
       this.c = h.b();
       this.a = true;
       return;
    }
    public boolean i(){
       return this.a;
    }
    public void j(){
    }
}
