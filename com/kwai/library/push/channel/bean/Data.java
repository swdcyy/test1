package com.kwai.library.push.channel.bean.Data;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class Data	// class@0008a0
{
    public JsonObject attach;
    public int bizId;
    public DataConf conf;
    public Shake mShake;
    public Sound mSound;
    public ViewStyle mViewStyle;
    public String schema;

    public void Data(){
       super();
    }
    public String toString(){
       return "Data{bizId="+this.bizId+", conf="+this.conf+", schema=\'"+this.schema+'''+", attach="+this.attach+", mShake="+this.mShake+", mSound="+this.mSound+", mViewStyle="+this.mViewStyle+'}';
    }
}
