package com.kwai.tokenshare.localtoken.LocalTokenModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class LocalTokenModel implements Serializable	// class@001925
{
    public String mShareId;
    public String mSubBiz;
    public String mTargetUrl;
    public static final long serialVersionUID = 0x8b1af6a5258ba326;

    public void LocalTokenModel(String p0,String p1,String p2){
       super();
       this.mSubBiz = p0;
       this.mTargetUrl = p2;
       this.mShareId = p1;
    }
}
