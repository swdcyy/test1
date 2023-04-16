package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$a;
import android.content.ServiceConnection;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.lang.Object;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import fna.j;

public final class GrowthCleanerCorePresenter$a implements ServiceConnection	// class@001316
{
    public final GrowthCleanerCorePresenter b;

    public void GrowthCleanerCorePresenter$a(GrowthCleanerCorePresenter p0){
       this.b = p0;
       super();
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthCleanerCorePresenter$a.class, "2")) {
          return;
       }
       if (p1 instanceof GrowthCleanerService$a) {
          GrowthCleanerCorePresenter$a tb = this.b;
          tb.F = p1;
          if (tb.w != null) {
             p1.a().c();
          }
       }
       return;
    }
    public void onServiceDisconnected(ComponentName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter$a.class, "1")) {
          return;
       }
       GrowthCleanerCorePresenter$a tb = this.b;
       tb.F = null;
       GrowthCleanerCorePresenter.b9(tb, null, 1, null);
       return;
    }
}
