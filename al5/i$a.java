package al5.i$a;
import androidx.viewpager.widget.ViewPager$i;
import al5.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import vk5.e;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import zk5.a;
import al5.a;
import io.reactivex.subjects.PublishSubject;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import yk5.f;
import yk5.a;
import il5.b;
import xk5.c;

public class i$a implements ViewPager$i	// class@0000d4
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       int i;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       i a = uoa.A;
       if (a == p0) {
          return;
       }
       boolean b = false;
       boolean b1 = (a < null)? true: false;
       i z = uoa.z;
       Objects.requireNonNull(z);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(a), Integer.valueOf(p0), z, uoe, "4")) {
          uoe = z.g;
          if (uoe != null && uoe.size()) {
             Iterator iterator = z.g.values().iterator();
             while (iterator.hasNext()) {
                a uoa1 = iterator.next();
                if (uoa1 == null) {
                   continue ;
                }else {
                   i = uoa1.c();
                   if (i == p0) {
                      uoa1.g(b);
                   }else if(i != a || PatchProxy.applyVoid(null, uoa1, a.class, "5")){
                      continue ;
                   }else {
                      uoa1 = uoa1.d;
                      if (uoa1 != null) {
                         uoa1.R8();
                      }
                   }
                }
             }
          }
       }
       uoa = this.b;
       uoa.A = p0;
       uoa.u.onNext(Integer.valueOf(p0));
       i$a tb = this.b;
       z = tb.A;
       Objects.requireNonNull(tb);
       a = i.class;
       if (!PatchProxy.isSupport(a) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(z), tb, a, "7") && tb.q.isShowRecordIndex())) {
          f uof = tb.r.c(z);
          if (uof != null && (uof.d() != 5 && (uof.d() != 1 && (uof.d() != 2 && (uof.d() == 3 || uof.d() == 4))))) {
             b.d("CurrentEmotionKeyboardTab", uof.b());
          }
       }
       tb = this.b;
       z = tb.t;
       if (z != null) {
          z.j(tb.r.c(tb.A), b1);
       }
       return;
    }
}
