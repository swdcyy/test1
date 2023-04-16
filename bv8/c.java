package bv8.c;
import erd.o;
import java.lang.String;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.lang.Object;
import bv8.b;
import brd.t;

public final class c implements o	// class@000464
{
    public final String b;
    public final ApiRequestTiming c;

    public void c(String p0,ApiRequestTiming p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return p0.a(this.b, this.c);
    }
}
