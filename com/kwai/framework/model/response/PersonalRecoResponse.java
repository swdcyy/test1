package com.kwai.framework.model.response.PersonalRecoResponse;
import java.io.Serializable;
import java.lang.Object;

public class PersonalRecoResponse implements Serializable	// class@0016c7
{
    public long deviceBit;
    public int result;
    public long userRecoBit;
    public static final long serialVersionUID = 0xa1baca92f206ae7b;

    public void PersonalRecoResponse(){
       super();
    }
    public boolean isSuccess(){
       boolean b = true;
       if (this.result == b) {
       }else {
          b = false;
       }
       return b;
    }
}
