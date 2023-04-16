package hf1.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup;

public final class b implements Runnable	// class@002681
{
    public final e$a b;

    public void b(e$a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e$a.class, "7")) {
       }else {
          RelativeLayout$LayoutParams layoutParams = tb.k.getLayoutParams();
          layoutParams.leftMargin = layoutParams.leftMargin + (tb.g.getRight() - tb.k.getRight());
          tb.k.setLayoutParams(layoutParams);
       }
       return;
    }
}
