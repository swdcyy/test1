package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k$a$c extends m	// class@001775
{
    public final k$a c;

    public void k$a$c(k$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k$a$c.class, "1")) {
          return;
       }
       this.c.R8();
       PatchProxy.onMethodExit(k$a$c.class, "1");
       return;
    }
}
