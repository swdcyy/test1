package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tk7.j;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a;
import java.util.Objects;
import java.lang.Boolean;
import tk7.d;
import tk7.b;

public final class GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1 extends Lambda implements a	// class@00131b
{
    public final Activity $activity;
    public final Ref$ObjectRef $mToast;
    public final a $task;

    public void GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1(Activity p0,a p1,Ref$ObjectRef p2){
       this.$activity = p0;
       this.$task = p1;
       this.$mToast = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1.class, "1")) {
          return;
       }
       j oj = j.g();
       GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1 $activity = obj.$activity;
       String str = GrowthCleanerHelper.c(R.string.arg_RES_7f1012e3);
       String str1 = GrowthCleanerHelper.c(R.string.arg_RES_7f1012e0);
       String str2 = GrowthCleanerHelper.c(R.string.arg_RES_7f1012df);
       String str3 = GrowthCleanerHelper.c(R.string.arg_RES_7f1012e2);
       GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a uocheckPermi = new GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a(obj);
       Objects.requireNonNull(oj);
       j oj1 = j.class;
       if (PatchProxy.isSupport(oj1)) {
          Object[] objArray1 = new Object[11];
          objArray1[0] = $activity;
          objArray1[1] = "user_growth";
          objArray1[2] = "spaceclean";
          objArray1[3] = "appList";
          objArray1[4] = str;
          objArray1[5] = str1;
          objArray1[6] = str2;
          objArray1[7] = str3;
          objArray1[8] = uocheckPermi;
          objArray1[9] = Boolean.TRUE;
          objArray1[10] = objArray;
          if (PatchProxy.applyVoid(objArray1, oj, oj1, "18")) {
          label_007f :
             return;
          }
       }
       oj.p($activity, "user_growth", "spaceclean", "appList", str, str1, str2, str3, uocheckPermi, true, null, null);
       goto label_007f ;
    }
}
