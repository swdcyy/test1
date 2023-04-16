package com.yxcorp.gifshow.homepage.menu.redesign.e$a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.homepage.menu.redesign.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mnc.a;
import java.lang.Boolean;
import xl8.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.e;

public class e$a implements SlidingPaneLayout$d	// class@001784
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       a.a(this.a.x, false);
       this.a.q.d(Boolean.FALSE);
       RxBus.f.b(new e(false));
       return;
    }
    public void b(View p0,float p1){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.a(this.a.x, true);
       this.a.q.d(Boolean.TRUE);
       RxBus.f.b(new e(true));
       return;
    }
}
