package com.kwai.live.gzone.common.keyswitch.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import java.lang.Number;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public class a	// class@000cb0
{

    public void a(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_SWITCH_ENABLE_GZONE_HOURLY_RANK).a();
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.e(LiveGzoneKeys.KEY_DEV_LIVE_GZONE_TAB_CONFIG.key(), 0);
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.e(LiveGzoneKeys.KEY_DEV_LIVE_GZONE_UI_STYLE.key(), 0);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d(LiveGzoneKeys.KEY_BLOCK_GZONE_FANS_GROUP_GIFT_EFFECT.key(), false);
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d(LiveGzoneKeys.KEY_SWITCH_KRN_COMPETITION_SCHEDULE.key(), false);
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_SWITCH_LIVE_SHOW_MULTI_TAB).a();
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_GRPR).a();
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_VIDEO_TEXT).a();
    }
    public static boolean i(){
       Object obj = PatchProxy.apply(null, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_FORCE_X_STREAM).a();
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(LiveGzoneKeys.KEY_DEV_LIVE_SHOW_MULTI_TAB).a();
    }
}
