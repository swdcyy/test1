package b5c.j;
import java.lang.Object;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import org.json.JSONObject;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kuaishou.android.model.feed.ImageFeed;
import kp.w1;
import com.kwai.framework.model.feed.BaseFeed;
import tkd.b;
import tkd.d;
import nl9.u;
import fg6.a;
import com.kuaishou.android.model.ads.PicFeedInfo;
import com.google.gson.Gson;

public final class j	// class@0003ad
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public static final QPhoto a(ProfileParam p0,User p1){
       boolean b;
       QPhoto qPhoto;
       j a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object obj = null;
       j obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, oj, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "param");
       a.p(p1, "user");
       obj1 = j.a;
       Objects.requireNonNull(obj1);
       Object obj2 = PatchProxy.applyOneRefs(p0, obj1, oj, "4");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          b = 0;
          try{
             if (new JSONObject(p0.mAdExtra).optInt("feedType", b) == 1) {
                b = 1;
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
             Log.d("UnionPicFeedUtil", "json error: "+e3);
          }
       }
    }
    public static final String b(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "adExtraJson");
       if (p0.optInt("feedType", 0) == 1) {
          return null;
       }
       return p0.optString("encryptedPhotoId");
    }
}
