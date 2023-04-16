package com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenAdResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsSidTokenAdResult implements Serializable	// class@00161a
{
    public final int mResult;
    public String mSecurity;
    public String mToken;
    public static final long serialVersionUID = 0x52b2ed38934ea950;

    public void JsSidTokenAdResult(String p0,String p1){
       super();
       this.mResult = 1;
       this.mToken = p1;
       this.mSecurity = p0;
    }
}
