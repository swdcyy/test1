package com.kuaishou.merchant.dynamicpendant.mount.LiteLiveArea;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteLiveArea extends Enum	// class@001698
{
    public static final LiteLiveArea[] $VALUES;
    public static final LiteLiveArea LITE_BOTTOM_BUBBLE;
    public static final LiteLiveArea LITE_TEMP_PLAY;

    static {
       LiteLiveArea liteLiveArea1;
       LiteLiveArea[] liteLiveArea = new LiteLiveArea[]{liteLiveArea1,liteLiveArea1};
       liteLiveArea1 = new LiteLiveArea("LITE_TEMP_PLAY", 0);
       LiteLiveArea.LITE_TEMP_PLAY = liteLiveArea1;
       liteLiveArea1 = new LiteLiveArea("LITE_BOTTOM_BUBBLE", 1);
       LiteLiveArea.LITE_BOTTOM_BUBBLE = liteLiveArea1;
       LiteLiveArea.$VALUES = liteLiveArea;
    }
    public void LiteLiveArea(String p0,int p1){
       super(p0, p1);
    }
    public static LiteLiveArea valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiteLiveArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiteLiveArea.class, p0);
    }
    public static LiteLiveArea[] values(){
       Object obj = PatchProxy.apply(null, null, LiteLiveArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteLiveArea.$VALUES.clone();
    }
}
