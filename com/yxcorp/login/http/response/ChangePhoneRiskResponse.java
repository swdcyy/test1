package com.yxcorp.login.http.response.ChangePhoneRiskResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class ChangePhoneRiskResponse implements Serializable, b	// class@001aca
{
    public String mMessage;
    public List mVerifyTypeList;
    public Integer result;
    public static final long serialVersionUID = 0x6b6dc65dfb3bcdfb;

    public void ChangePhoneRiskResponse(){
       super();
    }
    public List getItems(){
       return this.mVerifyTypeList;
    }
    public boolean hasMore(){
       return false;
    }
}
