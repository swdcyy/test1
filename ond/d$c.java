package ond.d$c;
import java.lang.Runnable;
import ond.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import qwc.i;
import qwc.i$a;

public final class d$c implements Runnable	// class@002028
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       this.b.c.t0(new EditDraftAction(false));
       d$c tb = this.b;
       tb.e.setDelegate(tb.j);
       tb = this.b;
       tb.e.d(tb.i);
       tb = this.b;
       tb.f.addOnScrollListener(tb.k);
       List decorationDr = this.b.e.getDecorationDrawerList();
       a.o(decorationDr, "mContainerView.decorationDrawerList");
       Iterator iterator = decorationDr.iterator();
       while (iterator.hasNext()) {
          iterator.next().setAlpha(0x3f800000);
       }
       d f = this.b.f;
       a.o(f, "mPictureRV");
       RecyclerView$Adapter adapter = f.getAdapter();
       Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.adapter.PicturesAdapter");
       adapter.Z0(this.b.l);
       this.b.K();
       return;
    }
}
