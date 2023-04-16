package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$b;
import rq5.a;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Number;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Arrays;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;
import lnc.a1;

public class LiveGzonePendantViewPagerPresenter$b extends a	// class@000c37
{
    public final LiveGzonePendantViewPagerPresenter h;

    public void LiveGzonePendantViewPagerPresenter$b(LiveGzonePendantViewPagerPresenter p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePendantViewPagerPresenter$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h.t.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          this.h.t.getLayoutParams().bottomMargin = this.h.q;
       }
       return this.h.t;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePendantViewPagerPresenter$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.a();
    }
    public List c(){
       LivePendantRelation[] obj = PatchProxy.apply(null, this, LiveGzonePendantViewPagerPresenter$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePendantRelation[]{LivePendantRelation.SCREEN_LANDSCAPE,LivePendantRelation.ANSWERING_QUESTION,LivePendantRelation.LIVE_PK_SMALL_WINDOW};
       return Arrays.asList(obj);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.GZONE_ACTIVITY_WIDGET;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePendantViewPagerPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(4.00f);
    }
}
