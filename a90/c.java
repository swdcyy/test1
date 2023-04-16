package a90.c;
import java.lang.String;
import android.graphics.Paint$Align;
import java.lang.Integer;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@000101
{
    public final String a;
    public final float b;
    public final int c;
    public final int d;
    public final Paint$Align e;
    public final String f;
    public final Integer g;
    public final boolean h;

    public void c(String p0,float p1,int p2,int p3,Paint$Align p4,String p5,Integer p6,boolean p7,int p8,u p9){
       if (p8 & 0x40) {
          p6 = null;
       }
       if (p8 & 0x0080) {
          p7 = false;
       }
       a.p(p0, "text");
       a.p(p4, "align");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       return;
    }
    public final Paint$Align a(){
       return this.e;
    }
    public final String b(){
       return this.f;
    }
    public final int c(){
       return this.d;
    }
    public final String d(){
       return this.a;
    }
    public final int e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (!Float.compare(this.b, p0.b) && (this.c == p0.c && (this.d == p0.d && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && this.h == p0.h))))))))) {
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
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((((i1 * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
       c te = this.e;
       int i2 = (te != null)? te.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       te = this.f;
       i2 = (te != null)? te.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       te = this.g;
       if (te != null) {
          i = te.hashCode();
       }
       i1 = (i1 + i) * 31;
       c th = this.h;
       if (th != null) {
          th = 1;
       }
       return (i1 + th);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TextStickerConfig\(text="+this.a+", textSize="+this.b+", width="+this.c+", height="+this.d+", align="+this.e+", fontPath="+this.f+", textColor="+this.g+", useBold="+this.h+"\)";
    }
}
