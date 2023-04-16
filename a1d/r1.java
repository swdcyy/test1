package a1d.r1;
import erd.r;
import a1d.s1;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class r1 implements r	// class@000050
{
    public final s1 b;

    public void r1(s1 p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       r1 tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 == FragmentEvent.STOP && !tb.q.K0())? true: false;
       return b;
    }
}
