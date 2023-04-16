package com.kwai.video.krtc.rtcengine.internal.aa;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Pair;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class aa	// class@000862
{
    public Object a;
    public Set b;

    public void aa(Object p0){
       super();
       this.b = new HashSet();
       this.a = p0;
    }
    public void a(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, aa.class, "1")) {
          return;
       }
       if (!this.b.contains(new Pair(p0, p1))) {
          this.b.add(new Pair(p0, p1));
       }
       return;
    }
    public boolean a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, aa.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.contains(new Pair(this.a, p0))) {
          return true;
       }
       return false;
    }
    public void b(Object p0){
       this.a = p0;
    }
}
