package com.kuaishou.live.core.basic.bulletin.LiveFocusAreaManagerImpl;
import i81.f;
import java.lang.Object;
import i81.f$a$a;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i81.f$a;
import xo1.j;
import i81.f$a$c;
import android.graphics.Rect;
import android.view.View;
import p02.x;
import java.util.Objects;
import i81.f$a$b;
import com.kuaishou.live.core.basic.bulletin.LiveFocusAreaManagerImpl$updateFocusAreaStatus$1;
import msd.l;

public final class LiveFocusAreaManagerImpl implements f	// class@000828
{
    public final a a;
    public View b;
    public j c;

    public void LiveFocusAreaManagerImpl(){
       super();
       a uoa = a.h(f$a$a.a);
       a.o(uoa, "BehaviorSubject.createDe¡­cusAreaStatus.FullScreen\)");
       this.a = uoa;
    }
    public t a(){
       t obj = PatchProxy.apply(null, this, LiveFocusAreaManagerImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.distinctUntilChanged();
       a.o(obj, "_focusAreaStatus.distinctUntilChanged\(\)");
       return obj;
    }
    public void b(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFocusAreaManagerImpl.class, "3")) {
          return;
       }
       a.p(p0, "focusAreaStatus");
       LiveFocusAreaManagerImpl tc = this.c;
       if (tc != null) {
          tc.b();
       }
       if (p0 instanceof f$a$c) {
          tc = this.a;
          Rect rect = p0.a();
          LiveFocusAreaManagerImpl tb = this.b;
          if (tb == null) {
             a.S("rootView");
          }
          rect = x.b(rect, tb);
          Objects.requireNonNull(p0);
          f$a$c uoa$c = PatchProxy.applyOneRefs(rect, p0, f$a$c.class, "1");
          if (uoa$c != PatchProxyResult.class) {
          }else {
             a.p(rect, "rect");
             uoa$c = new f$a$c(rect);
          }
          tc.onNext(uoa$c);
       }else if(p0 instanceof f$a$b){
          this.c = new j(p0.a, true, new LiveFocusAreaManagerImpl$updateFocusAreaStatus$1(this));
       }else {
          this.a.onNext(p0);
       }
       return;
    }
    public final void c(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveFocusAreaManagerImpl.class, "2")) {
          return;
       }
       a.p(p0, "liveRootView");
       a.p(p1, "bulletinContainer");
       this.b = p0;
       return;
    }
}
