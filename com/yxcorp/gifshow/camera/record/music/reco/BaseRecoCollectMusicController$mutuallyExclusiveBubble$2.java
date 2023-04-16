package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$mutuallyExclusiveBubble$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import trd.d1;

public final class BaseRecoCollectMusicController$mutuallyExclusiveBubble$2 extends Lambda implements a	// class@000e91
{
    public static final BaseRecoCollectMusicController$mutuallyExclusiveBubble$2 INSTANCE;

    static {
       BaseRecoCollectMusicController$mutuallyExclusiveBubble$2.INSTANCE = new BaseRecoCollectMusicController$mutuallyExclusiveBubble$2();
    }
    public void BaseRecoCollectMusicController$mutuallyExclusiveBubble$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Set invoke(){
       RecordBubbleItem[] obj = PatchProxy.apply(null, this, BaseRecoCollectMusicController$mutuallyExclusiveBubble$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RecordBubbleItem[]{RecordBubbleItem.AUTO_DOWNLOAD_PANEL,RecordBubbleItem.INCENTIVE_BAR,RecordBubbleItem.PENDANT_AVATAR_DIALOG};
       return d1.q(obj);
    }
}
