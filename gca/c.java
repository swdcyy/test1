package gca.c;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002461
{
    public final EditorFineTuningType a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void c(EditorFineTuningType p0,int p1,int p2,int p3,int p4,int p5){
       a.p(p0, "editorFineTuningType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final EditorFineTuningType a(){
       return this.a;
    }
    public final int b(){
       return this.e;
    }
    public final int c(){
       return this.d;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && this.f == p0.f))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((((((((i * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FineTuningViewData\(editorFineTuningType="+this.a+", textRes="+this.b+", iconRes="+this.c+", minProgress="+this.d+", maxProgress="+this.e+", defaultProgress="+this.f+"\)";
    }
}
