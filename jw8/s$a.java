package jw8.s$a;
import android.view.View$OnClickListener;
import jw8.s;
import huc.b;
import ypc.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import e17.i;
import kotlin.jvm.internal.a;

public final class s$a implements View$OnClickListener	// class@0029cb
{
    public final s b;
    public final b c;
    public final a d;

    public void s$a(s p0,b p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       if (this.c.b(this.b.getAdapterPosition())) {
          this.d.u(0);
          this.b.e(this.d);
       }else {
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f1038e5), "KSToast.applyStyle\(R.sty¡­tring.network_failed_tip\)");
       }
       return;
    }
}
