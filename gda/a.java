package gda.a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import f3b.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.o5;

public class a	// class@002ab5
{

    public void a(){
       super();
    }
    public static int a(BaseFeed p0){
       QPhoto obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new QPhoto(p0);
       int i = 0;
       if (obj.isVideoType() || obj.isImageType()) {
          i = 1;
       }else if(obj.isLiveStream()){
          i = 2;
       }
       return i;
    }
    public static int b(String p0,BaseFeed p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uoa, "1");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       Object obj2 = PatchProxy.apply(obj, obj, uoa, "2");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          h oh = b.a(0x4b316083);
          int i = 0;
          k2 d = (oh != null && oh.f() != null)? oh.f().d: o.i(i);
          if (!TextUtils.equals(d, o.i(15)) && (!TextUtils.equals(d, o.i(1)) && (!TextUtils.equals(d, "CORONA_PAGE") && (TextUtils.equals(d, "CORONA_DETAIL") || TextUtils.equals(d, "CORONA_SUB_CHANNEL_PAGE"))))) {
             b = true;
          }else {
             b = false;
          }
       }
       if (b) {
          if (a.a(p1) == 1 && TextUtils.equals(p0, "3")) {
             return 8;
          }else if(a.a(p1) == 2 && TextUtils.equals(p0, "4")){
             return 8;
          }else if(a.a(p1) == 2 && TextUtils.equals(p0, "6")){
             return 5;
          }
       }
       return o5.b(p0, 1);
    }
}
