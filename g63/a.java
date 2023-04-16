package g63.a;
import oq5.c;
import g63.b;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;

public final class a implements c	// class@002a7b
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0.orientation == 2)? true: false;
       tb.P8(false, b);
       return;
    }
}
