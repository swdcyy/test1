package ked.d;
import erd.g;
import ked.h;
import java.lang.Object;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import jed.h;
import java.lang.String;
import nfd.k1;

public final class d implements g	// class@00176c
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       p0.v = false;
       h q = p0.q;
       if (q != null && (p0.r != null && p0.s.R != null)) {
          q.show();
       }else {
          k1.a(p0.u, "SearchSkyFallDialog not show", true);
       }
       return;
    }
}
