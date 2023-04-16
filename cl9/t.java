package cl9.t;
import erd.g;
import cl9.y;
import java.lang.Object;
import nk9.h;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.library.widget.popup.common.c;

public final class t implements g	// class@00066d
{
    public final y b;

    public void t(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       p0 = tb.F;
       if (p0 != null) {
          p0.m();
       }
       p0 = tb.J;
       if (p0 != null) {
          p0.o();
       }
       p0 = tb.K;
       if (p0 != null) {
          p0.o();
          tb.K = null;
       }
       return;
    }
}
