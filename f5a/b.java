package f5a.b;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
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

public final class b	// class@0022c3
{
    public final boolean a;
    public final int b;
    public final ShareLogPageInfo c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public void b(boolean p0,int p1,ShareLogPageInfo p2,float p3,boolean p4,boolean p5,boolean p6,boolean p7,boolean p8){
       a.p(p2, "logPageInfo");
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
    public final ShareLogPageInfo a(){
       return this.c;
    }
    public final boolean b(){
       return this.g;
    }
    public final float c(){
       return this.d;
    }
    public final boolean d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (!Float.compare(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && this.i == p0.i)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = ((i1 * 31) + this.b) * 31;
       b tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.d)) * 31;
       tc = this.e;
       if (tc != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tc = this.f;
       if (tc != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tc = this.g;
       if (tc != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tc = this.h;
       if (tc != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tc = this.i;
       if (tc == null) {
          i = tc;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LandscapePhotoShareState\(isVideoPlaying="+this.a+", playControlSource="+this.b+", logPageInfo="+this.c+", playSpeed="+this.d+", mPayCourseTrailFinishShow="+this.e+", joySoundSwitch="+this.f+", mCoronaVipPanelShow="+this.g+", mCoronaVipPayDialogShow="+this.h+", mImageDetailOpen="+this.i+"\)";
    }
}
