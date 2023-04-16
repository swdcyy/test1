package com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.lang.Float;

public class LiveTabHostFragment$a implements ViewPager$i	// class@00091a
{
    public boolean b;
    public boolean c;
    public boolean d;
    public final LiveTabHostFragment e;

    public void LiveTabHostFragment$a(LiveTabHostFragment p0){
       this.e = p0;
       super();
       this.b = true;
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(LiveTabHostFragment$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveTabHostFragment$a.class, "3")) {
          return;
       }
       Objects.requireNonNull(this.e);
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(LiveTabHostFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LiveTabHostFragment$a.class, "1")) {
          return;
       }
       this.c = true;
       if (this.b != null && (!p0 && (!p1 && !p2))) {
          this.e.gh(0);
          this.b = false;
       }
    label_0038 :
       return;
    }
    public void onPageSelected(int p0){
       LiveTabHostFragment$a uoa = LiveTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.d = true;
       if (this.c != null) {
          Objects.requireNonNull(this.e);
       }
       this.e.gh(p0);
       return;
    }
}
