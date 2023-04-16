package nl9.f;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@0031ae
{
    public final boolean a;
    public final float b;
    public final AdDataWrapper$AdLogParamAppender c;
    public final float d;

    public void f(){
       super(false, 0, null, 0, 15, null);
    }
    public void f(boolean p0){
       super(p0, 0, null, 0, 14, null);
    }
    public void f(boolean p0,float p1,AdDataWrapper$AdLogParamAppender p2,float p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = false;
       }
       if (p4 & 0x02) {
          p1 = 0;
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = 0xbf800000;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (this.a == p0.a && (!Float.compare(this.b, p0.b) && (a.g(this.c, p0.c) && !Float.compare(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = ((i * 31) + Float.floatToIntBits(this.b)) * 31;
       f tc = this.c;
       int i1 = (tc != null)? tc.hashCode(): 0;
       return (((i + i1) * 31) + Float.floatToIntBits(this.d));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdHalfH5Config\(preload="+this.a+", heightRatio="+this.b+", mLogParamAppender="+this.c+", mDimAmount="+this.d+"\)";
    }
}
