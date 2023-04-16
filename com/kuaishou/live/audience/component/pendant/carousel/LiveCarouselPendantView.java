package com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import ekd.m1;
import androidx.viewpager.widget.ViewPager;
import com.kwai.robust.PatchProxyResult;

public final class LiveCarouselPendantView extends LinearLayout	// class@000bb9
{
    public ViewPager b;
    public LinearLayout c;
    public HashMap d;

    public void LiveCarouselPendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveCarouselPendantView.class, "5")) {
       }else {
          a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0aa0, this, true);
          View view = m1.f(this, R.id.live_carouse_pendant_view_pager);
          a.o(view, "bindWidget\(this, R.id.li¡­rouse_pendant_view_pager\)");
          this.b = view;
          view = m1.f(this, R.id.live_carouse_pendant_view_pager_dots_view);
          a.o(view, "bindWidget\(this, R.id.li¡­ant_view_pager_dots_view\)");
          this.c = view;
       }
       return;
    }
    public final LinearLayout getMDotView(){
       LiveCarouselPendantView obj = PatchProxy.apply(null, this, LiveCarouselPendantView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          a.S("mDotView");
       }
       return obj;
    }
    public final ViewPager getMViewPager(){
       LiveCarouselPendantView obj = PatchProxy.apply(null, this, LiveCarouselPendantView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("mViewPager");
       }
       return obj;
    }
    public final void setMDotView(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCarouselPendantView.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setMViewPager(ViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCarouselPendantView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
