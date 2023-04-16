package gka.t;
import erd.r;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Long;
import androidx.fragment.app.Fragment;

public final class t implements r	// class@002b19
{
    public final ProgressFragment b;

    public void t(ProgressFragment p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       t tb = this.b;
       boolean b = (tb.isResumed() && (tb.isVisible() && !tb.isRemoving()))? true: false;
       return b;
    }
}
