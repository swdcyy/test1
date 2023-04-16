package com.yxcorp.gifshow.widget.i0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;

public class i0 extends m	// class@00198b
{
    public final ScaleCleanControllerView c;

    public void i0(ScaleCleanControllerView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
          return;
       }
       ScaleCleanControllerView b = this.c.b;
       if (b != null) {
          b.d();
       }
       return;
    }
}
