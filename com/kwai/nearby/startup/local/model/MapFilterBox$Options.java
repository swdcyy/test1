package com.kwai.nearby.startup.local.model.MapFilterBox$Options;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.MapFilterBox$Options$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class MapFilterBox$Options implements Serializable	// class@00101e
{
    public String mDisplayText;
    public String mName;
    public static final MapFilterBox$Options$a Companion;
    public static final long serialVersionUID;

    static {
       MapFilterBox$Options.Companion = new MapFilterBox$Options$a(null);
    }
    public void MapFilterBox$Options(){
       super();
    }
    public final String getMDisplayText(){
       return this.mDisplayText;
    }
    public final String getMName(){
       return this.mName;
    }
    public final void setMDisplayText(String p0){
       this.mDisplayText = p0;
    }
    public final void setMName(String p0){
       this.mName = p0;
    }
}
