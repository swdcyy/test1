package com.kwai.feature.api.danmaku.model.DanmakuSettingAnchorViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DanmakuSettingAnchorViewType extends Enum	// class@000e7d
{
    public static final DanmakuSettingAnchorViewType[] $VALUES;
    public static final DanmakuSettingAnchorViewType MASK_SETTING;

    static {
       DanmakuSettingAnchorViewType uDanmakuSett1;
       DanmakuSettingAnchorViewType[] uDanmakuSett = new DanmakuSettingAnchorViewType[]{uDanmakuSett1};
       uDanmakuSett1 = new DanmakuSettingAnchorViewType("MASK_SETTING", 0);
       DanmakuSettingAnchorViewType.MASK_SETTING = uDanmakuSett1;
       DanmakuSettingAnchorViewType.$VALUES = uDanmakuSett;
    }
    public void DanmakuSettingAnchorViewType(String p0,int p1){
       super(p0, p1);
    }
    public static DanmakuSettingAnchorViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuSettingAnchorViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuSettingAnchorViewType.class, p0);
    }
    public static DanmakuSettingAnchorViewType[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuSettingAnchorViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuSettingAnchorViewType.$VALUES.clone();
    }
}
