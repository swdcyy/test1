package br1.c;
import androidx.lifecycle.Observer;
import br1.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.widget.TextView;

public final class c implements Observer	// class@0003fa
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.b;
             a.o(p0, "titleImage");
             p0.setVisibility(0);
             p0 = this.b.a;
             a.o(p0, "titleView");
             p0.setVisibility(8);
             p0 = this.b.d;
             a.o(p0, "countDownView");
             p0.setVisibility(8);
          }else {
             p0 = this.b.b;
             a.o(p0, "titleImage");
             p0.setVisibility(8);
             p0 = this.b.a;
             a.o(p0, "titleView");
             p0.setVisibility(0);
             p0 = this.b.d;
             a.o(p0, "countDownView");
             p0.setVisibility(0);
          }
       }
       return;
    }
}
