package jod.e;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@001724
{
    public final String a;
    public final List b;
    public final int c;
    public final int d;

    public void e(){
       super(null, null, 0, 0, 15, null);
    }
    public void e(String p0,List p1,int p2,int p3){
       a.p(p0, "text");
       a.p(p1, "iconUrls");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void e(String p0,List p1,int p2,int p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       ArrayList uArrayList = (p4 & 0x02)? new ArrayList(): null;
       if (p4 & 0x04) {
          p2 = -1;
       }
       if (p4 & 0x08) {
          p3 = -1;
       }
       super(p0, uArrayList, p2, p3);
       return;
    }
    public final List a(){
       return this.b;
    }
    public final int b(){
       return this.d;
    }
    public final int c(){
       return this.c;
    }
    public final String d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (((((i1 + i) * 31) + this.c) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TTSVoiceItem\(text="+this.a+", iconUrls="+this.b+", speakerId="+this.c+", languageType="+this.d+"\)";
    }
}
