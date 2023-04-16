package com.tencent.mmkv.MMKVHandler;
import com.tencent.mmkv.MMKVLogLevel;
import java.lang.String;
import com.tencent.mmkv.MMKVRecoverStrategic;

public interface abstract MMKVHandler	// class@000fe0
{

    void mmkvLog(MMKVLogLevel p0,String p1,int p2,String p3,String p4);
    MMKVRecoverStrategic onMMKVCRCCheckFail(String p0);
    MMKVRecoverStrategic onMMKVFileLengthError(String p0);
    boolean wantLogRedirecting();
}
