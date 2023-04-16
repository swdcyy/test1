package be8.h;
import erd.o;
import java.lang.Object;
import java.lang.Boolean;
import be8.k;

public final class h implements o	// class@000335
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       boolean b = (p0.booleanValue() && k.b())? true: false;
       return Boolean.valueOf(b);
    }
}
