package nv1.d;
import cs5.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import cs5.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z51.h;
import z51.j;
import lv1.d;
import java.util.List;
import androidx.viewpager.widget.ViewPager;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;

public class d implements b	// class@0033da
{
    public final f a;
    public final a b;

    public void d(a p0,f p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.a(this.a.x(), h.f);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       if (this.b.d.size() > 1) {
          this.b.t();
          d c = this.b.c;
          c.setCurrentItem((c.getCurrentItem() + 1));
       }
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.b.L1(p0);
       return;
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.d.size();
    }
    public void l(boolean p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p1)) {
          if (p0) {
             this.b.u.remove(p1);
          }else {
             this.b.u.add(p1);
          }
       }
       if (p0 && this.b.u.isEmpty()) {
          this.b.r(true);
          this.b.s();
       }else if(!p0){
          this.b.r(false);
       }
       return;
    }
}
