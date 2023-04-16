package zk.b;
import java.lang.reflect.Field;
import java.lang.Object;
import bl.a;
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.String;

public final class b	// class@002945
{
    public final Field a;

    public void b(Field p0){
       super();
       a.b(p0);
       this.a = p0;
    }
    public Annotation a(Class p0){
       return this.a.getAnnotation(p0);
    }
    public String b(){
       return this.a.getName();
    }
}
