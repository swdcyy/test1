package com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ip3.a;
import xa3.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupJoinButtonInfo;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kg1.h;
import com.kuaishou.live.lite.highfrequency.biz.fansgroup.LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a;
import erd.g;

public final class LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1 extends Lambda implements a	// class@0009b3
{
    public final LiveLiteHighFrequencyGuideFansGroupItemVC this$0;

    public void LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1(LiveLiteHighFrequencyGuideFansGroupItemVC p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveFansGroupJoinButtonInfo liveFansGrou;
       LiveFansGroupJoinButtonInfo liveFansGrou1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1.class, "1")) {
          return;
       }
       a uoa = this.this$0.t.get();
       if (uoa != null) {
          LiveData liveData = uoa.Uf();
          if (liveData != null) {
             LiveFansGroupInfo value = liveData.getValue();
             if (value != null) {
                objArray = value.mLiveFansGroupJoinButtonInfo;
             }
          }
       }
       if (objArray != null) {
          liveFansGrou = objArray.mJoinType;
          liveFansGrou1 = objArray.mPrice;
       }else {
          b.Z(LiveLiteLogTag.HIGH_FREQUENCY, "handleButtonClick: isJoinFansGroupInfoValid = false");
          liveFansGrou = 1;
          liveFansGrou1 = 1;
       }
       Object obj = this.this$0.s.get();
       if (obj != null) {
          obj.b(liveFansGrou, liveFansGrou1, "FREQUENTLY_ACTION_GUIDE", "LITE_HIGH_GUIDE_FANS_LACK", new LiveLiteHighFrequencyGuideFansGroupItemVC$handleButtonClick$1$a(this));
       }
       return;
    }
}
