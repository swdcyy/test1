package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import java.lang.Object;
import nsd.u;
import android.content.Context;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tb5.f;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import tb5.c;

public final class InvalidGestureChecker$a	// class@000978
{

    public void InvalidGestureChecker$a(){
       super();
    }
    public void InvalidGestureChecker$a(u p0){
       super();
    }
    public final InvalidGestureChecker a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InvalidGestureChecker$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       if (p0 instanceof f) {
          return p0.C0();
       }
       return null;
    }
    public final void b(Context p0,AnswerType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InvalidGestureChecker$a.class, "2")) {
          return;
       }
       a.p(p1, "type");
       if (p0 != null) {
          InvalidGestureChecker invalidGestu = InvalidGestureChecker.h.a(p0);
          if (invalidGestu != null && !PatchProxy.applyVoidOneRefs(p1, invalidGestu, InvalidGestureChecker.class, "4")) {
             a.p(p1, "type");
             invalidGestu = invalidGestu.b;
             if (invalidGestu != null) {
                invalidGestu.d(p1);
             }
          }
       }
       return;
    }
}
