package bu7.i0;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import android.content.Context;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import com.kwai.tokenshare.model.TokenDialogModel;
import com.kwai.framework.model.user.User;
import lnc.aa;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.i;
import ekd.n0;

public class i0	// class@00048b
{
    public static final Pattern a;

    static {
       i0.a = Pattern.compile("[\\s\\n]+");
    }
    public void i0(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("LIVE_STREAM_PRIVATE", p0);
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n("KWAIXIAODIAN_LOTTERY", p0);
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p0.startsWith("SF2020_"))? true: false;
       return b;
    }
    public static boolean d(BaseDialogInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (!TextUtils.x(p0.mOriginSubBiz) && (!i0.a(p0.mOriginSubBiz) && (i0.c(p0.mOriginSubBiz) || i0.b(p0.mOriginSubBiz))))) {
          b = true;
       }
    label_0039 :
       return b;
    }
    public static void e(Context p0,ShareTokenDialogInfo p1,TokenDialogModel p2,boolean p3,boolean p4){
       int i;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oi0, "3")) {
             return;
          }
       }
       p2 = p2.mUser;
       if (p2 == null) {
          return;
       }else if(p3){
          i = 0x7f101875;
       }else {
          i = 0x7f101874;
       }
       Object[] objArray1 = new Object[]{aa.a(p2.getName(), 7)};
       p1.mTitle = p0.getString(i, objArray1);
       p1.mAvatarUrl = p2.getAvatar();
       p1.mAvatarUrls = p2.getAvatars();
       p2.getSex();
       p1.mAvatarPlaceHolderImage = 0x7f08069a;
       if (!p4) {
          p1.mAction = p0.getString(0x7f101c3b);
          Object[] objArray2 = new Object[]{p2.getId()};
          p1.mActionUri = n0.a("kwai://profile/%s", objArray2);
       }
       return;
    }
}
