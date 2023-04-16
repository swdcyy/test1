package b9c.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b9c.l;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import java.lang.Object;
import com.kwai.library.widget.refresh.RefreshLayout;

public class i extends Accessor	// class@0003e3
{
    public final RecyclerDialogFragment c;
    public final l d;

    public void i(l p0,RecyclerDialogFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Ac();
    }
}
