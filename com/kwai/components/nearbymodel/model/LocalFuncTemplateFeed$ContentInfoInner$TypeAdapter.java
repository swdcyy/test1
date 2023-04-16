package com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfoInner;
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

public final class LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter extends TypeAdapter	// class@000c82
{
    public final Gson a;
    public static final a b;

    static {
       LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter.b = a.get(LocalFuncTemplateFeed$ContentInfoInner.class);
    }
    public void LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LocalFuncTemplateFeed$ContentInfoInner();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf3ca161e:
                      if (str.equals("bgColor")) {
                         i = 0;
                      }
                      break;
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 1;
                      }
                      break;
                    case 0x1ba7c42f:
                      if (str.equals("leftIconUrl")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mBgColor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mLeftIconUrl = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalFuncTemplateFeed$ContentInfoInner$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mBgColor != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBgColor);
          }
          if (p1.mLeftIconUrl != null) {
             p0.r("leftIconUrl");
             TypeAdapters.A.write(p0, p1.mLeftIconUrl);
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
