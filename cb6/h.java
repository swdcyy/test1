package cb6.h;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class h extends a	// class@000683
{
    public static final List a;
    public static final h b;

    static {
       h.b = new h();
       h.a = t.k(new b("www.kuaishoupay.com", 1));
    }
    public void h(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.KwaiPaySdk;
    }
    public List c(){
       return h.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
