package co5.p;
import co5.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import co5.p$b;
import java.util.Objects;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;

public class p	// class@000725
{
    public final boolean a;
    public final p$a b;

    public void p(boolean p0,p$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static p b(){
       Object obj = PatchProxy.apply(null, null, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p(false, null);
    }
    public static p$b c(){
       Object obj = PatchProxy.apply(null, null, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p$b();
    }
    public static p d(p$b p0){
       p$a obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, p.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(obj, p0, p$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = new p$a(p0);
       }
       return new p(true, obj);
    }
    public void a(IconifyRadioButtonNew p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       if (this.a != null) {
          p tb = this.b;
          if (tb != null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, p$a.class, "1")) {
                p$a a = tb.a;
                if (a != Integer.MIN_VALUE) {
                   p0.setTriangleColor(a);
                }
                a = tb.b;
                int i = 0xcf000000;
                if (a - i) {
                   if (!a - 0x3f800000) {
                      p0.setUpTriangleAlpha(0);
                      p0.setTriangleDirection(IconifyTextViewNew$a.a);
                   }
                   p0.setTriangleAlpha(tb.b);
                   a = tb.e;
                   if (a - i) {
                      if (!a - (float)IconifyTextViewNew$a.a) {
                         p0.setTriangleAlpha(tb.b);
                         p0.setUpTriangleAlpha(0);
                         p0.setTriangleDirection(IconifyTextViewNew$a.a);
                      }else {
                         p0.setUpTriangleAlpha(tb.b);
                         p0.setTriangleAlpha(0);
                         p0.setTriangleDirection(IconifyTextViewNew$a.b);
                      }
                   }
                }
                p0.setTriangleWidth(tb.c);
                p0.setUpTriangleWidth(tb.c);
                p0.setTriangleHeight(tb.d);
                p0.setUpTriangleHeight(tb.d);
                p0.i();
             }
             p0.i();
          label_008f :
             return;
          }
       }
       p0.d(8, false);
       goto label_008f ;
    }
}
