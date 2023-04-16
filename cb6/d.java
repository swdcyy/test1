package cb6.d;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class d extends a	// class@00067f
{
    public static final List a;
    public static final d b;

    static {
       d.b = new d();
       b[] uobArray = new b[]{new b("ali2.a.kwimgs.com", 1),new b("tx2.a.kwimgs.com", 1)};
       d.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void d(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.DESIGN;
    }
    public List c(){
       return d.a;
    }
    public String d(){
       return "cdn_platform_design";
    }
    public String e(){
       return "local.0";
    }
}
