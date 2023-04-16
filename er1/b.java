package er1.b;
import ekd.t;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ls1.b;
import java.lang.Long;
import java.lang.Integer;

public final class b extends t	// class@0021e1
{
    public final LiveMultiLineArenaLineMemberModel g;
    public final int h;

    public void b(LiveMultiLineArenaLineMemberModel p0,int p1,int p2,int p3){
       this.g = p0;
       this.h = p1;
       super(p2, p3);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b.b(this.g.b()).setValue(Long.valueOf(0));
       this.g.e("counterFinish");
       return;
    }
    public void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       b.b(this.g.b()).setValue(Long.valueOf(((long)p0 * 1000)));
       return;
    }
}
