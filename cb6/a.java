package cb6.a;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class a extends a	// class@00067c
{
    public static final List a;
    public static final a b;

    static {
       a.b = new a();
       a.a = t.k(new b("app.m.kuaishou.com", 1));
    }
    public void a(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.API_APPM;
    }
    public List c(){
       return a.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
