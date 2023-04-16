package lo8.a;
import androidx.viewpager2.widget.ViewPager2$j;
import com.tachikoma.core.bridge.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.lang.Throwable;
import wp8.a;
import java.util.Map;
import lo8.c;
import iq8.n;
import com.tkruntime.v8.V8Value;

public class a implements ViewPager2$j	// class@002d80
{
    public boolean a;
    public JsValueRef b;
    public d c;

    public void a(d p0){
       super();
       this.c = p0;
    }
    public void a(View p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (this.a == null) {
          uoa = this.b;
          if (uoa != null) {
             V8Function v8Function = uoa.get();
             if (!y.a(v8Function)) {
                return;
             }else {
                V8Object v8Object = null;
                Object[] objArray = new Object[]{Float.valueOf(p1)};
                V8Object v8Object1 = v8Function.call(v8Object, objArray);
                if (v8Object1 != null) {
                   Map all = v8Object1.getAll();
                   if (PatchProxy.applyVoidTwoRefs(p0, all, v8Object, c.class, "1") || (all != null && !all.isEmpty())) {
                      String str = "scaleX";
                      if (all.containsKey(str)) {
                         p0.setScaleX(c.b(all.get(str)));
                      }
                      str = "scaleY";
                      if (all.containsKey(str)) {
                         p0.setScaleY(c.b(all.get(str)));
                      }
                      str = "translateX";
                      if (all.containsKey(str)) {
                         p0.setTranslationX((float)n.a(c.b(all.get(str))));
                      }
                      str = "translateY";
                      if (all.containsKey(str)) {
                         p0.setTranslationY((float)n.a(c.b(all.get(str))));
                      }
                      str = "translateZ";
                      if (all.containsKey(str)) {
                         p0.setTranslationZ((float)n.a(c.b(all.get(str))));
                      }
                      str = "rotateX";
                      if (all.containsKey(str)) {
                         p0.setRotationX(c.b(all.get(str)));
                      }
                      str = "rotateY";
                      if (all.containsKey(str)) {
                         p0.setRotationY(c.b(all.get(str)));
                      }
                      str = "rotate";
                      if (all.containsKey(str)) {
                         p0.setRotation(c.b(all.get(str)));
                      }
                      str = "pivotX";
                      if (all.containsKey(str)) {
                         p0.setPivotX((float)n.a(c.b(all.get(str))));
                      }
                      str = "pivotY";
                      if (all.containsKey(str)) {
                         p0.setPivotY((float)n.a(c.b(all.get(str))));
                      }
                      if (all.containsKey("alpha")) {
                         p0.setAlpha(c.b(all.get("alpha")));
                      }
                   }
                label_014b :
                   v8Object1.setWeak();
                }
             }
          }
       }
       return;
    }
}
