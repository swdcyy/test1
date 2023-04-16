package d09.a;
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
import com.yxcorp.gifshow.entity.QPhoto;
import nx8.g;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdMainProcess;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import d09.a$a;
import erd.g;
import java.util.HashMap;
import java.util.Map;

public final class a extends e	// class@00201e
{
    public f b;

    public void a(f p0){
       a.p(p0, "mTkBridgeContext");
       super();
       this.b = p0;
    }
    public String a(){
       return "clickToConvert";
    }
    public Object c(JSONObject p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "data");
       if (this.b.b() == null) {
          return this.e();
       }
       QPhoto qPhoto = this.b.e();
       if (qPhoto != null) {
          qPhoto = qPhoto.mEntity;
          if (qPhoto != null) {
             Activity uActivity = this.b.b();
             if (uActivity != null) {
                g.a.a(uActivity, new PhotoAdDataWrapper(qPhoto)).m();
             }
             this.i(Integer.valueOf(p0.optInt("itemClickType")), Integer.valueOf(p0.optInt("itemClickAction")));
          }
       }
       return this.e();
    }
    public final void i(Integer p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       QPhoto qPhoto = this.b.e();
       if (qPhoto != null) {
          qPhoto = qPhoto.mEntity;
          if (qPhoto != null) {
             i0.a().e(2, qPhoto).d(new a$a(this, p0, p1)).o(this.f(this.b)).a();
          }
       }
       return;
    }
}
