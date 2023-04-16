package com.kuaishou.live.widget.page2.b;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.kuaishou.live.widget.page2.ViewPager2$i;
import java.lang.IllegalStateException;
import java.util.Locale;

public final class b extends ViewPager2$g	// class@00103c
{
    public final LinearLayoutManager a;
    public ViewPager2$i b;

    public void b(LinearLayoutManager p0){
       super();
       this.a = p0;
    }
    public void a(int p0){
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       p1 = - p1;
       p2 = 0;
       int i = 0;
       while (true) {
          if (i >= this.a.getChildCount()) {
             return;
          }
          View childAt = this.a.getChildAt(i);
          if (childAt != null) {
             int i1 = this.a.getPosition(childAt) - p0;
             float f = (float)i1 + p1;
             this.b.a(childAt, f);
             i = i + 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(this.a.getChildCount())};
       throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", objArray));
    }
    public void c(int p0){
    }
    public ViewPager2$i d(){
       return this.b;
    }
}
