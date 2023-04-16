package ne0.a$a;
import h3.a;
import ne0.a;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.CharSequence;
import me0.a;
import java.lang.Boolean;

public final class a$a extends a	// class@0032e4
{
    public final a d;

    public void a$a(a p0){
       this.d = p0;
       super();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a$a.class, "3")) {
          return;
       }
       a.p(p0, "container");
       a.p(p2, "obj");
       p0.removeView(p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.f.size();
    }
    public CharSequence l(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.f.get(p0).getName();
    }
    public Object o(ViewGroup p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "container");
       View view = this.d.f.get(p1).b(p0);
       p0.addView(view);
       return view;
    }
    public boolean p(View p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       a.p(p1, "obj");
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
