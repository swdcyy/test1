package b9c.t;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import b9c.n;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b9c.o;
import androidx.recyclerview.widget.RecyclerView;
import b9c.p;
import java.lang.Class;
import com.kwai.library.widget.refresh.RefreshLayout;
import b9c.q;
import y8c.t;
import b9c.r;
import b9c.s;
import mm8.a;

public final class t implements b	// class@0003ee
{

    public void t(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADAPTER", new n(this, p1));
       p0.i("PAGE_LIST", new o(this, p1));
       p0.h(RecyclerView.class, new p(this, p1));
       p0.h(RefreshLayout.class, new q(this, p1));
       t ot = t.class;
       r or = new r(this, p1);
       try{
          p0.h(ot, or);
          p0.h(RecyclerFragment.class, new s(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
