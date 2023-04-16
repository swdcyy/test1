package ek2.d0;
import android.content.DialogInterface$OnDismissListener;
import ek2.a0;
import com.kuaishou.live.core.show.stayinfo.StayInfo;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;

public final class d0 implements DialogInterface$OnDismissListener	// class@002748
{
    public final a0 b;
    public final StayInfo c;
    public final View$OnClickListener d;
    public final View$OnClickListener e;

    public void d0(a0 p0,StayInfo p1,View$OnClickListener p2,View$OnClickListener p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.K = null;
    }
}
