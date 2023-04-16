package mo1.a$a;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import mo1.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public class a$a extends Property	// class@0031d7
{

    public void a$a(Class p0,String p1){
       super(p0, p1);
    }
    public Object get(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          Objects.requireNonNull(p0);
          Object obj = PatchProxy.apply(null, p0, a.class, "2");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a.getLayoutParams().width;
          integer = Integer.valueOf(i);
       }
       return integer;
    }
    public void set(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
       }else {
          int i = p1.intValue();
          Objects.requireNonNull(p0);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), p0, uoa, "1")) {
             p0.a.getLayoutParams().width = i;
             p0.a.requestLayout();
          }
       }
       return;
    }
}
