package com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem$createTkView$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import cs5.f;
import z51.h;
import z51.j;
import pp.c;
import com.kuaishou.android.live.log.b;
import cs5.b;
import java.lang.Boolean;
import dsd.a;
import cs5.e;
import java.lang.IllegalStateException;

public final class LiveMiniWidgetKdsItem$createTkView$1 extends SuspendLambda implements p	// class@0016f5
{
    public final LiveMiniWidgetKdsView $view;
    public int label;
    public k0 p$;
    public final LiveMiniWidgetKdsItem this$0;

    public void LiveMiniWidgetKdsItem$createTkView$1(LiveMiniWidgetKdsItem p0,LiveMiniWidgetKdsView p1,c p2){
       this.this$0 = p0;
       this.$view = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveMiniWidgetKdsItem$createTkView$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMiniWidgetKdsItem$createTkView$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMiniWidgetKdsItem$createTkView$1(this.this$0, this.$view, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMiniWidgetKdsItem$createTkView$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMiniWidgetKdsItem$createTkView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       if (!this.$view.a()) {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, j.a(this.this$0.x(), h.h)+"view.createTkView fail", "widgetId", this.this$0.z());
          p0 = this.this$0.k();
          if (p0 != null) {
             p0.j(this.this$0.z());
          }
       }else {
          b.d0(LiveLogTag.LIVE_MINI_WIDGET_KDS, j.a(this.this$0.x(), h.h)+"view.createTkView success", "widgetId", this.this$0.z(), "isShowing", a.a(this.this$0.h0()));
          p0 = this.this$0.f;
          if (p0 != null) {
             p0.a();
          }
          if (this.this$0.h0()) {
             this.$view.d();
          }
       }
       return l1.a;
    }
}
