package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateUserStatusInfo$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.MutableLiveData;

public final class LiveLiteFansGroupDataModel$updateUserStatusInfo$1 extends Lambda implements a	// class@001d8f
{
    public final LiveLiteUserStatusResponse $response;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateUserStatusInfo$1(LiveLiteFansGroupDataModel p0,LiveLiteUserStatusResponse p1){
       this.this$0 = p0;
       this.$response = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveFansGroupInfo mLiveFansGro1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupDataModel$updateUserStatusInfo$1.class, "1")) {
          return;
       }
       List list = LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.this$0.a);
       LiveLiteFansGroupDataModel$updateUserStatusInfo$1 t$response = this.$response;
       if (t$response != null) {
          LiveLiteUserStatusResponse mLiveFansGro = t$response.mLiveFansGroupInfo;
          if (mLiveFansGro != null) {
             mLiveFansGro1 = mLiveFansGro.mLiveFansGroupJoinButtonInfo;
          label_0022 :
             b.S(list, "updateUserStatusInfo", "mLiveFansGroupJoinButtonInfo", mLiveFansGro1);
             LiveLiteFansGroupDataModel h = this.this$0.h;
             t$response = this.$response;
             if (t$response != null) {
                objArray = t$response.mLiveFansGroupInfo;
             }
             h.setValue(objArray);
             return;
          }
       }
       mLiveFansGro1 = objArray;
       goto label_0022 ;
    }
}
