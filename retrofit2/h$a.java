package retrofit2.h$a;
import java.lang.Object;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.r;
import java.lang.Class;
import java.lang.annotation.Annotation;
import retrofit2.q;
import retrofit2.h;

public abstract class h$a	// class@00245a
{

    public void h$a(){
       super();
    }
    public static Type getParameterUpperBound(int p0,ParameterizedType p1){
       return r.f(p0, p1);
    }
    public static Class getRawType(Type p0){
       return r.g(p0);
    }
    public h requestBodyConverter(Type p0,Annotation[] p1,Annotation[] p2,q p3){
       return null;
    }
    public h responseBodyConverter(Type p0,Annotation[] p1,q p2){
       return null;
    }
    public h stringConverter(Type p0,Annotation[] p1,q p2){
       return null;
    }
}
