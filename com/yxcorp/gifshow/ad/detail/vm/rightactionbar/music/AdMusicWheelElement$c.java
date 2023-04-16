package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.t0;
import qp7.b;
import w19.e;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import qp7.x0;
import ss7.r;

public final class AdMusicWheelElement$c implements ViewPager$i	// class@001729
{
    public final AdMusicWheelElement b;

    public void AdMusicWheelElement$c(AdMusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       AdMusicWheelElement$c uoc = AdMusicWheelElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (this.b.H().l()) {
          if (!p0) {
             if (this.b.K() && (AdMusicWheelElement.n0(this.b).getPlayer() != null && AdMusicWheelElement.n0(this.b).getPlayer().isPlaying())) {
                this.b.E().l();
             }
          }else {
             this.b.E().i();
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
