package androidx.room.h;
import z0.a;
import java.lang.Object;
import a3.b;
import java.lang.Boolean;

public final class h implements a	// class@000961
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(p0.isDatabaseIntegrityOk());
    }
}
