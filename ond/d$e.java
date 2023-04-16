package ond.d$e;
import qwc.i$a;
import java.lang.Object;
import qwc.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewGroup;

public final class d$e implements i$a	// class@00202a
{

    public void d$e(){
       super();
    }
    public void a(h p0,int p1){
       if (PatchProxy.isSupport(d$e.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d$e.class, "1")) {
          return;
       }
       a.p(p0, "holder");
       ViewGroup viewGroup = p0.itemView.findViewById(R.id.text_fake_view_container);
       if (viewGroup != null) {
          viewGroup.setVisibility(8);
       }
       return;
    }
}
