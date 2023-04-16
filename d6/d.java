package d6.d;
import d6.i;
import d6.j;
import java.lang.Object;
import java.lang.Enum;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Class;

public final class d implements i, j	// class@001e12
{

    public void d(){
       super();
    }
    public final Object a(Object p0){
       return p0.name();
    }
    public final Object a(Object p0,Type p1){
       return Enum.valueOf(p1, p0.toString());
    }
    public final boolean a(Class p0){
       return Enum.class.isAssignableFrom(p0);
    }
}
