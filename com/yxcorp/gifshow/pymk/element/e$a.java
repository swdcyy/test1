package com.yxcorp.gifshow.pymk.element.e$a;
import hka.b;
import com.yxcorp.gifshow.pymk.element.e;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import rkd.b;

public class e$a implements b	// class@0016c0
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e t = this.a.t;
       if (t != null) {
          ViewGroup$LayoutParams layoutParams = t.getLayoutParams();
          e$a ta = this.a;
          int i = (b.g())? this.a.R8(): this.a.P8();
          ta.q = i;
          ta = this.a;
          e q = ta.q;
          layoutParams.width = q;
          layoutParams.height = q;
          ta.t.setLayoutParams(layoutParams);
       }
       return;
    }
}
