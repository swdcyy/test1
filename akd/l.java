package akd.l;
import android.view.View$OnClickListener;
import com.yxcorp.upgrade.impl.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zjd.h$a;

public final class l implements View$OnClickListener	// class@000057
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, c.class, "8")) {
       }else if(tb.s != null){
          tb.u.a();
       }
       return;
    }
}
