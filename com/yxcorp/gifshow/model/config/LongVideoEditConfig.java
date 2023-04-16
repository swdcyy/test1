package com.yxcorp.gifshow.model.config.LongVideoEditConfig;
import java.io.Serializable;
import java.lang.Object;

public class LongVideoEditConfig implements Serializable	// class@001ed8
{
    public int mLongVideoMaxMinute;
    public int mLongVideoMinMillisecond;
    public static final long serialVersionUID = 0x6d405f7a9771da15;

    public void LongVideoEditConfig(){
       super();
       this.mLongVideoMinMillisecond = 0xdea8;
       this.mLongVideoMaxMinute = 15;
    }
    public long getMaxMilliseconds(){
       return (long)((this.mLongVideoMaxMinute * 60) * 1000);
    }
    public int getMaxMinutes(){
       return this.mLongVideoMaxMinute;
    }
    public long getMinMilliseconds(){
       return (long)this.mLongVideoMinMillisecond;
    }
}
