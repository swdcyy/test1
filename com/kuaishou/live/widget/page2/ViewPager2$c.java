package com.kuaishou.live.widget.page2.ViewPager2$c;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import com.kuaishou.live.widget.page2.ViewPager2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;

public class ViewPager2$c extends ViewPager2$g	// class@00102e
{
    public final ViewPager2 a;

    public void ViewPager2$c(ViewPager2 p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       ViewPager2$c uoc = ViewPager2$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.clearFocus();
       if (this.a.hasFocus()) {
          this.a.k.requestFocus(2);
       }
       return;
    }
}
