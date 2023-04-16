package fx8.h;
import java.lang.Object;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.gifshow.retrofit.service.KwaiShareTopicApiService;
import java.lang.Class;
import com.yxcorp.retrofit.e;
import java.lang.String;
import java.util.Map;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import brd.t;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import vw8.a;
import f66.i;
import jq.a;
import q87.c;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import k2b.u1;

public class h	// class@002380
{
    public KwaiShareTopicApiService a;
    public t b;

    public void h(){
       super();
       if (this.a == null) {
          this.a = e.b(b.a(-1961311520).a(RouteType.API, d.c), KwaiShareTopicApiService.class);
       }
       return;
    }
    public final t a(String p0,Map p1,c p2){
       Workspace$Type obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0) && p2 != null) {
          obj = p2.a1();
          Workspace$Source source = p2.T0();
          boolean b = i.g().getFromThirdParty().get(Boolean.FALSE).booleanValue();
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(obj, source, Boolean.valueOf(b), null, a.class, "1")) {
             Object[] objArray = new Object[0];
             a.b().w("PublishLogger", "logHotTagWithNoSessionId", objArray);
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("draftType", Integer.valueOf(obj.getNumber()));
             jsonObject.a0("draftSource", Integer.valueOf(source.getNumber()));
             jsonObject.H("isThirdApp", Boolean.valueOf(b));
             String str = jsonObject.toString();
             u1.R("post_recommend_tag_with_no_sessionid", str, 2);
          }
       }
       return this.a.hotRecommend(p0, p1);
    }
}
