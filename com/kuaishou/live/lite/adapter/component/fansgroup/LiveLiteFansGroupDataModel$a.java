package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$a;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import com.kuaishou.live.lite.adapter.component.fansgroup.http.LiveLiteFansGroupInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;
import java.lang.Integer;

public final class LiveLiteFansGroupDataModel$a implements g	// class@001d85
{
    public final LiveLiteFansGroupDataModel b;

    public void LiveLiteFansGroupDataModel$a(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupDataModel$a.class, "1")) {
       }else {
          LiveLiteFansGroupInfoResponse mFansGroupIn = p0.mFansGroupInfoData;
          if (mFansGroupIn == null) {
             b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "request fansGroupInfo. info is null");
          }else {
             int i = 2;
             Integer integer = null;
             if (mFansGroupIn.mCanLiteShowFansGroupEntry == null) {
                LiveLiteFansGroupDataModel.m(this.b, false, false, i, integer);
             }else if(mFansGroupIn.mIsDataValid == null){
                b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "request fansGroupInfo. invalid, no need update");
             }else if(mFansGroupIn.mCanShowFansGroupInfo == null){
                LiveLiteFansGroupDataModel.m(this.b, false, false, i, integer);
             }else {
                LiveLiteFansGroupDataModel$a tb = this.b;
                Integer integer1 = Integer.valueOf(mFansGroupIn.mFansGroupLevel);
                p0 = p0.mFansGroupInfoData;
                if (p0 != null) {
                   integer = Integer.valueOf(p0.mStatus);
                }
                tb.s(integer1, integer);
             }
          }
       }
       return;
    }
}
