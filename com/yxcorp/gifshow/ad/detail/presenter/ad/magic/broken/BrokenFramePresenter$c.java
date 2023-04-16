package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$c;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import android.view.TextureView;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b$b;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;

public final class BrokenFramePresenter$c extends a	// class@0015d1
{
    public final BrokenFramePresenter b;

    public void BrokenFramePresenter$c(BrokenFramePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       b uob;
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter$c.class, "2")) {
          return;
       }
       BrokenFramePresenter t = this.b.t;
       if (t != null) {
          TextureView textureView = t.get();
          if (textureView != null) {
             textureView.setVisibility(8);
          }
       }
       BrokenFramePresenter$c tb = this.b;
       tb.v = false;
       t = tb.y;
       if (t != null) {
          uob = t.get();
          if (uob != null) {
             uob.removeOnInfoListener(this.b.I);
          }
       }
       t = this.b.y;
       if (t != null) {
          uob = t.get();
          if (uob != null) {
             uob.O(this.b.F);
          }
       }
       return;
    }
    public void i2(){
       b uob1;
       if (PatchProxy.applyVoid(null, this, BrokenFramePresenter$c.class, "1")) {
          return;
       }
       BrokenFramePresenter$c tb = this.b;
       tb.v = true;
       tb.D = false;
       BrokenFramePresenter p = tb.p;
       if (p == null) {
          a.S("mPlayModule");
       }
       e player = p.getPlayer();
       if (player != null) {
          long currentPosit = player.getCurrentPosition();
          BrokenFramePresenter y = this.b.y;
          if (y != null) {
             b uob = y.get();
             if (uob != null) {
                uob.seekTo(currentPosit);
             }
          }
       }
       p = this.b.y;
       if (p != null) {
          uob1 = p.get();
          if (uob1 != null) {
             uob1.addOnInfoListener(this.b.I);
          }
       }
       p = this.b.y;
       if (p != null) {
          uob1 = p.get();
          if (uob1 != null) {
             uob1.w(this.b.F);
          }
       }
       return;
    }
}
