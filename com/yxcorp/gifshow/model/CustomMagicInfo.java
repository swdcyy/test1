package com.yxcorp.gifshow.model.CustomMagicInfo;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.model.CustomConfig;
import java.lang.Object;

public final class CustomMagicInfo implements Serializable	// class@001e00
{
    public final String coverPath;
    public final CustomConfig customConfig;
    public boolean isDefault;
    public final String magicId;

    public void CustomMagicInfo(String p0,String p1,CustomConfig p2){
       super();
       this.magicId = p0;
       this.coverPath = p1;
       this.customConfig = p2;
    }
    public final String getCoverPath(){
       return this.coverPath;
    }
    public final CustomConfig getCustomConfig(){
       return this.customConfig;
    }
    public final String getMagicId(){
       return this.magicId;
    }
    public final boolean isDefault(){
       return this.isDefault;
    }
    public final void setDefault(boolean p0){
       this.isDefault = p0;
    }
}
