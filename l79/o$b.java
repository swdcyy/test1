package l79.o$b;
import android.view.View$OnClickListener;
import l79.o;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import l79.m$c;

public final class o$b implements View$OnClickListener	// class@002cc9
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
          return;
       }
       a.q(p0, "v");
       Log.b("SelectedPhotoItemViewHolder", "mDeleteImg onClick\(\) called with: v = ["+p0+']');
       o$b tb = this.b;
       o h = tb.h;
       if (h != null) {
          h.d(tb.getAdapterPosition());
       }
       return;
    }
}
