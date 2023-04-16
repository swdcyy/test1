package com.yxcorp.gifshow.camera.record.sidebar.f;
import android.view.ViewTreeObserver$OnDrawListener;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import uf9.a;
import uf9.a$a;
import lnc.a1;
import q87.c;
import zg9.k;
import java.lang.Runnable;

public class f implements ViewTreeObserver$OnDrawListener	// class@000f15
{
    public final ViewGroup b;
    public final g c;

    public void f(g p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDraw(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecordSideBarController", "onSidebar draw"+a1.o(a.s.a()), objArray);
       f tb = this.b;
       tb.post(new k(this, tb));
       return;
    }
}
