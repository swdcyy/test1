package b66.j;
import erd.o;
import java.lang.String;
import java.lang.Object;
import com.google.gson.JsonObject;

public final class j implements o	// class@000423
{
    public final String b;

    public void j(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0.c0("requestUserId", this.b);
       return p0;
    }
}
