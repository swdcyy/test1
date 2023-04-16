package mx1.g;
import hf3.a;
import mx1.a;
import java.lang.Object;
import java.util.LinkedHashMap;
import mx1.c;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty;
import java.lang.System;
import java.lang.Long;
import crd.b;
import java.util.Map;
import android.util.Pair;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import mx1.d;
import mx1.e;
import erd.g;

public class g	// class@003241
{
    public final a a;
    public a b;
    public final Map c;
    public final g d;

    public void g(a p0,a p1){
       super();
       this.c = new LinkedHashMap();
       this.d = new c(this);
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(LiveInteractiveWidgetProto$LiveInteractiveWidget p0){
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, og, "7");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       if (obj1.status == true) {
          b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "widget status is close", "widgetId", obj1.widgetId);
          return false;
       }else {
          obj2 = PatchProxy.applyOneRefs(obj1, obj, og, "10");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(obj1.property == null){
             b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "invalid widget data, property is null", "widgetId", obj1.widgetId);
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return false;
          }else if(obj1.property.expireTime - System.currentTimeMillis() <= 0){
             b.d0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "expiration time is smaller than the current time, remove widget", "widgetId", obj1.widgetId, "expire time", Long.valueOf(obj1.property.expireTime));
             return false;
          }else {
             b uob = PatchProxy.applyOneRefs(obj1, obj, og, "9");
             if (uob != patchProxyRe) {
             }else if(obj.c.containsKey(obj1.widgetId)){
                Pair pair = obj.c.get(obj1.widgetId);
                Objects.requireNonNull(pair);
                pair.second.dispose();
             }
             uob = t.timer((obj1.property.expireTime - System.currentTimeMillis()), TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new d(obj, obj1), e.b);
             obj.c.put(obj1.widgetId, Pair.create(obj1, uob));
             return true;
          }
       }
    }
    public final boolean b(String p0){
       Pair obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.get(p0);
       if (obj == null) {
          return false;
       }
       obj.second.dispose();
       this.c.remove(p0);
       return true;
    }
}
