package com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$createTkView$bridge$2;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z51.g;
import z51.c;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$b;

public final class LiveMiniWidgetKdsView$createTkView$bridge$2 extends FunctionReferenceImpl implements a	// class@000d0c
{

    public void LiveMiniWidgetKdsView$createTkView$bridge$2(LiveMiniWidgetKdsView p0){
       super(0, p0, LiveMiniWidgetKdsView.class, "onWidgetClick", "onWidgetClick\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMiniWidgetKdsView$createTkView$bridge$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveMiniWidgetKdsView.class, "5")) {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView onWidgetClick", "widgetId", treceiver.g);
          LiveMiniWidgetKdsView d = treceiver.d;
          if (d != null) {
             d.b(treceiver.g, treceiver.h.c().a());
          }
       }
       return;
    }
}
