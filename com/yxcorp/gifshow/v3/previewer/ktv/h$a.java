package com.yxcorp.gifshow.v3.previewer.ktv.h$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.previewer.ktv.h;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kwai.video.editorsdk2.RenderPosDetail;
import lnc.da;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.SeekBar;

public class h$a extends VideoSDKPlayerView$e	// class@0015c1
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void onPause(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "3")) {
          return;
       }
       this.a.b.setSelected(false);
       return;
    }
    public void onPlay(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "2")) {
          return;
       }
       this.a.b.setSelected(true);
       return;
    }
    public void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "1")) {
          return;
       }
       double playbackPosi = p1.getPlaybackPositionSec();
       h$a ta = this.a;
       if (!ta.g - playbackPosi) {
          return;
       }
       ta.g = playbackPosi;
       int i = (int)(playbackPosi * 0x408f400000000000);
       ta.c.setText(da.b((long)i));
       this.a.e.setProgress(i);
       return;
    }
}
