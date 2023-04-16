package b63.a;
import java.lang.Object;
import java.util.ArrayList;
import androidx.collection.ArraySet;
import com.kwai.live.gzone.tab.page.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import b63.a$a;

public class a	// class@00035e
{
    public List a;
    public Set b;

    public void a(){
       super();
       this.a = new ArrayList();
       this.b = new ArraySet();
    }
    public void a(a p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (this.b.contains(p0)) {
          return;
       }
       this.b.add(p0);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
}
