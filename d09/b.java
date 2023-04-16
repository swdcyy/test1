package d09.b;
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
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import tkd.b;
import tkd.d;
import vu5.b;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import d09.b$a;
import erd.g;
import java.util.HashMap;
import java.util.Map;

public final class b extends e	// class@002020
{
    public f b;

    public void b(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "clickToProfile";
    }
    public Object c(JSONObject p0,a p1){
       b uob = b.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, uob, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          Activity uActivity = this.b.b();
          if (!uActivity instanceof GifshowActivity) {
             uActivity = objArray;
          }
          if (uActivity != null) {
             PhotoDetailParam photoDetailP = this.b.f();
             QPhoto qPhoto = this.b.e();
             if (qPhoto != null) {
                uActivity.m3(objArray);
                ProfileStartParam profileStart = ProfileStartParam.k(qPhoto.mEntity);
                if (photoDetailP != null) {
                   DetailCommonParam detailCommon = photoDetailP.getDetailCommonParam();
                   if (detailCommon != null) {
                      objArray = detailCommon.getPreInfo();
                   }
                }
                profileStart.A(objArray);
                int photoIndex = (photoDetailP != null)? photoDetailP.getPhotoIndex(): -1;
                profileStart.z(photoIndex);
                profileStart.o(true);
                d.a(-1718536792).Y7(uActivity, profileStart);
             }
          }
       }
    label_006c :
       if (p0.optBoolean("disableReport")) {
          return this.e();
       }else {
          this.i(Integer.valueOf(p0.optInt("itemClickType")), Integer.valueOf(p0.optInt("itemClickAction")));
          return this.e();
       }
    }
    public final void i(Integer p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       QPhoto qPhoto = this.b.e();
       if (qPhoto != null) {
          qPhoto = qPhoto.mEntity;
          if (qPhoto != null) {
             i0.a().e(2, qPhoto).d(new b$a(this, p0, p1)).o(this.f(this.b)).a();
          }
       }
       return;
    }
}
