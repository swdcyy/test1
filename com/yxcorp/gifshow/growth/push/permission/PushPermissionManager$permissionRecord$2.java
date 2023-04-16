package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$permissionRecord$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionRecord;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vma.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class PushPermissionManager$permissionRecord$2 extends Lambda implements a	// class@0014b1
{
    public static final PushPermissionManager$permissionRecord$2 INSTANCE;

    static {
       PushPermissionManager$permissionRecord$2.INSTANCE = new PushPermissionManager$permissionRecord$2();
    }
    public void PushPermissionManager$permissionRecord$2(){
       super(0);
    }
    public final PushPermissionRecord invoke(){
       Object[] objArray = null;
       PushPermissionRecord obj = PatchProxy.apply(objArray, this, PushPermissionManager$permissionRecord$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PushPermissionRecord.class;
       String str = a.a.getString("newPushPermissionRecord", "");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new PushPermissionRecord();
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
