package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import com.kwai.framework.model.user.UserInfo;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2 extends Lambda implements a	// class@00140c
{
    public final LiveHotSpotDetailRelatedAnchorItemViewModel this$0;

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2(LiveHotSpotDetailRelatedAnchorItemViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       LiveHotSpotDetailRelatedAnchorData$AuthorInfo obj = PatchProxy.apply(objArray, this, LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.k.getValue();
       if (obj != null) {
          obj = obj.userInfo;
          if (obj != null) {
             objArray = obj.mId;
          }
       }
       if (objArray == null) {
          objArray = "";
       }
       return objArray;
    }
}
