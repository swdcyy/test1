package an6.d;
import an6.k;
import pr6.d;
import an6.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import an6.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.bubble.a$c;
import an6.i;
import com.yxcorp.gifshow.widget.m;
import java.lang.Boolean;
import brd.t;

public abstract class d	// class@0000e6
{
    public final k a;
    public final d b;
    public final int c;
    public final int d;
    public final int e;
    public final o f;

    public void d(k p0,d p1,int p2,int p3,int p4,o p5){
       a.p(p0, "pageStateDelegate");
       a.p(p1, "fragment");
       a.p(p5, "wrapperBubble");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public e a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bubbleInfo");
       return null;
    }
    public abstract boolean b();
    public void c(a$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "builder");
       return;
    }
    public abstract i d(Object p0);
    public abstract m e(Object p0);
    public abstract m f(Object p0);
    public final d g(){
       return this.b;
    }
    public final int h(){
       return this.d;
    }
    public final k i(){
       return this.a;
    }
    public boolean j(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bubbleInfo");
       return true;
    }
    public void k(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "bubbleInfo");
       return;
    }
    public void l(){
    }
    public void m(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "bubbleInfo");
       return;
    }
    public abstract t n();
}
