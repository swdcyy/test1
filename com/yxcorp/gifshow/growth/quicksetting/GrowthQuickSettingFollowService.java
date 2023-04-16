package com.yxcorp.gifshow.growth.quicksetting.GrowthQuickSettingFollowService;
import android.service.quicksettings.TileService;
import com.yxcorp.gifshow.growth.quicksetting.GrowthQuickSettingFollowService$a;
import nsd.u;
import kqa.b;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import com.yxcorp.gifshow.growth.activity.GrowthRouterActivity;
import android.content.Context;
import qrd.l1;
import kqa.e;
import android.service.quicksettings.Tile;

public final class GrowthQuickSettingFollowService extends TileService	// class@0014b7
{
    public final b b;
    public static final GrowthQuickSettingFollowService$a c;

    static {
       GrowthQuickSettingFollowService.c = new GrowthQuickSettingFollowService$a(null);
    }
    public void GrowthQuickSettingFollowService(){
       super();
       this.b = new b();
    }
    public IBinder onBind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthQuickSettingFollowService.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.onBind(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return null;
       }
    }
    public void onClick(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthQuickSettingFollowService.class, "3")) {
          return;
       }
       super.onClick();
       this.b.a("YOUR_FOLLOW");
       if (!PatchProxy.applyVoid(objArray, this, GrowthQuickSettingFollowService.class, "5")) {
          Intent intent = new Intent(this, GrowthRouterActivity.class);
          intent.addFlags(0x10000000);
          intent.setAction("route_action_quick_setting");
          intent.putExtra("KEY_ENTRY_PAGE_SOURCE", "SYSTEM_NOTIFICATION_BAR_FOLLOW_FAST_SWITCH");
          this.startActivityAndCollapse(intent);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 1;
    }
    public void onStartListening(){
       if (PatchProxy.applyVoid(null, this, GrowthQuickSettingFollowService.class, "4")) {
          return;
       }
       super.onStartListening();
       e.a.a(this.getQsTile());
       return;
    }
    public void onTileAdded(){
       if (PatchProxy.applyVoid(null, this, GrowthQuickSettingFollowService.class, "1")) {
          return;
       }
       super.onTileAdded();
       e.a.a(this.getQsTile());
       return;
    }
}
