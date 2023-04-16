package gf.f;
import gf.a;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import ze.x;
import java.lang.Boolean;
import java.lang.Number;
import android.os.SystemClock;

public class f implements a	// class@0020a7
{
    public int a;
    public int b;
    public String c;
    public Rect d;

    public void f(){
       super();
       this.c = "";
       this.d = new Rect();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LayoutPerf"+","+this.b+","+this.a+","+this.c+","+this.d;
    }
    public void b(x p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "1")) {
          return;
       }
       if (p1 && this.a < p0.getLayoutCount()) {
          this.a = p0.getLayoutCount();
          this.b = p0.getReactTag();
          this.c = p0.getViewClass();
          this.d = new Rect(p0.getScreenX(), p0.getScreenY(), (p0.getScreenX() + p0.getScreenWidth()), (p0.getScreenY() + p0.getScreenHeight()));
       }
       Object obj = PatchProxy.apply(null, this, uof, "3");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): SystemClock.elapsedRealtime();
       if ((l - p0.getLayoutTime()) - 2000 > 0) {
          p0.resetLayoutCount();
          p0.setLayoutTime(l);
       }
       return;
    }
    public boolean hasValue(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
}
