package d61.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.graphics.Color;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveUtilsLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class k	// class@001f2a
{

    public void k(){
       super();
    }
    public static int a(float p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), null, ok, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((Math.min(255, Math.max(0, (int)(p0 * 0x437f0000))) << 24) + (p1 & 0xffffff));
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return Color.parseColor(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public static int c(String p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ok, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.x(p0)) {
          return p1;
       }else {
          try{
             return Color.parseColor(p0);
          }catch(java.lang.Exception e0){
             b.H(LiveUtilsLogTag.LiveColorUtils, "color parse error", "color", p0, e0);
             return p1;
          }
       }
    }
}
