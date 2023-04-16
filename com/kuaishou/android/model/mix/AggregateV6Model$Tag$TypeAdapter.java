package com.kuaishou.android.model.mix.AggregateV6Model$Tag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model$Tag;
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

public final class AggregateV6Model$Tag$TypeAdapter extends TypeAdapter	// class@000bb5
{
    public final Gson a;
    public static final a b;

    static {
       AggregateV6Model$Tag$TypeAdapter.b = a.get(AggregateV6Model$Tag.class);
    }
    public void AggregateV6Model$Tag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public AggregateV6Model$Tag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AggregateV6Model$Tag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AggregateV6Model$Tag tag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tag;
       }else {
          p0.c();
          AggregateV6Model$Tag tag1 = new AggregateV6Model$Tag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 0;
                   }
                   break;
                 case 0xc1a09044:
                   if (str.equals("textValue")) {
                      i = 1;
                   }
                   break;
                 case 0x15c83b7a:
                   if (str.equals("fontName")) {
                      i = 2;
                   }
                   break;
                 case 0x15caa0f0:
                   if (str.equals("fontSize")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tag1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   tag1.mTextValue = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   tag1.mFontName = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   tag1.mFontSize = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tag1;
       }
    }
    public void b(b p0,AggregateV6Model$Tag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AggregateV6Model$Tag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTextValue != null) {
             p0.r("textValue");
             TypeAdapters.A.write(p0, p1.mTextValue);
          }
          if (p1.mFontName != null) {
             p0.r("fontName");
             TypeAdapters.A.write(p0, p1.mFontName);
          }
          if (p1.mFontSize != null) {
             p0.r("fontSize");
             TypeAdapters.A.write(p0, p1.mFontSize);
          }
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
