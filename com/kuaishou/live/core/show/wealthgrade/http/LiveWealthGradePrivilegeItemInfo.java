package com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveWealthGradePrivilegeItemInfo implements Serializable	// class@001260
{
    public String mContent;
    public CDNUrl[] mDisplayImageUrls;
    public String mPrivilegeDescription;
    public int mPrivilegeType;
    public int mStatus;
    public int mUnlockGrade;
    public static final long serialVersionUID = 0x7f80f935eaa2149a;

    public void LiveWealthGradePrivilegeItemInfo(){
       super();
    }
    public boolean isLockedStatus(){
       boolean b = true;
       if (this.mStatus == b) {
       }else {
          b = false;
       }
       return b;
    }
}
