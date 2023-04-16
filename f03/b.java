package f03.b;
import com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import f03.c;
import com.kuaishou.livestream.message.nano.LiveEffectResourceData;
import java.util.List;

public class b	// class@00282d
{
    public int a;
    public long b;
    public List c;

    public void b(LiveEffectExtraResInfo p0){
       super();
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
       }else {
          this.a = p0.reqType;
          this.b = p0.timeoutDurationMs;
          p0 = p0.resourceDataList;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
             this.c = new ArrayList();
             int len = p0.length;
             for (int i = 0; i < len; i = i + 1) {
                this.c.add(new c(p0[i]));
             }
          }
       }
       return;
    }
}
