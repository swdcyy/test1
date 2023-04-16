package com.kwai.plugin.dva.feature.core.hook.component.fakecomponents.FakeService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class FakeService extends Service	// class@001309
{

    public void FakeService(){
       super();
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (PatchProxy.isSupport(FakeService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FakeService.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.stopSelf();
       return super.onStartCommand(p0, p1, p2);
    }
}
