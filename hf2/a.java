package hf2.a;
import android.content.DialogInterface$OnCancelListener;
import hf2.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.String;
import ne2.k;

public final class a implements DialogInterface$OnCancelListener	// class@002d7c
{
    public final l b;

    public void a(l p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       this.b.K.s(false, "PERSONAL_CARD_FOLLOW");
    }
}
