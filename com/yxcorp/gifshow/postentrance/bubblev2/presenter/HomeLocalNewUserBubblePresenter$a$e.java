package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$e;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import rzb.p;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BasePostEntranceBubble;
import brd.t;
import pzb.r;
import brd.x;

public final class HomeLocalNewUserBubblePresenter$a$e implements o	// class@001016
{
    public final HomeLocalNewUserBubblePresenter$a b;

    public void HomeLocalNewUserBubblePresenter$a$e(HomeLocalNewUserBubblePresenter$a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          p0 = (p.b.b(p0) && this.b.r() != null)? t.just(p0).compose(new r(this.b.r())): t.just(p0);
          ot = p0;
       }
       return ot;
    }
}
