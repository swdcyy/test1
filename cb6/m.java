package cb6.m;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class m extends a	// class@000688
{
    public static final List a;
    public static final m b;

    static {
       m.b = new m();
       b[] uobArray = new b[]{new b("w1.kskwai.com", 2),new b("w2.kskwai.com", 2),new b("w3.kskwai.com", 1)};
       m.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void m(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.PLATFORM;
    }
    public List c(){
       return m.a;
    }
    public String d(){
       return "platform";
    }
    public String e(){
       return "local.0";
    }
}
