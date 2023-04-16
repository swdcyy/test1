package com.kuaishou.bowl.core.live.b$b;
import su.b;
import com.kuaishou.bowl.core.live.b;
import tu.g;
import xu.a;
import tu.h;
import java.lang.Object;
import java.util.Map;
import av.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv.c;
import java.util.HashMap;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ev.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import fv.g;
import java.lang.StringBuilder;

public class b$b implements b	// class@0011a9
{
    public final g a;
    public final a b;
    public final h c;
    public final b d;

    public void b$b(b p0,g p1,a p2,h p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(Map p0,a p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1")) {
          return;
       }
       c.f("LiveApi- startLiveMatch success");
       b$b ta = this.a;
       if (ta != null) {
          ta.b(p0, new HashMap());
       }
       if (this.b != null) {
          ta = this.d;
          Objects.requireNonNull(ta);
          String obj = PatchProxy.apply(null, ta, b.class, "21");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = b.b().c();
             b = (TextUtils.isEmpty(obj))? false: g.b(obj);
          }
          if (b) {
             this.b.a(p1);
          }
       }
       if (this.c != null) {
          c.a("LiveApi-startLiveMatch success, businessData size: "+p0.size());
          this.c.b(p0);
       }else {
          c.f("LiveApi- requestCallback is null");
       }
       return;
    }
    public void onFailed(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       StringBuilder str = "LiveApi- startLiveMatch failed ";
       String str1 = (p0 == null)? "": p0;
       c.a(str+str1);
       b$b ta = this.a;
       if (ta != null) {
          ta.b(new HashMap(), new HashMap());
       }
       ta = this.c;
       if (ta != null) {
          ta.onFailed(p0);
       }else {
          c.f("LiveApi- requestCallback is null");
       }
       return;
    }
}
