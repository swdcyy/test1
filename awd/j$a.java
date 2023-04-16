package awd.j$a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import java.lang.Class;
import java.util.Map;
import java.lang.IllegalStateException;
import java.lang.String;

public class j$a	// class@000299
{
    public final List a;
    public final Map b;
    public final Map c;
    public final StringBuilder d;
    public Class e;
    public Class f;
    public boolean g;
    public c h;

    public void j$a(){
       super();
       this.a = new ArrayList();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new StringBuilder(128);
    }
    public boolean a(Method p0,Class p1){
       Object obj = this.b.put(p1, p0);
       if (obj == null) {
          return true;
       }
       if (obj instanceof Method) {
          if (this.b(obj, p1)) {
             this.b.put(p1, this);
          }else {
             throw new IllegalStateException();
          }
       }
       return this.b(p0, p1);
    }
    public final boolean b(Method p0,Class p1){
       (this.d).setLength(0);
       StringBuilder str = this.d+p0.getName();
       str = this.d+'>'+p1.getName();
       String str1 = this.d;
       Class declaringCla = p0.getDeclaringClass();
       Class uClass = this.c.put(str1, declaringCla);
       if (uClass == null || uClass.isAssignableFrom(declaringCla)) {
          return true;
       }
       this.c.put(str1, uClass);
       return 0;
    }
    public void c(Class p0){
       this.f = p0;
       this.e = p0;
       this.g = false;
       this.h = null;
    }
    public void d(){
       if (this.g != null) {
          this.f = null;
       }else {
          Class superclass = this.f.getSuperclass();
          this.f = superclass;
          String name = superclass.getName();
          if (!name.startsWith("java.") && (name.startsWith("javax.") || name.startsWith("android."))) {
             this.f = null;
          }
       }
       return;
    }
}
