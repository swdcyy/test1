package l29.a;
import android.content.DialogInterface$OnDismissListener;
import msd.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a implements DialogInterface$OnDismissListener	// class@002c7b
{
    public final l b;

    public void a(l p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}
