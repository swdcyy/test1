package ny0.d;
import oq5.c;
import ny0.f;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import t02.a0;
import xp5.a;

public final class d implements c	// class@003420
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       f uof = (p0.orientation == 2)? 1: null;
       if (uof) {
          if (tb.E.t.b()) {
             tb.e9();
          }else {
             tb.o9();
          }
       }else {
          tb.q9(true);
       }
       return;
    }
}
