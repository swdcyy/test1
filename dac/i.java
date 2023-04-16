package dac.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;

public final class i implements Runnable	// class@002141
{
    public final ExploreFriendContactFragment b;

    public void i(ExploreFriendContactFragment p0){
       this.b = p0;
    }
    public final void run(){
       ExploreFriendContactFragment.Gh(this.b);
    }
}
