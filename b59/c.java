package b59.c;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import b59.c$a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Intent;
import ekd.j0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.lang.StringBuilder;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import oe6.e;
import yy6.c;

public abstract class c extends e	// class@00036e
{
    public f b;

    public void c(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       this.i();
       this.k(Integer.valueOf(p0.optInt("itemClickType")), Integer.valueOf(p0.optInt("itemClickAction")));
       return this.e();
    }
    public final void i(){
       String str1;
       String preUserId;
       String prePhotoId;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       QPhoto qPhoto = this.b.e();
       if (qPhoto != null) {
          Activity uActivity = this.b.b();
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!mE.isLogined()) {
             String str = a.B.getString(R.string.arg_RES_7f103077);
             a.o(str, "AppEnv.APP.getString\(R.string.login_prompt_follow\)");
             d.a(-1712118428).ne(uActivity, qPhoto.getFullSource(), "photo_follow", 14, str, qPhoto.mEntity, null, null, new c$a(this)).h();
             return;
          }else {
             PhotoDetailParam photoDetailP = this.b.f();
             if (uActivity != null) {
                Intent intent = uActivity.getIntent();
                if (intent != null) {
                   str1 = j0.f(intent, "arg_photo_exp_tag");
                label_0071 :
                   StringBuilder str2 = "_";
                   if (photoDetailP != null) {
                      DetailCommonParam detailCommon = photoDetailP.getDetailCommonParam();
                      if (detailCommon != null) {
                         preUserId = detailCommon.getPreUserId();
                         if (preUserId != null) {
                         label_0083 :
                            if (photoDetailP != null) {
                               DetailCommonParam detailCommon1 = photoDetailP.getDetailCommonParam();
                               if (detailCommon1 != null) {
                                  prePhotoId = detailCommon1.getPrePhotoId();
                                  if (prePhotoId != null) {
                                     str2 = prePhotoId;
                                  }
                               }
                            }
                            prePhotoId = preUserId+'/'+str2;
                            qPhoto.getUser().mPage = "photo";
                            str2 = (uActivity != null)? uActivity.Q2(): objArray;
                            f$a uoa = new f$a(qPhoto.getUser(), str2);
                            uoa.c(qPhoto.getFullSource());
                            str2 = "";
                            if (uActivity != null) {
                               objArray = uActivity.getUrl();
                            }
                            uoa.o(str2+objArray+"#follow");
                            uoa.g(str1);
                            uoa.f(qPhoto.getExpTag());
                            uoa.n(prePhotoId);
                            uoa.q(true);
                            FollowHelper.b(uoa.b());
                            User user = qPhoto.getUser();
                            a.o(user, "photo.user");
                            user.setFollowStatus(User$FollowStatus.FOLLOWING);
                            e.f0(false);
                            f g = this.b.g;
                            if (g != null) {
                               g.b();
                            }
                         }
                      }
                   }
                   preUserId = str2;
                   goto label_0083 ;
                }
             }
             str1 = objArray;
             goto label_0071 ;
          }
       }
       return;
    }
    public final f j(){
       return this.b;
    }
    public abstract void k(Integer p0,Integer p1);
}
