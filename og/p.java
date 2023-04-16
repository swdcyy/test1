package og.p;
import erd.o;
import com.kwai.feature.post.api.feature.bridge.JsPostAtlasParams;
import android.app.Activity;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import og.l;
import java.lang.String;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.content.Context;
import y26.b$a;
import y26.b;
import java.io.File;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import z36.d$a;

public final class p implements o	// class@0027bb
{
    public final JsPostAtlasParams b;
    public final Activity c;

    public void p(JsPostAtlasParams p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p tb = this.b;
       Object[] objArray = new Object[0];
       l.D().w("PostAtlasHelper", "build video context ", objArray);
       VideoContext videoContext = new VideoContext();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("activityId", tb.mActivityId);
       videoContext.o0(jsonObject.toString());
       b$a uoa = b.b(this.c);
       uoa.x = tb.mImagePaths;
       uoa.J(new File(tb.mImagePaths.get(0)));
       uoa.i(tb.mImagePaths.get(0));
       uoa.y = p0;
       uoa.p(tb.mSource);
       uoa.N(tb.mTag);
       p0 = PatchProxy.apply(null, uoa, b$a.class, "4");
       uoa = (p0 != PatchProxyResult.class)? p0: Boolean.TRUE;
       uoa.P(videoContext);
       return uoa.d(tb.mArgsMap).g();
    }
}
