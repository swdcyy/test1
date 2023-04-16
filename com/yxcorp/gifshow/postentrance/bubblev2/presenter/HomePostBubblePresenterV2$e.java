package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$e;
import fr6.d;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2;
import java.lang.Object;
import wq6.e;
import wq6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.kcube.TabIdentifier;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import kzb.a;
import mrd.a;
import kotlin.Pair;
import java.util.Iterator;
import java.lang.Iterable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ozb.r;
import fr6.c;

public final class HomePostBubblePresenterV2$e implements d	// class@00101e
{
    public final HomePostBubblePresenterV2 a;

    public void HomePostBubblePresenterV2$e(HomePostBubblePresenterV2 p0){
       this.a = p0;
       super();
    }
    public void a(e p0,h p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, HomePostBubblePresenterV2$e.class, "1")) {
          return;
       }
       a.p(p0, "atomicTab");
       a.p(p1, "belongsToChild");
       String type = p0.M2().getType();
       String type1 = p1.M2().getType();
       Object[] objArray = new Object[0];
       g.C().w("home_entrance_bubble", "HomePostBubblePresenterV2 onTabSelected "+type+' '+type1, objArray);
       this.a.V8().m().onNext(new Pair(type, type1));
       Iterator iterator = this.a.y.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          if (presenterV2 instanceof r) {
             presenterV2.p1(type, type1);
          }
       }
       PatchProxy.onMethodExit(HomePostBubblePresenterV2$e.class, "1");
       return;
    }
    public void b(e p0,e p1,h p2,h p3,float p4){
       c.b(this, p0, p1, p2, p3, p4);
    }
    public void c(e p0,h p1){
       c.a(this, p0, p1);
    }
}
