package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Dialog;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1 extends Lambda implements a	// class@00131c
{
    public final Dialog $descDialog;

    public void GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1(Dialog p0){
       this.$descDialog = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCorePresenter$checkPermissionToDo$onErrorOrComplete$1.class, "1")) {
          return;
       }
       this.$descDialog.dismiss();
       return;
    }
}
