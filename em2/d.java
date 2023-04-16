package em2.d;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;

public class d	// class@00278c
{

    public void d(){
       super();
    }
    public static int a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (q.f(p0)) {
          return -1;
       }
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveVoteOption mCount = iterator.next().mCount;
          if (mCount >= i) {
             i = mCount;
          }
       }
       return i;
    }
    public static int b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (q.f(p0)) {
          return 0;
       }
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          LiveVoteOption liveVoteOpti = iterator.next();
          int i1 = (liveVoteOpti == null)? 0: liveVoteOpti.mCount;
          i = i + i1;
       }
       return i;
    }
}
