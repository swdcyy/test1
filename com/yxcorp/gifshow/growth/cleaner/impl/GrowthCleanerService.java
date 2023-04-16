package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import android.app.Service;
import crd.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$mCleanerConfiguration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$a;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startScanAppList$1;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$b;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$c;
import erd.g;
import crd.b;
import android.content.Intent;
import android.os.IBinder;

public final class GrowthCleanerService extends Service	// class@00133f
{
    public a b;
    public List c;
    public boolean d;
    public boolean e;
    public final p f;
    public final GrowthCleanerService$a g;

    public void GrowthCleanerService(){
       super();
       this.b = new a();
       this.c = CollectionsKt__CollectionsKt.E();
       this.f = s.c(GrowthCleanerService$mCleanerConfiguration$2.INSTANCE);
       this.g = new GrowthCleanerService$a(this);
    }
    public final CleanerConfigurationWrapper a(){
       Object obj = PatchProxy.apply(null, this, GrowthCleanerService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final boolean b(){
       return this.d;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerService.class, "4")) {
          return;
       }
       if (this.d == null && this.e == null) {
          this.d = true;
          this.b.c(t.create(new GrowthCleanerService$startScanAppList$1(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new GrowthCleanerService$b(this), new GrowthCleanerService$c(this)));
       }
       return;
    }
    public IBinder onBind(Intent p0){
       return this.g;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerService.class, "3")) {
          return;
       }
       this.b.dispose();
       this.b = new a();
       super.onDestroy();
       return;
    }
    public void onRebind(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerService.class, "2")) {
          return;
       }
       this.b.dispose();
       this.b = new a();
       super.onRebind(p0);
       return;
    }
}
