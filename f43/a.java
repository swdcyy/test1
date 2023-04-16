package f43.a;
import android.view.View$OnClickListener;
import f43.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import f43.b$b;
import com.kwai.library.widget.popup.common.c;

public final class a implements View$OnClickListener	// class@002867
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b d;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.getId() == 0x7f0a053e) {
          d = tb.D;
          if (d != null) {
             d.b();
          }
          tb.o();
       }else if(p0.getId() == 0x7f0a053f){
          d = tb.D;
          if (d != null) {
             d.a();
          }
          tb.o();
       }
       return;
    }
}
