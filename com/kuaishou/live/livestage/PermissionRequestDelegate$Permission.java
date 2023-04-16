package com.kuaishou.live.livestage.PermissionRequestDelegate$Permission;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PermissionRequestDelegate$Permission extends Enum	// class@000bd7
{
    public static final PermissionRequestDelegate$Permission[] $VALUES;
    public static final PermissionRequestDelegate$Permission CAMERA;

    static {
       PermissionRequestDelegate$Permission permission;
       PermissionRequestDelegate$Permission[] permissionAr = new PermissionRequestDelegate$Permission[]{permission};
       permission = new PermissionRequestDelegate$Permission("CAMERA", 0);
       PermissionRequestDelegate$Permission.CAMERA = permission;
       PermissionRequestDelegate$Permission.$VALUES = permissionAr;
    }
    public void PermissionRequestDelegate$Permission(String p0,int p1){
       super(p0, p1);
    }
    public static PermissionRequestDelegate$Permission valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PermissionRequestDelegate$Permission.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PermissionRequestDelegate$Permission.class, p0);
    }
    public static PermissionRequestDelegate$Permission[] values(){
       Object obj = PatchProxy.apply(null, null, PermissionRequestDelegate$Permission.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PermissionRequestDelegate$Permission.$VALUES.clone();
    }
}
