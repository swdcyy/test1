package c47.p;
import oq5.c;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public class p implements c	// class@0004db
{
    public final d b;

    public void p(d p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       d y = this.b.y;
       boolean b = (p0.orientation == 2)? true: false;
       y.onNext(Boolean.valueOf(b));
       return;
    }
}
