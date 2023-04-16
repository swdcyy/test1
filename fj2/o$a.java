package fj2.o$a;
import oq5.c;
import fj2.o;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class o$a implements c	// class@002977
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o$a tb = this.b;
       if (tb.D == null) {
          tb.b9();
          tb.D = true;
       }
       return;
    }
}
