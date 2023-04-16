package cc9.n;
import cc9.h;
import cc9.n$a;
import nsd.u;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.StringBuilder;

public final class n extends h	// class@000514
{
    public final MagicEmoji$MagicFace a;
    public final int b;
    public final int c;
    public final boolean d;
    public static final n$a e;

    static {
       n.e = new n$a(null);
    }
    public void n(MagicEmoji$MagicFace p0,int p1,int p2,boolean p3){
       a.p(p0, "magicFace");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static n a(n p0,MagicEmoji$MagicFace p1,int p2,int p3,boolean p4,int p5,Object p6){
       n b;
       n c;
       n d;
       n a = (p5 & 0x01)? p0.a: null;
       if (p5 & 0x02) {
          b = p0.b;
       }
       if (p5 & 0x04) {
          c = p0.c;
       }
       if (p5 & 0x08) {
          d = p0.d;
       }
       if (PatchProxy.isSupport(n.class)) {
          p0 = PatchProxy.applyFourRefs(a, Integer.valueOf(b), Integer.valueOf(c), Boolean.valueOf(d), p0, n.class, "1");
          if (p0 != PatchProxyResult.class) {
          label_0049 :
             return p0;
          }
       }
       a.p(a, "magicFace");
       p0 = new n(a, b, c, d);
       goto label_0049 ;
    }
    public final int b(){
       return this.c;
    }
    public final MagicEmoji$MagicFace c(){
       return this.a;
    }
    public final int d(){
       return this.b;
    }
    public final boolean e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof n && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       n obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((((i * 31) + this.b) * 31) + this.c) * 31;
       n td = this.d;
       if (td != null) {
          td = 1;
       }
       return (i + td);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicItemState\(magicFace="+this.a+", prepareProgress="+this.b+", downloadState="+this.c+", isShowPartition="+this.d+"\)";
    }
}
