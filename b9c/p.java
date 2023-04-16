package b9c.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b9c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class p extends Accessor	// class@0003ea
{
    public final RecyclerFragment c;
    public final t d;

    public void p(t p0,RecyclerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h0();
    }
}
