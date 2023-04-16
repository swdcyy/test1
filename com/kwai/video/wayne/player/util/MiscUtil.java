package com.kwai.video.wayne.player.util.MiscUtil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.wayne.player.util.Supplier;
import com.kwai.video.wayne.player.util.LocalDebugConfigPreference;

public class MiscUtil	// class@000dbf
{

    public void MiscUtil(){
       super();
    }
    public static boolean isHardWareVendorMediaTek(){
       String obj = PatchProxy.apply(null, null, MiscUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Build.HARDWARE;
       boolean b = (!TextUtils.isEmpty(obj) && obj.matches("mt[0-9]*"))? true: false;
       return b;
    }
    public static boolean useLocalBooleanIfSetted(String p0,Supplier p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MiscUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       int intx = LocalDebugConfigPreference.getInt(p0, i);
       if (!intx) {
          return p1.get().booleanValue();
       }
       if (intx == 1) {
          i = true;
       }
       return i;
    }
}
