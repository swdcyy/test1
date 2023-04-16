package com.yxcorp.gifshow.tube.ExtraParams;
import java.io.Serializable;
import com.yxcorp.gifshow.tube.ExtraParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class ExtraParams implements Serializable	// class@001de0
{
    public String mUpdateTimeText;
    public static final ExtraParams$a Companion;
    public static final long serialVersionUID;

    static {
       ExtraParams.Companion = new ExtraParams$a(null);
    }
    public void ExtraParams(){
       super();
    }
    public final String getMUpdateTimeText(){
       return this.mUpdateTimeText;
    }
    public final void setMUpdateTimeText(String p0){
       this.mUpdateTimeText = p0;
    }
}
