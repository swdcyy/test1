package com.kwai.slide.play.detail.information.marquee.widget.a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.slide.play.detail.information.marquee.widget.c;
import hr7.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jr7.b;

public class a extends m	// class@0017f3
{
    public final a c;
    public final c d;

    public void a(c p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       c e = this.d.e;
       if (e != null) {
          e.b(this.c);
       }
       return;
    }
}
