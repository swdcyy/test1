package bt1.a;
import java.lang.String;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@00040f
{
    public int a;
    public final int b;
    public String c;
    public final Map d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public LiveMultiPkBottomTip j;

    public void a(int p0,int p1,String p2,Map p3,Map p4,long p5,long p6,String p7,int p8,LiveMultiPkBottomTip p9){
       a.p(p3, "teamInfoMap");
       a.p(p4, "teamsRankInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public final long a(){
       return this.g;
    }
    public final long b(){
       return this.f;
    }
    public final Map c(){
       return this.e;
    }
    public final int d(){
       return this.i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (!this.f - p0.f && (!this.g - p0.g && (a.g(this.h, p0.h) && (this.i == p0.i && a.g(this.j, p0.j)))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.a * 31) + this.b) * 31;
       a tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.e;
       i2 = (tc != null)? tc.hashCode(): 0;
       a tf = this.f;
       tf = this.g;
       i = (((((i + i2) * 31) + (int)(tf ^ (tf >> 32))) * 31) + (int)(tf ^ (tf >> 32))) * 31;
       tc = this.h;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (((i + i2) * 31) + this.i) * 31;
       tc = this.j;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkGameInfo\(pkType="+this.a+", pkMode="+this.b+", anchorUserId="+this.c+", teamInfoMap="+this.d+", teamsRankInfo="+this.e+", prePenaltyDeadline="+this.f+", penaltyDeadline="+this.g+", penaltyText="+this.h+", voteEndType="+this.i+", bottomTip="+this.j+"\)";
    }
}
