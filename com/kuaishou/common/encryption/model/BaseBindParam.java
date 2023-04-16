package com.kuaishou.common.encryption.model.BaseBindParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import java.lang.String;

public abstract class BaseBindParam extends a implements Serializable	// class@0016af
{
    public String openId;

    public void BaseBindParam(){
       super();
    }
    public String getOpenId(){
       return this.openId;
    }
    public void setOpenId(String p0){
       this.openId = p0;
    }
}
