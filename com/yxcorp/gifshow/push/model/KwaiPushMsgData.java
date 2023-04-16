package com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.bean.PushData;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i6c.k;

public class KwaiPushMsgData extends PushData	// class@0012fd
{
    public String bgImg;
    public String bigPicUrl;
    public String extraData;
    public String mId;
    public List picArray;
    public String pushLargeIcon;
    public int pushType;
    public String serverKey;
    public boolean showBadge;
    public boolean showButton;
    public boolean showOnlyInBar;
    public boolean silentPush;
    public static final long serialVersionUID = 0x52289772332dbf80;

    public void KwaiPushMsgData(){
       super();
       this.showBadge = false;
       this.showOnlyInBar = false;
       this.silentPush = false;
    }
    public String getPushValueFromServerKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPushMsgData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.c(this.serverKey, p0);
    }
}
