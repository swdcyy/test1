package com.kwai.feed.player.ui.GestureView$b;
import c56.a$c;
import com.kwai.feed.player.ui.GestureView;
import java.lang.Object;
import c56.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class GestureView$b implements a$c	// class@0014a8
{
    public final GestureView a;

    public void GestureView$b(GestureView p0){
       this.a = p0;
       super();
    }
    public void a(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView$b.class, "1")) {
          return;
       }
       this.a.e("onScaleStart");
       GestureView i = this.a.i;
       if (i != null) {
          i.a(p0);
       }
       return;
    }
    public void b(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView$b.class, "2")) {
          return;
       }
       GestureView i = this.a.i;
       if (i != null) {
          i.b(p0);
       }
       return;
    }
    public void c(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GestureView$b.class, "3")) {
          return;
       }
       this.a.e("onScaleEnd");
       GestureView i = this.a.i;
       if (i != null) {
          i.c(p0);
       }
       return;
    }
}
