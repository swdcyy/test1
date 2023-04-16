package bvc.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class b	// class@00049e
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public void b(){
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
    }
    public final boolean a(){
       return this.c;
    }
    public final boolean b(){
       return this.b;
    }
    public final boolean c(){
       return this.a;
    }
    public final boolean d(){
       return this.d;
    }
    public final void e(boolean p0){
       this.c = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public final void f(boolean p0){
       this.b = p0;
    }
    public final void g(boolean p0){
       this.a = p0;
    }
    public final void h(boolean p0){
       this.d = p0;
    }
    public int hashCode(){
       int i2;
       b ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       b tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NewTextEditContext\(mHasShownTextTip="+this.a+", mHasShownSubtitleTip="+this.b+", mHasShownStickerTip="+this.c+", isTextTimeLineShowing="+this.d+"\)";
    }
}
