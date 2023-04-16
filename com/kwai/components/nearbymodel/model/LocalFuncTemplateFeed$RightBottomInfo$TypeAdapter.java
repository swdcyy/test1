package com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$RightBottomInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl;
import com.google.gson.stream.b;

public final class LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter extends TypeAdapter	// class@000c86
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter.c = a.get(LocalFuncTemplateFeed$RightBottomInfo.class);
    }
    public void LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LocalFuncTemplateFeed$IconUrl$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter.class, "2");
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
             obj = new LocalFuncTemplateFeed$RightBottomInfo();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("iconUrls")) {
                   if (!str1.equals("text")) {
                      p0.Q();
                   }else {
                      obj.mText = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mLeftIconUrl = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalFuncTemplateFeed$RightBottomInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLeftIconUrl != null) {
             p0.r("iconUrls");
             this.b.write(p0, p1.mLeftIconUrl);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          p0.j();
       }
       return;
    }
}
