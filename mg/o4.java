package mg.o4;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import zq8.a;

public final class o4 implements o	// class@002646
{
    public final String b;

    public void o4(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return new a(this.b, p0.booleanValue());
    }
}
