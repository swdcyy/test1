package i8a.a$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@0027be
{
    public final String caption;
    public final String exception;
    public final String photoId;
    public final int state;
    public final boolean success;
    public final long successToDisplay;

    public void a$a(String p0,String p1,boolean p2,int p3,long p4,String p5){
       a.p(p0, "photoId");
       super();
       this.photoId = p0;
       this.caption = p1;
       this.success = p2;
       this.state = p3;
       this.successToDisplay = p4;
       this.exception = p5;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.photoId, p0.photoId) && (a.g(this.caption, p0.caption) && (this.success == p0.success && (this.state == p0.state && (!this.successToDisplay - p0.successToDisplay && a.g(this.exception, p0.exception)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.photoId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tcaption = this.caption;
       int i2 = (tcaption != null)? tcaption.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcaption = this.success;
       if (tcaption != null) {
          i2 = 1;
       }
       tcaption = this.successToDisplay;
       i1 = (((((i1 + i2) * 31) + this.state) * 31) + (int)(tcaption ^ (tcaption >> 32))) * 31;
       tcaption = this.exception;
       if (tcaption != null) {
          i = tcaption.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CaptionLogInfo\(photoId="+this.photoId+", caption="+this.caption+", success="+this.success+", state="+this.state+", successToDisplay="+this.successToDisplay+", exception="+this.exception+"\)";
    }
}
