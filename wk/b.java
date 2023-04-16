package wk.b;
import java.lang.Object;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.ParameterizedType;
import java.lang.String;
import ok.n;

public abstract class b	// class@002f70
{

    public void b(){
       super();
    }
    public final Type capture(){
       Type genericSuper = this.getClass().getGenericSuperclass();
       n.g(genericSuper instanceof ParameterizedType, "%s isn\'t parameterized", genericSuper);
       return genericSuper.getActualTypeArguments()[0];
    }
}
