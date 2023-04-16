package lca.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import lca.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gca.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lca.d$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import gca.c;
import android.widget.FrameLayout;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import android.graphics.Color;

public final class d extends RecyclerView$ViewHolder	// class@002dac
{
    public b a;
    public int b;
    public final a c;

    public void d(View p0,a p1){
       a.p(p0, "itemView");
       a.p(p1, "fineTuningActionListener");
       super(p0);
       this.c = p1;
       this.b = -1;
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "fineTuningItemUiData");
       this.a = p0;
       this.itemView.setOnClickListener(new d$a(this));
       ImageView imageView = this.itemView.findViewById(R.id.fine_tuning_param_icon);
       d ta = this.a;
       if (ta == null) {
          a.S("mFineTuningItemUiData");
       }
       imageView.setImageResource(ta.d().c);
       View view = this.itemView.findViewById(R.id.fine_tuning_param_icon_container);
       a.o(view, "itemView.findViewById<Fr¡­ing_param_icon_container\)");
       ta = this.a;
       if (ta == null) {
          a.S("mFineTuningItemUiData");
       }
       view.setSelected(ta.e());
       TextView textView = this.itemView.findViewById(R.id.fine_tuning_param_text);
       a.o(textView, "textView");
       ta = this.a;
       if (ta == null) {
          a.S("mFineTuningItemUiData");
       }
       textView.setText(a1.p(ta.d().b));
       ta = this.a;
       if (ta == null) {
          a.S("mFineTuningItemUiData");
       }
       int i = (ta.e())? -1: Color.parseColor("#ADFFFFFF");
       textView.setTextColor(i);
       view = this.itemView.findViewById(R.id.fine_tuning_changed_flag);
       ta = this.a;
       if (ta == null) {
          a.S("mFineTuningItemUiData");
       }
       if (ta.d != null) {
          ta = this.a;
          if (ta == null) {
             a.S("mFineTuningItemUiData");
          }
          i = (ta.e())? 0x7f080673: 0x7f080672;
          view.setBackgroundResource(i);
          a.o(view, "flagView");
          view.setVisibility(0);
       }else {
          a.o(view, "flagView");
          view.setVisibility(8);
       }
       return;
    }
}
