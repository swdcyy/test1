package ked.a;
import android.content.DialogInterface$OnDismissListener;
import ked.h;
import java.lang.Object;
import android.content.DialogInterface;

public final class a implements DialogInterface$OnDismissListener	// class@001769
{
    public final h b;

    public void a(h p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       p0.q = null;
    }
}
