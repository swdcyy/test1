package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$b;
import erd.g;
import android.app.Activity;
import msd.a;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class GrowthCleanerCorePresenter$b implements g	// class@001317
{
    public final Activity b;
    public final a c;

    public void GrowthCleanerCorePresenter$b(Activity p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter$b.class, "1")) {
       }else if(PermissionUtils.a(this.b, "android.permission.WRITE_EXTERNAL_STORAGE")){
          this.c.invoke();
       }
       return;
    }
}
