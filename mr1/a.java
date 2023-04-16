package mr1.a;
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

public final class a	// class@0031ed
{
    public final float a;
    public final c b;
    public final e c;

    public void a(float p0,c p1,e p2){
       a.p(p1, "mLiveLinePeerInfoUiParams");
       a.p(p2, "resizeExtraInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final float a(){
       return this.a;
    }
    public final c b(){
       return this.b;
    }
    public final e c(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (!Float.compare(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Float.floatToIntBits(this.a) * 31;
       a tb = this.b;
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
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLinePeerAnchorWidgetParams\(mBottomWidgetContainerWidth="+this.a+", mLiveLinePeerInfoUiParams="+this.b+", resizeExtraInfo="+this.c+"\)";
    }
}
