package add.g0;
import java.lang.Runnable;
import java.util.List;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Object;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.RelatedSearchItem;
import com.yxcorp.plugin.search.result.b;

public final class g0 implements Runnable	// class@0000e5
{
    public final List b;
    public final SearchResultFragment c;
    public final SearchItem d;
    public final int e;

    public void g0(List p0,SearchResultFragment p1,SearchItem p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       g0 tc = this.c;
       g0 td = this.d;
       g0 te = this.e;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          b.n(tc, td, iterator.next(), te);
       }
       return;
    }
}
