package cb6.c;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class c extends a	// class@00067e
{
    public static final List a;
    public static final c b;

    static {
       c.b = new c();
       c.a = t.k(new b("activity.e.kuaishou.com", 1));
    }
    public void c(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.COMMERCIAL_ACTIVITY;
    }
    public List c(){
       return c.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
