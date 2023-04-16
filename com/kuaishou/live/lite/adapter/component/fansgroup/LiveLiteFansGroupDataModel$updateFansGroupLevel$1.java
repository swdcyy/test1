package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$updateFansGroupLevel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import usd.q;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;

public final class LiveLiteFansGroupDataModel$updateFansGroupLevel$1 extends Lambda implements a	// class@001d8b
{
    public final int $fansGroupLevel;
    public final boolean $syncToFeed;
    public final LiveLiteFansGroupDataModel this$0;

    public void LiveLiteFansGroupDataModel$updateFansGroupLevel$1(LiveLiteFansGroupDataModel p0,int p1,boolean p2){
       this.this$0 = p0;
       this.$fansGroupLevel = p1;
       this.$syncToFeed = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupDataModel$updateFansGroupLevel$1.class, "1")) {
          return;
       }
       LiveLiteFansGroupDataModel b = this.this$0.b;
       Integer value = b.getValue();
       int i = (value != null)? q.n(value.intValue(), this.$fansGroupLevel): this.$fansGroupLevel;
       b.setValue(Integer.valueOf(i));
       if (this.$syncToFeed != null) {
          Integer value1 = this.this$0.h().getValue();
          if (value1 != null) {
             a.o(value1, "level.value ?: return@runOnUiThread");
             int i1 = value1.intValue();
             LiveFansGroupRelationInfoResponse liveFansGrou = this.this$0.f();
             if (liveFansGrou != null) {
                liveFansGrou.mFansGroupLevel = i1;
             }
          }
       }
       return;
    }
}
