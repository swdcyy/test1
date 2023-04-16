package com.yxcorp.gifshow.settings.stencil.entity.action.AbsSettingItemAction;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public abstract class AbsSettingItemAction implements Serializable	// class@001b39
{
    public final String type;

    public void AbsSettingItemAction(String p0){
       super();
       this.type = p0;
    }
    public final String getType(){
       return this.type;
    }
}
