package bac.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.l;
import bac.i;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j extends Accessor	// class@00040d
{
    public final i c;
    public final l d;

    public void j(l p0,i p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.y;
    }
    public void set(Object p0){
       this.c.y = p0;
    }
}
