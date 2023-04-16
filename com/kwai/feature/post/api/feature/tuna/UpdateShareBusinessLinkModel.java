package com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import java.io.Serializable;
import java.lang.Object;
import d36.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class UpdateShareBusinessLinkModel implements Serializable	// class@0013d8
{
    public List mAtFriends;
    public long mConversionTaskId;
    public String mEntryId;
    public String mExtData;
    public String mItemInfo;
    public String mItemName;
    public String mMetaText;
    public String mServiceId;
    public String mSubtype;
    public boolean mSupportPostEdit;
    public List mTopics;
    public static final long serialVersionUID = 0x41b2ceade292173b;

    public void UpdateShareBusinessLinkModel(){
       super();
    }
    public f toEvent(){
       Object obj = PatchProxy.apply(null, this, UpdateShareBusinessLinkModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
}
