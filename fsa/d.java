package fsa.d;
import hsa.b;
import com.yxcorp.gifshow.homebottom.presenter.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import ra6.a;
import com.google.android.material.tabs.TabLayout;
import zq6.b;
import com.kwai.kcube.decorator.IContainerDecorator;
import com.google.android.material.tabs.TabLayout$f;
import wq6.h;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import pr6.d;
import zq6.r;
import rn5.a;
import wn5.b;
import zq6.p;
import java.lang.CharSequence;
import android.view.View;
import com.google.android.material.tabs.NasaTabView;
import gsa.i;

public final class d implements b	// class@0029e3
{
    public final b a;

    public void d(b p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, uob, "4") && a.e())) {
          int tabCount = ta.r.getTabCount();
          b uob1 = ta.u.a();
          int i = 0;
          while (i < tabCount) {
             TabLayout$f uof = ta.r.v(i);
             if (uof != null) {
                h oh = uof.d();
                if (oh != null) {
                   TabIdentifier d = b.d;
                   if (d.equals(oh.M2())) {
                      ta.u.e().a(d).a(a.n, b.a(R.string.arg_RES_7f102f5f));
                   }
                   uof.o(uob1.e(oh, a.n).d(p0));
                   if (uof.a() instanceof NasaTabView) {
                      NasaTabView nasaTabView = uof.a();
                      int i1 = (i.a() && tabCount <= i.c())? 1: 0;
                      if (i1) {
                         nasaTabView.setTextSize(10);
                      }else if(p0){
                         i1 = NasaTabView.getRealTextSize();
                      }else {
                         i1 = 14;
                      }
                      nasaTabView.setTextSize(i1);
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
