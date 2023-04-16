package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$b;
import io.reactivex.g;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import java.util.Collection;
import brd.g;

public final class HomeLocalNewUserBubblePresenter$a$b implements g	// class@001013
{
    public final HomeLocalNewUserBubblePresenter$a b;

    public void HomeLocalNewUserBubblePresenter$a$b(HomeLocalNewUserBubblePresenter$a p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       List list = this.b.v.b9();
       if (list.isEmpty() ^ 0x01) {
          p0.onNext(list);
       }
       p0.onComplete();
       return;
    }
}
