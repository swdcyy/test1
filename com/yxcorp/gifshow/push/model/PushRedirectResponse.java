package com.yxcorp.gifshow.push.model.PushRedirectResponse;
import java.io.Serializable;
import java.lang.Object;

public class PushRedirectResponse implements Serializable	// class@001691
{
    public boolean mIsForkData;
    public String mUri;
    public static final long serialVersionUID = 0x8e982ab53b53f3ca;

    public void PushRedirectResponse(){
       super();
    }
    public PushRedirectResponse setForkData(boolean p0){
       this.mIsForkData = p0;
       return this;
    }
}
