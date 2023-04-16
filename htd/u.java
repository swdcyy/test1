package htd.u;
import htd.a;
import java.lang.Object;
import htd.c;
import htd.b;
import htd.z;
import htd.p;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import otd.f;
import ltd.o$b;
import ltd.b;
import otd.g;
import ltd.c;

public class u extends a	// class@000fe2
{

    public void u(){
       super();
    }
    public final boolean C(){
       return false;
    }
    public final boolean D(){
       return false;
    }
    public Object F(Object p0){
       z obj;
       while (true) {
          obj = super.F(p0);
          Object a = b.a;
          if (obj == a) {
             return a;
          }
          if (obj == b.b) {
             obj = this.J(p0);
             if (obj == null) {
                return a;
             }
             if (obj instanceof p) {
                return obj;
             }
             continue ;
          }else if(obj instanceof p){
             return obj;
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Invalid offerInternal result "+obj.toString());
    }
    public Object G(Object p0,f p1){
       Object obj;
       while (true) {
          if (this.U()) {
             obj = super.G(p0, p1);
          }else {
             obj = p1.g(this.d(p0));
             if (obj == null) {
                obj = b.a;
             }
          }
          if (obj == g.e()) {
             break ;
          }else {
             Object a = b.a;
             if (obj == a) {
                return a;
             }else {
                if (obj == b.b || obj == c.b) {
                   continue ;
                }else if(obj instanceof p){
                   return obj;
                }else {
                   throw new IllegalStateException("Invalid result "+obj.toString());
                }
             }
          }
       }
       return g.e();
    }
    public final boolean V(){
       return true;
    }
    public final boolean W(){
       return true;
    }
}
