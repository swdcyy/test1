package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$a;
import erd.g;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import ozb.a;
import an6.o;

public final class HomeLocalNewUserBubblePresenter$a$a implements g	// class@001012
{
    public final HomeLocalNewUserBubblePresenter$a b;

    public void HomeLocalNewUserBubblePresenter$a$a(HomeLocalNewUserBubblePresenter$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             if (this.b.b()) {
                this.b.v.S8().a(this.b);
             }else {
                this.b.v.S8().b(this.b);
             }
          }
       }
       return;
    }
}
