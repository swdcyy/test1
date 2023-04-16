package hf2.c;
import android.content.DialogInterface$OnClickListener;
import hf2.l;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.String;
import ne2.k;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.core.show.profilecard.follow.b;
import hf2.i;
import wj2.r;
import we2.f;
import brd.t;
import brd.x;
import a51.c;
import crd.b;

public final class c implements DialogInterface$OnClickListener	// class@002d7e
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f104f05) {
          tb.K.s(true, "PERSONAL_CARD_FOLLOW");
          b.a(tb.E, "1");
          b.d(tb.D, new i(tb)).compose(tb.P8()).subscribe();
       }
       return;
    }
}
