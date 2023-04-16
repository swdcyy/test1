package com.kuaishou.android.model.mix.LabelPackage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class LabelPackage implements Serializable	// class@000cfa
{
    public String mIdentity;
    public String mName;
    public String mParams;

    public void LabelPackage(){
       super();
    }
    public final String getMIdentity(){
       return this.mIdentity;
    }
    public final String getMName(){
       return this.mName;
    }
    public final String getMParams(){
       return this.mParams;
    }
    public final void setMIdentity(String p0){
       this.mIdentity = p0;
    }
    public final void setMName(String p0){
       this.mName = p0;
    }
    public final void setMParams(String p0){
       this.mParams = p0;
    }
}
