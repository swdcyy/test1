package cb6.f;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class f extends a	// class@000681
{
    public static final List a;
    public static final f b;

    static {
       f.b = new f();
       b[] uobArray = new b[]{new b("p1.a.yximgs.com", 2),new b("p2.a.yximgs.com", 2),new b("p3.a.yximgs.com", 1)};
       f.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void f(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.FEED;
    }
    public List c(){
       return f.a;
    }
    public String d(){
       return "feed";
    }
    public String e(){
       return "local.0";
    }
}
