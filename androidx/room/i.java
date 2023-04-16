package androidx.room.i;
import z0.a;
import java.lang.Object;
import a3.b;
import java.lang.Boolean;

public final class i implements a	// class@000962
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isDbLockedByCurrentThread());
    }
}
