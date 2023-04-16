package at2.c$b;
import at2.c;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.util.concurrent.atomic.AtomicInteger;
import at2.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$b extends c	// class@0002c3
{
    public final GuideStructBizRelations d;
    public final String e;
    public final MicSeatGuideState f;
    public final boolean g;
    public final String h;
    public final long i;
    public final String j;
    public final boolean k;
    public final int l;

    public void c$b(String p0,MicSeatGuideState p1,boolean p2,String p3,long p4,String p5,boolean p6,int p7){
       a.p(p0, "userId");
       a.p(p1, "state");
       super(null);
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.k = p6;
       this.l = p7;
       this.d = GuideStructBizRelations.GuestFollowGuideStruct;
    }
    public void c$b(String p0,MicSeatGuideState p1,boolean p2,String p3,long p4,String p5,boolean p6,int p7,int p8,u p9){
       int i = p8;
       boolean b = (i & 0x04)? false: p2;
       String str = "";
       String str1 = (i & 0x08)? str: p3;
       long l = (i & 0x10)? 0: p4;
       String str2 = (i & 0x20)? str: p5;
       boolean b1 = (i & 0x40)? false: p6;
       int i1 = (i & 0x0080)? c.c.a().incrementAndGet(): p7;
       super(p0, p1, b, str1, l, str2, b1, i1);
       return;
    }
    public int d(){
       return this.l;
    }
    public GuideStructBizRelations e(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$b && (a.g(this.g(), p0.g()) && (a.g(this.f(), p0.f()) && (this.g == p0.g && (a.g(this.h, p0.h) && (!this.i - p0.i && (a.g(this.j, p0.j) && (this.k == p0.k && this.d() == p0.d()))))))))) {
          return true;
       }
       return false;
    }
    public MicSeatGuideState f(){
       return this.f;
    }
    public String g(){
       return this.e;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.f() == MicSeatGuideState.SHOWN)? true: false;
       return b;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, c$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MicSeatGuideState micSeatGuide = this.f();
       int i2 = (micSeatGuide != null)? micSeatGuide.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       c$b tg = this.g;
       int i3 = 1;
       if (tg != null) {
          tg = 1;
       }
       i1 = (i1 + tg) * 31;
       tg = this.h;
       i2 = (tg != null)? tg.hashCode(): 0;
       c$b ti = this.i;
       i1 = (((i1 + i2) * 31) + (int)(ti ^ (ti >> 32))) * 31;
       tg = this.j;
       if (tg != null) {
          i = tg.hashCode();
       }
       i1 = (i1 + i) * 31;
       c$b tk = this.k;
       if (tk == null) {
          i3 = tk;
       }
       return (((i1 + i3) * 31) + this.d());
    }
    public final boolean j(){
       return this.g;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MicSeatFollowModel\(userId="+this.g()+", state="+this.f()+", isFollowFan="+this.g+", guideBubbleText="+this.h+", guideBubbleDuration="+this.i+", guideBottomText="+this.j+", guideBottomTextBreathAnimEnable="+this.k+", id="+this.d()+"\)";
    }
}
