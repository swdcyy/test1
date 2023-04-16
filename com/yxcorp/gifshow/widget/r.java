package com.yxcorp.gifshow.widget.r;
import android.view.View$OnClickListener;
import tyc.f3;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.c2;

public abstract class r implements View$OnClickListener	// class@0019a8
{
    public f3 b;

    public void r(f3 p0){
       super();
       this.b = p0;
    }
    public abstract void a(View p0);
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.b.a(p0, new c2(this));
       return;
    }
}
