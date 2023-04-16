package com.kwai.library.push.channel.bean.ChannelData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class ChannelData implements Serializable	// class@00089f
{
    public String back;
    public String id;
    public boolean mIsSync;
    public Data payload;
    public String type;
    public static final long serialVersionUID = 0x1265ff8799d820e3;

    public void ChannelData(){
       super();
    }
    public String toString(){
       return "ChannelData{id=\'"+this.id+'''+", type=\'"+this.type+'''+", back=\'"+this.back+'''+", payload="+this.payload+'}';
    }
}
