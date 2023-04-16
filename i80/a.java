package i80.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.media.model.EditorSdkDecodeConfig;

public final class a	// class@002188
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static EditorSdkDecodeConfig a(Type p0){
       String str = a.a.getString("editorsdk_decode_config", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
}
