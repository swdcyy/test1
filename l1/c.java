package l1.c;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.app.AppOpsManager;
import android.os.Build$VERSION;
import java.lang.Class;

public final class c	// class@001d2f
{

    public static int a(Context p0,String p1,int p2,String p3){
       return p0.getSystemService("appops").noteOp(p1, p2, p3);
    }
    public static int b(Context p0,String p1,String p2){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getSystemService(AppOpsManager.class).noteProxyOpNoThrow(p1, p2);
       }
       return 1;
    }
    public static String c(String p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return AppOpsManager.permissionToOp(p0);
       }
       return null;
    }
}
