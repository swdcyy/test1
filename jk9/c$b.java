package jk9.c$b;
import java.lang.Runnable;
import jk9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import android.widget.TextView;
import ekd.k1;

public final class c$b implements Runnable	// class@002af7
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$b.class, "1")) {
          return;
       }
       c$b tb = this.b;
       Objects.requireNonNull(tb);
       Rect obj = PatchProxy.apply(objArray, tb, c.class, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = new Rect();
          b = (tb.h.getGlobalVisibleRect(obj) && (double)obj.height() - ((double)tb.h.getHeight() * 0x3fe8000000000000) > 0)? true: false;
       }
       if (b) {
          k1.r(this.b.e, 300);
       }
       return;
    }
}
