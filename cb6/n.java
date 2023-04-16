package cb6.n;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class n extends a	// class@000689
{
    public static final List a;
    public static final n b;

    static {
       n.b = new n();
       b[] uobArray = new b[]{new b("p1.a.yximgs.com", 2),new b("p2.a.yximgs.com", 2),new b("p3.a.yximgs.com", 1)};
       n.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void n(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.POST;
    }
    public List c(){
       return n.a;
    }
    public String d(){
       return "post";
    }
    public String e(){
       return "local.0";
    }
}
