package com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;

public class DynamicTabHostFragment$a implements ViewPager$i	// class@0015c0
{
    public boolean b;
    public final DynamicTabHostFragment c;

    public void DynamicTabHostFragment$a(DynamicTabHostFragment p0){
       this.c = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       DynamicTabHostFragment$a uoa = DynamicTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       DynamicTabHostFragment z = this.c.z;
       if (z != null) {
          z.onPageScrollStateChanged(p0);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(DynamicTabHostFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, DynamicTabHostFragment$a.class, "1")) {
          return;
       }
       DynamicTabHostFragment z = this.c.z;
       if (z != null) {
          z.onPageScrolled(p0, p1, p2);
       }
       return;
    }
    public void onPageSelected(int p0){
       DynamicTabHostFragment$a uoa = DynamicTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b = true;
       this.c.th(p0);
       DynamicTabHostFragment z = this.c.z;
       if (z != null) {
          z.onPageSelected(p0);
       }
       return;
    }
}
