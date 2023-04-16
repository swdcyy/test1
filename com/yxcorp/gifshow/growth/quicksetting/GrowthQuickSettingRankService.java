package com.yxcorp.gifshow.growth.quicksetting.GrowthQuickSettingRankService;
import android.service.quicksettings.TileService;
import com.yxcorp.gifshow.growth.quicksetting.GrowthQuickSettingRankService$a;
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

public final class GrowthQuickSettingRankService extends TileService	// class@0014b9
{
    public final b b;
    public static final GrowthQuickSettingRankService$a c;

    static {
       GrowthQuickSettingRankService.c = new GrowthQuickSettingRankService$a(null);
    }
    public void GrowthQuickSettingRankService(){
       super();
       this.b = new b();
    }
    public IBinder onBind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthQuickSettingRankService.class, "2");
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
       if (PatchProxy.applyVoid(objArray, this, GrowthQuickSettingRankService.class, "3")) {
          return;
       }
       super.onClick();
       this.b.a("HOT_TREND");
       if (!PatchProxy.applyVoid(objArray, this, GrowthQuickSettingRankService.class, "5")) {
          Intent intent = new Intent(this, GrowthRouterActivity.class);
          intent.addFlags(0x10000000);
          intent.setAction("route_action_quick_setting");
          intent.putExtra("KEY_ENTRY_PAGE_SOURCE", "SYSTEM_NOTIFICATION_BAR_HOT_FAST_SWITCH");
          this.startActivityAndCollapse(intent);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return 1;
    }
    public void onStartListening(){
       if (PatchProxy.applyVoid(null, this, GrowthQuickSettingRankService.class, "4")) {
          return;
       }
       super.onStartListening();
       e.a.a(this.getQsTile());
       return;
    }
    public void onTileAdded(){
       if (PatchProxy.applyVoid(null, this, GrowthQuickSettingRankService.class, "1")) {
          return;
       }
       super.onTileAdded();
       e.a.a(this.getQsTile());
       return;
    }
}
