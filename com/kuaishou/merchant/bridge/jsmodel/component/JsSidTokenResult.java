package com.kuaishou.merchant.bridge.jsmodel.component.JsSidTokenResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsSidTokenResult implements Serializable	// class@00161c
{
    public final int mResult;
    public String mSecurity;
    public String mToken;
    public static final long serialVersionUID = 0xe13d0bd6e5bf478f;

    public void JsSidTokenResult(String p0,String p1){
       super();
       this.mResult = 1;
       this.mToken = p1;
       this.mSecurity = p0;
    }
}
