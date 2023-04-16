package cc9.p;
import cc9.h;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class p extends h	// class@000516
{
    public final Music a;
    public final int b;
    public final Intent c;
    public final boolean d;

    public void p(Music p0,int p1,Intent p2,boolean p3){
       a.p(p0, "music");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static p a(p p0,Music p1,int p2,Intent p3,boolean p4,int p5,Object p6){
       p b;
       p c;
       p d;
       p a = (p5 & 0x01)? p0.a: null;
       if (p5 & 0x02) {
          b = p0.b;
       }
       if (p5 & 0x04) {
          c = p0.c;
       }
       if (p5 & 0x08) {
          d = p0.d;
       }
       if (PatchProxy.isSupport(p.class)) {
          p0 = PatchProxy.applyFourRefs(a, Integer.valueOf(b), c, Boolean.valueOf(d), p0, p.class, "1");
          if (p0 != PatchProxyResult.class) {
          label_0046 :
             return p0;
          }
       }
       a.p(a, "music");
       p0 = new p(a, b, c, d);
       goto label_0046 ;
    }
    public final Music b(){
       return this.a;
    }
    public final Intent c(){
       return this.c;
    }
    public final int d(){
       return this.b;
    }
    public final boolean e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof p && (a.g(this.a, p0.a) && (this.b == p0.b && (a.g(this.c, p0.c) && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       p obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       p tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       i1 = (i1 + i) * 31;
       p td = this.d;
       if (td != null) {
          td = 1;
       }
       return (i1 + td);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MusicItemState\(music="+this.a+", prepareProgress="+this.b+", musicIntent="+this.c+", isShowPartition="+this.d+"\)";
    }
}
