package fk1.a;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o56.a;
import s00.b$b;
import s00.b;
import com.google.common.primitives.Ints;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftMergedMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMergedMessage;
import com.kuaishou.live.core.show.gift.GiftMessage;
import android.animation.Animator;

public class a	// class@00236d
{
    public static String a = "";

    public void a(){
       super();
    }
    public static boolean a(UserInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (QCurrentUser.me().getId()).equals(p0.mId))? true: false;
       return b;
    }
    public static boolean b(QLiveMessage p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0.mDeviceHash)) {
          String str = PatchProxy.apply(null, null, uoa, "6");
          if (str != patchProxyRe) {
          }else if(!TextUtils.x(a.a) || TextUtils.x(a.a)){
             str = a.a;
          }else {
             str = b.b().a(Ints.f((a.a).hashCode()));
             a.a = str;
          }
          if (str.equals(p0.mDeviceHash)) {
             b = true;
          label_005a :
             return b;
          }
       }
       b = false;
       goto label_005a ;
    }
    public static boolean c(QLiveMessage p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }else if(TextUtils.x(p0.mDeviceHash)){
          return a.a(p0.getUser());
       }else if(p0.mIsAnonymous != null){
          return a.b(p0);
       }else if(p1){
          return a.a(p0.getUser());
       }else if(a.a(p0.getUser()) && a.b(p0)){
          b = true;
       }
       return b;
    }
    public static boolean d(QLiveMessage p0){
       if (p0 instanceof LiveGiftToAudienceMessage) {
          return false;
       }
       if (p0 instanceof LiveGiftMergedMessage || p0 instanceof LiveGiftToAudienceMergedMessage) {
          return false;
       }
       return p0 instanceof GiftMessage;
    }
    public static void e(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          return;
       }
       if (p0 != null && p0.isRunning()) {
          p0.removeAllListeners();
          p0.end();
       }
       return;
    }
}
