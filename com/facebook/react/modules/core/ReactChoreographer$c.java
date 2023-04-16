package com.facebook.react.modules.core.ReactChoreographer$c;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.modules.core.ReactChoreographer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayDeque;
import cb.a;

public class ReactChoreographer$c extends a$a	// class@001294
{
    public final ReactChoreographer c;

    public void ReactChoreographer$c(ReactChoreographer p0){
       this.c = p0;
       super();
    }
    public void a(long p0){
       ReactChoreographer$c uoc = ReactChoreographer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       ReactChoreographer c = this.c.c;
       _monitor_enter(c);
       this.c.f = false;
       int i = 0;
       ReactChoreographer$c tc = this.c;
       ReactChoreographer d = tc.d;
       while (i < d.length) {
          object oobject = d[i];
          int i1 = oobject.size();
          int i2 = 0;
          while (i2 < i1) {
             a$a uoa = oobject.pollFirst();
             if (uoa != null) {
                uoa.a(p0);
                ReactChoreographer$c tc1 = this.c;
                int i3 = tc1.e - 1;
                tc1.e = i3;
             }else {
                a.g("ReactNative", "Tried to execute non-existent frame callback");
             }
             i2 = i2 + 1;
          }
          i = i + 1;
       }
       tc.c();
       _monitor_exit(c);
       return;
    }
}
