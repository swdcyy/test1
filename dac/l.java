package dac.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dac.n;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;
import mrd.c;

public class l extends Accessor	// class@002144
{
    public final ExploreFriendContactFragment c;
    public final n d;

    public void l(n p0,ExploreFriendContactFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.M;
    }
    public void set(Object p0){
       this.c.M = p0;
    }
}
