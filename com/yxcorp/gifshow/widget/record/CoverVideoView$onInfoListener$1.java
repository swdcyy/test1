package com.yxcorp.gifshow.widget.record.CoverVideoView$onInfoListener$1;
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
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class CoverVideoView$onInfoListener$1 extends Lambda implements q	// class@0019b7
{
    public final CoverVideoView this$0;

    public void CoverVideoView$onInfoListener$1(CoverVideoView p0){
       this.this$0 = p0;
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return Boolean.valueOf(this.invoke(p0, p1.intValue(), p2.intValue()));
    }
    public final boolean invoke(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(CoverVideoView$onInfoListener$1.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, CoverVideoView$onInfoListener$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "mp");
       Object[] objArray = new Object[0];
       a.D().w("CoverVideoView", "onInfo : "+p1+' '+p2, objArray);
       if (p1 == 701) {
          CoverVideoView.b(this.this$0).setVisibility(0);
       }else if(p1 == 702){
          CoverVideoView.b(this.this$0).setVisibility(8);
       }else if(p1 == 3){
          CoverVideoView.a(this.this$0).setVisibility(8);
          CoverVideoView.b(this.this$0).setVisibility(8);
       }
       return 0;
    }
}
