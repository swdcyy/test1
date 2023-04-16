package a17.j;
import android.view.View$OnClickListener;
import a17.k;
import a17.l;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import a17.c$a;
import a17.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import a17.b$b;
import com.kwai.library.widget.popup.common.c;

public final class j implements View$OnClickListener	// class@000019
{
    public final k b;
    public final l c;

    public void j(k p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       c uoc = this.b.J0().c0();
       a.o(uoc, "mBuilder.sheet");
       this.b.J0().Q.a(uoc, p0, this.c.getAdapterPosition());
       this.b.J0().c0().q(4);
    }
}
