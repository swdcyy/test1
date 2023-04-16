package com.yxcorp.gifshow.v3.editor.ktv.crop.h$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.widget.ImageView;
import java.lang.Double;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class h$a extends VideoSDKPlayerView$e	// class@000fc8
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "4")) {
          return;
       }
       this.a.x.seekToPlaybackStart();
       return;
    }
    public void onPause(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
          return;
       }
       this.a.q.setImageResource(R.drawable.arg_RES_7f081c89);
       return;
    }
    public void onPlay(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "3")) {
          return;
       }
       this.a.q.setImageResource(R.drawable.arg_RES_7f0807ed);
       return;
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "1")) {
          return;
       }
       h y = this.a.y;
       Objects.requireNonNull(y);
       if (!PatchProxy.isSupport(KtvBaseTimeLineView.class) || !PatchProxy.applyVoidOneRefs(Double.valueOf(p1), y, KtvBaseTimeLineView.class, "14")) {
          double d = (double)y.i * p1;
          if (y.c.getKaraokeType() != 1) {
             d = d + (double)y.u;
          }
          if (d - (double)y.u >= 0 && d - (double)y.v <= 0) {
             y.g.setTranslationX((float)(int)d);
          }
       }
    label_005a :
       return;
    }
}
