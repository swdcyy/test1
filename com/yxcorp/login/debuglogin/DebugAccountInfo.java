package com.yxcorp.login.debuglogin.DebugAccountInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class DebugAccountInfo implements Serializable	// class@001aa5
{
    public String mEnv;
    public String mName;
    public String mQuickLoginToken;
    public String mUid;
    public static final long serialVersionUID = 0x5c1270f02e9a97f0;

    public void DebugAccountInfo(String p0,String p1,String p2,String p3){
       super();
       this.mEnv = p0;
       this.mUid = p1;
       this.mName = p2;
       this.mQuickLoginToken = p3;
    }
}
