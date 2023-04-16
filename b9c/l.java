package b9c.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import b9c.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b9c.g;
import androidx.recyclerview.widget.RecyclerView;
import b9c.h;
import java.lang.Class;
import com.kwai.library.widget.refresh.RefreshLayout;
import b9c.i;
import y8c.t;
import b9c.j;
import b9c.k;
import mm8.a;

public final class l implements b	// class@0003e6
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADAPTER", new f(this, p1));
       p0.i("PAGE_LIST", new g(this, p1));
       p0.h(RecyclerView.class, new h(this, p1));
       p0.h(RefreshLayout.class, new i(this, p1));
       t ot = t.class;
       j oj = new j(this, p1);
       try{
          p0.h(ot, oj);
          p0.h(RecyclerDialogFragment.class, new k(this, p1));
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
