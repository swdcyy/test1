package h33.v;
import erd.g;
import h33.x;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import h33.y;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class v implements g	// class@002c31
{
    public final x b;
    public final SlipSwitchButton c;

    public void v(x p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v tb = this.b;
       v tc = this.c;
       Objects.requireNonNull(tb);
       if (!p0 instanceof KwaiException) {
          tb.g.a(tc, (tc.getSwitch() ^ 0x01));
          ExceptionHandler.handleException(a.B, p0);
       }else {
          tb.g.a = p0.getErrorCode();
          x g = tb.g;
          if (!g.d(g.a, tc)) {
             tb.g.a(tc, (tc.getSwitch() ^ 0x01));
             ExceptionHandler.handleException(a.B, p0);
          }
       }
       return;
    }
}
