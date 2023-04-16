package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$f;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import kzb.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import java.lang.Float;

public final class HomePostBubblePresenterV2$f implements SlidingPaneLayout$d	// class@00101f
{
    public boolean a;
    public final HomePostBubblePresenterV2 b;

    public void HomePostBubblePresenterV2$f(HomePostBubblePresenterV2 p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$f.class, "2")) {
          return;
       }
       a.p(p0, "panel");
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 homePanelSlide close", objArray);
       this.b.V8().r(0);
       this.b.S8().k(0);
       this.a = true;
       return;
    }
    public void b(View p0,float p1){
       HomePostBubblePresenterV2$f uof = HomePostBubblePresenterV2$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uof, "1")) {
          return;
       }
       a.p(p0, "panel");
       if (this.a != null && (p1 && p1 - 0x3f800000)) {
          Object[] objArray = new Object[0];
          g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 homePanelSlide, dismiss bubble", objArray);
          this.b.S8().f(true);
          this.a = false;
       }
    label_0043 :
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$f.class, "3")) {
          return;
       }
       a.p(p0, "panel");
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 homePanelSlide open", objArray);
       this.b.V8().r(true);
       this.b.S8().d(0);
       this.a = true;
       return;
    }
}
