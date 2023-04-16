package nx0.i;
import java.lang.String;
import java.util.Map;
import nx0.y;
import nx0.m;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class i	// class@0033ee
{
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final Map k;
    public final String l;
    public final y m;
    public final m n;

    public void i(String p0,int p1,int p2,String p3,String p4,String p5,String p6,int p7,String p8,String p9,Map p10,String p11,y p12,m p13){
       a.p(p12, "viewParam");
       a.p(p13, "animationResourceModel");
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
       this.k = p10;
       this.l = p11;
       this.m = p12;
       this.n = p13;
    }
    public final Map a(){
       return this.k;
    }
    public final int b(){
       return this.c;
    }
    public final String c(){
       return this.a;
    }
    public final int d(){
       return this.b;
    }
    public final String e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && (a.g(this.i, p0.i) && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (a.g(this.l, p0.l) && (a.g(this.m, p0.m) && a.g(this.n, p0.n)))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.d;
    }
    public final y g(){
       return this.m;
    }
    public int hashCode(){
       int i;
       i obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.b) * 31) + this.c) * 31;
       i td = this.d;
       int i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.e;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.f;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.g;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.h) * 31;
       td = this.i;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.j;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.k;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.l;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.m;
       i2 = (td != null)? td.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       td = this.n;
       if (td != null) {
          i = td.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceOverRoomV2Message\(messageId="+this.a+", overRoomMessageBizType="+this.b+", livePushMessageType="+this.c+", targetLiveStreamId="+this.d+", schemeUrl="+this.e+", expTag="+this.f+", serverExpTag="+this.g+", liveSourceType="+this.h+", liveSourceUrl="+this.i+", broadcastInfo="+this.j+", extraMessage="+this.k+", extraLogParam="+this.l+", viewParam="+this.m+", animationResourceModel="+this.n+"\)";
    }
}
