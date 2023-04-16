package com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.common.rightactionbar.music.wheel.MusicWheelElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import qp7.x0;
import ss7.r;

public final class MusicWheelElement$c implements ViewPager$i	// class@0014b7
{
    public final MusicWheelElement b;

    public void MusicWheelElement$c(MusicWheelElement p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       MusicWheelElement$c uoc = MusicWheelElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (this.b.H().l()) {
          if (!p0) {
             if (this.b.K() && (MusicWheelElement.n0(this.b) != null && (MusicWheelElement.n0(this.b).getPlayer() != null && MusicWheelElement.n0(this.b).getPlayer().isPlaying()))) {
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
