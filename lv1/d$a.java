package lv1.d$a;
import androidx.viewpager.widget.ViewPager$l;
import lv1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public class d$a extends ViewPager$l	// class@003060
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       b uob;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.b.b == null) {
          return;
       }
       p0 = 0;
       while (p0 < this.b.b.getChildCount()) {
          int i = this.b.c.getCurrentItem() % this.b.a();
          if (p0 == i) {
             uob = new b();
             uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
             uob.g(KwaiRadiusStyles.R2);
             this.b.b.getChildAt(p0).setBackground(uob.a());
          }else {
             uob = new b();
             uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060620));
             uob.g(KwaiRadiusStyles.R2);
             this.b.b.getChildAt(p0).setBackground(uob.a());
          }
          p0++;
       }
       return;
    }
}
