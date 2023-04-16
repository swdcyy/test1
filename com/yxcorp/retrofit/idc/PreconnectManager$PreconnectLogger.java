package com.yxcorp.retrofit.idc.PreconnectManager$PreconnectLogger;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class PreconnectManager$PreconnectLogger implements Serializable	// class@00096a
{
    public String mHostName;
    public int mTiming;
    public String mTypeName;
    public static final long serialVersionUID = 0xf36fc9d5322eb52e;

    public void PreconnectManager$PreconnectLogger(String p0,String p1,int p2){
       super();
       this.mTypeName = p0;
       this.mHostName = p1;
       this.mTiming = p2;
    }
}
