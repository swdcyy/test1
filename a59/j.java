package a59.j;
import java.util.concurrent.atomic.AtomicBoolean;
import a09.c;
import android.view.View$OnClickListener;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class j	// class@000049
{
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final c c;
    public final View$OnClickListener d;

    public void j(AtomicBoolean p0,AtomicBoolean p1,c p2,View$OnClickListener p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = null;
       }
       super();
       this.a = null;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public final AtomicBoolean a(){
       return this.a;
    }
    public final c b(){
       return this.c;
    }
    public final AtomicBoolean c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof j && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       j obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       j tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkPlayEndSubContext\(disablePlayEnd="+this.a+", isConverted="+this.b+", playEndClickListener="+this.c+", avatarClickListener="+this.d+"\)";
    }
}
