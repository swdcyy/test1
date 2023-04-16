package cb6.l;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class l extends a	// class@000687
{
    public static final List a;
    public static final l b;

    static {
       l.b = new l();
       b[] uobArray = new b[]{new b("w1.kskwai.com", 2),new b("w2.kskwai.com", 2),new b("w3.kskwai.com", 1)};
       l.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void l(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.MIDDLEWARE;
    }
    public List c(){
       return l.a;
    }
    public String d(){
       return "middleware";
    }
    public String e(){
       return "local.0";
    }
}
