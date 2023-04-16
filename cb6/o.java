package cb6.o;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class o extends a	// class@00068a
{
    public static final List a;
    public static final o b;

    static {
       o.b = new o();
       b[] uobArray = new b[]{new b("w1.kskwai.com", 2),new b("w2.kskwai.com", 2),new b("w3.kskwai.com", 1)};
       o.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void o(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.SOCIAL;
    }
    public List c(){
       return o.a;
    }
    public String d(){
       return "social";
    }
    public String e(){
       return "local.0";
    }
}
