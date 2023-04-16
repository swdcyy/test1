package pa.j$b;
import erd.r;
import android.app.Activity;
import java.lang.Object;
import ox8.e;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class j$b implements r	// class@0028ff
{
    public final Activity b;

    public void j$b(Activity p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       a.p(p0, "it");
       return (this.b.isFinishing() ^ 0x01);
    }
}
