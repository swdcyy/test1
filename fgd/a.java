package fgd.a;
import android.view.View$OnClickListener;
import fgd.k;
import java.lang.Object;
import android.view.View;
import android.widget.Button;
import java.util.List;
import bgd.a;

public final class a implements View$OnClickListener	// class@000e20
{
    public final k b;

    public void a(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       boolean b = tb.s.isSelected();
       int i = 0;
       while (i < tb.x.size()) {
          if (!b || (tb.x.get(i).a() || (!b && !tb.x.get(i).a()))) {
             tb.R8(i);
          }
          i = i + 1;
       }
       tb.S8();
       return;
    }
}
