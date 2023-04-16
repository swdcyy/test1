package djd.a;
import retrofit2.h$a;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import retrofit2.q;
import retrofit2.h;
import java.lang.Class;
import zid.b;
import java.lang.Object;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;

public class a extends h$a	// class@000ccc
{

    public void a(){
       super();
    }
    public h stringConverter(Type p0,Annotation[] p1,q p2){
       Class uClass;
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p1[i];
             if (oobject.annotationType().equals(b.class)) {
                uClass = oobject.value();
             label_001e :
                if (uClass != null) {
                   return uClass.newInstance();
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             uClass = null;
             goto label_001e ;
          }
       }
       return super.stringConverter(p0, p1, p2);
    }
}
