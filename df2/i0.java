package df2.i0;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.String;
import ne2.k;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.core.show.profilecard.follow.b;
import wj2.r;
import we2.f;
import brd.t;
import brd.x;
import a51.c;
import crd.b;

public final class i0 implements DialogInterface$OnClickListener	// class@0024f4
{
    public final m0 b;

    public void i0(m0 p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f104f05) {
          tb.z.s(true, "PERSONAL_CARD_MORE");
          b.a(tb.x, "2");
          b.d(tb.v, null).compose(tb.P8()).subscribe();
       }
       return;
    }
}
