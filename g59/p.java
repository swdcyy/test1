package g59.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement;

public class p	// class@002411
{

    public void p(){
       super();
    }
    public static float a(long p0,long p1){
       if (p1 <= 0) {
          return 0;
       }
       float f = ((float)p0 * 0x3f800000) / (float)p1;
       if (f - 0x3f800000 > 0 || f < 0) {
          f = 0x3f000000;
       }
       return f;
    }
    public static int b(String p0,int p1){
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, op, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!TextUtils.x(p0)) {
          if (!p0.startsWith("#")) {
             p0 = "#"+p0;
          }
          return TextUtils.J(p0, p1);
       }else {
          return p1;
       }
    }
    public static int c(String p0,int p1,String p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, p.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!TextUtils.x(p0) && p0.length() >= 6) {
          return TextUtils.J("#"+p2+p0.substring((p0.length() - 6)), p1);
       }else {
          return p1;
       }
    }
    public static String d(PhotoAdvertisement p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "ad is null";
       }
       return "creativeId: "+p0.mCoverId+"\nsourceType: "+p0.mSourceType+"\nadType: "+p0.mAdGroup+"\nurl: "+p0.mUrl+"\nconversionType: "+p0.mConversionType+"\n";
    }
}
