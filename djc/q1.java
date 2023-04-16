package djc.q1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public final class q1 extends RecyclerView$ViewHolder	// class@00221a
{
    public final KwaiImageView a;
    public final TextView b;
    public final TextView c;

    public void q1(View p0){
       a.p(p0, "itemView");
       super(p0);
       View view = p0.findViewById(R.id.image);
       a.o(view, "itemView.findViewById\(R.id.image\)");
       this.a = view;
       view = p0.findViewById(R.id.text);
       a.o(view, "itemView.findViewById\(R.id.text\)");
       this.b = view;
       p0 = p0.findViewById(R.id.red_dot);
       a.o(p0, "itemView.findViewById\(R.id.red_dot\)");
       this.c = p0;
    }
    public final TextView a(){
       return this.c;
    }
    public final TextView b(){
       return this.b;
    }
}
