package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$c;
import fw8.b;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import kzb.a;
import hn5.c;
import java.lang.Boolean;
import mrd.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;

public final class HomePostBubblePresenterV2$c extends b	// class@00101c
{
    public final HomePostBubblePresenterV2 b;

    public void HomePostBubblePresenterV2$c(HomePostBubblePresenterV2 p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostBubblePresenterV2$c.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onActivityResumed", objArray);
       boolean b = p0 instanceof c;
       this.b.V8().c.onNext(Boolean.valueOf(b));
       if (!b) {
          this.b.S8().f(true);
       }
       return;
    }
}
