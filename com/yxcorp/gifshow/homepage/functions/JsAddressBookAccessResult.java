package com.yxcorp.gifshow.homepage.functions.JsAddressBookAccessResult;
import java.io.Serializable;
import java.lang.Object;

public class JsAddressBookAccessResult implements Serializable	// class@0016ca
{
    public int mResult;
    public int mStatus;
    public static final long serialVersionUID = 0x1c8c2bf5e0a3cdcf;

    public void JsAddressBookAccessResult(int p0,int p1){
       super();
       this.mResult = p0;
       this.mStatus = p1;
    }
}
