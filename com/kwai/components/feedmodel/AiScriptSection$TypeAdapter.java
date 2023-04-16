package com.kwai.components.feedmodel.AiScriptSection$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.AiScriptSection;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.feedmodel.AiScriptSection$SearchAiInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.stream.b;

public final class AiScriptSection$TypeAdapter extends TypeAdapter	// class@000c0e
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       AiScriptSection$TypeAdapter.d = a.get(AiScriptSection.class);
    }
    public void AiScriptSection$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(AiScriptSection$SearchAiInfo.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AiScriptSection$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new AiScriptSection();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("aiScriptItem")) {
                   p0.Q();
                }else {
                   obj.mAiInfos = this.c.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AiScriptSection$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAiInfos != null) {
             p0.r("aiScriptItem");
             this.c.write(p0, p1.mAiInfos);
          }
          p0.j();
       }
       return;
    }
}
