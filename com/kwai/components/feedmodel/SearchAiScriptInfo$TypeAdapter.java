package com.kwai.components.feedmodel.SearchAiScriptInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.SearchAiScriptInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.feedmodel.AiScriptSection$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.ArrayList;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SearchAiScriptInfo$TypeAdapter extends TypeAdapter	// class@000c3d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       SearchAiScriptInfo$TypeAdapter.d = a.get(SearchAiScriptInfo.class);
    }
    public void SearchAiScriptInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(AiScriptSection$TypeAdapter.d);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SearchAiScriptInfo$TypeAdapter.class, "2");
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
             obj = new SearchAiScriptInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("title")) {
                   if (!str1.equals("aiScriptSection")) {
                      p0.Q();
                   }else {
                      obj.mAIScriptInfo = this.c.read(p0);
                   }
                }else {
                   obj.mAITitle = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchAiScriptInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAITitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mAITitle);
          }
          if (p1.mAIScriptInfo != null) {
             p0.r("aiScriptSection");
             this.c.write(p0, p1.mAIScriptInfo);
          }
          p0.j();
       }
       return;
    }
}
