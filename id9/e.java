package id9.e;
import android.view.View$OnClickListener;
import id9.t;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import pi9.j;

public final class e implements View$OnClickListener	// class@0027eb
{
    public final t b;

    public void e(t p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, t.class, "14")) {
       }else if(tb.l2()){
          t o = tb.o;
          o.setSelected((o.isSelected() ^ 0x01));
          ViewGroup viewGroup = tb.t.a();
          int i = (tb.o.isSelected())? 0: 8;
          viewGroup.setVisibility(i);
       }
       return;
    }
}
