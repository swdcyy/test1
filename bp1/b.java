package bp1.b;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import lnc.a1;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b	// class@0003d8
{
    public static final Drawable a;
    public static final Drawable b;
    public static final Map c;
    public static final Map d;

    static {
       int[] ointArray = new int[]{a1.a(0x7f06026d),a1.a(0x7f06031d)};
       GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray);
       b.a = gradientDraw;
       int[] ointArray1 = new int[]{a1.a(0x7f06049c),a1.a(0x7f06049d)};
       GradientDrawable gradientDraw1 = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray1);
       b.b = gradientDraw1;
       HashMap hashMap = new HashMap();
       b.c = hashMap;
       HashMap hashMap1 = new HashMap();
       b.d = hashMap1;
       Integer integer = Integer.valueOf(266);
       hashMap.put(integer, "lucky_magic_box.webp");
       Integer integer1 = Integer.valueOf(0x2774);
       hashMap.put(integer1, "supreme_magic_box.webp");
       if (SystemUtil.I() || (a.a().c() && SystemUtil.J())) {
          hashMap.put(Integer.valueOf(999), "supreme_magic_box.webp");
       }
       hashMap1.put(integer, gradientDraw);
       hashMap1.put(integer1, gradientDraw1);
    }
    public void b(){
       super();
    }
    public static String a(int p0){
       Map obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = b.c;
       if (obj.containsKey(Integer.valueOf(p0))) {
          return obj.get(Integer.valueOf(p0));
       }else {
          return "";
       }
    }
}
