package g59.h0;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class h0	// class@002402
{

    public void h0(){
       super();
    }
    public static boolean a(PhotoAdvertisement$TkTemplateData p0,boolean p1){
       if (p0 == null) {
          return false;
       }
       p0 = p0.mDisplayLocation;
       if (p0 == null) {
          return true;
       }
       if (p0 == true) {
          return p1;
       }
       if (p0 != 2) {
          return false;
       }
       return (p1 ^ 0x01);
    }
    public static boolean b(PhotoAdvertisement$TkTemplateInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!TextUtils.isEmpty(p0.templateId) && (!TextUtils.isEmpty(p0.templateUrl) && !TextUtils.isEmpty(p0.templateMd5))))? true: false;
       return b;
    }
}
