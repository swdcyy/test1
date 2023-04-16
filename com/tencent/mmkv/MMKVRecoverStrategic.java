package com.tencent.mmkv.MMKVRecoverStrategic;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MMKVRecoverStrategic extends Enum	// class@000fe2
{
    public static final MMKVRecoverStrategic[] $VALUES;
    public static final MMKVRecoverStrategic OnErrorDiscard;
    public static final MMKVRecoverStrategic OnErrorRecover;

    static {
       MMKVRecoverStrategic mMKVRecoverS = new MMKVRecoverStrategic("OnErrorDiscard", 0);
       MMKVRecoverStrategic.OnErrorDiscard = mMKVRecoverS;
       MMKVRecoverStrategic mMKVRecoverS1 = new MMKVRecoverStrategic("OnErrorRecover", 1);
       MMKVRecoverStrategic.OnErrorRecover = mMKVRecoverS1;
       MMKVRecoverStrategic[] mMKVRecoverS2 = new MMKVRecoverStrategic[]{mMKVRecoverS,mMKVRecoverS1};
       MMKVRecoverStrategic.$VALUES = mMKVRecoverS2;
    }
    public void MMKVRecoverStrategic(String p0,int p1){
       super(p0, p1);
    }
    public static MMKVRecoverStrategic valueOf(String p0){
       return Enum.valueOf(MMKVRecoverStrategic.class, p0);
    }
    public static MMKVRecoverStrategic[] values(){
       return MMKVRecoverStrategic.$VALUES.clone();
    }
}
