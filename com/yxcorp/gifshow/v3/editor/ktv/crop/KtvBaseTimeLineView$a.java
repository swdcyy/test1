package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class KtvBaseTimeLineView$a implements Runnable	// class@000fb9
{
    public final KtvBaseTimeLineView b;

    public void KtvBaseTimeLineView$a(KtvBaseTimeLineView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KtvBaseTimeLineView$a.class, "1")) {
          return;
       }
       this.b.z.removeCallbacks(this);
       this.b.getPlayer().seekTo((double)this.b.A);
       return;
    }
}
