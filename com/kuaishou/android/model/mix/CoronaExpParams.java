package com.kuaishou.android.model.mix.CoronaExpParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class CoronaExpParams implements Serializable	// class@000c0a
{
    public String mCoronaTvName;
    public boolean mDisableCinemaNotice;

    public void CoronaExpParams(){
       super();
    }
    public final String getMCoronaTvName(){
       return this.mCoronaTvName;
    }
    public final boolean getMDisableCinemaNotice(){
       return this.mDisableCinemaNotice;
    }
    public final void setMCoronaTvName(String p0){
       this.mCoronaTvName = p0;
    }
    public final void setMDisableCinemaNotice(boolean p0){
       this.mDisableCinemaNotice = p0;
    }
}
