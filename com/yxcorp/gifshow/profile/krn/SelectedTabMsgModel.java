package com.yxcorp.gifshow.profile.krn.SelectedTabMsgModel;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.profile.krn.TabModel;

public final class SelectedTabMsgModel implements Serializable	// class@001369
{
    public TabModel mSelectedTab;

    public void SelectedTabMsgModel(){
       super();
    }
    public final TabModel getMSelectedTab(){
       return this.mSelectedTab;
    }
    public final void setMSelectedTab(TabModel p0){
       this.mSelectedTab = p0;
    }
}
