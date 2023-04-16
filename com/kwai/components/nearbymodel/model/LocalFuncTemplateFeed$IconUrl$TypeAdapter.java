package com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$IconUrl;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LocalFuncTemplateFeed$IconUrl$TypeAdapter extends TypeAdapter	// class@000c84
{
    public final Gson a;
    public static final a b;

    static {
       LocalFuncTemplateFeed$IconUrl$TypeAdapter.b = a.get(LocalFuncTemplateFeed$IconUrl.class);
    }
    public void LocalFuncTemplateFeed$IconUrl$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed$IconUrl$TypeAdapter.class, "2");
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
             obj = new LocalFuncTemplateFeed$IconUrl();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("dark")) {
                   if (!str1.equals("light")) {
                      p0.Q();
                   }else {
                      obj.mLightIcon = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mDarkIcon = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalFuncTemplateFeed$IconUrl$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mDarkIcon != null) {
             p0.r("dark");
             TypeAdapters.A.write(p0, p1.mDarkIcon);
          }
          if (p1.mLightIcon != null) {
             p0.r("light");
             TypeAdapters.A.write(p0, p1.mLightIcon);
          }
          p0.j();
       }
       return;
    }
}
