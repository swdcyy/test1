package l3a.a;
import android.content.DialogInterface$OnShowListener;
import msd.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a implements DialogInterface$OnShowListener	// class@002d47
{
    public final l b;

    public void a(l p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       a.o(this.b.invoke(p0), "invoke\(...\)");
    }
}