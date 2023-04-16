package apd.h;
import to7.b;
import apd.i;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.Object;
import to7.a;
import so7.d;
import android.view.View;
import apd.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class h implements b	// class@000217
{
    public final c$b a;
    public final i b;

    public void h(i p0,c$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       a.b(this, p0);
    }
    public void b(d p0){
       if (p0.a() != null) {
          this.b.k = p0;
          this.a.Y(new h$a(this));
       }
       return;
    }
}
