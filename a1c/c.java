package a1c.c;
import j16.b;
import a1c.d;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Math;
import brd.g;
import java.lang.Exception;
import java.lang.Throwable;

public class c implements b	// class@000021
{
    public float a;
    public final v b;
    public final d c;

    public void c(d p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = 0xbf800000;
    }
    public void a(int p0,float p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, c.class, "1")) {
          return;
       }
       float f = Math.min(p1, 0x3f7d70a4);
       if (f - this.a > 0) {
          this.a = f;
          this.b.onNext(Float.valueOf(f));
       }
       return;
    }
    public void onComplete(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       p0.a = null;
       this.b.onNext(Float.valueOf(0x3f800000));
       this.b.onComplete();
       return;
    }
    public void onError(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       p0.a = null;
       this.b.onError(new Exception());
       return;
    }
}
