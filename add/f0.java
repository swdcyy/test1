package add.f0;
import java.lang.Runnable;
import e7d.h;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.util.List;
import com.yxcorp.plugin.search.result.SubTabItem;
import java.lang.String;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Object;
import k2b.e0;
import com.yxcorp.plugin.search.result.b;

public final class f0 implements Runnable	// class@0000e3
{
    public final h b;
    public final SearchResultFragment c;
    public final int d;
    public final List e;
    public final SubTabItem f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final SearchPage k;

    public void f0(h p0,SearchResultFragment p1,int p2,List p3,SubTabItem p4,String p5,String p6,String p7,String p8,SearchPage p9){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public final void run(){
       f0 tc = this.c;
       f0 td = this.d;
       f0 te = this.e;
       f0 tf = this.f;
       f0 tg = this.g;
       f0 th = this.h;
       f0 ti = this.i;
       f0 tj = this.j;
       f0 tk = this.k;
       if (this.b != null && tc != null) {
          b.m(td, tc, te, tf, tg, th, ti, tj, tk, tc);
       }
       return;
    }
}
