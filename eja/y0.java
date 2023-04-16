package eja.y0;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.presenter.y$a;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.presenter.y;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.String;
import yga.c;

public final class y0 implements Runnable	// class@002706
{
    public final y$a b;

    public void y0(y$a p0){
       this.b = p0;
    }
    public final void run(){
       y0 tb = this.b;
       if (!tb.a.t.h0().isComputingLayout()) {
          c.l(KsLogFollowTag.HOME_FOLLOW, "onChanged");
          tb.a.t.h0().invalidateItemDecorations();
       }
       return;
    }
}
