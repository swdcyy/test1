package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem implements Serializable	// class@001220
{
    public int mGiftBatchCount;
    public String mGiftBatchCountDescription;
    public String mGiftBatchDisplayText;
    public boolean mIsEditGiftCountItem;
    public boolean mIsFromAllItem;
    public static final long serialVersionUID = 0x603b7f8dbce6074e;

    public void LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(int p0,String p1){
       super();
       this.mGiftBatchCount = p0;
       this.mGiftBatchDisplayText = String.valueOf(p0);
       this.mGiftBatchCountDescription = p1;
    }
    public void LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(int p0,String p1,String p2,boolean p3){
       super();
       this.mGiftBatchCount = p0;
       this.mGiftBatchDisplayText = p1;
       this.mGiftBatchCountDescription = p2;
       this.mIsFromAllItem = p3;
    }
    public static LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem createEditGiftBatchNumberItem(){
       LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem obj = PatchProxy.apply(null, null, LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(0, a1.p(0x7f100bb6));
       obj.mGiftBatchDisplayText = "";
       obj.mIsEditGiftCountItem = true;
       return obj;
    }
    public static LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem parseFromLiveGiftBatchConfig(LiveConfigStartupResponse$LiveGiftBatchConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(p0.mGiftBatchCount, p0.mGiftBatchCountDescription);
    }
    public boolean isGiftBatchNumberItemInvalid(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.x(this.mGiftBatchCountDescription) && TextUtils.x(this.mGiftBatchDisplayText))? true: false;
       return b;
    }
}
