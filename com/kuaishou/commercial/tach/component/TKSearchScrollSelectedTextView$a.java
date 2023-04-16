package com.kuaishou.commercial.tach.component.TKSearchScrollSelectedTextView$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.TKSearchScrollSelectedTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.n;
import android.view.View;
import com.tachikoma.core.component.e;
import android.widget.TextView;

public class TKSearchScrollSelectedTextView$a implements Runnable	// class@001664
{
    public final TKSearchScrollSelectedTextView b;

    public void TKSearchScrollSelectedTextView$a(TKSearchScrollSelectedTextView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKSearchScrollSelectedTextView$a.class, "1")) {
          return;
       }
       d.a(-252254383).A10(this.b.getView());
       return;
    }
}
