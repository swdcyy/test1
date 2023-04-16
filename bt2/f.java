package bt2.f;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import at2.c;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class f implements Comparator	// class@000450
{

    public void f(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.e().getPriority()), Integer.valueOf(p1.e().getPriority()));
    }
}
