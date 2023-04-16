package a67.j;
import oq5.c;
import a67.l;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;

public final class j implements c	// class@00005d
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.orientation == 2) {
          tb.V8();
       }else {
          tb.P8();
       }
       return;
    }
}
