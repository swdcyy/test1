package be8.i;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import be8.k;

public final class i implements o	// class@000336
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0.booleanValue() && k.a())? true: false;
       return Boolean.valueOf(b);
    }
}
