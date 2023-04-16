package ne0.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Objects;
import android.view.WindowManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import me0.b;
import java.util.Collection;
import java.util.List;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import ne0.a$a;
import h3.a;
import ne0.b;
import androidx.viewpager.widget.ViewPager$i;
import android.view.WindowManager$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;

public final class a	// class@0032e5
{
    public a$a a;
    public View b;
    public PagerSlidingTabStrip c;
    public ViewPager d;
    public int e;
    public final List f;
    public final WindowManager g;
    public boolean h;
    public final Context i;

    public void a(Context p0){
       View view;
       a.p(p0, "context");
       super();
       this.i = p0;
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       a systemServic = p0.getSystemService("window");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
       this.g = systemServic;
       systemServic = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, systemServic, "1")) {
       }else {
          Objects.requireNonNull(b.b);
          uArrayList.addAll(b.a);
          if (!PatchProxy.applyVoid(objArray, this, systemServic, "2")) {
             view = n.G(p0, R.layout.arg_RES_7f0d079c);
             a.o(view, "ViewUtil.inflate\(context¡­yout_debugtool_page_main\)");
             this.b = view;
             String str = "mDTPageView";
             if (view == null) {
                a.S(str);
             }
             view = view.findViewById(R.id.dt_tabs);
             a.o(view, "mDTPageView.findViewById\(R.id.dt_tabs\)");
             this.c = view;
             a tb = this.b;
             if (tb == null) {
                a.S(str);
             }
             view = tb.findViewById(R.id.dt_view_pager);
             a.o(view, "mDTPageView.findViewById\(R.id.dt_view_pager\)");
             this.d = view;
             this.a = new a$a(this);
             tb = this.d;
             str = "mViewPager";
             if (tb == null) {
                a.S(str);
             }
             systemServic = this.a;
             if (systemServic == null) {
                a.S("mAdapter");
             }
             tb.setAdapter(systemServic);
             tb = this.d;
             if (tb == null) {
                a.S(str);
             }
             tb.addOnPageChangeListener(new b(this));
             tb = this.c;
             if (tb == null) {
                a.S("mTabs");
             }
             systemServic = this.d;
             if (systemServic == null) {
                a.S(str);
             }
             tb.setViewPager(systemServic);
             tb = this.d;
             if (tb == null) {
                a.S(str);
             }
             tb.setCurrentItem(this.e);
          }
       }
       return;
    }
    public final WindowManager$LayoutParams a(){
       WindowManager$LayoutParams obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WindowManager$LayoutParams();
       obj.type = (Build$VERSION.SDK_INT >= 26)? 2038: 2002;
       obj.format = 1;
       obj.flags = 8;
       obj.gravity = 51;
       int i = n.c(this.i, 50.00f);
       int i1 = i * 2;
       obj.width = n.y(this.i) - i1;
       obj.height = n.u(this.i) - i1;
       obj.x = i;
       obj.y = i;
       return obj;
    }
}
