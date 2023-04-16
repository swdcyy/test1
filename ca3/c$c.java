package ca3.c$c;
import java.lang.String;
import android.graphics.Bitmap;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$c	// class@0004d7
{
    public final String a;
    public final String b;
    public final Bitmap c;
    public final LiveAudienceState d;

    public void c$c(String p0,String p1,Bitmap p2,LiveAudienceState p3){
       a.p(p0, "userName");
       a.p(p1, "description");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$c obj = PatchProxy.apply(null, this, c$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c$c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewData\(userName="+this.a+", description="+this.b+", giftBitmap="+this.c+", senderState="+this.d+"\)";
    }
}
