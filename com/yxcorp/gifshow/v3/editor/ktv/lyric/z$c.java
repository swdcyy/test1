package com.yxcorp.gifshow.v3.editor.ktv.lyric.z$c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import brd.y;

public class z$c extends VideoSDKPlayerView$e	// class@000fec
{
    public final z a;

    public void z$c(z p0){
       this.a = p0;
       super();
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       if (PatchProxy.isSupport(z$c.class) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, z$c.class, "1")) {
          return;
       }
       this.a.U0.onNext(Boolean.TRUE);
       return;
    }
}
