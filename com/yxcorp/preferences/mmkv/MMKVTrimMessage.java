package com.yxcorp.preferences.mmkv.MMKVTrimMessage;
import java.io.Serializable;
import java.lang.Object;

public class MMKVTrimMessage implements Serializable	// class@000954
{
    public long mAfterTrimKb;
    public long mBeforeTrimKb;
    public String mFile;
    public String mProcessName;
    public String mStackTrace;
    public Map mValueSizeMap;

    public void MMKVTrimMessage(){
       super();
    }
}
