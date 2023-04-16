package bb6.a;
import java.lang.Object;
import com.yxcorp.retrofit.cdn.CdnHostGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.List;

public abstract class a	// class@000451
{

    public void a(){
       super();
    }
    public final CdnHostGroup a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CdnHostGroup uCdnHostGrou = new CdnHostGroup(this.d(), this.b().getTypeName(), this.c(), this.e(), true);
       return v7;
    }
    public abstract CdnHostGroupType b();
    public abstract List c();
    public abstract String d();
    public abstract String e();
}
