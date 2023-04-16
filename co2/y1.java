package co2.y1;
import co2.y1$a;
import nsd.u;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class y1	// class@0005bb
{
    public final boolean a;
    public final Integer b;
    public MicSeatTeam c;
    public static final y1$a d;

    static {
       y1.d = new y1$a(null);
    }
    public void y1(){
       super(false, null, null, 7, null);
    }
    public void y1(boolean p0){
       super(p0, null, null, 6, null);
    }
    public void y1(boolean p0,Integer p1,MicSeatTeam p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void y1(boolean p0,Integer p1,MicSeatTeam p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = false;
       }
       MicSeatTeam micSeatTeam = null;
       if (p3 & 0x02) {
          p1 = micSeatTeam;
       }
       if (p3 & 0x04) {
          micSeatTeam = MicSeatTeam.NONE;
       }
       super(p0, p1, micSeatTeam);
       return;
    }
    public final Integer a(){
       return this.b;
    }
    public final boolean b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof y1 && (this.a == p0.a && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       y1 obj = PatchProxy.apply(null, this, y1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       y1 tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, y1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MicSeatApplyingData\(isApplying="+this.a+", applyingMicSeatId="+this.b+", applyingTeam="+this.c+"\)";
    }
}
