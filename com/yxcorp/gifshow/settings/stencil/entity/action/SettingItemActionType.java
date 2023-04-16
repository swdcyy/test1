package com.yxcorp.gifshow.settings.stencil.entity.action.SettingItemActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SettingItemActionType extends Enum	// class@001b3a
{
    public static final SettingItemActionType[] $VALUES;
    public static final SettingItemActionType Page;

    static {
       SettingItemActionType settingItemA1;
       SettingItemActionType[] settingItemA = new SettingItemActionType[]{settingItemA1};
       settingItemA1 = new SettingItemActionType("Page", 0);
       SettingItemActionType.Page = settingItemA1;
       SettingItemActionType.$VALUES = settingItemA;
    }
    public void SettingItemActionType(String p0,int p1){
       super(p0, p1);
    }
    public static SettingItemActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SettingItemActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SettingItemActionType.class, p0);
    }
    public static SettingItemActionType[] values(){
       Object obj = PatchProxy.apply(null, null, SettingItemActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SettingItemActionType.$VALUES.clone();
    }
}
