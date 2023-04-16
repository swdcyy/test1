package gaa.t;
import android.content.DialogInterface$OnCancelListener;
import gaa.h0;
import java.lang.Object;
import android.content.DialogInterface;

public final class t implements DialogInterface$OnCancelListener	// class@00244d
{
    public final h0 b;

    public void t(h0 p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       p0.i = true;
    }
}
