package com.kuaishou.merchant.live.basic.common.sandeabiz.SandeBizPublishException;
import java.lang.Exception;
import java.lang.String;
import lnc.a1;

public class SandeBizPublishException extends Exception	// class@001885
{
    public String mErrorMessage;
    public static final long serialVersionUID = 0x16ab4fab873c4738;

    public void SandeBizPublishException(int p0){
       super(a1.p(p0));
    }
    public void SandeBizPublishException(String p0){
       super();
       this.mErrorMessage = p0;
    }
    public String getMessage(){
       return this.mErrorMessage;
    }
}
