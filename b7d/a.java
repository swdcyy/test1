package b7d.a;
import a9c.e;
import java.lang.Object;
import com.yxcorp.plugin.search.entity.SuggestItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.s0;

public class a extends e	// class@0003b2
{

    public void a(){
       super();
    }
    public boolean a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): s0.a(p0, p1);
       return b;
    }
    public boolean b(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): s0.a(p0, p1);
       return b;
    }
}
