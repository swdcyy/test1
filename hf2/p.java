package hf2.p;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.TextView;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class p	// class@002d8c
{
    public int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
       p.b = a1.e(8.00f);
       p.c = a1.e(24.00f);
       p.d = a1.e(38.00f);
    }
    public void p(){
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, p.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.i() + p.b);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.i() * 2) + (p.b * 2));
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.e() + p.b);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f() + p.b);
    }
    public int e(){
       return ((this.a - p.b) / 2);
    }
    public int f(){
       return ((this.a - (p.b * 2)) / 3);
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.e() + this.i()) + (p.b * 2));
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.f() * 2) + (p.b * 2));
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.e() - p.b) / 2);
    }
    public void j(TextView p0,int p1,int p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, p.class, "13")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1;
       p0.setLayoutParams(layoutParams);
       FrameLayout$LayoutParams layoutParams1 = p0.getLayoutParams();
       layoutParams1.leftMargin = p2;
       p0.setLayoutParams(layoutParams1);
       return;
    }
}
