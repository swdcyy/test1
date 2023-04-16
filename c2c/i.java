package c2c.i;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import c2c.f;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.View;

public final class i implements SeekBar$OnSeekBarChangeListener	// class@000511
{
    public final ProfilePreviewVideoStatusPresenter b;

    public void i(ProfilePreviewVideoStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, i.class, "1")) {
          return;
       }
       a.p(p0, "seekBar");
       if (p2) {
          this.b.j9();
          long l = (long)((((float)p0.getProgress() * 0x3f800000) * (float)this.b.c9()) / (float)0x2710);
          IWaynePlayer iWaynePlayer = this.b.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.seekTo(l);
          }
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "seekBar");
       this.b.j9();
       IWaynePlayer iWaynePlayer = this.b.V8();
       if (iWaynePlayer != null) {
          iWaynePlayer.pause();
       }
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       a.p(p0, "seekBar");
       this.b.j9();
       i tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, ProfilePreviewVideoStatusPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          IWaynePlayer iWaynePlayer1 = tb.V8();
          b = (iWaynePlayer1 != null && iWaynePlayer1.isPrepared() == true)? true: false;
       }
       if (b && this.b.c9() > 0) {
          long l = (long)((((float)p0.getProgress() * 0x3f800000) * (float)this.b.c9()) / (float)0x2710);
          IWaynePlayer iWaynePlayer = this.b.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.seekTo(l);
          }
          ProfilePreviewVideoStatusPresenter b1 = this.b.B;
          if (b1 == null) {
             a.S("mProgressVideoPlayBtn");
          }
          if (b1.isSelected()) {
             this.b.h9();
          }
       }
    label_0085 :
       return;
    }
}
