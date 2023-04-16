package com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lrb.a;
import q96.d;
import srb.b;

public class HomeLocalPermissionChangePresenter$1 implements LifecycleObserver	// class@000fa3
{
    public final HomeLocalPermissionChangePresenter b;

    public void HomeLocalPermissionChangePresenter$1(HomeLocalPermissionChangePresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeLocalPermissionChangePresenter$1.class, "1")) {
          return;
       }
       HomeLocalPermissionChangePresenter$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, HomeLocalPermissionChangePresenter.class, "4")) {
          boolean b = a.a();
          tb.p = b;
          if (tb.q != b) {
             tb.q = b;
             if (b) {
                a.l(true, "nearby", "", null);
                a.j(tb.x);
             }
          }
       }
       return;
    }
}
