package com.kuaishou.live.common.core.component.liveplus.pendant.right.LivePlusRightPendantView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import com.kuaishou.live.common.core.component.liveplus.pendant.right.LivePlusRightPendantView$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import java.lang.Boolean;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;

public final class LivePlusRightPendantView extends SelectShapeFrameLayout	// class@00149c
{
    public LiveMiniWidgetContainerView c;
    public boolean d;
    public HashMap e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final LivePlusRightPendantView$a j;

    static {
       LivePlusRightPendantView.j = new LivePlusRightPendantView$a(null);
       LivePlusRightPendantView.f = a1.d(0x7f070261);
       LivePlusRightPendantView.g = a1.d(0x7f07034c);
       LivePlusRightPendantView.h = a1.d(0x7f070339);
       LivePlusRightPendantView.i = a1.d(0x7f07028f);
    }
    public void LivePlusRightPendantView(Context p0){
       super(p0, null, 2, null);
    }
    public void LivePlusRightPendantView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.d = true;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlusRightPendantView.class, "1")) {
       }else {
          View view = a.c(p0, R.layout.arg_RES_7f0d0d36, this).findViewById(R.id.live_plus_widget_content_container);
          a.o(view, "view.findViewById\(R.id.l¡­widget_content_container\)");
          this.c = view;
       }
       return;
    }
    public void LivePlusRightPendantView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(LivePlusRightPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlusRightPendantView.class, "2")) {
          return;
       }
       this.d = p0;
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, LivePlusRightPendantView.class, "4")) {
             this.c(true);
          }
       }else if(PatchProxy.applyVoid(null, this, LivePlusRightPendantView.class, "5")){
          this.c(false);
       }
       this.requestLayout();
       return;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(LivePlusRightPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlusRightPendantView.class, "6")) {
          return;
       }
       int f = LivePlusRightPendantView.f;
       int i = (p0)? LivePlusRightPendantView.i: LivePlusRightPendantView.h;
       LivePlusRightPendantView tc = this.c;
       if (tc == null) {
          a.S("miniWidgetContainerView");
       }
       ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
       layoutParams.width = f;
       layoutParams.height = i;
       LivePlusRightPendantView tc1 = this.c;
       if (tc1 == null) {
          a.S("miniWidgetContainerView");
       }
       tc1.setLayoutParams(layoutParams);
       return;
    }
    public final LiveMiniWidgetContainerView getMiniWidgetContainerView(){
       LivePlusRightPendantView obj = PatchProxy.apply(null, this, LivePlusRightPendantView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("miniWidgetContainerView");
       }
       return obj;
    }
}
