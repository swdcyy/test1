package com.yxcorp.gifshow.profile.http.AccountCanceledException;
import java.lang.Exception;
import java.lang.String;

public class AccountCanceledException extends Exception	// class@00134b
{
    public final String mCanceledBtnText;
    public final String mCanceledDesc;

    public void AccountCanceledException(String p0,String p1){
       super();
       this.mCanceledBtnText = p0;
       this.mCanceledDesc = p1;
    }
}
