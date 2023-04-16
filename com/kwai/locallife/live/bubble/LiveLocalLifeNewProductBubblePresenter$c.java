package com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c;
import n87.c;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import o87.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c$a;
import o87.d$c;
import com.kwai.locallife.live.bubble.LiveLocalLifeNewProductBubblePresenter$c$b;
import o87.d$b;
import bq5.f;
import m87.a$a;
import bq5.f$a;
import n87.d;
import m87.a;
import bq5.h;
import kotlin.jvm.internal.a;
import android.view.View;
import a87.a;

public final class LiveLocalLifeNewProductBubblePresenter$c implements c	// class@000ead
{
    public final LiveLocalLifeNewProductBubblePresenter a;

    public void LiveLocalLifeNewProductBubblePresenter$c(LiveLocalLifeNewProductBubblePresenter p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(LiveLocalLifeNewProductBubblePresenter$c.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLocalLifeNewProductBubblePresenter$c.class, "3");
       }
       return;
    }
    public boolean b(){
       return true;
    }
    public boolean c(d p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLocalLifeNewProductBubblePresenter$c uoc = LiveLocalLifeNewProductBubblePresenter$c.class;
       LiveLocalLifeNewProductBubblePresenter$c obj = PatchProxy.applyOneRefs(p0, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0.b(new LiveLocalLifeNewProductBubblePresenter$c$a(p0, this, p0));
          p0.a(new LiveLocalLifeNewProductBubblePresenter$c$b(this, p0));
          obj = this.a;
          a uoa = PatchProxy.applyOneRefs(p0, this, uoc, "2");
          if (uoa != patchProxyRe) {
          }else {
             a$a uoa1 = new a$a();
             uoa1.c(p0.e);
             uoa1.f(p0.o);
             uoa1.e(new d(p0));
             uoa = uoa1.g();
          }
          obj.u = uoa;
          LiveLocalLifeNewProductBubblePresenter u = this.a.u;
          a.m(u);
          LiveLocalLifeNewProductBubblePresenter.P8(this.a).Oh(u);
          LiveLocalLifeNewProductBubblePresenter s = this.a.s;
          if (s == null) {
             a.S("mLocalLifeBottomBarService");
          }
          View view = s.a();
          if (view != null) {
             p0.c = view;
          }
       }
       return false;
    }
}
