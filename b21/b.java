package b21.b;
import erd.r;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import java.lang.Object;
import kotlin.Triple;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import oe3.h;
import fe3.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import fe3.b;

public final class b implements r	// class@00030b
{
    public final LiveAudienceMultiChatPlayerViewTransformer b;

    public void b(LiveAudienceMultiChatPlayerViewTransformer p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       int b;
       LayoutConfig layoutConfig;
       Integer obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          obj = p0.component1();
          h oh = p0.component2();
          p0 = p0.component3();
          b tb = this.b;
          Object[] objArray = new Object[6];
          objArray[0] = "streamType";
          a.o(obj, "streamType");
          objArray[1] = obj;
          objArray[2] = "videoSize";
          a.o(p0, "videoSize");
          objArray[3] = p0;
          b = 4;
          objArray[4] = "layoutConfig";
          int i = 5;
          h oh1 = (oh != null)? oh: "Null";
          objArray[i] = oh1;
          tb.j("overlay event changed", objArray);
          if (!obj.intValue()) {
             this.b.e = null;
          }
          layoutConfig = oh.a();
          if (layoutConfig != null) {
             tb = layoutConfig.b();
             if (tb != null && tb.b() == 1) {
                layoutConfig = oh.a();
                if (layoutConfig == null || (layoutConfig.c() != 1 || obj.intValue() == 1)) {
                   LayoutConfig layoutConfig1 = oh.a();
                   if (layoutConfig1 == null || (layoutConfig1.c() != 2 || obj.intValue() == b)) {
                      b = true;
                   }
                }
             }
          }
          b = false;
       }
       return b;
    }
}
