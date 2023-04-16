package com.yxcorp.gifshow.relation.explore.model.TabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class TabConfig implements Serializable	// class@00181b
{
    public String indexId;
    public boolean mForceUseExploreFriendsStyle;
    public boolean mNeedRequestContactPermission;
    public boolean mNotChangeStatusBarColor;
    public List tabIds;
    public int tabType;
    public static final long serialVersionUID = 0x1fcda1e50cfcea1f;

    public void TabConfig(int p0){
       super();
       this.tabIds = new ArrayList();
       this.mNeedRequestContactPermission = true;
       this.mForceUseExploreFriendsStyle = false;
       this.mNotChangeStatusBarColor = false;
       this.tabType = p0;
    }
}
