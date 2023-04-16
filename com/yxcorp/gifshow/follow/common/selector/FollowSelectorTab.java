package com.yxcorp.gifshow.follow.common.selector.FollowSelectorTab;
import java.lang.Enum;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FollowSelectorTab extends Enum	// class@001088
{
    public boolean mEnableRefresh;
    public RefreshType mRefreshType;
    public int mSelectorTabId;
    public int mSelectorTabIndex;
    public String mSelectorTabName;
    public static final FollowSelectorTab[] $VALUES;
    public static final FollowSelectorTab DEFAULT_RANK;
    public static final FollowSelectorTab ONLY_SHOW_FRIENDS;
    public static final FollowSelectorTab TIMELINE_RANK;

    static {
       RefreshType refreshType = RefreshType.TAB_CLICK;
       FollowSelectorTab uFollowSelec = new FollowSelectorTab("DEFAULT_RANK", 0, "", 0, 0, refreshType, true);
       FollowSelectorTab.DEFAULT_RANK = v8;
       uFollowSelec = new FollowSelectorTab("TIMELINE_RANK", 1, "", 1, 1, refreshType, true);
       FollowSelectorTab.TIMELINE_RANK = v10;
       uFollowSelec = new FollowSelectorTab("ONLY_SHOW_FRIENDS", 2, "", 2, 2, refreshType, true);
       FollowSelectorTab.ONLY_SHOW_FRIENDS = v11;
       FollowSelectorTab[] uFollowSelec1 = new FollowSelectorTab[]{v8,v10,v11};
       FollowSelectorTab.$VALUES = uFollowSelec1;
    }
    public void FollowSelectorTab(String p0,int p1,String p2,int p3,int p4,RefreshType p5,boolean p6){
       super(p0, p1);
       this.mSelectorTabId = p3;
       this.mSelectorTabIndex = p4;
       this.mSelectorTabName = p2;
       this.mRefreshType = p5;
       this.mEnableRefresh = p6;
    }
    public static FollowSelectorTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowSelectorTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FollowSelectorTab.class, p0);
    }
    public static FollowSelectorTab[] values(){
       Object obj = PatchProxy.apply(null, null, FollowSelectorTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowSelectorTab.$VALUES.clone();
    }
    public FollowSelectorTab disableRefresh(){
       this.mEnableRefresh = false;
       return this;
    }
    public FollowSelectorTab enableRefresh(){
       this.mEnableRefresh = true;
       return this;
    }
    public RefreshType getRefreshType(){
       return this.mRefreshType;
    }
    public String getSelectorLoggerTabName(){
       String str;
       FollowSelectorTab tmSelectorTa = this.mSelectorTabIndex;
       if (tmSelectorTa != null) {
          if (tmSelectorTa != 1) {
             str = (tmSelectorTa != 2)? "": "friends";
          }else {
             str = "time";
          }
       }else {
          str = "default";
       }
       return str;
    }
    public int getSelectorTabId(){
       return this.mSelectorTabId;
    }
    public int getSelectorTabIndex(){
       return this.mSelectorTabIndex;
    }
    public String getSelectorTabName(){
       return this.mSelectorTabName;
    }
    public boolean isEnableRefresh(){
       return this.mEnableRefresh;
    }
    public FollowSelectorTab setRefreshType(RefreshType p0){
       this.mRefreshType = p0;
       return this;
    }
    public void setSelectorTabId(int p0){
       this.mSelectorTabId = p0;
    }
    public void setSelectorTabIndex(int p0){
       this.mSelectorTabIndex = p0;
    }
    public void setSelectorTabName(String p0){
       this.mSelectorTabName = p0;
    }
}
