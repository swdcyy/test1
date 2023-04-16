package com.yxcorp.gifshow.profile.krn.TabChangedMsgModel;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.profile.krn.TabModel;

public final class TabChangedMsgModel implements Serializable	// class@00136a
{
    public TabModel mFrom;
    public TabModel mToTab;

    public void TabChangedMsgModel(){
       super();
    }
    public final TabModel getMFrom(){
       return this.mFrom;
    }
    public final TabModel getMToTab(){
       return this.mToTab;
    }
    public final void setMFrom(TabModel p0){
       this.mFrom = p0;
    }
    public final void setMToTab(TabModel p0){
       this.mToTab = p0;
    }
}
