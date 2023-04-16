package com.kwai.live.gzone.debugconfig.GzoneDebugSwitch;
import java.lang.Enum;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.common.keyswitch.b;
import com.kwai.live.gzone.common.keyswitch.b$d;

public final class GzoneDebugSwitch extends Enum	// class@000cd1
{
    public LiveGzoneKeys mKey;
    public String mTitle;
    public static final GzoneDebugSwitch[] $VALUES;
    public static final GzoneDebugSwitch HIDE_ACCOMPANY;
    public static final GzoneDebugSwitch HIDE_TREASURE_BOX;
    public static final GzoneDebugSwitch HIDE_TURNTABLE;
    public static final GzoneDebugSwitch KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH;

    static {
       GzoneDebugSwitch gzoneDebugSw = new GzoneDebugSwitch("KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH", 0, LiveGzoneKeys.KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH, "允许设置玩法开关");
       GzoneDebugSwitch.KEY_DEV_GZONE_MASTER_ACTIVITY_SWITCH = gzoneDebugSw;
       GzoneDebugSwitch gzoneDebugSw1 = new GzoneDebugSwitch("HIDE_TREASURE_BOX", 1, LiveGzoneKeys.KEY_DEV_GZONE_HIDE_TREASURE_BOX, "关闭宝箱");
       GzoneDebugSwitch.HIDE_TREASURE_BOX = gzoneDebugSw1;
       GzoneDebugSwitch gzoneDebugSw2 = new GzoneDebugSwitch("HIDE_TURNTABLE", 2, LiveGzoneKeys.KEY_DEV_GZONE_HIDE_TURNTABLE, "关闭拆蛋机");
       GzoneDebugSwitch.HIDE_TURNTABLE = gzoneDebugSw2;
       GzoneDebugSwitch gzoneDebugSw3 = new GzoneDebugSwitch("HIDE_ACCOMPANY", 3, LiveGzoneKeys.KEY_DEV_GZONE_HIDE_ACCOMPANY, "关闭陪玩");
       GzoneDebugSwitch.HIDE_ACCOMPANY = gzoneDebugSw3;
       GzoneDebugSwitch[] gzoneDebugSw4 = new GzoneDebugSwitch[]{gzoneDebugSw,gzoneDebugSw1,gzoneDebugSw2,gzoneDebugSw3};
       GzoneDebugSwitch.$VALUES = gzoneDebugSw4;
    }
    public void GzoneDebugSwitch(String p0,int p1,LiveGzoneKeys p2,String p3){
       super(p0, p1);
       this.mKey = p2;
       this.mTitle = p3;
    }
    public static GzoneDebugSwitch valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GzoneDebugSwitch.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GzoneDebugSwitch.class, p0);
    }
    public static GzoneDebugSwitch[] values(){
       Object obj = PatchProxy.apply(null, null, GzoneDebugSwitch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GzoneDebugSwitch.$VALUES.clone();
    }
    public boolean isOn(){
       Object obj = PatchProxy.apply(null, this, GzoneDebugSwitch.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b().a(this.mKey).a();
    }
    public void setSwitch(boolean p0){
       GzoneDebugSwitch gzoneDebugSw = GzoneDebugSwitch.class;
       if (PatchProxy.isSupport(gzoneDebugSw) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, gzoneDebugSw, "4")) {
          return;
       }
       b.b().c(this.mKey, p0);
       return;
    }
}
