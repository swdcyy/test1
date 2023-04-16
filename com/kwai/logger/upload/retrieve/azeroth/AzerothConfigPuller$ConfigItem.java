package com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$ConfigItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AzerothConfigPuller$ConfigItem extends Enum	// class@000d2c
{
    public static final AzerothConfigPuller$ConfigItem[] $VALUES;
    public static final AzerothConfigPuller$ConfigItem CHECK_INTERVAL;
    public static final AzerothConfigPuller$ConfigItem RETRY_DELAY;

    static {
       AzerothConfigPuller$ConfigItem uConfigItem = new AzerothConfigPuller$ConfigItem("CHECK_INTERVAL", 0);
       AzerothConfigPuller$ConfigItem.CHECK_INTERVAL = uConfigItem;
       AzerothConfigPuller$ConfigItem uConfigItem1 = new AzerothConfigPuller$ConfigItem("RETRY_DELAY", 1);
       AzerothConfigPuller$ConfigItem.RETRY_DELAY = uConfigItem1;
       AzerothConfigPuller$ConfigItem[] uConfigItemA = new AzerothConfigPuller$ConfigItem[]{uConfigItem,uConfigItem1};
       AzerothConfigPuller$ConfigItem.$VALUES = uConfigItemA;
    }
    public void AzerothConfigPuller$ConfigItem(String p0,int p1){
       super(p0, p1);
    }
    public static AzerothConfigPuller$ConfigItem valueOf(String p0){
       return Enum.valueOf(AzerothConfigPuller$ConfigItem.class, p0);
    }
    public static AzerothConfigPuller$ConfigItem[] values(){
       return AzerothConfigPuller$ConfigItem.$VALUES.clone();
    }
}
