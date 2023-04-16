package awd.i;
import java.lang.reflect.Method;
import java.lang.Class;
import org.greenrobot.eventbus.ThreadMode;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public class i	// class@000298
{
    public final Method a;
    public final ThreadMode b;
    public final Class c;
    public final int d;
    public final boolean e;
    public String f;

    public void i(Method p0,Class p1,ThreadMode p2,int p3,boolean p4){
       super();
       this.a = p0;
       this.b = p2;
       this.c = p1;
       this.d = p3;
       this.e = p4;
    }
    public synchronized final void a(){
       if (this.f == null) {
          this.f = new StringBuilder(64)+this.a.getDeclaringClass().getName()+'#'+this.a.getName()+'('+this.c.getName();
       }
       return;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof i) {
          return false;
       }
       this.a();
       p0.a();
       return (this.f).equals(p0.f);
    }
    public int hashCode(){
       return this.a.hashCode();
    }
}
