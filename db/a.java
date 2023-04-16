package db.a;
import java.lang.Object;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import java.lang.String;

public class a	// class@001e2f
{
    public static final Map a;

    static {
       a.a = ImmutableMap.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");
    }
    public static boolean a(String p0){
       boolean b = (p0 != null && p0.startsWith("video/"))? true: false;
       return b;
    }
}
