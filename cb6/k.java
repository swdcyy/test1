package cb6.k;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class k extends a	// class@000686
{
    public static final List a;
    public static final k b;

    static {
       k.b = new k();
       b[] uobArray = new b[]{new b("p1.eckwai.com", 2),new b("p2.eckwai.com", 2),new b("p3.eckwai.com", 1)};
       k.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void k(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.MERCHANT;
    }
    public List c(){
       return k.a;
    }
    public String d(){
       return "merchant";
    }
    public String e(){
       return "local.0";
    }
}
