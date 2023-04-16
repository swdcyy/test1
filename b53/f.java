package b53.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements View$OnClickListener	// class@00030a
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "7")) {
       }else {
          tb.X8();
       }
       return;
    }
}
