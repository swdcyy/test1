package com.kwai.library.push.http.bean.PayloadData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class PayloadData implements Serializable	// class@0008ca
{
    public ChannelData mChannelData;
    public boolean mIsSync;
    public static final long serialVersionUID = 0xcedec9243884a9c7;

    public void PayloadData(){
       super();
    }
    public String toString(){
       return "PayloadData{mIsSync="+this.mIsSync+", mChannelData="+this.mChannelData+'}';
    }
}
