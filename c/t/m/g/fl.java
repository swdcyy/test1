package c.t.m.g.fl;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;

public class fl	// class@000c92
{
    public final Class a;
    public final Method b;
    public final Object c;
    public final boolean d;

    public void fl(Class p0,Method p1,Object p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public Method a(){
       return this.b;
    }
    public boolean a(Object p0){
       return p0.getClass().equals(this.a);
    }
    public Object b(){
       return this.c;
    }
}
