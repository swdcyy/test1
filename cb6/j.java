package cb6.j;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class j extends a	// class@000685
{
    public static final List a;
    public static final j b;

    static {
       j.b = new j();
       b[] uobArray = new b[]{new b("p1-live.a.yximgs.com", 2),new b("p2-live.a.yximgs.com", 2),new b("p3-live.a.yximgs.com", 1)};
       j.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void j(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.LIVE;
    }
    public List c(){
       return j.a;
    }
    public String d(){
       return "live";
    }
    public String e(){
       return "local.0";
    }
}
