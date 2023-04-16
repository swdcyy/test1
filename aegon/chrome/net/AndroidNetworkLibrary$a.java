package aegon.chrome.net.AndroidNetworkLibrary$a;
import java.lang.Object;
import android.os.Build$VERSION;
import b0.a;
import java.lang.String;
import b0.b;

public class AndroidNetworkLibrary$a	// class@000067
{
    public static AndroidNetworkLibrary$a a;

    static {
       AndroidNetworkLibrary$a.a = new AndroidNetworkLibrary$a();
    }
    public void AndroidNetworkLibrary$a(){
       super();
    }
    public static AndroidNetworkLibrary$a a(){
       return AndroidNetworkLibrary$a.a;
    }
    public boolean b(){
       if (Build$VERSION.SDK_INT < 23) {
          return true;
       }
       return a.c();
    }
    public boolean c(String p0){
       if (Build$VERSION.SDK_INT < 24) {
          return this.b();
       }
       return b.a(p0);
    }
}
