package ekd.d0;
import java.util.HashMap;
import java.lang.String;
import android.content.Context;
import android.graphics.Typeface;
import java.lang.Object;
import java.util.Map;
import android.content.res.AssetManager;
import java.io.File;

public class d0	// class@000d30
{
    public static Map a;

    static {
       d0.a = new HashMap();
    }
    public static Typeface a(String p0,Context p1){
       Typeface typeface = d0.a.get(p0);
       if (typeface == null) {
          try{
             typeface = Typeface.createFromAsset(p1.getAssets(), p0);
             d0.a.put(p0, typeface);
          }catch(java.lang.Exception e0){
             return null;
          }
       }
       return typeface;
    }
    public static Typeface b(File p0){
       String absolutePath = p0.getAbsolutePath();
       Typeface typeface = d0.a.get(absolutePath);
       if (typeface == null) {
          typeface = null;
          try{
             if (!p0.exists()) {
                return typeface;
             }else {
                typeface = Typeface.createFromFile(p0);
                d0.a.put(absolutePath, typeface);
             }
          }catch(java.lang.Exception e0){
          }
       }
       return typeface;
    }
    public static Typeface c(){
       return Typeface.create("sans-serif-medium", 0);
    }
    public static Typeface d(Context p0){
       return d0.a("osp_din.ttf", p0);
    }
}
