package cb6.i;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class i extends a	// class@000684
{
    public static final List a;
    public static final i b;

    static {
       i.b = new i();
       i.a = t.k(new b("live.kuaishou.com", 1));
    }
    public void i(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.LIVE_API;
    }
    public List c(){
       return i.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
