package a59.k;
import android.view.View;
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

public final class k	// class@00004a
{
    public final View a;
    public final View b;
    public final View c;
    public final View d;

    public void k(){
       super(null, null, null, null, 15, null);
    }
    public void k(View p0){
       super(p0, null, null, null, 14, null);
    }
    public void k(View p0,View p1,View p2,View p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void k(View p0,View p1,View p2,View p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = null;
       }
       super(p0, null, null, null);
       return;
    }
    public final View a(){
       return this.a;
    }
    public final View b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       k tb = this.b;
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
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkPopImageSubContext\(messageContainer="+this.a+", popPlayContainer="+this.b+", topActionBarContainer="+this.c+", webCardContainer="+this.d+"\)";
    }
}
