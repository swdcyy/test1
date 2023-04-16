package com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableLocalGiftType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableType;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;

public class LiveGzoneTurntablePrize implements Serializable, a	// class@000e39
{
    public int mBatchSize;
    public String mColorString;
    public String mForwardUrl;
    public LiveGzoneTurntablePrize$TurntableLocalGiftType mLocalGiftType;
    public String mName;
    public CDNUrl[] mPicUrls;
    public String mPrizeDescription;
    public String mPrizeId;
    public int mPrizeTypeValue;
    public String mPrizeUnit;
    public CDNUrl[] mRedDotUrls;
    public String mTips;
    public LiveGzoneTurntablePrize$TurntableType mType;
    public static final long serialVersionUID = 0xc847fb8fcb4ac7ea;

    public void LiveGzoneTurntablePrize(){
       super();
       this.mLocalGiftType = LiveGzoneTurntablePrize$TurntableLocalGiftType.NORMAL_GIFT;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntablePrize.class, "1")) {
          return;
       }
       this.mType = LiveGzoneTurntablePrize$TurntableType.from(this.mPrizeTypeValue);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntablePrize.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof LiveGzoneTurntablePrize) {
          return false;
       }
       return TextUtils.equals(this.mPrizeId, p0.mPrizeId);
    }
    public int hashCode(){
       LiveGzoneTurntablePrize obj = PatchProxy.apply(null, this, LiveGzoneTurntablePrize.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPrizeId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
}
