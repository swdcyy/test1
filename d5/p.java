package d5.p;
import d5.a;
import n5.c;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import n5.b;
import n5.a;

public class p extends a	// class@001e0d
{
    public final b l;
    public final Object m;

    public void p(c p0){
       super(p0, null);
    }
    public void p(c p0,Object p1){
       super(Collections.emptyList());
       this.l = new b();
       this.l(p0);
       this.m = p1;
    }
    public float c(){
       return 0x3f800000;
    }
    public Object h(){
       p tm = this.m;
       return this.e.a(0, 0, tm, tm, this.f(), this.f(), this.f());
    }
    public Object i(a p0,float p1){
       return this.h();
    }
    public void j(){
       if (this.e != null) {
          super.j();
       }
       return;
    }
}
