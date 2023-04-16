package ccc.a;
import erd.g;
import com.yxcorp.gifshow.relation.user.fragment.FollowerListFragment;
import java.lang.Object;
import wca.q;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class a implements g	// class@00056e
{
    public final FollowerListFragment b;

    public void a(FollowerListFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.q().remove(p0.a);
    }
}
