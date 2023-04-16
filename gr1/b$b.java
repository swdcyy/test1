package gr1.b$b;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import gr1.a;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig$a;

public final class b$b implements a	// class@002568
{

    public void b$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
       label_0020 :
          p0 = null;
       }else {
          int i = a.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                goto label_0020 ;
             }else {
                i = LiveMultiLineArenaTagLayoutConfig.h.b();
             }
          }else {
             i = LiveMultiLineArenaTagLayoutConfig.h.c();
          }
       }
       return p0;
    }
}
