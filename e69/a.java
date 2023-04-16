package e69.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.x0;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;
import com.kwai.framework.model.user.FriendClap;
import lnc.i3;
import k2b.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a	// class@002146
{

    public void a(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = x0.f(p0);
       uri = (uri != null)? x0.a(uri, "photoId"): "";
       return uri;
    }
    public static String b(User p0){
       UserFollowState obj = PatchProxy.applyOneRefs(p0, null, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(p0, false);
       if (obj == UserFollowState.CLAP) {
          p0 = p0.mFriendClap;
          FriendClap mClapText = (p0.mCanClap != null)? p0.mClapText: p0.mClapSubText;
          i3 oi3 = i3.f();
          oi3.d("button_name", mClapText);
          return oi3.e();
       }else {
          i3 oi31 = i3.f();
          oi31.d("button_name", obj.getText());
          return oi31.e();
       }
    }
    public static void c(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "7")) {
          return;
       }
       a.d(p0, "to_profile");
       return;
    }
    public static void d(User p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       a.e(p0, p1, null);
       return;
    }
    public static void e(User p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "9")) {
          return;
       }
       h oh = h.m("", "PEOPLE_IN_POP");
       ClientContent$ContentPackage uContentPack = PatchProxy.applyTwoRefs(p0, p2, null, a.class, "11");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = new ClientContent$ContentPackage();
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = p0.mId;
          userPackage.index = p0.mPosition + 1;
          userPackage.params = a.b(p0);
          uContentPack.userPackage = userPackage;
          uContentPack.photoPackage = a.f(p2);
       }
       oh.c(uContentPack);
       i3 oi3 = i3.f();
       oi3.d("click_area", p1);
       oh.n(oi3.e());
       oh.h();
       return;
    }
    public static ClientContent$PhotoPackage f(String p0){
       ClientContent$PhotoPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       obj = new ClientContent$PhotoPackage();
       obj.identity = p0;
       return obj;
    }
}
