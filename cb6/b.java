package cb6.b;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class b extends a	// class@00067d
{
    public static final List a;
    public static final b b;

    static {
       b.b = new b();
       b[] uobArray = new b[]{new b("p1.adkwai.com", 2),new b("p2.adkwai.com", 2),new b("p3.adkwai.com", 1)};
       b.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void b(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.BUSINESS;
    }
    public List c(){
       return b.a;
    }
    public String d(){
       return "business";
    }
    public String e(){
       return "local.0";
    }
}
