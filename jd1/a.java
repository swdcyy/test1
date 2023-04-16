package jd1.a;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.a;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@002b38
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.j = null;
    }
}
