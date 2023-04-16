package ae3.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.liteend.baseinfo.g;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.liteend.baseinfo.h$a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;

public final class c implements View$OnClickListener	// class@00009e
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(new h$a(), tb, g.class, "2")) {
       }else {
          tb.d.run();
       }
       return;
    }
}
