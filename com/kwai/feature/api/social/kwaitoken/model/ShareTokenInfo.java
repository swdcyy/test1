package com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import java.io.Serializable;
import java.lang.Object;

public class ShareTokenInfo implements Serializable	// class@001109
{
    public Serializable mExtras;
    public int mPlatform;
    public int mResult;
    public ShareTokenDialogInfo mTokenDialog;
    public String mUri;
    public static final long serialVersionUID = 0x7bd8920d133bb895;

    public void ShareTokenInfo(){
       super();
    }
    public Object getExtras(){
       return this.mExtras;
    }
}
