package b84.a;
import g14.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import com.google.gson.JsonObject;
import g14.a;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.gson.JsonElement;
import a84.a;
import a84.a$a;
import java.lang.StringBuilder;
import g14.d;

public final class a implements e	// class@000321
{
    public final String a;

    public void a(){
       super();
       this.a = "updateTrustHalfPageStatus";
    }
    public boolean a(Activity p0,String p1,JsonObject p2,a p3,User p4,BaseFeed p5){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          p0 = PatchProxy.apply(objArray, this, a.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (a.g(this.a, p1)) {
          try{
             a.c.c(p2.e0("isShow").d());
             return 1;
          }catch(java.lang.Exception e5){
             p3.onFailed("UPDATE_TRUST_HALF_PAGE_STATUS err, params: "+p2+", error:"+e5);
          }
          return v3;
       }else {
          goto label_0063 ;
       }
    }
    public String getLiveId(){
       return d.a(this);
    }
}
