package com.yxcorp.gifshow.widget.h0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;

public class h0 extends m	// class@001989
{
    public final ScaleCleanControllerView c;

    public void h0(ScaleCleanControllerView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
          return;
       }
       ScaleCleanControllerView b = this.c.b;
       if (b != null) {
          b.c();
       }
       return;
    }
}
