package com.kwai.sdk.switchconfig.v2.ConfigPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConfigPriority extends Enum	// class@001676
{
    public int value;
    public static final ConfigPriority[] $VALUES;
    public static final ConfigPriority HIGH;
    public static final ConfigPriority LOW;
    public static final ConfigPriority MIDDLE;

    static {
       ConfigPriority uConfigPrior = new ConfigPriority("HIGH", 0, 2);
       ConfigPriority.HIGH = uConfigPrior;
       ConfigPriority uConfigPrior1 = new ConfigPriority("MIDDLE", 1, 1);
       ConfigPriority.MIDDLE = uConfigPrior1;
       ConfigPriority uConfigPrior2 = new ConfigPriority("LOW", 2, 0);
       ConfigPriority.LOW = uConfigPrior2;
       ConfigPriority[] uConfigPrior3 = new ConfigPriority[]{uConfigPrior,uConfigPrior1,uConfigPrior2};
       ConfigPriority.$VALUES = uConfigPrior3;
    }
    public void ConfigPriority(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ConfigPriority get(int p0){
       object oobject;
       ConfigPriority[] uConfigPrior = ConfigPriority.values();
       int len = uConfigPrior.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return ConfigPriority.LOW;
          }
          oobject = uConfigPrior[i];
          if (oobject.value == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static ConfigPriority valueOf(String p0){
       return Enum.valueOf(ConfigPriority.class, p0);
    }
    public static ConfigPriority[] values(){
       return ConfigPriority.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
