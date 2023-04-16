package com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.List;
import g91.a;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import com.kuaishou.live.common.core.component.gift.util.LiveUserRightsInfoHelper$2;

public class LiveUserRightsInfoHelper	// class@00132c
{
    public static final String a;

    static {
       LiveUserRightsInfoHelper.a = a1.p(0x7f102d68);
    }
    public void LiveUserRightsInfoHelper(){
       super();
    }
    public static void a(LiveUserRightsCenterView p0,String p1){
       LiveUserRightsInfoHelper liveUserRigh = LiveUserRightsInfoHelper.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, liveUserRigh, "4")) {
          return;
       }
       p0.a(false);
       if (!PatchProxy.applyVoidOneRefs(p1, null, liveUserRigh, "1")) {
          List list = a.a(new LiveUserRightsInfoHelper$1().getType());
          if (!LiveUserRightsInfoHelper.b(list, p1)) {
             if (list == null) {
                list = new ArrayList();
             }
             if (p1 != null) {
                list.add(p1);
             }
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("hasClickedUserRightsIds", b.e(list));
             g.a(uEditor);
          }
       }
       return;
    }
    public static boolean b(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveUserRightsInfoHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p1 != null && (p0 != null && p0.contains(p1)))? true: false;
       return b;
    }
    public static boolean c(LiveUserRightsInfo p0){
       List obj = PatchProxy.applyOneRefs(p0, null, LiveUserRightsInfoHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.a(new LiveUserRightsInfoHelper$2().getType());
       boolean b = (p0.enableJudgeRedDot != null && !LiveUserRightsInfoHelper.b(obj, p0.a()))? true: false;
       return b;
    }
}
