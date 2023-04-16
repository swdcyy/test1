package com.kuaishou.live.preview.item.feedback.c$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.preview.item.feedback.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class c$b extends ViewPager$l	// class@000de5
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
       uob = this.b;
       if (uob.s != null) {
          if (p0 == 2) {
             uob.r.d(false, 22);
          }else if(!p0){
             uob.r.d(true, 22);
          }
       }
       return;
    }
}
