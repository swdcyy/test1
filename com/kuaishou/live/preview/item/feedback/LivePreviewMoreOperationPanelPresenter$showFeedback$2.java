package com.kuaishou.live.preview.item.feedback.LivePreviewMoreOperationPanelPresenter$showFeedback$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import sk3.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import rl3.a;

public final class LivePreviewMoreOperationPanelPresenter$showFeedback$2 extends Lambda implements a	// class@000ddf
{
    public final i this$0;

    public void LivePreviewMoreOperationPanelPresenter$showFeedback$2(i p0){
       this.this$0 = p0;
       super(0);
    }
    public final ClientContent$LiveStreamPackage invoke(){
       i obj = PatchProxy.apply(null, this, LivePreviewMoreOperationPanelPresenter$showFeedback$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       return a.a(obj.mEntity, 1);
    }
    public Object invoke(){
       return this.invoke();
    }
}
