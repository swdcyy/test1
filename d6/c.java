package d6.c;
import d6.i;
import d6.j;
import java.lang.Object;
import java.util.Date;
import java.lang.Long;
import java.lang.reflect.Type;
import java.lang.Class;

public final class c implements i, j	// class@001e11
{

    public void c(){
       super();
    }
    public final Object a(Object p0){
       return Long.valueOf(p0.getTime());
    }
    public final Object a(Object p0,Type p1){
       return new Date(p0.longValue());
    }
    public final boolean a(Class p0){
       return Date.class.isAssignableFrom(p0);
    }
}
