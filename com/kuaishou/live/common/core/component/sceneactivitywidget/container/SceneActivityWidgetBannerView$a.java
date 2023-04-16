package com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import px1.a;
import nx1.c;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import xp5.i;
import lp3.c;
import lp3.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import sx4.e;
import sx4.e$a;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.SceneActivityWidgetBannerView$b;

public class SceneActivityWidgetBannerView$a extends ViewPager$l	// class@001768
{
    public final SceneActivityWidgetBannerView b;

    public void SceneActivityWidgetBannerView$a(SceneActivityWidgetBannerView p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       SceneActivityWidgetBannerView$a uoa = SceneActivityWidgetBannerView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.b.g.isEmpty()) {
          return;
       }
       p0 = p0 % this.b.g.size();
       a uoa1 = this.b.g.get(p0);
       c uoc = uoa1.i();
       int i = p0 + 1;
       LiveInteractiveWidgetProto$LiveInteractiveWidget widgetId = uoa1.j().widgetId;
       SceneActivityWidgetBannerView$a tb = this.b;
       int i1 = (tb.c != null)? 3: 1;
       uoc.d(i, widgetId, i1, tb.i.a(i.class).a());
       uoa1.h().setIJS2NativeInvoker(uoc);
       this.b.g.get(p0).b();
       uoa = this.b;
       SceneActivityWidgetBannerView d = uoa.d;
       if (d != -1) {
          uoa.g.get(d).d();
       }
       SceneActivityWidgetBannerView k = this.b.k;
       if (k != null) {
          k.a(p0);
       }
       this.b.d = p0;
       return;
    }
}
