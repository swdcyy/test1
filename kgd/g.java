package kgd.g;
import erd.g;
import kgd.d;
import java.lang.Object;
import kotlin.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;

public final class g implements g	// class@001791
{
    public final d b;
    public final boolean c;

    public void g(d p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          j.d(d.P8(this.b), this.b.R8());
          this.b.S8(this.c);
       }
       return;
    }
}
