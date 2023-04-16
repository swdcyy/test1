package mld.b$a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import mld.b;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class b$a extends RecyclerView$ViewHolder	// class@001d2b
{
    public final FrameLayout a;
    public final View b;
    public final TextView c;
    public final b d;

    public void b$a(b p0,View p1){
       a.p(p1, "itemView");
       this.d = p0;
       super(p1);
       View view = p1.findViewById(R.id.item_main_layout);
       a.o(view, "itemView.findViewById\(R.id.item_main_layout\)");
       this.a = view;
       view = p1.findViewById(R.id.indicator);
       a.o(view, "itemView.findViewById\(R.id.indicator\)");
       this.b = view;
       view = p1.findViewById(R.id.text);
       a.o(view, "itemView.findViewById\(R.id.text\)");
       this.c = view;
    }
}
