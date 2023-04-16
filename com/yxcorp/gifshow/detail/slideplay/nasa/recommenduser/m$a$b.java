package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class m$a$b extends m	// class@00177b
{
    public final m$a c;

    public void m$a$b(m$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m$a$b.class, "1")) {
          return;
       }
       this.c.R8();
       PatchProxy.onMethodExit(m$a$b.class, "1");
       return;
    }
}
