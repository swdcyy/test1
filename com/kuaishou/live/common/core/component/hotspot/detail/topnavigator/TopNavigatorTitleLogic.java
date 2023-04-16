package com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import com.kuaishou.live.widget.ShootMarqueeView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$marqueeRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$2;
import androidx.lifecycle.LifecycleObserver;
import android.text.TextPaint;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$b;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TopNavigatorTitleLogic	// class@001418
{
    public final p a;
    public final LifecycleOwner b;
    public final View c;
    public final ShootMarqueeView d;
    public final LiveData e;
    public final LiveData f;
    public final MutableLiveData g;

    public void TopNavigatorTitleLogic(LifecycleOwner p0,View p1,ShootMarqueeView p2,LiveData p3,LiveData p4,MutableLiveData p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "titleContainer");
       a.p(p2, "titleText");
       a.p(p3, "titleModel");
       a.p(p4, "titleUpdateData");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.a = s.c(new TopNavigatorTitleLogic$marqueeRunnable$2(this));
       p4.observe(p0, new TopNavigatorTitleLogic$a(this));
       p0.getLifecycle().addObserver(new TopNavigatorTitleLogic$2(this));
       p2.setMarqueeDpPerSecond(40);
       TextPaint paint = p2.getPaint();
       a.o(paint, "titleText.paint");
       paint.setFakeBoldText(true);
       p3.observe(p0, new TopNavigatorTitleLogic$b(this));
    }
    public final Runnable a(){
       Object obj = PatchProxy.apply(null, this, TopNavigatorTitleLogic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, TopNavigatorTitleLogic.class, "4")) {
          return;
       }
       this.d.y();
       this.d.removeCallbacks(this.a());
       return;
    }
}
