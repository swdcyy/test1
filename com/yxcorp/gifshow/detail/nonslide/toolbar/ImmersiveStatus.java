package com.yxcorp.gifshow.detail.nonslide.toolbar.ImmersiveStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ImmersiveStatus extends Enum	// class@0015e9
{
    public static final ImmersiveStatus[] $VALUES;
    public static final ImmersiveStatus DARK_TEXT;
    public static final ImmersiveStatus DISABLED;
    public static final ImmersiveStatus LIGHT_TEXT;

    static {
       ImmersiveStatus immersiveSta = new ImmersiveStatus("DISABLED", 0);
       ImmersiveStatus.DISABLED = immersiveSta;
       ImmersiveStatus immersiveSta1 = new ImmersiveStatus("DARK_TEXT", 1);
       ImmersiveStatus.DARK_TEXT = immersiveSta1;
       ImmersiveStatus immersiveSta2 = new ImmersiveStatus("LIGHT_TEXT", 2);
       ImmersiveStatus.LIGHT_TEXT = immersiveSta2;
       ImmersiveStatus[] immersiveSta3 = new ImmersiveStatus[]{immersiveSta,immersiveSta1,immersiveSta2};
       ImmersiveStatus.$VALUES = immersiveSta3;
    }
    public void ImmersiveStatus(String p0,int p1){
       super(p0, p1);
    }
    public static ImmersiveStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImmersiveStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ImmersiveStatus.class, p0);
    }
    public static ImmersiveStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ImmersiveStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ImmersiveStatus.$VALUES.clone();
    }
}
