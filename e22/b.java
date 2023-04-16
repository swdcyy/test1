package e22.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import gka.i;
import androidx.fragment.app.c;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;

public class b extends i implements PagerSlidingTabStrip$d$b	// class@002611
{
    public final List l;

    public void b(c p0){
       super(p0);
       this.l = new ArrayList();
    }
    public PagerSlidingTabStrip$d b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0 || p0 >= this.l.size()) {
          return null;
       }else {
          return this.l.get(p0);
       }
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       int i = 0;
       while (true) {
          if (i >= this.l.size()) {
             return -1;
          }
          PagerSlidingTabStrip$d uod = this.l.get(i);
          if (uod != null && TextUtils.equals(p0, uod.c())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public String d(int p0){
       String obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PagerSlidingTabStrip$d uod = this.b(p0);
       obj = "";
       if (uod != null && uod.c() != null) {
          obj = uod.c();
       }
       return obj;
    }
    public PagerSlidingTabStrip$d e(String p0){
       PagerSlidingTabStrip$d uod;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = this.l.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uod = obj.next();
          if (uod != null && p0.equals(uod.c())) {
             break ;
          }
       }
       return uod;
    }
}
