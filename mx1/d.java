package mx1.d;
import erd.g;
import mx1.g;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import mx1.a;

public final class d implements g	// class@00323e
{
    public final g b;
    public final LiveInteractiveWidgetProto$LiveInteractiveWidget c;

    public void d(g p0,LiveInteractiveWidgetProto$LiveInteractiveWidget p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       b.d0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "achieve expiration time, remove widget", "widgetId", tc.widgetId, "expire time", Long.valueOf(tc.property.expireTime));
       if (tb.b(tc.widgetId)) {
          tb.b.a();
       }
       return;
    }
}
