package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupMedalType$1;
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

public final class LiveLiteFansGroupDataModel$updateFansGroupMedalType$1 extends Lambda implements a	// class@001d8c
{
    public final int $fansGroupMedalType;
    public final boolean $syncToFeed;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateFansGroupMedalType$1(LiveLiteFansGroupDataModel p0,int p1,boolean p2){
       this.this$0 = p0;
       this.$fansGroupMedalType = p1;
       this.$syncToFeed = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupDataModel$updateFansGroupMedalType$1.class, "1")) {
          return;
       }
       this.this$0.c.setValue(Integer.valueOf(this.$fansGroupMedalType));
       if (this.$syncToFeed != null) {
          Integer value = this.this$0.i().getValue();
          if (value != null) {
             a.o(value, "medalType.value ?: return@runOnUiThread");
             int i = value.intValue();
             LiveFansGroupRelationInfoResponse liveFansGrou = this.this$0.f();
             if (liveFansGrou != null) {
                liveFansGrou.mFansGroupMedalType = i;
             }
          }
       }
       return;
    }
}
