package cb6.e;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class e extends a	// class@000680
{
    public static final List a;
    public static final e b;

    static {
       e.b = new e();
       e.a = t.k(new b("app.kwaixiaodian.com", 1));
    }
    public void e(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.ESHOP_APP;
    }
    public List c(){
       return e.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
