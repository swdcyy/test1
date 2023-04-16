package ak2.i;
import oq5.c;
import ak2.l;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;

public final class i implements c	// class@0000ec
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.orientation == 2)? true: false;
       tb.y = b;
       tb.P8();
       return;
    }
}
