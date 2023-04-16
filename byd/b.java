package byd.b;
import java.lang.reflect.Method;
import java.util.List;
import java.lang.Object;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;

public final class b	// class@000303
{
    public final Method a;
    public final List b;

    public void b(Method p0,List p1){
       super();
       this.a = p0;
       this.b = Collections.unmodifiableList(p1);
    }
    public Method a(){
       return this.a;
    }
    public String toString(){
       Object[] objArray = new Object[]{this.a.getDeclaringClass().getName(),this.a.getName(),this.b};
       return String.format("%s.%s\(\) %s", objArray);
    }
}
