package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a;
import tk7.d;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.NotImplementedError;
import tk7.c;
import java.lang.Integer;
import msd.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.widget.Toast;
import android.content.Context;
import android.app.Activity;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;

public final class GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a implements d	// class@00131a
{
    public final GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1 a;

    public void GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a(GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1 p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a.class, "3")) {
          return;
       }
       throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
    public void b(){
       c.b(this);
    }
    public void c(String p0,int p1){
       if (PatchProxy.isSupport(GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a.class, "1")) {
          return;
       }
       this.a.$task.invoke();
       return;
    }
    public void d(String p0,int p1){
       GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a uocheckPermi = GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a.class;
       if (PatchProxy.isSupport(uocheckPermi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uocheckPermi, "2")) {
          return;
       }
       Ref$ObjectRef element = this.a.$mToast.element;
       if (element != null) {
          element.cancel();
       }
       GrowthCleanerCorePresenter$checkPermissionToDo$getAppListPermission$1$a ta = this.a;
       Toast toast = Toast.makeText(ta.$activity.getApplicationContext(), "", 0);
       a.o(toast, "Toast.makeText\(activity.бн \"\", Toast.LENGTH_SHORT \)");
       p1.element = toast;
       this.a.$mToast.element.setGravity(17, 0, 0);
       this.a.$mToast.element.setText(GrowthCleanerHelper.c(R.string.arg_RES_7f1012e1));
       this.a.$mToast.element.show();
       return;
    }
    public void e(){
       c.a(this);
    }
}
