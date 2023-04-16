package com.reactnativepagerview.PagerViewViewManager$b$a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.reactnativepagerview.PagerViewViewManager$b;
import java.lang.IllegalStateException;
import java.lang.String;
import com.reactnativepagerview.PagerViewViewManager;
import df.c;
import rk8.b;
import android.widget.FrameLayout;
import df.b;
import rk8.a;
import rk8.c;

public final class PagerViewViewManager$b$a extends ViewPager2$h	// class@000b6e
{
    public final PagerViewViewManager$b a;

    public void PagerViewViewManager$b$a(PagerViewViewManager$b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       String str;
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                str = "settling";
             }else {
                throw new IllegalStateException("Unsupported pageScrollState");
             }
          }else {
             str = "dragging";
          }
       }else {
          str = "idle";
       }
       PagerViewViewManager.access$getEventDispatcher$p(this.a.b).c(new b(this.a.d.getId(), str));
       return;
    }
    public void b(int p0,float p1,int p2){
       PagerViewViewManager.access$getEventDispatcher$p(this.a.b).c(new a(this.a.d.getId(), p0, p1));
    }
    public void c(int p0){
       PagerViewViewManager.access$getEventDispatcher$p(this.a.b).c(new c(this.a.d.getId(), p0));
    }
}
