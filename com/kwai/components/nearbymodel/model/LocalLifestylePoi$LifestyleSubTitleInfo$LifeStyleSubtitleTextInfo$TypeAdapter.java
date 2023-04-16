package com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.nearbymodel.model.LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo;
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

public final class LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter extends TypeAdapter	// class@000c8b
{
    public final Gson a;
    public static final a b;

    static {
       LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter.b = a.get(LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo.class);
    }
    public void LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter.class, "2");
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
             obj = new LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x900e898d:
                      if (str.equals("darkColor")) {
                         i = 0;
                      }
                      break;
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 1;
                      }
                      break;
                    case 0x5a72f63:
                      if (str.equals("color")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDarkColor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mColor = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifestylePoi$LifestyleSubTitleInfo$LifeStyleSubtitleTextInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mColor != null) {
             p0.r("color");
             TypeAdapters.A.write(p0, p1.mColor);
          }
          if (p1.mDarkColor != null) {
             p0.r("darkColor");
             TypeAdapters.A.write(p0, p1.mDarkColor);
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
