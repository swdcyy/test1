package k99.l;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.c;
import java.lang.Object;
import java.lang.Boolean;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;

public final class l implements g	// class@002b87
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       if (tb.q.get() instanceof CustomRecyclerView) {
          tb.q.get().setFixScrollConflictDirection(1);
       }
       return;
    }
}
