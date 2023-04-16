package com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import java.util.List;

public class ShareBusinessLinkInfo implements Serializable	// class@0013d4
{
    public ShareBusinessLinkInfo$DialogInfo mDialog;
    public ShareBusinessLinkInfo$EntranceInfo mEntrance;
    public static final long serialVersionUID = 0xfa1de8d555c43eac;

    public void ShareBusinessLinkInfo(){
       super();
    }
    public boolean hasLinkInfo(){
       boolean b;
       ShareBusinessLinkInfo obj = PatchProxy.apply(null, this, ShareBusinessLinkInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mDialog;
       if (obj != null) {
          ShareBusinessLinkInfo$DialogInfo mItems = obj.mItems;
          if (mItems != null && mItems.size() > 0) {
             b = true;
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
}
