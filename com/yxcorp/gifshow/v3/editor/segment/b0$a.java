package com.yxcorp.gifshow.v3.editor.segment.b0$a;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import faa.a;
import q87.c;

public class b0$a extends VideoSDKPlayerView$d	// class@0011c5
{
    public final b0 a;

    public void b0$a(b0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, b0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.F.isPlaying()) {
          this.a.F.play();
          objArray = new Object[0];
          a.D().s("SegmentListPresenter", "onSingleTapUp, playerView play", objArray);
       }else {
          this.a.F.pause();
          objArray = new Object[0];
          a.D().s("SegmentListPresenter", "onSingleTapUp, playerView pause", objArray);
       }
       return 0;
    }
}
