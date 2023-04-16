package com.hpplay.sdk.source.bean.DanmakuPropertyBean$Speed;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DanmakuPropertyBean$Speed extends Enum	// class@000649
{
    public float value;
    public static final DanmakuPropertyBean$Speed[] $VALUES;
    public static final DanmakuPropertyBean$Speed SPEED_1;
    public static final DanmakuPropertyBean$Speed SPEED_10;
    public static final DanmakuPropertyBean$Speed SPEED_2;
    public static final DanmakuPropertyBean$Speed SPEED_3;
    public static final DanmakuPropertyBean$Speed SPEED_4;
    public static final DanmakuPropertyBean$Speed SPEED_5;
    public static final DanmakuPropertyBean$Speed SPEED_6;
    public static final DanmakuPropertyBean$Speed SPEED_7;
    public static final DanmakuPropertyBean$Speed SPEED_8;
    public static final DanmakuPropertyBean$Speed SPEED_9;

    static {
       DanmakuPropertyBean$Speed speed = new DanmakuPropertyBean$Speed("SPEED_1", 0, 0x3fc00000);
       DanmakuPropertyBean$Speed.SPEED_1 = speed;
       DanmakuPropertyBean$Speed speed1 = new DanmakuPropertyBean$Speed("SPEED_2", 1, 0x3fa66666);
       DanmakuPropertyBean$Speed.SPEED_2 = speed1;
       DanmakuPropertyBean$Speed speed2 = new DanmakuPropertyBean$Speed("SPEED_3", 2, 0x3f8ccccd);
       DanmakuPropertyBean$Speed.SPEED_3 = speed2;
       DanmakuPropertyBean$Speed speed3 = new DanmakuPropertyBean$Speed("SPEED_4", 3, 0x3f666666);
       DanmakuPropertyBean$Speed.SPEED_4 = speed3;
       DanmakuPropertyBean$Speed speed4 = new DanmakuPropertyBean$Speed("SPEED_5", 4, 0x3f333333);
       DanmakuPropertyBean$Speed.SPEED_5 = speed4;
       DanmakuPropertyBean$Speed speed5 = new DanmakuPropertyBean$Speed("SPEED_6", 5, 0x3f000000);
       DanmakuPropertyBean$Speed.SPEED_6 = speed5;
       DanmakuPropertyBean$Speed speed6 = new DanmakuPropertyBean$Speed("SPEED_7", 6, 0.40f);
       DanmakuPropertyBean$Speed.SPEED_7 = speed6;
       DanmakuPropertyBean$Speed speed7 = new DanmakuPropertyBean$Speed("SPEED_8", 7, 0.30f);
       DanmakuPropertyBean$Speed.SPEED_8 = speed7;
       DanmakuPropertyBean$Speed speed8 = new DanmakuPropertyBean$Speed("SPEED_9", 8, 0.20f);
       DanmakuPropertyBean$Speed.SPEED_9 = speed8;
       DanmakuPropertyBean$Speed speed9 = new DanmakuPropertyBean$Speed("SPEED_10", 9, 0.10f);
       DanmakuPropertyBean$Speed.SPEED_10 = speed9;
       DanmakuPropertyBean$Speed[] speedArray = new DanmakuPropertyBean$Speed[10];
       speedArray[0] = speed;
       speedArray[1] = speed1;
       speedArray[2] = speed2;
       speedArray[3] = speed3;
       speedArray[4] = speed4;
       speedArray[5] = speed5;
       speedArray[6] = speed6;
       speedArray[7] = speed7;
       speedArray[8] = speed8;
       speedArray[9] = speed9;
       DanmakuPropertyBean$Speed.$VALUES = speedArray;
    }
    public void DanmakuPropertyBean$Speed(String p0,int p1,float p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DanmakuPropertyBean$Speed valueOf(String p0){
       return Enum.valueOf(DanmakuPropertyBean$Speed.class, p0);
    }
    public static DanmakuPropertyBean$Speed[] values(){
       return DanmakuPropertyBean$Speed.$VALUES.clone();
    }
    public float value(){
       return this.value;
    }
}
