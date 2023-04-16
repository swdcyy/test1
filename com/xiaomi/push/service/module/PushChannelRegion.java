package com.xiaomi.push.service.module.PushChannelRegion;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PushChannelRegion extends Enum	// class@001186
{
    public static final PushChannelRegion[] $VALUES;
    public static final PushChannelRegion China;
    public static final PushChannelRegion Europe;
    public static final PushChannelRegion Global;
    public static final PushChannelRegion India;
    public static final PushChannelRegion Russia;

    static {
       PushChannelRegion pushChannelR = new PushChannelRegion("China", 0);
       PushChannelRegion.China = pushChannelR;
       PushChannelRegion pushChannelR1 = new PushChannelRegion("Global", 1);
       PushChannelRegion.Global = pushChannelR1;
       PushChannelRegion pushChannelR2 = new PushChannelRegion("Europe", 2);
       PushChannelRegion.Europe = pushChannelR2;
       PushChannelRegion pushChannelR3 = new PushChannelRegion("Russia", 3);
       PushChannelRegion.Russia = pushChannelR3;
       PushChannelRegion pushChannelR4 = new PushChannelRegion("India", 4);
       PushChannelRegion.India = pushChannelR4;
       PushChannelRegion[] pushChannelR5 = new PushChannelRegion[]{pushChannelR,pushChannelR1,pushChannelR2,pushChannelR3,pushChannelR4};
       PushChannelRegion.$VALUES = pushChannelR5;
    }
    public void PushChannelRegion(String p0,int p1){
       super(p0, p1);
    }
    public static PushChannelRegion valueOf(String p0){
       return Enum.valueOf(PushChannelRegion.class, p0);
    }
    public static PushChannelRegion[] values(){
       return PushChannelRegion.$VALUES.clone();
    }
}
