package dr1.d;
import java.lang.String;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.util.Map;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@001ffb
{
    public final String a;
    public final String b;
    public LiveMultiLineArenaLiveState c;
    public String d;
    public a e;
    public String f;
    public Map g;
    public boolean h;
    public long i;

    public void d(String p0,String p1,LiveMultiLineArenaLiveState p2,String p3,a p4,String p5,Map p6,boolean p7,long p8){
       a.p(p0, "multiLineChatId");
       a.p(p1, "arenaId");
       a.p(p2, "state");
       a.p(p3, "hostUserId");
       a.p(p5, "winnerUserId");
       a.p(p6, "memberStatisticInfoMap");
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
    public final a a(){
       return this.e;
    }
    public final String b(){
       return this.d;
    }
    public final Map c(){
       return this.g;
    }
    public final LiveMultiLineArenaLiveState d(){
       return this.c;
    }
    public final String e(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && !this.i - p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.h;
    }
    public final void g(LiveMultiLineArenaLiveState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.g;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       d th = this.h;
       if (th != null) {
          th = 1;
       }
       th = this.i;
       return (((i1 + th) * 31) + (int)(th ^ (th >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiLineArenaLineInfo\(multiLineChatId="+this.a+", arenaId="+this.b+", state="+this.c+", hostUserId="+this.d+", currentActorCellInfo="+this.e+", winnerUserId="+this.f+", memberStatisticInfoMap="+this.g+", isShowEndInServer="+this.h+", arenaLineEndTimestamp="+this.i+"\)";
    }
}
