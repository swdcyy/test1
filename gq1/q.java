package gq1.q;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import gq1.p;

public final class q	// class@00255b
{
    public final CopyOnWriteArraySet a;

    public void q(){
       super();
       this.a = new CopyOnWriteArraySet();
    }
    public final void a(int p0,String p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oq, "1")) {
          return;
       }
       a.p(p1, "base64StatisticInfo");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
}
