package ao.e;
import rn.b;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import kotlin.jvm.internal.a;
import qn.m$d;
import qn.m;

public final class e extends b	// class@00020a
{
    public boolean q;
    public String r;
    public boolean s;
    public final String t;
    public final JsonObject u;

    public void e(String p0,JsonObject p1){
       a.p(p0, "url");
       a.p(p1, "data");
       super(m$d.b);
       this.t = p0;
       this.u = p1;
       this.r = "-1";
    }
    public final String l(){
       return this.t;
    }
    public final void m(boolean p0){
       this.q = p0;
    }
}
