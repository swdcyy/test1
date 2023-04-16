package abc.u;
import erd.o;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import com.yxcorp.gifshow.relation.intimate.model.IntimatePostMediaSceneInfoResponse;
import java.lang.Object;
import y36.b;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Boolean;
import brd.t;

public final class u implements o	// class@0000e0
{
    public final p b;
    public final IntimatePostMediaSceneInfoResponse c;

    public void u(p p0,IntimatePostMediaSceneInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       u tb = this.b;
       e g = tb.g;
       IntimatePostMediaSceneInfoResponse mPostParams = this.c.mPostParams;
       String str = PatchProxy.applyOneRefs(mPostParams, tb, p.class, "7");
       if (str != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.G("postParams", mPostParams);
          str = jsonObject.toString();
       }
       p0.CF(g, str);
       return t.just(Boolean.TRUE);
    }
}
