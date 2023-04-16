package com.kuaishou.android.model.mix.AggregateV6Model$TagContent$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.AggregateV6Model$Tag$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.AggregateV6Model$Tag;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.AggregateV6Model$TagContent$TypeAdapter$a;

public final class AggregateV6Model$TagContent$TypeAdapter extends TypeAdapter	// class@000bb9
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       AggregateV6Model$TagContent$TypeAdapter.c = a.get(AggregateV6Model$TagContent.class);
    }
    public void AggregateV6Model$TagContent$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(AggregateV6Model$Tag$TypeAdapter.b);
    }
    public AggregateV6Model$TagContent a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AggregateV6Model$TagContent$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AggregateV6Model$TagContent tagContent = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tagContent;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tagContent;
       }else {
          p0.c();
          AggregateV6Model$TagContent tagContent1 = new AggregateV6Model$TagContent();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb548be36:
                   if (str.equals("leftTextConfig")) {
                      i = 0;
                   }
                   break;
                 case 0xffce0a0b:
                   if (str.equals("rightTextConfig")) {
                      i = 1;
                   }
                   break;
                 case 0x38de73f8:
                   if (str.equals("tagBackgroundColors")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tagContent1.mFirstTag = this.b.read(p0);
                   break;
                 case 1:
                   tagContent1.mSecondTag = this.b.read(p0);
                   break;
                 case 2:
                   tagContent1.mTagBackground = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new AggregateV6Model$TagContent$TypeAdapter$b(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tagContent1;
       }
    }
    public void b(b p0,AggregateV6Model$TagContent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AggregateV6Model$TagContent$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mFirstTag != null) {
             p0.r("leftTextConfig");
             this.b.write(p0, p1.mFirstTag);
          }
          if (p1.mSecondTag != null) {
             p0.r("rightTextConfig");
             this.b.write(p0, p1.mSecondTag);
          }
          if (p1.mTagBackground != null) {
             p0.r("tagBackgroundColors");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new AggregateV6Model$TagContent$TypeAdapter$a(this)).b(p0, p1.mTagBackground);
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
