package com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencilType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SettingItemStencilType extends Enum	// class@001b36
{
    public static final SettingItemStencilType[] $VALUES;
    public static final SettingItemStencilType BASIC;
    public static final SettingItemStencilType OFFLINE;

    static {
       SettingItemStencilType settingItemS1;
       SettingItemStencilType[] settingItemS = new SettingItemStencilType[]{settingItemS1,settingItemS1};
       settingItemS1 = new SettingItemStencilType("BASIC", 0);
       SettingItemStencilType.BASIC = settingItemS1;
       settingItemS1 = new SettingItemStencilType("OFFLINE", 1);
       SettingItemStencilType.OFFLINE = settingItemS1;
       SettingItemStencilType.$VALUES = settingItemS;
    }
    public void SettingItemStencilType(String p0,int p1){
       super(p0, p1);
    }
    public static SettingItemStencilType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SettingItemStencilType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SettingItemStencilType.class, p0);
    }
    public static SettingItemStencilType[] values(){
       Object obj = PatchProxy.apply(null, null, SettingItemStencilType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SettingItemStencilType.$VALUES.clone();
    }
}
