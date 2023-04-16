package oc1.b;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.c;
import java.lang.Object;
import android.content.DialogInterface;

public final class b implements DialogInterface$OnDismissListener	// class@0034c3
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.e = null;
    }
}
