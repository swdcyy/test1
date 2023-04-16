package g22.a;
import sx4.e$a;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import java.lang.String;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.o5;

public class a implements e$a	// class@002a43
{
    public final ViewPager b;

    public void a(ViewPager p0){
       super();
       this.b = p0;
    }
    public Object b(String p0,String p1,h p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (TextUtils.n("onTabClicked", p0)) {
          int i = o5.b(p1, -1);
          if (i >= 0) {
             a tb = this.b;
             if (tb != null) {
                tb.setCurrentItem(i);
             }
          }
       }
       return null;
    }
}
