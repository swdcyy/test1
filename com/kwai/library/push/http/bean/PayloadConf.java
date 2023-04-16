package com.kwai.library.push.http.bean.PayloadConf;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class PayloadConf implements Serializable	// class@0008c9
{
    public PayloadConf$ConfData mData;
    public boolean mIsSyn;

    public void PayloadConf(){
       super();
    }
    public String toString(){
       return "PayloadConf{isSyn="+this.mIsSyn+", data="+this.mData+'}';
    }
}
