package ngd.b$a;
import erd.g;
import ngd.b;
import java.lang.Object;
import com.yxcorp.plugin.setting.fontscale.FontScaleFollowSystemStatus;

public final class b$a implements g	// class@001e31
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       b$a tb = this.b;
       boolean b = (p0 == FontScaleFollowSystemStatus.OPEN)? true: false;
       tb.p = b;
       return;
    }
}
