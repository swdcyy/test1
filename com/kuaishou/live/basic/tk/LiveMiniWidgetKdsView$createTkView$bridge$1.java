package com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$createTkView$bridge$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import cs5.b;

public final class LiveMiniWidgetKdsView$createTkView$bridge$1 extends FunctionReferenceImpl implements a	// class@000d0b
{

    public void LiveMiniWidgetKdsView$createTkView$bridge$1(LiveMiniWidgetKdsView p0){
       super(0, p0, LiveMiniWidgetKdsView.class, "closePage", "closePage\(\)Z", 0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CallableReference obj = PatchProxy.apply(objArray, this, LiveMiniWidgetKdsView$createTkView$bridge$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.receiver;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, LiveMiniWidgetKdsView.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView closePage", "widgetId", obj.g);
          LiveMiniWidgetKdsView c = obj.c;
          if (c != null) {
             c.j(obj.g);
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
}
