package n2a.g$b;
import tk7.b$a;
import n2a.g;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n2a.g$b$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class g$b implements b$a	// class@0030d0
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public b$a a(String p0){
       return this;
    }
    public b$a b(CharSequence p0,View$OnClickListener p1){
       p0.u = p1;
       return this;
    }
    public b$a c(CharSequence p0,View$OnClickListener p1){
       p0.t = p1;
       return this;
    }
    public b$a d(View$OnClickListener p0){
       return this;
    }
    public b$a setTitle(String p0){
       return this;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       this.a.v.Y(new g$b$a(this));
       return;
    }
}
