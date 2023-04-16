package com.yxcorp.gifshow.profile.model.UserOperationEntrance;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.model.UserOperationEntranceType;

public class UserOperationEntrance implements Serializable, a	// class@0013bd
{
    public int mActionType;
    public String mActionUrl;
    public String mEntranceDarkIcon;
    public String mEntranceIcon;
    public String mEntranceName;
    public String mEntranceSubName;
    public UserOperationEntranceType mEntranceType;
    public String mExtParam;
    public int mGroupType;
    public String mSourceEntranceType;
    public String mStatisticsParams;
    public static final long serialVersionUID = 0x292457a66e6ed4d0;

    public void UserOperationEntrance(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, UserOperationEntrance.class, "1")) {
          return;
       }
       this.mEntranceType = UserOperationEntranceType.of(this.mSourceEntranceType);
       return;
    }
}
