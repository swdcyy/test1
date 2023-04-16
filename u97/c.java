package u97.c;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Request;

public class c	// class@0038f0
{

    public void c(){
       super();
    }
    public Map a(Map p0){
       a.q(p0, "cookieMap");
       return p0;
    }
    public Map b(Map p0){
       a.q(p0, "headerMap");
       return p0;
    }
    public Map c(Map p0){
       a.q(p0, "postMap");
       return p0;
    }
    public Map d(Map p0){
       a.q(p0, "queryMap");
       return p0;
    }
    public Map e(Request p0,Map p1,Map p2){
       a.q(p0, "request");
       a.q(p1, "params");
       a.q(p2, "sigMap");
       return p2;
    }
}
