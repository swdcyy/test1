package b9c.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b9c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import com.kwai.library.widget.refresh.RefreshLayout;

public class q extends Accessor	// class@0003eb
{
    public final RecyclerFragment c;
    public final t d;

    public void q(t p0,RecyclerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Ac();
    }
}
