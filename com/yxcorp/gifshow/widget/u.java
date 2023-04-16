package com.yxcorp.gifshow.widget.u;
import android.view.View$OnClickListener;
import java.lang.Object;
import tyc.f3;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.e3;

public abstract class u implements View$OnClickListener	// class@0019ee
{
    public f3 b;

    public void u(){
       super();
       this.b = new f3();
    }
    public void u(long p0){
       super();
       this.b = new f3(p0);
    }
    public abstract void a(View p0);
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.b.a(p0, new e3(this));
       return;
    }
}
