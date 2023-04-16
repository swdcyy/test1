package hl2.k;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.template.j;
import java.lang.Object;
import android.content.DialogInterface;

public final class k implements DialogInterface$OnDismissListener	// class@002dc5
{
    public final j b;

    public void k(j p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.N = null;
    }
}
