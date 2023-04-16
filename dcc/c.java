package dcc.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.kwai.library.widget.button.SlipSwitchButton;
import dcc.c$a;
import android.view.View$OnClickListener;

public class c extends RecyclerView$ViewHolder	// class@00216c
{
    public final View a;
    public final TextView b;
    public final ImageView c;
    public final SlipSwitchButton d;
    public c e;

    public void c(View p0){
       a.p(p0, "itemView");
       super(p0);
       View view = p0.findViewById(R.id.gap);
       a.o(view, "itemView.findViewById\(R.id.gap\)");
       this.a = view;
       view = p0.findViewById(R.id.text);
       a.o(view, "itemView.findViewById\(R.id.text\)");
       this.b = view;
       view = p0.findViewById(R.id.icon);
       a.o(view, "itemView.findViewById\(R.id.icon\)");
       this.c = view;
       view = p0.findViewById(R.id.slip_switch_button);
       a.o(view, "itemView.findViewById\(R.id.slip_switch_button\)");
       this.d = view;
       view.setOnlyResponseClick(true);
       p0.setOnClickListener(new c$a(this));
    }
    public void a(){
    }
    public void b(){
    }
    public void c(){
    }
}
