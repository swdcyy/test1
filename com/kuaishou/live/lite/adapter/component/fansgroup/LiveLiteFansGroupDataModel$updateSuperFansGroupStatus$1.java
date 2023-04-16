package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1;
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

public final class LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1 extends Lambda implements a	// class@001d8e
{
    public final boolean $isJoinSuperFansGroup;
    public final boolean $syncToFeed;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1(LiveLiteFansGroupDataModel p0,boolean p1,boolean p2){
       this.this$0 = p0;
       this.$isJoinSuperFansGroup = p1;
       this.$syncToFeed = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupDataModel$updateSuperFansGroupStatus$1.class, "1")) {
          return;
       }
       this.this$0.f.setValue(Boolean.valueOf(this.$isJoinSuperFansGroup));
       if (this.$syncToFeed != null) {
          Boolean value = this.this$0.g().getValue();
          if (value != null) {
             a.o(value, "hasJoinSuperFansGroup.va\x20\x02e ?: return@runOnUiThread\x00");
             boolean b = value.booleanValue();
             LiveFansGroupRelationInfoResponse liveFansGrou = this.this$0.f();
             if (liveFansGrou != null) {
                liveFansGrou.mHasJoinSuperFansGroup = b;
             }
          }
       }
       return;
    }
}
