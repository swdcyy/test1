package c44.a$b;
import java.lang.Runnable;
import c44.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.o;
import c44.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class a$b implements Runnable	// class@0004a6
{
    public final a b;
    public final int c;

    public void a$b(a p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = PatchProxy.apply(objArray, tb, a.class, "12");
       if (uoa != PatchProxyResult.class) {
       }else if(tb.y == null){
          tb.y = new c(tb, tb.getContext());
       }
       uoa = tb.y;
       if (uoa != null) {
          uoa.p(this.c);
          RecyclerView$LayoutManager layoutManage = a.P8(this.b).getLayoutManager();
          if (layoutManage != null) {
             layoutManage.startSmoothScroll(uoa);
          }
       }
       return;
    }
}
