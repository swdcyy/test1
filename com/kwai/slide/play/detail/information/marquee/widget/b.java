package com.kwai.slide.play.detail.information.marquee.widget.b;
import com.yxcorp.gifshow.widget.m;
import com.kwai.slide.play.detail.information.marquee.widget.c;
import hr7.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jr7.b;

public class b extends m	// class@0017f4
{
    public final a c;
    public final c d;

    public void b(c p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       c e = this.d.e;
       if (e != null) {
          e.f(this.c);
       }
       return;
    }
}
