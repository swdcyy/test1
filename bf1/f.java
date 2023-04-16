package bf1.f;
import android.view.View$OnClickListener;
import bf1.h;
import df1.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import df1.c;
import bf1.j;
import s51.c;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide;
import android.content.Context;

public final class f implements View$OnClickListener	// class@000374
{
    public final h b;
    public final f c;

    public void f(h p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, h.class, "3")) {
       }else {
          tb.o(tc);
          tb.p(tc);
          tb.l().r4(tc.c.actionUrl, tb.k());
       }
       return;
    }
}
