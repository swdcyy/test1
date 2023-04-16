package al1.a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import al1.c;
import java.lang.Object;
import android.view.View;
import ya1.f0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class a implements LiveViewFlipper$a	// class@0000c6
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public void a(View p0,int p1){
       f0.a(this, p0, p1);
    }
    public final void b(View p0,int p1){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), tb, c.class, "6")) {
          tb.P8(p0);
       }
       return;
    }
}
