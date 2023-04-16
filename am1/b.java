package am1.b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;

public final class b	// class@0000da
{
    public final RecyclerView a;

    public void b(View p0){
       a.p(p0, "itemView");
       super();
       p0 = p0.findViewById(R.id.rv_tab_list);
       a.o(p0, "itemView.findViewById\(R.id.rv_tab_list\)");
       this.a = p0;
    }
}
