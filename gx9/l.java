package gx9.l;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.framework.model.user.User;
import java.util.List;
import gx9.l$a;
import java.util.Comparator;
import java.util.Collections;

public class l	// class@0024fe
{
    public static String a = "OPEN_FROM_KEY";

    public void l(){
       super();
    }
    public static boolean a(QPhoto p0,NasaBizParam p1){
       boolean b1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p1.getNasaSlideParam().mIsFriendsNasaDetail == null && !p1.getNasaSlideParam().isEnableReceiveLikeComment()) {
          if (p1.getNasaSlideParam().isFollowNasaDetail()) {
             p1 = PatchProxy.applyOneRefs(p0, null, l.class, "7");
             if (p1 != PatchProxyResult.class) {
                b1 = p1.booleanValue();
             }else if(p0.getUser() == null){
                b1 = false;
             }else if(p0.getUser().isFriend()){
                b1 = true;
             }else {
                b1 = p0.enableShowLikeList();
             }
             if (b1) {
             label_005b :
                b = true;
             }
          }
       }else {
          goto label_005b ;
       }
       return b;
    }
    public static void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "6")) {
          return;
       }
       Collections.sort(p0, new l$a());
       return;
    }
}
