package e0b.f$b;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import e0b.f;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public final class f$b extends RecyclerView$ViewHolder	// class@0025c1
{
    public final View a;
    public final TextView b;
    public final f c;

    public void f$b(f p0,View p1){
       a.p(p1, "rootView");
       this.c = p0;
       super(p1);
       this.a = p1;
       View view = p1.findViewById(R.id.device_name_tv);
       a.o(view, "rootView.findViewById\(R.id.device_name_tv\)");
       this.b = view;
    }
}
