package com.kuaishou.commercial.tach.component.TKSearchScrollView$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.TKSearchScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.o;
import android.view.View;
import com.tachikoma.core.component.e;

public class TKSearchScrollView$a implements Runnable	// class@001666
{
    public final TKSearchScrollView b;

    public void TKSearchScrollView$a(TKSearchScrollView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollView$a.class, "1")) {
          return;
       }
       d.a(-1052561880).i(this.b.getView());
       return;
    }
}
