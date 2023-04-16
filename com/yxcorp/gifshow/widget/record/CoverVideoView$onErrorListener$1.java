package com.yxcorp.gifshow.widget.record.CoverVideoView$onErrorListener$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j8c.a;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class CoverVideoView$onErrorListener$1 extends Lambda implements q	// class@0019b6
{
    public final CoverVideoView this$0;

    public void CoverVideoView$onErrorListener$1(CoverVideoView p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1.intValue(), p2.intValue()));
    }
    public final boolean invoke(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(CoverVideoView$onErrorListener$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, CoverVideoView$onErrorListener$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "iMediaPlayer");
       a.D().z("CoverVideoView", "error", new RuntimeException(" onError\(\) called with: iMediaPlayer = ["+p0+"], i = ["+p1+"], i1 = ["+p2+']'));
       this.this$0.i();
       this.this$0.k();
       CoverVideoView.a(this.this$0).setVisibility(0);
       return 0;
    }
}
