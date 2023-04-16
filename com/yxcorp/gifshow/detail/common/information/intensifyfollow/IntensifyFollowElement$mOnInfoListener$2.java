package com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mOnInfoListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.common.information.intensifyfollow.IntensifyFollowElement$mOnInfoListener$2$a;

public final class IntensifyFollowElement$mOnInfoListener$2 extends Lambda implements a	// class@00141f
{
    public final IntensifyFollowElement this$0;

    public void IntensifyFollowElement$mOnInfoListener$2(IntensifyFollowElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMediaPlayer$OnInfoListener invoke(){
       Object obj = PatchProxy.apply(null, this, IntensifyFollowElement$mOnInfoListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IntensifyFollowElement$mOnInfoListener$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
