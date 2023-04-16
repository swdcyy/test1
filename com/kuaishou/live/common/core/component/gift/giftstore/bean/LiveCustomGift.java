package com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveCustomGift;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveCustomGift implements Serializable	// class@001314
{
    public String TAG;
    public int mCustomGiftId;
    public Gift mGift;
    public int mState;
    public static final long serialVersionUID = 0x79ec1ce8e6468787;

    public void LiveCustomGift(){
       super();
       this.TAG = "LiveCustomGift";
       this.mState = 0;
    }
    public Gift getGift(){
       return this.mGift;
    }
    public int getState(){
       return this.mState;
    }
    public Boolean inInInvalidState(){
       Object obj = PatchProxy.apply(null, this, LiveCustomGift.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (this.mState == null)? true: false;
       return Boolean.valueOf(b);
    }
    public Boolean isInNormalState(){
       Object obj = PatchProxy.apply(null, this, LiveCustomGift.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       if (this.mState != b) {
          b = false;
       }
       return Boolean.valueOf(b);
    }
    public void setState(int p0){
       if (PatchProxy.isSupport(LiveCustomGift.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveCustomGift.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.CUSTOM_GIFT, this.TAG+" setState: "+p0);
       this.mState = p0;
       return;
    }
}
