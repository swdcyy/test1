package at2.c$c;
import at2.c;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.concurrent.atomic.AtomicInteger;
import at2.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$c extends c	// class@0002c4
{
    public final String d;
    public final MicSeatGuideState e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final long j;
    public final GuideStructBizRelations k;
    public final int l;

    public void c$c(String p0,MicSeatGuideState p1,boolean p2,String p3,String p4,boolean p5,long p6,GuideStructBizRelations p7,int p8){
       a.p(p0, "userId");
       a.p(p1, "state");
       a.p(p3, "bubbleContent");
       a.p(p4, "buttonContent");
       a.p(p7, "relation");
       super(null);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.k = p7;
       this.l = p8;
    }
    public void c$c(String p0,MicSeatGuideState p1,boolean p2,String p3,String p4,boolean p5,long p6,GuideStructBizRelations p7,int p8,int p9,u p10){
       int i = (p9 & 0x0100)? c.c.a().incrementAndGet(): p8;
       super(p0, p1, p2, p3, p4, p5, p6, p7, i);
       return;
    }
    public int d(){
       return this.l;
    }
    public GuideStructBizRelations e(){
       return this.k;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$c && (a.g(this.g(), p0.g()) && (a.g(this.f(), p0.f()) && (this.f == p0.f && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (this.i == p0.i && (!this.j - p0.j && (a.g(this.e(), p0.e()) && this.d() == p0.d())))))))))) {
          return true;
       }
       return false;
    }
    public MicSeatGuideState f(){
       return this.e;
    }
    public String g(){
       return this.d;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.f() == MicSeatGuideState.SHOWN)? true: false;
       return b;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, c$c.class, "8");
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
       c$c tf = this.f;
       int i3 = 1;
       if (tf != null) {
          tf = 1;
       }
       i1 = (i1 + tf) * 31;
       tf = this.g;
       i2 = (tf != null)? tf.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tf = this.h;
       i2 = (tf != null)? tf.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tf = this.i;
       if (tf == null) {
          i3 = tf;
       }
       tf = this.j;
       i1 = (((i1 + i3) * 31) + (int)(tf ^ (tf >> 32))) * 31;
       GuideStructBizRelations guideStructB = this.e();
       if (guideStructB != null) {
          i = guideStructB.hashCode();
       }
       return (((i1 + i) * 31) + this.d());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MicSeatFollowModelV2\(userId="+this.g()+", state="+this.f()+", isEffectAvatarClick="+this.f+", bubbleContent="+this.g+", buttonContent="+this.h+", enableButtonAnim="+this.i+", showDuration="+this.j+", relation="+this.e()+", id="+this.d()+"\)";
    }
}
