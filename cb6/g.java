package cb6.g;
import bb6.a;
import bjd.b;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.network.cdn.CdnHostGroupType;

public final class g extends a	// class@000682
{
    public static final List a;
    public static final g b;

    static {
       g.b = new g();
       b[] uobArray = new b[]{new b("d1-game.a.kwimgs.com", 2),new b("d2-game.a.kwimgs.com", 2),new b("d3-game.a.kwimgs.com", 1)};
       g.a = CollectionsKt__CollectionsKt.L(uobArray);
    }
    public void g(){
       super();
    }
    public CdnHostGroupType b(){
       return CdnHostGroupType.GAME;
    }
    public List c(){
       return g.a;
    }
    public String d(){
       return "game";
    }
    public String e(){
       return "local.0";
    }
}
