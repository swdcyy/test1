package hf1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;

public final class c implements Runnable	// class@002682
{
    public final e$a b;
    public final int c;
    public final int d;

    public void c(e$a p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       int i = this.c - this.d;
       e$a uoa = e$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uoa, "8")) {
          RelativeLayout$LayoutParams layoutParams = tb.j.getLayoutParams();
          layoutParams.width = i - a1.d(0x7f07028d);
          tb.j.setLayoutParams(layoutParams);
       }
       return;
    }
}
