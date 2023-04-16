package nz9.o1;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import nz9.u1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;

public final class o1 implements PopupInterface$d	// class@003239
{
    public final u1 a;

    public void o1(u1 p0){
       this.a = p0;
    }
    public final void a(c p0,int p1){
       o1 ta = this.a;
       Objects.requireNonNull(ta);
       if (p1 != 1) {
          if (p1 == 2) {
             ta.a();
          }
       }else {
          ta.b();
       }
       return;
    }
}
