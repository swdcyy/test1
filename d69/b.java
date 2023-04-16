package d69.b;
import im8.g;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import java.lang.Object;
import xl8.b;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d69.o;
import java.util.Map;
import java.util.HashMap;

public class b implements g	// class@00206c
{
    public String b;
    public String c;
    public String d;
    public final RelationAggregateFragment e;
    public a f;
    public p g;
    public b h;
    public String i;
    public String j;
    public String k;
    public String l;

    public void b(RelationAggregateFragment p0){
       super();
       this.b = "";
       this.c = "";
       this.d = "";
       this.h = new b(Integer.valueOf(-1));
       this.i = "";
       this.j = "";
       this.k = "";
       this.l = "";
       this.e = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new o());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
