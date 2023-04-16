package fs1.d;
import as1.b;
import pq1.c;
import pq1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@002393
{
    public final float a;
    public final b b;
    public final c c;
    public final e d;

    public void d(float p0,b p1,c p2,e p3){
       a.p(p2, "mLiveLinePeerInfoUiParams");
       a.p(p3, "resizeExtraInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final float a(){
       return this.a;
    }
    public final c b(){
       return this.c;
    }
    public final b c(){
       return this.b;
    }
    public final e d(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (!Float.compare(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Float.floatToIntBits(this.a) * 31;
       d tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiLinePuzzlePeerAnchorWidgetParams\(mBottomWidgetContainerWidth="+this.a+", puzzleParticipantInfoModel="+this.b+", mLiveLinePeerInfoUiParams="+this.c+", resizeExtraInfo="+this.d+"\)";
    }
}
