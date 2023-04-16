package da1.a$a;
import java.util.Comparator;
import da1.a;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class a$a implements Comparator	// class@001f58
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Long.compare(p0.getSortRank(), p1.getSortRank());
       return i;
    }
}
