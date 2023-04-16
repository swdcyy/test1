package gaa.e;
import android.content.DialogInterface$OnCancelListener;
import gaa.s;
import java.lang.Object;
import android.content.DialogInterface;

public final class e implements DialogInterface$OnCancelListener	// class@00242d
{
    public final s b;

    public void e(s p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       p0.g = true;
    }
}
