package com.yxcorp.gifshow.homepage.menu.d$a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.homepage.menu.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.lang.Float;

public class d$a implements SlidingPaneLayout$d	// class@001773
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b(View p0,float p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
}
