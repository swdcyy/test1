package el9.u;
import erd.g;
import com.yxcorp.gifshow.comment.presenter.global.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;

public final class u implements g	// class@002202
{
    public final f b;

    public void u(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          p0 = tb.v;
          if (p0 != null) {
             p0.o();
             tb.v = null;
          }
       }
       return;
    }
}
