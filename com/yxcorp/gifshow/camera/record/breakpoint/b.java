package com.yxcorp.gifshow.camera.record.breakpoint.b;
import ml8.d;
import com.yxcorp.gifshow.camera.record.breakpoint.a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.breakpoint.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rc9.a;
import android.view.View;
import java.lang.Boolean;

public class b implements d	// class@000db0
{
    public View b;
    public final a c;
    public final m d;

    public void b(a p0){
       super();
       this.d = new b$a(this);
       this.c = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tb = this.b;
       if (tb == null) {
          return;
       }
       tb.setSelected(this.c.p.h());
       return;
    }
    public void b(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.b;
       if (uob == null) {
          return;
       }
       uob.setEnabled(p0);
       return;
    }
    public void doBindView(View p0){
    }
}
