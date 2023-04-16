package com.yxcorp.gifshow.profile.model.UserMiddleButton;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.model.UserMiddleButtonType;

public class UserMiddleButton implements Serializable, a	// class@0013b6
{
    public String mEntranceName;
    public UserMiddleButtonType mEntranceType;
    public String mLinkUrl;
    public String mSourceEntranceType;
    public static final long serialVersionUID = 0xf6d3c68469b7f18a;

    public void UserMiddleButton(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, UserMiddleButton.class, "1")) {
          return;
       }
       this.mEntranceType = UserMiddleButtonType.of(this.mSourceEntranceType);
       return;
    }
}
