package com.kwai.nearby.startup.local.model.MapFilterBox;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public final class MapFilterBox implements Serializable	// class@00101f
{
    public String mDisplayText;
    public String mName;
    public List mOptions;
    public final long serialVersionUID;

    public void MapFilterBox(){
       super();
       this.serialVersionUID = 0x33ffca751543713a;
    }
    public final String getMDisplayText(){
       return this.mDisplayText;
    }
    public final String getMName(){
       return this.mName;
    }
    public final List getMOptions(){
       return this.mOptions;
    }
    public final void setMDisplayText(String p0){
       this.mDisplayText = p0;
    }
    public final void setMName(String p0){
       this.mName = p0;
    }
    public final void setMOptions(List p0){
       this.mOptions = p0;
    }
}
