package c35.a$a;
import android.view.View$OnClickListener;
import c35.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import c35.b;
import com.kuaishou.viewbinder.IViewBinder;
import androidx.lifecycle.ViewModel;
import c35.g;

public final class a$a implements View$OnClickListener	// class@000407
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       ViewParent parent = p0.getParent();
       View view = p0;
       while (!parent instanceof RecyclerView && parent != null) {
          view = parent;
          parent = view.getParent();
       }
       Objects.requireNonNull(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
       int childAdapter = parent.getChildAdapterPosition(view);
       RecyclerView$ViewHolder viewHolder = parent.findViewHolderForAdapterPosition(childAdapter);
       if (viewHolder instanceof b) {
          Objects.requireNonNull(this.b);
          if (viewHolder.a().onInterceptUserEvent(p0, null, false)) {
             return;
          }
       }
       a$a tb = this.b;
       a e = tb.e;
       if (e != null) {
          e.a(tb, p0, childAdapter);
       }
       return;
    }
}
