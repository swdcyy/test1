package el9.i0;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.i;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import im8.f;
import java.lang.Integer;
import el9.j0;
import android.content.Context;
import android.view.ViewGroup;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class i0 implements Runnable	// class@0021ed
{
    public final i b;
    public final RecyclerView c;
    public final QComment d;

    public void i0(i p0,RecyclerView p1,QComment p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       i0 tb = this.b;
       i0 tc = this.c;
       i0 td = this.d;
       if (tb.x.get().intValue() < 0x2710) {
          j0 oj0 = new j0(tb, tc.getContext());
          if (tb.p.g7().t1(td) >= 0) {
             oj0.p(0);
             tc.getLayoutManager().startSmoothScroll(oj0);
          }
       }else {
          tc.scrollToPosition(tb.p.g7().t1(td));
       }
       return;
    }
}
