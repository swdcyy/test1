package c09.c;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import a59.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import b09.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import g59.e;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.model.CDNUrl;
import fg6.a;
import com.google.gson.Gson;

public final class c extends e	// class@0004b7
{
    public f b;

    public void c(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "getData";
    }
    public Object c(JSONObject p0,a p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       a.p(p0, "data");
       Object[] objArray = null;
       String str = PatchProxy.apply(objArray, this, uoc, "2");
       if (str == patchProxyRe) {
          PhotoAdvertisement$TkTemplateData tkTemplateDa = this.b.k();
          if (tkTemplateDa != null) {
             a uoa = new a();
             uoa.dataString = tkTemplateDa.mData;
             QPhoto qPhoto = this.b.e();
             int i = 1;
             if (qPhoto != null) {
                User user = qPhoto.getUser();
                if (user != null && user.isFollowingOrFollowRequesting() == i) {
                label_0045 :
                   uoa.isFollowing = i;
                   uoa.ad = k.B(this.b.e());
                   qPhoto = this.b.e();
                   user = (qPhoto != null)? qPhoto.getUser(): objArray;
                   uoa.user = user;
                   uoa.mHasLiveReserved = e.a(this.b.e());
                   qPhoto = this.b.e();
                   if (qPhoto != null) {
                      user = qPhoto.getUser();
                      if (user != null) {
                         user = user.mAvatars;
                         if (user != null) {
                            CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(user);
                            if (uCDNUrl != null) {
                               uCDNUrl = uCDNUrl.mUrl;
                               if (uCDNUrl != null) {
                               label_00a0 :
                                  uoa.headUrl = uCDNUrl;
                                  qPhoto = this.b.e();
                                  if (qPhoto != null) {
                                     user = qPhoto.getUser();
                                     if (user != null) {
                                        objArray = user.getName();
                                     }
                                  }
                                  uoa.userName = objArray;
                                  str = a.a.q(uoa);
                                  a.o(str, "Gsons.KWAI_GSON.toJson\(playEndData\)");
                               }
                            }
                         }
                      }
                   }
                   qPhoto = this.b.e();
                   if (qPhoto != null) {
                      user = qPhoto.getUser();
                      if (user != null) {
                         user = user.mAvatar;
                         goto label_00a0 ;
                      }
                   }
                   Object[] objArray1 = objArray;
                   goto label_00a0 ;
                }
             }
             i = 0;
             goto label_0045 ;
          }else {
             str = "";
          }
       }
       return str;
    }
}
