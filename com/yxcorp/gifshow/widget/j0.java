package com.yxcorp.gifshow.widget.j0;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.ScaleCleanControllerView$a;

public class j0 extends m	// class@00198d
{
    public final ScaleCleanControllerView c;

    public void j0(ScaleCleanControllerView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
          return;
       }
       ScaleCleanControllerView b = this.c.b;
       if (b != null) {
          b.b();
       }
       return;
    }
}
