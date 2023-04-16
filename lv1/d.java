package lv1.d;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import java.util.List;
import android.view.View;
import java.lang.Object;
import lv1.d$a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import lv1.d$b;

public class d	// class@003062
{
    public Context a;
    public LinearLayout b;
    public ViewPager c;
    public List d;
    public View e;
    public d$b f;

    public void d(Context p0,ViewPager p1,LinearLayout p2,List p3,View p4){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.d = p3;
       this.e = p4;
       p1.addOnPageChangeListener(new d$a(this));
    }
    public int a(){
       d obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj == null) {
          return -1;
       }
       return obj.size();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.d.clear();
       this.c.clearOnPageChangeListeners();
       return;
    }
    public void c(){
       b uob;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       if (tb == null) {
          return;
       }
       tb.removeAllViews();
       boolean b = true;
       if (this.a() <= b) {
          this.d(false);
          return;
       }else {
          this.d(b);
          for (int i = 0; i < this.a(); i = i + 1) {
             ImageView imageView = new ImageView(this.a);
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.a(this.a.getResources(), 0x7f0708b4), c.b(this.a.getResources(), 0x7f0708b4));
             layoutParams.setMargins(c.a(this.a.getResources(), R.dimen.arg_RES_7f0708b3), false, c.a(this.a.getResources(), R.dimen.arg_RES_7f0708b3), false);
             int i1 = this.c.getCurrentItem() % this.a();
             if (i == i1) {
                uob = new b();
                uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060788));
                uob.g(KwaiRadiusStyles.R2);
                imageView.setBackground(uob.a());
             }else {
                uob = new b();
                uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060620));
                uob.g(KwaiRadiusStyles.R2);
                imageView.setBackground(uob.a());
             }
             imageView.setLayoutParams(layoutParams);
             this.b.addView(imageView);
          }
          return;
       }
    }
    public void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       uod = this.b;
       if (uod == null) {
          return;
       }
       if (uod.getVisibility() || (p0 || (this.b.getVisibility() && !p0))) {
          return;
       }
       uod = this.b;
       int i = 0;
       int i1 = (p0)? 0: 8;
       uod.setVisibility(i1);
       uod = this.f;
       if (uod != null) {
          if (!p0) {
             i = 8;
          }
          uod.q(i);
       }
       return;
    }
}
