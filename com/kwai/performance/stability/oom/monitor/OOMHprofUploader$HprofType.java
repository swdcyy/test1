package com.kwai.performance.stability.oom.monitor.OOMHprofUploader$HprofType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OOMHprofUploader$HprofType extends Enum	// class@001247
{
    public static final OOMHprofUploader$HprofType[] $VALUES;
    public static final OOMHprofUploader$HprofType ORIGIN;
    public static final OOMHprofUploader$HprofType STRIPPED;

    static {
       OOMHprofUploader$HprofType hprofType;
       OOMHprofUploader$HprofType[] hprofTypeArr = new OOMHprofUploader$HprofType[]{hprofType,hprofType};
       hprofType = new OOMHprofUploader$HprofType("ORIGIN", 0);
       OOMHprofUploader$HprofType.ORIGIN = hprofType;
       hprofType = new OOMHprofUploader$HprofType("STRIPPED", 1);
       OOMHprofUploader$HprofType.STRIPPED = hprofType;
       OOMHprofUploader$HprofType.$VALUES = hprofTypeArr;
    }
    public void OOMHprofUploader$HprofType(String p0,int p1){
       super(p0, p1);
    }
    public static OOMHprofUploader$HprofType valueOf(String p0){
       return Enum.valueOf(OOMHprofUploader$HprofType.class, p0);
    }
    public static OOMHprofUploader$HprofType[] values(){
       return OOMHprofUploader$HprofType.$VALUES.clone();
    }
}
