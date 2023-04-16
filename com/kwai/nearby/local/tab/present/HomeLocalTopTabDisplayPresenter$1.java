package com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import hd7.e;
import id7.o0;

public class HomeLocalTopTabDisplayPresenter$1 implements LifecycleObserver	// class@000fe9
{
    public final HomeLocalTopTabDisplayPresenter b;

    public void HomeLocalTopTabDisplayPresenter$1(HomeLocalTopTabDisplayPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeLocalTopTabDisplayPresenter$1.class, "1")) {
          return;
       }
       HomeLocalTopTabDisplayPresenter$1 tb = this.b;
       tb.A.b(tb.s.getText().toString());
       return;
    }
}
