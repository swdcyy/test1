package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mOnInfoListener$2$a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mOnInfoListener$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import d7a.b;

public final class IntensifyFollowElement$mOnInfoListener$2$a implements IMediaPlayer$OnInfoListener	// class@00141e
{
    public final IntensifyFollowElement$mOnInfoListener$2 b;

    public void IntensifyFollowElement$mOnInfoListener$2$a(IntensifyFollowElement$mOnInfoListener$2 p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(IntensifyFollowElement$mOnInfoListener$2$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, IntensifyFollowElement$mOnInfoListener$2$a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          IntensifyFollowElement$mOnInfoListener$2 this$0 = this.b.this$0;
          this$0.J = this$0.J + 1;
          Iterator iterator = this$0.y0().iterator();
          while (iterator.hasNext()) {
             this.b.this$0.G0(iterator.next(), 0, 0);
          }
       }
       return false;
    }
}
