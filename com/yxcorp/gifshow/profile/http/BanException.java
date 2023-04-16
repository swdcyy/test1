package com.yxcorp.gifshow.profile.http.BanException;
import java.lang.Exception;
import java.lang.String;

public class BanException extends Exception	// class@00134c
{
    public final boolean mBanDisallowAppeal;
    public final String mBanText;
    public final String mPromptText;
    public final String mVerifiedUrl;

    public void BanException(String p0,String p1,String p2,boolean p3){
       super();
       this.mBanText = p0;
       this.mPromptText = p1;
       this.mVerifiedUrl = p2;
       this.mBanDisallowAppeal = p3;
    }
}
