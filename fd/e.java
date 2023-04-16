package fd.e;
import com.facebook.imagepipeline.nativecode.WebpTranscoderImpl;
import java.lang.Object;
import java.lang.Class;
import com.facebook.imagepipeline.nativecode.a;

public class e	// class@001fec
{
    public static a a;
    public static boolean b;

    static {
       e.a = WebpTranscoderImpl.class.newInstance();
       e.b = true;
    }
    public static a a(){
       return e.a;
    }
}
