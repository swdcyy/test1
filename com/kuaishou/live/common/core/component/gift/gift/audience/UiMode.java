package com.kuaishou.live.common.core.component.gift.gift.audience.UiMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UiMode extends Enum	// class@00128d
{
    public static final UiMode[] $VALUES;
    public static final UiMode NormalMode;
    public static final UiMode ToAudienceMode;

    static {
       UiMode uiMode = new UiMode("NormalMode", 0);
       UiMode.NormalMode = uiMode;
       UiMode uiMode1 = new UiMode("ToAudienceMode", 1);
       UiMode.ToAudienceMode = uiMode1;
       UiMode[] uiModeArray = new UiMode[]{uiMode,uiMode1};
       UiMode.$VALUES = uiModeArray;
    }
    public void UiMode(String p0,int p1){
       super(p0, p1);
    }
    public static UiMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UiMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UiMode.class, p0);
    }
    public static UiMode[] values(){
       Object obj = PatchProxy.apply(null, null, UiMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UiMode.$VALUES.clone();
    }
}
