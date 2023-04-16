package com.kuaishou.merchant.home2.skin.SkinDownloadException;
import java.lang.Exception;
import java.lang.String;

public class SkinDownloadException extends Exception	// class@00181e
{
    public final String mErrorMsg;
    public static final long serialVersionUID = 0x8c5dc084e75e86a1;

    public void SkinDownloadException(String p0){
       super();
       this.mErrorMsg = p0;
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
}
