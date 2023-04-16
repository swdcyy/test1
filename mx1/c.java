package mx1.c;
import lf3.g;
import mx1.g;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import android.util.Pair;
import mx1.a;
import lf3.f;

public final class c implements g	// class@00323d
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b;
       c tb = this.b;
       Objects.requireNonNull(tb);
       LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup liveInteract = p0.liveInteractiveWidget;
       int len = liveInteract.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = liveInteract[i];
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          g og = g.class;
          Object obj = PatchProxy.applyOneRefs(oobject, tb, og, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "onReceivedWidgetData", "widgetId", oobject.widgetId);
             obj = PatchProxy.applyOneRefs(oobject, tb, og, "5");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!tb.c.containsKey(oobject.widgetId)){
                b = tb.a(oobject);
             }else {
                Object obj1 = PatchProxy.applyOneRefs(oobject, tb, og, "6");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   Pair pair = tb.c.get(oobject.widgetId);
                   Objects.requireNonNull(pair);
                   if (oobject.version - pair.first.version > 0) {
                      tb.b(oobject.widgetId);
                      tb.a(oobject);
                      b = true;
                   }else {
                      b = false;
                   }
                }
             }
          }
          if (b) {
             i1 = 1;
          }
          i = i + 1;
       }
       if (i1) {
          tb.b.a();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
