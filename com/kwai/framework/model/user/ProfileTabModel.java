package com.kwai.framework.model.user.ProfileTabModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.Integer;
import com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo;

public class ProfileTabModel implements Serializable	// class@001718
{
    public ProfileTabModel$AdBusinessTabInfo mAdBusinessTabInfo;
    public int mIndex;
    public String mName;
    public int mShowStatus;
    public String mTabLogName;
    public int mType;
    public static final long serialVersionUID = 0xdf11772ddf2e0f1f;

    public void ProfileTabModel(){
       super();
    }
    public String getLogTabId(){
       Object obj = PatchProxy.apply(null, this, ProfileTabModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isBusinessTab()) {
          return String.valueOf(this.mType);
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.mType),this.mAdBusinessTabInfo.mPageId};
       return String.format(Locale.US, "%d-%s", objArray);
    }
    public int getTabId(){
       return this.mType;
    }
    public boolean isBusinessTab(){
       boolean b = (9 == this.mType && this.mAdBusinessTabInfo != null)? true: false;
       return b;
    }
}
