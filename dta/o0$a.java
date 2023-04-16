package dta.o0$a;
import erd.g;
import dta.o0;
import java.lang.Object;
import sb5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.g;
import wq6.h;
import java.util.Objects;
import gsa.i;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$f;
import android.view.View;
import com.google.android.material.tabs.NasaTabView;
import java.lang.CharSequence;
import android.text.TextUtils;
import jk.x;
import lnc.a1;
import sb5.e;
import ekd.k1;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class o0$a implements g	// class@002544
{
    public final o0 b;

    public void o0$a(o0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$a.class, "1")) {
       }else {
          p0 = this.b;
          p0.P8(p0.q.c().e());
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, o0.class, "3")) {
             p0 = p0.p;
             if (p0 != null) {
                int i = 0;
                int i1 = (i.a() && p0.getTabCount() <= i.c())? 1: 0;
                int tabCount = p0.getTabCount();
                while (i < tabCount) {
                   TabLayout$f uof = p0.v(i);
                   View view = (uof != null)? uof.a(): null;
                   if (view != null) {
                      String str = i.g(i);
                      if (!TextUtils.isEmpty(str) && i1) {
                         view.setIconConfig(new x(10, e.g(i.h(), a1.a(R.color.arg_RES_7f061fcd)), str));
                      }else {
                         view.S();
                         int realTextSize = (k1.h())? NasaTabView.getRealTextSize(): 14;
                         view.setTextSize(realTextSize);
                         TextView textView = view.findViewById(0x1020014);
                         if (textView != null) {
                            textView.setTextSize(1, (float)realTextSize);
                         }
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
}
