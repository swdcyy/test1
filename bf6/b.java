package bf6.b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import bf6.h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import java.lang.String;

public final class b implements PopupInterface$d	// class@00048f
{
    public final h a;

    public void b(h p0){
       this.a = p0;
    }
    public final void a(c p0,int p1){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 == 1 || p1 == 2) {
          ta.d("cancel");
       }
       return;
    }
}
