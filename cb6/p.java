package cb6.p;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class p extends a	// class@00068b
{
    public static final List a;
    public static final p b;

    static {
       p.b = new p();
       b[] uobArray = new b[]{new b("w1.eckwai.com", 1),new b("w2.eckwai.com", 1)};
       p.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void p(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.WEB_MERCHANT;
    }
    public List c(){
       return p.a;
    }
    public String d(){
       return "";
    }
    public String e(){
       return "local.0";
    }
}
