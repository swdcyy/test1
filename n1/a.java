package n1.a;
import android.content.pm.PackageInfo;
import android.os.Build$VERSION;

public final class a	// class@0026b0
{

    public static long a(PackageInfo p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getLongVersionCode();
       }
       return (long)p0.versionCode;
    }
}
