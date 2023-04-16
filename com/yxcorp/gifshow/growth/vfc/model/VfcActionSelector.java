package com.yxcorp.gifshow.growth.vfc.model.VfcActionSelector;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcActionSelector extends Enum	// class@0015c4
{
    public static final VfcActionSelector[] $VALUES;
    public static final VfcActionSelector ERROR_DIALOG;
    public static final VfcActionSelector LINK_URL;
    public static final VfcActionSelector NON_ACTION;
    public static final VfcActionSelector SHARE_TOKEN_DIALOG;

    static {
       VfcActionSelector vfcActionSel1;
       VfcActionSelector[] vfcActionSel = new VfcActionSelector[]{vfcActionSel1,vfcActionSel1,vfcActionSel1,vfcActionSel1};
       vfcActionSel1 = new VfcActionSelector("NON_ACTION", 0);
       VfcActionSelector.NON_ACTION = vfcActionSel1;
       vfcActionSel1 = new VfcActionSelector("LINK_URL", 1);
       VfcActionSelector.LINK_URL = vfcActionSel1;
       vfcActionSel1 = new VfcActionSelector("SHARE_TOKEN_DIALOG", 2);
       VfcActionSelector.SHARE_TOKEN_DIALOG = vfcActionSel1;
       vfcActionSel1 = new VfcActionSelector("ERROR_DIALOG", 3);
       VfcActionSelector.ERROR_DIALOG = vfcActionSel1;
       VfcActionSelector.$VALUES = vfcActionSel;
    }
    public void VfcActionSelector(String p0,int p1){
       super(p0, p1);
    }
    public static VfcActionSelector valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcActionSelector.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcActionSelector.class, p0);
    }
    public static VfcActionSelector[] values(){
       Object obj = PatchProxy.apply(null, null, VfcActionSelector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcActionSelector.$VALUES.clone();
    }
}
