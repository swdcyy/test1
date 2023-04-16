package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2 extends Lambda implements a	// class@00140d
{
    public final LiveHotSpotDetailRelatedAnchorItemViewModel this$0;

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2(LiveHotSpotDetailRelatedAnchorItemViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final UserInfo invoke(){
       Object[] objArray = null;
       LiveHotSpotDetailRelatedAnchorData$AuthorInfo obj = PatchProxy.apply(objArray, this, LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.k.getValue();
       if (obj != null) {
          objArray = obj.userInfo;
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
