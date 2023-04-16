package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$bizToken$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;

public final class LivePreviewRecoEnterActionPresenter$bizToken$2 extends Lambda implements a	// class@000e4c
{
    public final LivePreviewRecoEnterActionPresenter this$0;

    public void LivePreviewRecoEnterActionPresenter$bizToken$2(LivePreviewRecoEnterActionPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter$bizToken$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Preview-"+LivePreviewRecoEnterActionPresenter.W8(this.this$0).getLiveStreamId();
    }
}
