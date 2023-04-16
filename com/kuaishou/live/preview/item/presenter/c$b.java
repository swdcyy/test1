package com.kuaishou.live.preview.item.presenter.c$b;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.preview.item.presenter.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class c$b implements ViewPager$i	// class@000e16
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0) {
          c$b tb = this.b;
          if (tb.B >= 0) {
             tb.X8();
          }else {
             tb.V8();
          }
       }else {
          this.b.P8(false);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
