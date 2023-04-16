package bw8.c;
import bw8.b;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.action.model.RealActionBaseFeed;
import zv8.l;
import com.yxcorp.gifshow.action.startup.FeedRealActionsPageBaseConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import bw8.a;

public class c implements b	// class@00046b
{

    public void c(){
       super();
    }
    public String a(){
       return "RealActionFilterBiz";
    }
    public boolean b(RealActionBaseFeed p0,l p1,FeedRealActionsPageBaseConfig p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2.booleanValue();
       }
       List list = p1.actionFilters();
       if (q.f(list)) {
          return true;
       }
       Iterator iterator = list.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().a(p0)) {
             break ;
          }
       }
       return true;
    }
}
