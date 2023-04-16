package com.yxcorp.gifshow.detail.presenter.b$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jc6.g;
import android.widget.FrameLayout;

public class b$a extends a	// class@0016cf
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b$a tb = this.b;
       tb.A = false;
       tb.r.setVisibility(8);
       this.b.stop();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.A = true;
       tb.r.setVisibility(0);
       this.b.Z8();
       return;
    }
}
