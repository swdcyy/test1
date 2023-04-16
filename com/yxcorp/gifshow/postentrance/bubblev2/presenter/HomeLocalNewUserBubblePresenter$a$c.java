package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$c;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import a0c.c;
import rzb.i;
import rzb.k;
import a0c.f;
import brd.t;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.a;

public final class HomeLocalNewUserBubblePresenter$a$c implements o	// class@001014
{
    public static final HomeLocalNewUserBubblePresenter$a$c b;

    static {
       HomeLocalNewUserBubblePresenter$a$c.b = new HomeLocalNewUserBubblePresenter$a$c();
    }
    public void HomeLocalNewUserBubblePresenter$a$c(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "cdnUrlList");
          String str = c.b.f(p0.get(0));
          if (str != null) {
             p0 = k.a.a(new i(str, p0, ""), f.a(1)).flatMap(a.b);
             if (p0 != null) {
             label_0044 :
                ot = p0;
             }
          }
          p0 = t.empty();
          goto label_0044 ;
       }
       return ot;
    }
}
