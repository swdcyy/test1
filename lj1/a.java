package lj1.a;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@002f7c
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final int f;

    public void a(String p0,String p1,String p2,List p3,boolean p4,int p5,int p6,u p7){
       if (p6 & 0x08) {
          p3 = null;
       }
       if (p6 & 0x10) {
          p4 = false;
       }
       a.p(p1, "promptText");
       super();
       this.a = null;
       this.b = p1;
       this.c = null;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       return;
    }
    public final int a(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (this.e == p0.e && this.f == p0.f))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       a te = this.e;
       if (te != null) {
          te = 1;
       }
       return (((i1 + te) * 31) + this.f);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSendConfirmDialogConfig\(title="+this.a+", promptText="+this.b+", notNotifyText="+this.c+", sendGiftMsgKeys="+this.d+", enableDefaultSelectNotNotify="+this.e+", panelSource="+this.f+"\)";
    }
}
