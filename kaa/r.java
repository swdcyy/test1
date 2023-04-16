package kaa.r;
import kaa.w;
import jaa.d;
import com.google.gson.JsonObject;
import kaa.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import fg6.a;
import com.google.gson.Gson;
import jaa.c;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.FeatureId;
import com.google.gson.JsonElement;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AICutTheme$b;
import com.kuaishou.edit.draft.FeatureId$b;
import haa.f;
import java.lang.StringBuilder;
import q87.c;

public class r extends w	// class@002c34
{
    public final d a;
    public final JsonObject b;

    public void r(){
       super();
       this.a = new d(2, 7, 7);
       JsonObject jsonObject = JsonObject.class;
       Object[] objArray = null;
       JsonObject jsonObject1 = PatchProxy.apply(objArray, objArray, v.class, "2");
       if (jsonObject1 != PatchProxyResult.class) {
       }else {
          jsonObject1 = a.t().getValue("aiCutStyleIdMapping", jsonObject, objArray);
          if (jsonObject1 == null) {
             jsonObject = a.a.h("{\"40144\":\"15573\",\"40228\":\"15572\",\"40247\":\"15571\",\"40262\":\"15570\",\"40299\":\"15569\",\"40316\":\"15568\",\"40334\":\"15567\",\"40363\":\"15566\",\"40470\":\"15565\",\"40471\":\"15564\",\"63813\":\"15563\",\"63816\":\"15562\",\"63817\":\"15561\",\"63818\":\"15560\",\"63819\":\"15559\",\"63820\":\"15558\",\"63821\":\"15557\",\"63822\":\"15556\",\"66174\":\"15555\",\"66177\":\"15554\",\"66179\":\"15553\",\"68455\":\"15552\",\"68456\":\"15551\",\"68457\":\"15550\",\"68458\":\"15549\",\"75387\":\"15548\",\"75388\":\"15547\"}", jsonObject);
             if (jsonObject == null) {
                jsonObject = new JsonObject();
             }
             jsonObject1 = jsonObject;
          }
       }
       this.b = jsonObject1;
       return;
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       super.b(p0);
       p0 = p0.a;
       p0.f("Android");
       if (p0.getType() == Workspace$Type.AI_CUT && (p0.getSource() != Workspace$Source.SEASON_ALBUM_MOVIE && (p0.instance.getAiCutThemesCount() > 0 && this.b.size() > 0))) {
          int i = 0;
          String external = p0.getAiCutThemes(i).getFeatureId().getExternal();
          String str = (this.b.s0(external))? this.b.e0(external).w(): external;
          AICutTheme$b uob = p0.getAiCutThemes(i).toBuilder();
          FeatureId$b uob1 = FeatureId.newBuilder();
          uob1.a(str);
          uob.b(uob1.build());
          p0.copyOnWrite();
          p0.instance.setAiCutThemes(i, uob);
          Object[] objArray = new Object[i];
          f.D().w("Migrator277", "migrate ai cut style id old="+external+",newId="+str, objArray);
       }
    label_00a0 :
       return;
    }
}
