package com.kwai.sdk.switchconfig.UpdateConfigMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public final class UpdateConfigMode extends Enum	// class@001634
{
    public String desc;
    public static final UpdateConfigMode[] $VALUES;
    public static final UpdateConfigMode ALL;
    public static final UpdateConfigMode PARTIALLY;

    static {
       UpdateConfigMode updateConfig = new UpdateConfigMode("ALL", 0, "全量更新");
       UpdateConfigMode.ALL = updateConfig;
       UpdateConfigMode updateConfig1 = new UpdateConfigMode("PARTIALLY", 1, "增量更新");
       UpdateConfigMode.PARTIALLY = updateConfig1;
       UpdateConfigMode[] updateConfig2 = new UpdateConfigMode[]{updateConfig,updateConfig1};
       UpdateConfigMode.$VALUES = updateConfig2;
    }
    public void UpdateConfigMode(String p0,int p1,String p2){
       super(p0, p1);
       this.desc = p2;
    }
    public static UpdateConfigMode valueOf(String p0){
       return Enum.valueOf(UpdateConfigMode.class, p0);
    }
    public static UpdateConfigMode[] values(){
       return UpdateConfigMode.$VALUES.clone();
    }
    public boolean isUpdateAll(){
       boolean b = (UpdateConfigMode.ALL == this)? true: false;
       return b;
    }
    public String toString(){
       return "UpdateConfigMode{desc=\'"+this.desc+'''+'}';
    }
}
