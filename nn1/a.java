package nn1.a;
import yh3.a;
import androidx.lifecycle.LiveData;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn1.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nn1.a$a$a;
import ln1.b;
import nn1.a$a$b;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import fn1.a;
import fn1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaBaseItemViewModel$logShowEvent$1;
import msd.l;

public class a extends a	// class@00337c
{
    public final LiveData a;
    public final p b;
    public final k c;

    public void a(LiveData p0,p p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "clickHandler");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void u0(a$a p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof a$a$a) {
          b value = this.a.getValue();
          if (value != null) {
             this.b.invoke(value, p0.a);
          }else {
             return;
          }
       }else if(a.g(p0, a$a$b.a)){
          b value1 = this.a.getValue();
          if (value1 != null && !value1.getHasReportShowEvent()) {
             if (!PatchProxy.applyVoidOneRefs(value1, this, uoa, "2")) {
                a.a.d("LIVE_HOTSPOT_DATAIL_RELATED_CONTENT", this.c.E0(), this.c.a(), new LiveHotSpotDetailNormalMediaBaseItemViewModel$logShowEvent$1(MediaType.Companion.a(value1).getLoggerType(), value1));
             }
             value1.setHasReportShowEvent(true);
          }
       }
       return;
    }
}
