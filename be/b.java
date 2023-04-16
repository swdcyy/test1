package be.b;
import java.lang.String;
import hg.a;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.soloader.SoLoader;

public class b	// class@000b1d
{
    public static boolean a;

    public static void a(){
       if (b.a) {
          return;
       }
       a.a(0, "FabricSoLoader.staticInit::load:fabricjni");
       ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
       SoLoader.b("fabricjni");
       ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
       a.c(0, "FabricSoLoader.staticInit::load:fabricjni");
       b.a = true;
       return;
    }
}
