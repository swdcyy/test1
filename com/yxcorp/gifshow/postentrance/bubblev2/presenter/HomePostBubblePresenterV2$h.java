package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$h;
import jta.h;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import jta.g;

public final class HomePostBubblePresenterV2$h implements h	// class@001021
{
    public final HomePostBubblePresenterV2 a;

    public void HomePostBubblePresenterV2$h(HomePostBubblePresenterV2 p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, HomePostBubblePresenterV2$h.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onSwipeStart", objArray);
       this.a.S8().f(true);
       return;
    }
    public void b(){
       g.a(this);
    }
}
