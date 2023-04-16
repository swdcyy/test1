package mod.a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@001d38
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;

    public void a(){
       super(false, false, false, 0, null, false, null, null, 255, null);
    }
    public void a(boolean p0,boolean p1,boolean p2,int p3,String p4,boolean p5,String p6,String p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public void a(boolean p0,boolean p1,boolean p2,int p3,String p4,boolean p5,String p6,String p7,int p8,u p9){
       int i = 0;
       int i1 = (p8 & 0x01)? 0: p0;
       int i2 = (p8 & 0x02)? 1: p1;
       int i3 = (p8 & 0x04)? 0: p2;
       int i4 = (p8 & 0x08)? 0: p3;
       int i5 = 0;
       if (!(p8 & 0x10)) {
          i5 = p4;
       }
       if (!(p8 & 0x20)) {
          i = p5;
       }
       super(i1, i2, i3, i4, i5, i, 0, 0);
       return;
    }
    public static a a(a p0,boolean p1,boolean p2,boolean p3,int p4,String p5,boolean p6,String p7,String p8,int p9,Object p10){
       a uoa = p0;
       int i = p9;
       a a = (i & 0x01)? uoa.a: p1;
       a b = (i & 0x02)? uoa.b: p2;
       a c = (i & 0x04)? uoa.c: p3;
       a d = (i & 0x08)? uoa.d: p4;
       a e = (i & 0x10)? uoa.e: p5;
       a f = (i & 0x20)? uoa.f: p6;
       a g = (i & 0x40)? uoa.g: p7;
       a h = (i & 0x0080)? uoa.h: p8;
       Objects.requireNonNull(p0);
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(a),Boolean.valueOf(b),Boolean.valueOf(c),Integer.valueOf(d),e,Boolean.valueOf(f),g,h};
          uoa = PatchProxy.apply(objArray, p0, uoa1, "1");
          if (uoa != PatchProxyResult.class) {
          label_00a5 :
             return uoa;
          }
       }
       p0 = new a(a, b, c, d, e, f, g, h);
       goto label_00a5 ;
    }
    public final boolean b(){
       return this.b;
    }
    public final int c(){
       return this.d;
    }
    public final String d(){
       return this.g;
    }
    public final boolean e(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (a.g(this.e, p0.e) && (this.f == p0.f && (a.g(this.g, p0.g) && a.g(this.h, p0.h)))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.a;
    }
    public final boolean g(){
       return this.f;
    }
    public int hashCode(){
       int i1;
       int i2;
       a tg;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       a tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (((i1 + i2) * 31) + this.d) * 31;
       tb = this.e;
       int i3 = 0;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb == null) {
          tg = tb;
       }
       i1 = (i1 + i) * 31;
       tg = this.g;
       i = (tg != null)? tg.hashCode(): 0;
       i1 = (i1 + i) * 31;
       tg = this.h;
       if (tg != null) {
          i3 = tg.hashCode();
       }
       return (i1 + i3);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditingTextState\(isEditing="+this.a+", closePanelV3="+this.b+", textPanelShowV3="+this.c+", keyboardOffset="+this.d+", currentText="+this.e+", isKeyBoardPanelOpen="+this.f+", originText="+this.g+", originHint="+this.h+"\)";
    }
}
