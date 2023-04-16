package dac.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dac.w;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import java.lang.Object;
import mrd.c;

public class u extends Accessor	// class@00214d
{
    public final ExploreFriendFragment c;
    public final w d;

    public void u(w p0,ExploreFriendFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.G;
    }
    public void set(Object p0){
       this.c.G = p0;
    }
}
