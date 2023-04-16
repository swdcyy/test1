package com.yxcorp.gifshow.push.model.PushInitError;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class PushInitError implements Serializable	// class@00168e
{
    public String mProvider;
    public String mReason;
    public static final long serialVersionUID = 0x2bdd158f061e5f16;

    public void PushInitError(String p0,String p1){
       super();
       this.mProvider = p0;
       this.mReason = p1;
    }
}
