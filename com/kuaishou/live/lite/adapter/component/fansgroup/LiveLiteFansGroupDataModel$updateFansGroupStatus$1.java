package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupStatus$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;

public final class LiveLiteFansGroupDataModel$updateFansGroupStatus$1 extends Lambda implements a	// class@001d8d
{
    public final int $intimacyStatus;
    public final boolean $syncToFeed;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateFansGroupStatus$1(LiveLiteFansGroupDataModel p0,int p1,boolean p2){
       this.this$0 = p0;
       this.$intimacyStatus = p1;
       this.$syncToFeed = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupDataModel$updateFansGroupStatus$1.class, "1")) {
          return;
       }
       this.this$0.d.setValue(Integer.valueOf(this.$intimacyStatus));
       if (this.$syncToFeed != null) {
          Integer value = this.this$0.j().getValue();
          if (value != null) {
             a.o(value, "status.value ?: return@runOnUiThread");
             int i = value.intValue();
             LiveFansGroupRelationInfoResponse liveFansGrou = this.this$0.f();
             if (liveFansGrou != null) {
                liveFansGrou.mStatus = i;
             }
          }
       }
       return;
    }
}
