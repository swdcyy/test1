package d0c.d;
import d0c.a;
import d0c.d$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.postfont.model.FontType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d extends a	// class@0020aa
{
    public boolean j;
    public String k;
    public int l;
    public FontType m;
    public boolean n;
    public static final d$a o;

    static {
       d.o = new d$a(null);
    }
    public void d(){
       super(false, null, 0, null, false, 31, null);
    }
    public void d(boolean p0,String p1,int p2,FontType p3,boolean p4,int p5,u p6){
       int i = this;
       boolean b = (p5 & 0x01)? false: p0;
       FontType uFontType = null;
       String str = (p5 & 0x02)? "": uFontType;
       int i1 = (p5 & 0x04)? -1: p2;
       if (p5 & 0x08) {
          uFontType = FontType.REMOTE;
       }
       FontType uFontType1 = uFontType;
       int i2 = (p5 & 0x10)? 0: p4;
       a.p(str, "fontPath");
       a.p(uFontType1, "type");
       super(null, null, null, null, null, null, null, null, 0, 511, 0);
       i.j = b;
       i.k = str;
       i.l = i1;
       i.m = uFontType1;
       i.n = i2;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (this.j == p0.j && (a.g(this.k, p0.k) && (this.l == p0.l && (a.g(this.m, p0.m) && this.n == p0.n)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.j;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       d tk = this.k;
       int i2 = 0;
       int i3 = (tk != null)? tk.hashCode(): 0;
       i1 = (((i1 + i3) * 31) + this.l) * 31;
       tk = this.m;
       if (tk != null) {
          i2 = tk.hashCode();
       }
       i1 = (i1 + i2) * 31;
       tk = this.n;
       if (tk == null) {
          i = tk;
       }
       return (i1 + i);
    }
    public final int i(){
       return this.l;
    }
    public final boolean j(){
       return this.j;
    }
    public final String k(){
       return this.k;
    }
    public final boolean l(){
       return this.n;
    }
    public final FontType m(){
       return this.m;
    }
    public final void n(int p0){
       this.l = p0;
    }
    public final void o(boolean p0){
       this.j = p0;
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.k = p0;
       return;
    }
    public final void q(boolean p0){
       this.n = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FontViewData\(downloaded="+this.j+", fontPath="+this.k+", downloadProgress="+this.l+", type="+this.m+", selected="+this.n+"\)";
    }
}
