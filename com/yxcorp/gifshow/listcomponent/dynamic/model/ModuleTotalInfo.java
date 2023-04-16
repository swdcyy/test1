package com.yxcorp.gifshow.listcomponent.dynamic.model.ModuleTotalInfo;
import java.io.Serializable;
import java.lang.Object;

public class ModuleTotalInfo implements Serializable	// class@001a66
{
    public ModuleDataInfo data;
    public String dataId;
    public ModuleTotalInfo footer;
    public ModuleTotalInfo header;
    public String level;
    public LeveExtraInfo levelExtraInfo;
    public String levelType;
    public List modules;
    public boolean more;
    public int pageIndex;

    public void ModuleTotalInfo(){
       super();
    }
}
