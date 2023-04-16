package com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import java.lang.Integer;
import kob.k;
import java.lang.StringBuilder;
import q87.c;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import java.lang.Float;

public class BaseMusicSmoothPagerSlidingTabStrip$a implements ViewPager$i	// class@002044
{
    public int b;
    public float c;
    public final BaseMusicSmoothPagerSlidingTabStrip d;

    public void BaseMusicSmoothPagerSlidingTabStrip$a(BaseMusicSmoothPagerSlidingTabStrip p0){
       this.d = p0;
       super();
       this.b = 0;
       this.c = 0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, BaseMusicSmoothPagerSlidingTabStrip$a.class, "4")) {
          return;
       }
       this.d.l();
       this.c = 0;
       return;
    }
    public void onPageScrollStateChanged(int p0){
       BaseMusicSmoothPagerSlidingTabStrip$a uoa = BaseMusicSmoothPagerSlidingTabStrip$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().s("SmoothSlidingTabStrip", "onPageScrollStateChanged "+p0, objArray);
       this.b = p0;
       if (!p0) {
          Fresco.getImagePipeline().resume();
          this.a();
       }else {
          Fresco.getImagePipeline().pause();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(BaseMusicSmoothPagerSlidingTabStrip$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, BaseMusicSmoothPagerSlidingTabStrip$a.class, "1")) {
          return;
       }
       this.c = this.d.n(p0, p1);
       return;
    }
    public void onPageSelected(int p0){
       BaseMusicSmoothPagerSlidingTabStrip$a uoa = BaseMusicSmoothPagerSlidingTabStrip$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       boolean b = true;
       if (this.b == null) {
          b = false;
       }
       this.d.h(p0, this.c, b);
       if (!b || this.c - 0x3f800000 >= 0) {
          this.a();
       }
       return;
    }
}
