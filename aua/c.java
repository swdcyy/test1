package aua.c;
import erd.g;
import aua.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.widget.TextView;
import java.lang.CharSequence;

public final class c implements g	// class@000308
{
    public final e b;
    public final int c;

    public void c(e p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       StringBuilder str = p0+tb.x.getResources().getString(0x7f101cb3);
       p0 = (this.c <= null)? "0": tb.x.getText();
       tb.W8(str+p0);
       return;
    }
}
