package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;

public final class LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1 extends Lambda implements a	// class@001d8a
{
    public final boolean $enableShowFansGroupInfo;
    public final boolean $syncToFeed;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1(LiveLiteFansGroupDataModel p0,boolean p1,boolean p2){
       this.this$0 = p0;
       this.$enableShowFansGroupInfo = p1;
       this.$syncToFeed = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupDataModel$updateCanShowFansGroupInfo$1.class, "1")) {
          return;
       }
       this.this$0.e.setValue(Boolean.valueOf(this.$enableShowFansGroupInfo));
       if (this.$syncToFeed != null) {
          Boolean value = this.this$0.e().getValue();
          if (value != null) {
             a.o(value, "canShowFansGroupInfo.value ?: return@runOnUiThread");
             boolean b = value.booleanValue();
             LiveFansGroupRelationInfoResponse liveFansGrou = this.this$0.f();
             if (liveFansGrou != null) {
                liveFansGrou.mCanShowFansGroupInfo = b;
             }
          }
       }
       return;
    }
}
