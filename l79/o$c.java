package l79.o$c;
import com.yxcorp.gifshow.widget.m;
import l79.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import l79.m$c;

public final class o$c extends m	// class@002cca
{
    public final o c;

    public void o$c(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "1")) {
          return;
       }
       a.q(p0, "v");
       Log.b("SelectedPhotoItemViewHolder", "mPreview doClick\(\) called with: v = ["+p0+']');
       o$c tc = this.c;
       o h = tc.h;
       if (h != null) {
          h.c(tc.getAdapterPosition());
       }
       return;
    }
}
