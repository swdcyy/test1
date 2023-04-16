package com.yxcorp.gifshow.entity.helper.FollowHelper$StidParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class FollowHelper$StidParam implements Serializable	// class@000dd1
{
    public String mCommonStid;
    public String mInterStid;
    public static final long serialVersionUID = 0x6994c3ef39c41b68;

    public void FollowHelper$StidParam(){
       super();
       this.mCommonStid = "";
       this.mInterStid = "";
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, FollowHelper$StidParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.x(this.mCommonStid) && TextUtils.x(this.mInterStid))? true: false;
       return b;
    }
}
