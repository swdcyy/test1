package el9.l0$b;
import java.lang.Runnable;
import el9.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$l;

public final class l0$b implements Runnable	// class@0021f6
{
    public final l0 b;

    public void l0$b(l0 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       RecyclerView$l itemAnimator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l0$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       m1.C().w("CommentSubCommentAnimPresenter", "clear itemAnimator runnable", objArray1);
       RecyclerView recyclerView = l0.P8(this.b).h0();
       a.o(recyclerView, "mFragment.recyclerView");
       itemAnimator = recyclerView.getItemAnimator();
       if (itemAnimator != null) {
          a.o(itemAnimator, "it");
          if (!itemAnimator.p()) {
             l0$b tb = this.b;
             if (tb.r != null) {
                tb.r = i;
                Object[] objArray2 = new Object[i];
                m1.C().w("CommentSubCommentAnimPresenter", "clear itemAnimator start", objArray2);
                recyclerView = l0.P8(this.b).h0();
                a.o(recyclerView, "mFragment.recyclerView");
                recyclerView.setItemAnimator(objArray);
                objArray = new Object[i];
                m1.C().w("CommentSubCommentAnimPresenter", "clear itemAnimator end", objArray);
             }
          }
       }
       return;
    }
}
