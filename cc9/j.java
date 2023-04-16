package cc9.j;
import cc9.h;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
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

public final class j extends h	// class@00050f
{
    public final KSTemplateDetailInfo a;
    public final int b;
    public final boolean c;
    public final d d;

    public void j(KSTemplateDetailInfo p0,int p1,boolean p2,d p3){
       a.p(p0, "kuaishan");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static j a(j p0,KSTemplateDetailInfo p1,int p2,boolean p3,d p4,int p5,Object p6){
       j b;
       j c;
       j d;
       j a = (p5 & 0x01)? p0.a: null;
       if (p5 & 0x02) {
          b = p0.b;
       }
       if (p5 & 0x04) {
          c = p0.c;
       }
       if (p5 & 0x08) {
          d = p0.d;
       }
       if (PatchProxy.isSupport(j.class)) {
          p0 = PatchProxy.applyFourRefs(a, Integer.valueOf(b), Boolean.valueOf(c), d, p0, j.class, "1");
          if (p0 != PatchProxyResult.class) {
          label_0046 :
             return p0;
          }
       }
       a.p(a, "kuaishan");
       p0 = new j(a, b, c, d);
       goto label_0046 ;
    }
    public final KSTemplateDetailInfo b(){
       return this.a;
    }
    public final int c(){
       return this.b;
    }
    public final d d(){
       return this.d;
    }
    public final boolean e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof j && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && a.g(this.d, p0.d)))))) {
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
       i1 = ((i1 * 31) + this.b) * 31;
       j tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       i1 = (i1 + tc) * 31;
       tc = this.d;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KSItemState\(kuaishan="+this.a+", prepareProgress="+this.b+", isShowPartition="+this.c+", project="+this.d+"\)";
    }
}
