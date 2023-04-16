package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrizeListResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.Iterator;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableLocalGiftType;

public class LiveGzoneTurntablePrizeListResponse implements Serializable, a	// class@000e3a
{
    public int mAvailableDrawCount;
    public String mIntroductionUrl;
    public List mNormalPrizes;
    public String mPrizeRecordsUrl;
    public List mPrizeViewData;
    public List mWelfareTaskPrizes;
    public static final long serialVersionUID = 0x6f46ed25a82483e8;

    public void LiveGzoneTurntablePrizeListResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntablePrizeListResponse.class, "1")) {
          return;
       }
       this.mPrizeViewData = new ArrayList();
       if (this.mNormalPrizes == null) {
          this.mNormalPrizes = new ArrayList();
       }
       if (q.f(this.mWelfareTaskPrizes)) {
          this.mPrizeViewData.addAll(this.mNormalPrizes);
          return;
       }else {
          Iterator iterator = this.mWelfareTaskPrizes.iterator();
          while (iterator.hasNext()) {
             iterator.next().mLocalGiftType = LiveGzoneTurntablePrize$TurntableLocalGiftType.WELFARE_GIFT;
          }
          LiveGzoneTurntablePrize liveGzoneTur = new LiveGzoneTurntablePrize();
          liveGzoneTur.mLocalGiftType = LiveGzoneTurntablePrize$TurntableLocalGiftType.DIVIDER;
          this.mPrizeViewData.addAll(this.mWelfareTaskPrizes);
          this.mPrizeViewData.add(liveGzoneTur);
          this.mPrizeViewData.addAll(this.mNormalPrizes);
          return;
       }
    }
}
