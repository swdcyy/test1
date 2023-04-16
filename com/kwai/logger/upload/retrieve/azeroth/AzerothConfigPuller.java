package com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller;
import java.util.EnumMap;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$ConfigItem;
import java.lang.Class;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Config;

public class AzerothConfigPuller	// class@000d2e
{
    public static final EnumMap a;
    public static ObiwanConfig$Config b;

    static {
       AzerothConfigPuller.a = new EnumMap(AzerothConfigPuller$ConfigItem.class);
       AzerothConfigPuller.b = new ObiwanConfig$Config();
    }
}
