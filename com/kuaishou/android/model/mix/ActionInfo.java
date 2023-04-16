package com.kuaishou.android.model.mix.ActionInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class ActionInfo implements Serializable	// class@000bac
{
    public int mActionType;
    public String mActionUrl;

    public void ActionInfo(){
       super();
       this.mActionType = -1;
    }
    public final int getMActionType(){
       return this.mActionType;
    }
    public final String getMActionUrl(){
       return this.mActionUrl;
    }
    public final void setMActionType(int p0){
       this.mActionType = p0;
    }
    public final void setMActionUrl(String p0){
       this.mActionUrl = p0;
    }
}
