package iv1.n;
import ok.h;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$TextDesc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.common.LiveColorSpanModel;

public class n implements h	// class@0029a9
{
    public final LiveOperationNotificationView b;

    public void n(LiveOperationNotificationView p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       LiveColorSpanModel liveColorSpa = PatchProxy.applyOneRefs(p0, this, n.class, "1");
       if (liveColorSpa != PatchProxyResult.class) {
       }else {
          liveColorSpa = new LiveColorSpanModel();
          liveColorSpa.mColor = p0.textColor;
          liveColorSpa.mText = p0.textContent;
       }
       return liveColorSpa;
    }
}
