package dr1.e;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindowFrameColor;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@001ffc
{
    public final String a;
    public final UserInfo b;
    public int c;
    public long d;
    public int e;
    public String f;
    public String g;
    public long h;
    public InteractiveChatWindowFrameColor i;

    public void e(String p0,UserInfo p1,int p2,long p3,int p4,String p5,String p6,long p7,InteractiveChatWindowFrameColor p8){
       a.p(p0, "userId");
       a.p(p1, "user");
       a.p(p5, "displayScore");
       a.p(p6, "orderLabel");
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
    }
    public final String a(){
       return this.f;
    }
    public final String b(){
       return this.g;
    }
    public final int c(){
       return this.e;
    }
    public final int d(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && (!this.d - p0.d && (this.e == p0.e && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (!this.h - p0.h && a.g(this.i, p0.i))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       tb = this.d;
       long l = 32;
       i1 = (((((((i1 + i2) * 31) + this.c) * 31) + (int)(tb ^ (tb >> l))) * 31) + this.e) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       i2 = (tb != null)? tb.hashCode(): 0;
       tb = this.h;
       i1 = (((i1 + i2) * 31) + (int)(tb ^ (tb >> l))) * 31;
       tb = this.i;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiLineArenaLineMemberStatisticInfo\(userId="+this.a+", user="+this.b+", status="+this.c+", score="+this.d+", rank="+this.e+", displayScore="+this.f+", orderLabel="+this.g+", showEndTimestamp="+this.h+", teamFrameColor="+this.i+"\)";
    }
}
